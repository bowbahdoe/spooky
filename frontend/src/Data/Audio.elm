module Data.Audio exposing (Audio)


type alias Audio =
    { currentTime : Maybe Float
    , duration : Maybe Float
    , playing : Bool
    }
