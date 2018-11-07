module Data.Navbar exposing
    ( Navbar
    , NavbarCategory
    , hoverOver
    , leaveHover
    )


type alias NavbarCategory msg =
    { id : String
    , title : String
    , onSelect : msg
    }


type alias Navbar msg =
    { logo : Maybe { url : String, onSelect : msg }
    , categories : List (NavbarCategory msg)
    , hoveringOver : Maybe String
    }


{-| Sets the given id as being hovered over in the Navbar.
-}
hoverOver : String -> Navbar msg -> Navbar msg
hoverOver id navbar =
    { navbar | hoveringOver = Just id }


{-| Sets Nothing as being hovered over in the Navbar.
-}
leaveHover : Navbar msg -> Navbar msg
leaveHover navbar =
    { navbar | hoveringOver = Nothing }
