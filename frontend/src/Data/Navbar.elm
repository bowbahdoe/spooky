module Data.Navbar exposing
    ( Navbar
    , NavbarCategory
    )


type alias NavbarCategory msg =
    { id : String
    , title : String
    , onSelect : msg
    }


type alias Navbar msg =
    { logo : Maybe { url : String, onSelect : msg }
    , categories : List (NavbarCategory msg)
    }
