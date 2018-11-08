module Main exposing (main)

import Browser
import Browser.Dom
import Browser.Events
import Data.Navbar as Navbar exposing (Navbar, NavbarCategory)
import Debug
import Element exposing (..)
import Element.Background as Background
import Element.Border as Border
import Element.Events exposing (..)
import Element.Font as Font
import Flags
import GraphQL.Client.Http as GraphQLClient
import Html exposing (Html)
import Http
import Json.Decode
import Mario.Data
import Mario.Subs
import Msg exposing (Msg(..))
import Podcasts exposing (searchRequest)
import Task
import View.Blog
import View.Navbar


type Page
    = Blog
    | Mario { game : Mario.Data.Game }


type alias Model =
    { navbar : Navbar Msg
    , page : Page
    , apiUrl : String
    , screenSize : Maybe { width : Int, height : Int }
    }


getScreenSize : Cmd Msg
getScreenSize =
    let
        parseViewport { viewport } =
            ScreenResize (floor viewport.width) (floor viewport.height)
    in
    Task.perform parseViewport Browser.Dom.getViewport


init : Json.Decode.Value -> ( Model, Cmd Msg )
init flagsValue =
    let
        flags =
            Flags.decode flagsValue

        initialModel =
            { navbar =
                { logo =
                    Just
                        { url = "https://package.elm-lang.org/assets/favicon.ico"
                        , onSelect = NoOp
                        }
                , categories =
                    [ { id = "1", title = "Blog", onSelect = EnterBlog }
                    , { id = "2", title = "Game", onSelect = EnterMario }
                    ]
                , hoveringOver = Nothing
                }
            , page = Blog
            , apiUrl = flags.apiUrl
            , screenSize = Nothing
            }

        initialCommands =
            Cmd.batch
                [ getScreenSize
                , GraphQLClient.sendQuery (flags.apiUrl ++ "graphql") (searchRequest "trump")
                    |> Task.attempt SearchForPodcasts
                ]
    in
    ( initialModel, initialCommands )


update : Msg -> Model -> ( Model, Cmd Msg )
update msg model =
    case msg of
        NoOp ->
            ( model, Cmd.none )

        EnterHoverNavItem id ->
            ( { model | navbar = Navbar.hoverOver id model.navbar }, Cmd.none )

        LeaveHoverNavItem id ->
            ( { model | navbar = Navbar.leaveHover model.navbar }, Cmd.none )

        EnterBlog ->
            ( { model | page = Blog }, Cmd.none )

        EnterMario ->
            ( { model
                | page =
                    Mario { game = Mario.Data.defaultGame }
              }
            , Cmd.none
            )

        MarioMsg marioMsg ->
            ( model, Cmd.none )

        ScreenResize width height ->
            ( { model
                | screenSize =
                    Just
                        { width = width, height = height }
              }
            , Cmd.none
            )

        SearchForPodcasts r ->
            Debug.log (Debug.toString r) ( model, Cmd.none )


view : Model -> Html Msg
view model =
    Element.layout [] <|
        column [ spacing 10, fill |> width ]
            [ View.Navbar.render model.navbar
            , case model.page of
                Blog ->
                    View.Blog.render

                Mario game ->
                    text "Mario game goes here"
            ]


subscriptions : Model -> Sub Msg
subscriptions model =
    Sub.batch
        [ case model.page of
            Blog ->
                Sub.none

            Mario { game } ->
                Mario.Subs.subscriptions game MarioMsg
        , Browser.Events.onResize ScreenResize
        ]


main : Program Json.Decode.Value Model Msg
main =
    Browser.element
        { init = init
        , view = view
        , update = update
        , subscriptions = subscriptions
        }
