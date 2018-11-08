# Spooky

This is my repo for experimenting with more niche technologies.

It has kinda gone off the rails a bit in terms of requirements,
so that needs to be fixed but as of right now to be able to run
and work with this repo you will need:

<ul>
    <li> JDK 8 or above. It might work with 7, it'll probably work with
    anything higher than 8, I just only have 8 on my laptop right now.
    <li>
     IntelliJ with the <a href="https://cursive-ide.com/"> Cursive </a>
     and <a href = "https://klazuka.github.io/intellij-elm/"> Elm Language </a>
     plugins
    </li>
    <li> Python 3.6 and the <a href="http://www.pyinvoke.org/"> Invoke </a> command
    line tool.
    (this is used for the build process right now. LMK if you have better cross platform
    ideas.)
    </li>
    <li> <a href="https://leiningen.org/"> Leiningen </a> (Clojure build tooling)
    <li> Maven (Leiningen generates poms which are used by some build steps)
    <li> <a href="https://github.com/avh4/elm-format#atom-elm-format-installation">Elm format</a> installed.
     Follow the instructions in the IntelliJ plugin for
    configuring it to run on save. This requires a full edition of intelliJ, not
    community.
    </li>
    <li> <a href="https://github.com/halfzebra/create-elm-app"> create-elm-app</a>, 
    which you can get through npm or yarn.
    </li>
    <li> <a href="https://www.npmjs.com/">npm</a> or
     <a href="https://yarnpkg.com/en/">yarn</a>
    </li>
</ul>

And yeah, all that will kill performance of your editor. You can
also definitely get everything working in Sublime, VSCode, Atom, etc
but personally IntelliJ's integration with Java makes Clojure interop
too nice to not use.

Also, this is alot of crap; I get that. Its build tools and editor plugins
from Java, JavaScript, Python, Clojure, and Elm, which is an absolute
buttload of crosscutting knowledge required to just get shit working.

For the case of create-elm-app we can use "elm-app eject" or just
setup the webpack config ourselves and its no big issue, but for now
the simplicity of the template is worth it.

Also, this is a massive mess so do what you feel like. Just don't force
push to master and it'll probably be fine. Add some keras notebooks, write cobol
on clogs, have fun with it.

## How to get started.

Just message me and have me help you through each step. Its not
that it is too hard to do on your own, just frustrating probably.

If you are able to install everything above correctly, you can see
possible build tasks by running `invoke --list`.

### To start developing
Execute the following in two different terminals
<ul>
    <li><code>invoke start-hotreload-server</code>
    <li><code>invoke start-webpack-server</code>
</ul>

`localhost:3000` will have the Elm frontend and `localhost:8080` 
will have the Clojure ring server.

### To test it out
You can make an uberjar with `invoke make-uberjar`, which
you can run directly with `java -jar`.