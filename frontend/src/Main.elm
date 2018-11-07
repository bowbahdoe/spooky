module Main exposing (main)

import Browser
import Browser.Dom
import Browser.Events
import Data.Navbar as Navbar exposing (Navbar, NavbarCategory)
import Element exposing (..)
import Element.Background as Background
import Element.Border as Border
import Element.Events exposing (..)
import Element.Font as Font
import Html exposing (Html)
import Mario.Data
import Mario.Subs
import Msg exposing (Msg(..))
import Task
import View.Blog
import View.Navbar


type Page
    = Blog
    | Mario { game : Mario.Data.Game }


type alias Model =
    { navbar : Navbar Msg
    , page : Page
    , screenSize : Maybe { width : Int, height : Int }
    }


initialModel : Model
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
    , screenSize = Nothing
    }


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


getScreenSize : Cmd Msg
getScreenSize =
    let
        parseViewport { viewport } =
            ScreenResize (floor viewport.width) (floor viewport.height)
    in
    Task.perform parseViewport Browser.Dom.getViewport


main : Program () Model Msg
main =
    Browser.element
        { init = \_ -> ( initialModel, getScreenSize )
        , view = view
        , update = update
        , subscriptions = subscriptions
        }
