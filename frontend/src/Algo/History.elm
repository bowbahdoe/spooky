module Algo.History exposing (HistoryStore, back, current, forward, new, to)


type alias HistoryStore a =
    { back : List a
    , forward : List a
    , current : a
    }


{-| Creates a new history store starting at the given "origin"
-}
new : a -> HistoryStore a
new startWith =
    { back = [], forward = [], current = startWith }


{-| Moves forward in the history. If there is nothing forward,
there is no change.
-}
forward : HistoryStore a -> HistoryStore a
forward store =
    case store.forward of
        first :: rest ->
            { back = store.current :: store.back
            , forward = rest
            , current = first
            }

        [] ->
            store


{-| Moves back in the history. If there is nothing back,
there is no change.
-}
back : HistoryStore a -> HistoryStore a
back store =
    case store.back of
        first :: rest ->
            { back = rest
            , forward = store.current :: store.forward
            , current = first
            }

        [] ->
            store


{-| Gets the current point in the history
-}
current : HistoryStore a -> a
current store =
    store.current


{-| Navigates to the given point. Erases everything forward.
-}
to : HistoryStore a -> a -> HistoryStore a
to store next =
    { back = store.current :: store.back
    , forward = []
    , current = next
    }


{-| Maps the given function over the history.
Turns a history of a into a history of b.
-}
map : (a -> b) -> HistoryStore a -> HistoryStore b
map function store =
    { back = List.map function store.back
    , forward = List.map function store.forward
    , current = function store.current
    }
