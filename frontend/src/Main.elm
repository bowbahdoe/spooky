module Main exposing (main)

import Browser exposing (UrlRequest(..))
import Browser.Dom
import Browser.Events
import Browser.Navigation
import Data.Navbar as Navbar exposing (Navbar, NavbarCategory)
import Dict exposing (Dict)
import Element exposing (..)
import Element.Background as Background
import Element.Border as Border
import Element.Events exposing (..)
import Element.Font as Font
import Element.Input as Input
import Flags
import GraphQL.Client.Http as GraphQLClient
import Html exposing (Html)
import Http
import Json.Decode
import Msg exposing (Msg(..))
import Podcasts exposing (SearchResult, searchRequest)
import Ports exposing (pauseAudio, startAudio, stopAudio)
import Task
import Url
import View.Blog
import View.Navbar


type Page
    = Blog
    | Podcasts


type alias Model =
    { navKey : Browser.Navigation.Key
    , navbar : Navbar Msg
    , page : Page
    , apiUrl : String
    , screenSize : Maybe { width : Int, height : Int }
    , search :
        { searchBarContents : String
        , searchResults : Dict String (List SearchResult)
        }
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
            , navbar =
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
            , page = determinePage url
            , apiUrl = flags.apiUrl
            , screenSize = Nothing
            , search =
                { searchBarContents = ""
                , searchResults = Dict.empty
                }
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

        SearchBarType query ->
            ( let
                search =
                    model.search

                updated =
                    { search | searchBarContents = query }
              in
              { model | search = updated }
            , GraphQLClient.sendQuery (model.apiUrl ++ "graphql") (searchRequest query)
                |> Task.attempt (RecievePodcastSearchResults query)
            )

        RecievePodcastSearchResults query (Ok results) ->
            let
                search =
                    model.search

                updatedSearchResults =
                    Dict.insert query results model.search.searchResults

                updated =
                    { search | searchResults = updatedSearchResults }
            in
            ( { model | search = updated }, Cmd.none )

        ClickedLink req ->
            case req of
                Internal url ->
                    ( { model | page = determinePage url }
                    , Browser.Navigation.pushUrl model.navKey (Url.toString url)
                    )

                External path ->
                    ( model, Browser.Navigation.load path )

        PlayAudio { url } ->
            ( model, startAudio { url = url } )

        StopAudio ->
            ( model, stopAudio () )

        PauseAudio ->
            ( model, pauseAudio () )

        _ ->
            ( model, Cmd.none )


changePage model page =
    case page of
        Podcasts ->
            { model
                | page = page
                , search =
                    { searchResults = model.search.searchResults
                    , searchBarContents = ""
                    }
            }

        Blog ->
            { model | page = page }


filterMaybes =
    List.filterMap identity


view : Model -> Browser.Document Msg
view model =
    { title = "Hello SPA"
    , body =
        [ Element.layout [] <|
            column [ spacing 10, fill |> width ]
                [ View.Navbar.render model.navbar
                , Input.button [] { onPress = Just (PlayAudio { url = "title1.ogg" }), label = text "PLAY AUDIO" }
                , Input.button [] { onPress = Just StopAudio, label = text "STOP AUDIO" }
                , Input.button [] { onPress = Just PauseAudio, label = text "PAUSE AUDIO" }
                , case model.page of
                    Blog ->
                        View.Blog.render

                    Podcasts ->
                        column []
                            ([ Input.search []
                                { onChange = SearchBarType
                                , text = model.search.searchBarContents
                                , placeholder = Nothing
                                , label = Input.labelHidden "Search Bar"
                                }
                             ]
                                ++ (case Dict.get model.search.searchBarContents model.search.searchResults of
                                        Just results ->
                                            results
                                                |> List.map (\res -> res.artist)
                                                |> filterMaybes
                                                |> List.map (\artist -> Element.paragraph [] [ text artist ])

                                        Nothing ->
                                            []
                                   )
                            )
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
                Sub.none
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
