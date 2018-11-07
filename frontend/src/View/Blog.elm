module View.Blog exposing (render)

import Element
    exposing
        ( centerX
        , centerY
        , el
        , fill
        , height
        , maximum
        , minimum
        , paddingXY
        , text
        , width
        )
import Element.Font as Font


render =
    el [ paddingXY 15 0, centerX, fill |> width, fill |> height ] <|
        Element.paragraph [ centerX ] [ Element.text "Hello" ]
