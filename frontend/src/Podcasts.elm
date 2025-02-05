module Podcasts exposing
    ( Model
    , Msg
    , SearchResult
    , init
    , leave
    , searchRequest
    , subs
    , update
    , view
    )

import Data.Audio exposing (Audio)
import Debug
import Dict exposing (Dict)
import Element
    exposing
        ( Element
        , alignTop
        , centerX
        , column
        , el
        , fill
        , image
        , padding
        , paragraph
        , px
        , rgb255
        , row
        , spacing
        , text
        , width
        )
import Element.Background as Background
import Element.Border as Border
import Element.Events exposing (..)
import Element.Font as Font
import Element.Input as Input
import GraphQL.Client.Http as GraphQLClient
import GraphQL.Request.Builder
    exposing
        ( Document
        , Query
        , Request
        , extract
        , field
        , list
        , nullable
        , object
        , queryDocument
        , request
        , string
        , with
        )
import GraphQL.Request.Builder.Arg as Arg
import GraphQL.Request.Builder.Variable as Var
import Http
import Pallete
import Ports
import Task exposing (Task)


type alias SearchResult =
    { artist : Maybe String
    , collection : Maybe String
    , feedUrl : Maybe String
    , image : Maybe String
    }


searchQuery : Document Query (List SearchResult) { vars | query : String }
searchQuery =
    let
        queryVar =
            Var.required "query" .query Var.string

        searchResult =
            object SearchResult
                |> with (field "artist" [] (nullable string))
                |> with (field "collection" [] (nullable string))
                |> with (field "feedUrl" [] (nullable string))
                |> with (field "image" [] (nullable string))

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


type alias Model =
    { searchBarContents : String
    , searchResults : Dict String (List SearchResult)
    , playing : Maybe Audio
    , apiUrl : String
    }


init : { apiUrl : String } -> Model
init { apiUrl } =
    { searchBarContents = ""
    , searchResults = Dict.empty
    , playing = Nothing
    , apiUrl = apiUrl
    }


type Msg
    = SearchBarType String
    | RecievePodcastSearchResults
        { query : String
        , result : Result GraphQLClient.Error (List SearchResult)
        }
    | PlayAudio { url : String }
    | StopAudio
    | PauseAudio
    | AudioUpdated Audio


activeSearchResults : Model -> Maybe (List SearchResult)
activeSearchResults { searchBarContents, searchResults } =
    Dict.get searchBarContents searchResults


gqlUrl : { a | apiUrl : String } -> String
gqlUrl { apiUrl } =
    apiUrl ++ "graphql"


update : Msg -> Model -> ( Model, Cmd Msg )
update msg model =
    case msg of
        SearchBarType query ->
            let
                onResults result =
                    RecievePodcastSearchResults { query = query, result = result }
            in
            ( { model | searchBarContents = query }
            , GraphQLClient.sendQuery (gqlUrl model)
                (searchRequest query)
                |> Task.attempt onResults
            )

        RecievePodcastSearchResults { query, result } ->
            case result of
                Ok data ->
                    let
                        updatedSearchResults =
                            Dict.insert query data model.searchResults
                    in
                    ( { model | searchResults = updatedSearchResults }, Cmd.none )

                Err _ ->
                    ( model, Ports.error ("Searching for " ++ query ++ "failed") )

        PlayAudio { url } ->
            ( model, Ports.startAudio { url = url } )

        StopAudio ->
            ( model, Ports.stopAudio () )

        PauseAudio ->
            ( model, Ports.pauseAudio () )

        AudioUpdated audio ->
            ( { model | playing = Just audio }, Cmd.none )


searchBar contents =
    el [ width (px 600), centerX ]
        (Input.search [ Background.color Pallete.white ]
            { onChange = SearchBarType
            , text = contents
            , placeholder = Just <| Input.placeholder [] (text "Search")
            , label = Input.labelHidden "Search Bar"
            }
        )


filterMaybes : List (Maybe a) -> List a
filterMaybes =
    List.filterMap identity


defaultImage =
    ""


albumImage url =
    el
        [ Border.color Pallete.pink
        , Border.width 5
        , Border.rounded 5
        , width (px 200)
        ]
        (image
            [ fill |> width ]
            { src = url
            , description = ""
            }
        )


searchResultListing result =
    row
        [ padding 3
        , Border.solid
        , Border.rounded 3
        , Border.color Pallete.pink
        , Border.width 2
        , Background.color Pallete.blue
        , Font.color Pallete.fontColor
        , fill |> width
        ]
        [ albumImage <| Maybe.withDefault defaultImage result.image
        , column [ alignTop, padding 3, fill |> width ]
            [ paragraph [] <|
                [ el [ Font.size 30 ] <|
                    text <|
                        Maybe.withDefault "" result.collection
                ]
            , paragraph [] <|
                [ el [ Font.size 20, Font.italic ]
                    (text <| Maybe.withDefault "" result.artist)
                ]
            ]
        ]


view : Model -> Element Msg
view model =
    column [ fill |> width ]
        [ searchBar model.searchBarContents
        , column [ spacing 5, padding 5, fill |> width ]
            (activeSearchResults model
                |> Maybe.withDefault []
                |> List.map searchResultListing
            )
        ]


subs : Model -> Sub Msg
subs model =
    Ports.audioUpdated AudioUpdated


leave model =
    { model | searchBarContents = "" }
