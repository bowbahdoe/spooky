module Flags exposing (Flags, decode)

import Json.Decode as Decode exposing (Decoder, Value, decodeValue, string)
import Json.Decode.Pipeline exposing (optional)


type alias Flags =
    { apiUrl : String }


defaultFlags : Flags
defaultFlags =
    { apiUrl = "/" }


decoder : Decoder Flags
decoder =
    Decode.succeed Flags
        |> optional "apiUrl" string defaultFlags.apiUrl


decode : Value -> Flags
decode value =
    Result.withDefault defaultFlags (decodeValue decoder value)
