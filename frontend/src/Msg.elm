module Msg exposing (Msg(..))

import Browser exposing (UrlRequest)
import Data.Audio exposing (Audio)
import GraphQL.Client.Http as GraphQLClient
import Podcasts


type Msg
    = NoOp
    | EnterBlog
    | EnterPodcasts
    | ScreenResize Int Int -- Width, Height
    | ClickedLink UrlRequest
    | PodcastMsg Podcasts.Msg
