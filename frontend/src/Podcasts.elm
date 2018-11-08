module Podcasts exposing (SearchResult, searchRequest)

import GraphQL.Request.Builder
    exposing
        ( Document
        , Query
        , Request
        , extract
        , field
        , list
        , object
        , queryDocument
        , request
        , string
        , with
        )
import GraphQL.Request.Builder.Arg as Arg
import GraphQL.Request.Builder.Variable as Var
import Http
import Task exposing (Task)


type alias SearchResult =
    { artist : String
    , collection : String
    }


searchQuery : Document Query (List SearchResult) { vars | query : String }
searchQuery =
    let
        queryVar =
            Var.required "query" .query Var.string

        searchResult =
            object SearchResult
                |> with (field "artist" [] string)
                |> with (field "collection" [] string)

        queryRoot =
            extract
                (field "search"
                    [ ( "query", Arg.variable queryVar ) ]
                    (list searchResult)
                )
    in
    queryDocument queryRoot


searchRequest : String -> Request Query (List SearchResult)
searchRequest query =
    searchQuery
        |> request { query = query }
