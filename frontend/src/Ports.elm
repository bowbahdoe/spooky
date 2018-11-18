port module Ports exposing (audioUpdated, error, pauseAudio, startAudio, stopAudio)

import Data.Audio exposing (Audio)


{-| Starts playing audio located at the given resource url on the player.
-}
port startAudio : { url : String } -> Cmd msg


{-| Stops the given audio playing
-}
port stopAudio : () -> Cmd msg


port pauseAudio : () -> Cmd msg


port audioUpdated : (Audio -> msg) -> Sub msg


{-| Outputs the given message to console.error
-}
port error : String -> Cmd msg
