module Msg exposing (Msg(..))

import GraphQL.Client.Http as GraphQLClient
import Mario.Data
import Podcasts exposing (SearchResult)


type Msg
    = NoOp
    | EnterHoverNavItem String
    | LeaveHoverNavItem String
    | EnterBlog
    | EnterMario
    | MarioMsg Mario.Data.Msg
    | ScreenResize Int Int -- Width, Height
    | SearchForPodcasts (Result GraphQLClient.Error (List SearchResult))
