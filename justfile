generate_docs:
    lein codox

hotreload_server:
    lein ring start

make_uberjar:
    lein uberjar

generate_soap_classes:
    lein pom
    mvn generate-sources

start_elm_watcher:
    cd frontend
    elm-app start

build_elm_prod:
    cd frontend
    elm-app build
    # Note, needs to be changed for mac
    xcopy build/ ../resources/frontend /O /X /E /H /K