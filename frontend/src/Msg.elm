module Msg exposing (Msg(..))

import Browser exposing (UrlRequest)
import GraphQL.Client.Http as GraphQLClient
import Podcasts exposing (SearchResult)


type Msg
    = NoOp
    | EnterBlog
    | EnterPodcasts
    | ScreenResize Int Int -- Width, Height
    | SearchBarType String
    | RecievePodcastSearchResults String (Result GraphQLClient.Error (List SearchResult))
    | ClickedLink UrlRequest
