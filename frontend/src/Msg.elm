module Msg exposing (Msg(..))

import Mario.Data


type Msg
    = NoOp
    | EnterHoverNavItem String
    | LeaveHoverNavItem String
    | EnterBlog
    | EnterMario
    | MarioMsg Mario.Data.Msg
    | ScreenResize Int Int -- Width, Height
