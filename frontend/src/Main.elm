module Main exposing (main)

import Browser exposing (UrlRequest(..))
import Browser.Dom
import Browser.Events
import Browser.Navigation
import Dict exposing (Dict)
import Element exposing (..)
import Element.Background as Background
import Element.Border as Border
import Element.Events exposing (..)
import Element.Font as Font
import Element.Input as Input
import Flags
import Html exposing (Html)
import Http
import Json.Decode
import Msg exposing (Msg(..))
import Navbar
import Podcasts
import Ports exposing (..)
import Task
import Url


type Page
    = Blog
    | Podcasts


type alias Model =
    { navKey : Browser.Navigation.Key
    , page : Page
    , podcasts : Podcasts.Model
    , screenSize : Maybe { width : Int, height : Int }
    }


getScreenSize : Cmd Msg
getScreenSize =
    let
        parseViewport { viewport } =
            ScreenResize (floor viewport.width) (floor viewport.height)
    in
    Task.perform parseViewport Browser.Dom.getViewport


determinePage url =
    if url.path == "/blog" then
        Blog

    else if url.path == "/podcasts" then
        Podcasts

    else
        Blog


init : Json.Decode.Value -> Url.Url -> Browser.Navigation.Key -> ( Model, Cmd Msg )
init flagsValue url navKey =
    let
        flags =
            Flags.decode flagsValue

        initialModel =
            { navKey = navKey
            , page = determinePage url
            , screenSize = Nothing
            , podcasts = Podcasts.init { apiUrl = flags.apiUrl }
            }

        initialCommands =
            Cmd.batch
                [ getScreenSize ]
    in
    ( initialModel, initialCommands )


update : Msg -> Model -> ( Model, Cmd Msg )
update msg model =
    case msg of
        NoOp ->
            ( model, Cmd.none )

        EnterBlog ->
            ( changePage model Blog
            , Browser.Navigation.pushUrl model.navKey "/blog"
            )

        EnterPodcasts ->
            ( changePage model Podcasts
            , Browser.Navigation.pushUrl model.navKey "/podcasts"
            )

        ScreenResize width height ->
            ( { model
                | screenSize =
                    Just
                        { width = width, height = height }
              }
            , Cmd.none
            )

        ClickedLink req ->
            case req of
                Internal url ->
                    ( { model | page = determinePage url }
                    , Browser.Navigation.pushUrl model.navKey (Url.toString url)
                    )

                External path ->
                    ( model, Browser.Navigation.load path )

        PodcastMsg podcastMsg ->
            let
                ( podcastsModel, cmds ) =
                    Podcasts.update podcastMsg model.podcasts
            in
            ( { model | podcasts = podcastsModel }, Cmd.map PodcastMsg cmds )


changePage model page =
    case page of
        Podcasts ->
            { model
                | page = page
                , podcasts = Podcasts.leave model.podcasts
            }

        Blog ->
            { model | page = page }


view : Model -> Browser.Document Msg
view model =
    { title =
        case model.page of
            Blog ->
                "Blog"

            Podcasts ->
                "Podcasts"
    , body =
        [ Element.layout [] <|
            column [ spacing 10, fill |> width ]
                [ Navbar.render
                    { logo =
                        Just
                            { url = "https://package.elm-lang.org/assets/favicon.ico"
                            , onSelect = NoOp
                            }
                    , categories =
                        [ { title = "Podcasts", onSelect = EnterPodcasts }
                        , { title = "Blog", onSelect = EnterBlog }
                        ]
                    }
                , case model.page of
                    Blog ->
                        text "todo"

                    Podcasts ->
                        Element.map PodcastMsg <| Podcasts.view model.podcasts
                ]
        ]
    }


subscriptions : Model -> Sub Msg
subscriptions model =
    Sub.batch
        [ case model.page of
            Blog ->
                Sub.none

            Podcasts ->
                Sub.map PodcastMsg <| Podcasts.subs model.podcasts
        , Browser.Events.onResize ScreenResize
        ]


main : Program Json.Decode.Value Model Msg
main =
    Browser.application
        { init = init
        , onUrlChange = \_ -> NoOp
        , onUrlRequest = ClickedLink
        , view = view
        , update = update
        , subscriptions = subscriptions
        }
