module Mario.Data.Vector2D exposing (Vector2D, magnitude, reverse, unitVector, zero)


type alias Vector2D =
    { x : Float, y : Float }


{-| Returns the magnitude of the given Vector.
-}
magnitude : Vector2D -> Float
magnitude vector =
    sqrt <| (vector.x ^ 2) + (vector.y ^ 2)


unitVector : Vector2D -> Vector2D
unitVector vector =
    let
        mag =
            magnitude vector
    in
    { x = vector.x / mag, y = vector.y / mag }


{-| Reverses the direction of the given vector.
-}
reverse : Vector2D -> Vector2D
reverse vector =
    { x = -vector.x, y = -vector.y }


{-| The zero vector.
-}
zero : Vector2D
zero =
    { x = 0, y = 0 }
