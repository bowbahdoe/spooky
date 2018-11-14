port module Ports exposing (pauseAudio, startAudio, stopAudio)

--Starts playing audio located at the given resource url on the player.


port startAudio : { url : String } -> Cmd msg


port stopAudio : () -> Cmd msg


port pauseAudio : () -> Cmd msg
