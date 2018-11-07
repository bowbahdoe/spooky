module Mario.Subs exposing (subscriptions)

import Browser.Events exposing (onAnimationFrameDelta)
import Mario.Data as Mario


subscriptions : Mario.Game -> (Mario.Msg -> msg) -> Sub msg
subscriptions game makeMsg =
    let
        subs =
            onAnimationFrameDelta Mario.Tick
    in
    Sub.map makeMsg subs
