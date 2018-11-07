module Mario.Data exposing (Game, Msg(..), Tile(..), World, defaultGame)

import Algo.History as History exposing (HistoryStore)
import Array exposing (Array)
import Mario.Data.Vector2D as Vector exposing (Vector2D)


type Msg
    = Tick Float -- Time passed.
    | Jump -- Player jumps.
    | MoveRight -- Player moves to the right.
    | MoveLeft -- Player moves to the left.


type Tile
    = Air
    | Dirt
    | Grass


defaultCharacterMass =
    1


startAtPos : Vector2D -> Character
startAtPos pos =
    { physics =
        { pos = pos, vel = Vector.zero, mass = defaultCharacterMass }
    , health = Alive
    }


{-| Checks if the given tile is collidable. Stuff like Air obviously
wont be while ground blocks will.
-}
isCollidable : Tile -> Bool
isCollidable tile =
    case tile of
        Air ->
            False

        Dirt ->
            True

        Grass ->
            True


{-| Type representing a force. The direction should be a unit vector and the
magnitude should always be positive.
-}
type alias Force =
    { magnitude : Float, direction : Vector2D }


{-| Represents the physical state of an object.
-}
type alias Physics =
    { pos : Vector2D
    , vel : Vector2D
    , mass : Float
    }


{-| Calculates a force to apply to an object based on its current physics
-}
type alias ForceFn =
    Physics -> Force


gravity : ForceFn
gravity _ =
    { magnitude = 9.8, direction = { x = 0, y = -1 } }


airResistance : ForceFn
airResistance { vel, mass } =
    let
        k =
            0.22

        direction =
            Vector.unitVector <| Vector.reverse vel

        magnitude =
            k * Vector.magnitude vel
    in
    { magnitude = magnitude, direction = direction }


type Health
    = Dead
    | Alive
    | Mushroomed


type alias Character =
    { physics : Physics
    , health : Health
    }


type alias Enemy =
    { physics : Physics }


type alias World =
    { tiles : Array (Array Tile)
    , character : Character
    }


type alias Game =
    { worldHistory : HistoryStore World }


advanceByTime time physics =
    let
        granularity =
            0.001

        -- This function works by approximating along small amounts of
        -- time. This function is meant to compute the physics linearly, so
        -- it isn't recursive like the outer one.
        stepByTime t phys =
            let
                { pos, vel, mass } =
                    physics.physicalState

                forceFns =
                    physics.forceFunctions
            in
            physics
    in
    if time > 0 then
        advanceByTime
            (time - granularity)
            physics

    else
        physics



-- Some shorthands to make building the maps easier


a =
    Air


g =
    Grass



-- Tile maps for the worlds


worldOne : World
worldOne =
    { tiles =
        Array.fromList
            [ Array.repeat 7 a
            , Array.repeat 7 a
            , Array.repeat 7 a
            , Array.repeat 7 g
            ]
    , character =
        startAtPos { x = 0, y = 0 }
    }


defaultGame : Game
defaultGame =
    { worldHistory = History.new worldOne }
