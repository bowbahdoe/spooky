port module Ports exposing (audioUpdated, pauseAudio, startAudio, stopAudio)

import Data.Audio exposing (Audio)



--Starts playing audio located at the given resource url on the player.


port startAudio : { url : String } -> Cmd msg


port stopAudio : () -> Cmd msg


port pauseAudio : () -> Cmd msg


port audioUpdated : (Audio -> msg) -> Sub msg
