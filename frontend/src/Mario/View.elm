module Mario.View exposing (render)

import Html exposing (Html)
import Mario.Data exposing (Tile(..), World)
import Msg exposing (Msg(..))
import Svg exposing (svg)


render : World -> Html Msg
render world =
    svg [] []
