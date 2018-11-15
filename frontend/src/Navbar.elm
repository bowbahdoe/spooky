module Navbar exposing (Navbar, NavbarCategory, render)

import Element exposing (..)
import Element.Background as Background
import Element.Border as Border
import Element.Events exposing (..)
import Element.Font as Font


type alias NavbarCategory msg =
    { title : String
    , onSelect : msg
    }


type alias Navbar msg =
    { logo : Maybe { url : String, onSelect : msg }
    , categories : List (NavbarCategory msg)
    }


navbarStyle =
    { backgroundColor = rgb255 0 0 50
    , elementSpacing = 5
    , labelSize = Font.size 12
    , labelColor = rgb255 255 0 0
    , labelBackground = rgb255 0 0 100
    }


navbarCategory : NavbarCategory msg -> Element msg
navbarCategory navCategory =
    el
        [ Background.color <| navbarStyle.labelBackground
        , Element.mouseOver
            [ Background.color <|
                rgb255 255
                    255
                    255
            ]
        , padding 5
        , Border.rounded 3
        , onClick navCategory.onSelect
        ]
        (text navCategory.title)


navbarCategories categories =
    row
        [ alignLeft
        , Font.color <| navbarStyle.labelColor
        , spacing 15
        , padding 10
        ]
        (List.map navbarCategory categories)


navbarLogo logo =
    image
        [ alignLeft
        , padding 10
        , width
            (fill
                |> maximum 50
                |> minimum 10
            )
        , onClick logo.onSelect
        ]
        { src = logo.url, description = "" }


render navbarData =
    let
        navCategories =
            navbarCategories navbarData.categories

        contents =
            case navbarData.logo of
                Just logo ->
                    [ navbarLogo logo, navCategories ]

                Nothing ->
                    [ navCategories ]
    in
    row
        [ alignTop
        , Background.color <| navbarStyle.backgroundColor
        , spacing navbarStyle.elementSpacing
        , fill |> width
        ]
        contents
