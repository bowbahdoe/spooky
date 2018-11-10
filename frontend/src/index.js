import './main.css';
import { Elm } from './Main.elm';
import registerServiceWorker from './registerServiceWorker';

Elm.Main.init({
  node: document.getElementById('root'),
  flags: {
    apiUrl : process.env.NODE_ENV === "production" ? "/" : "http://localhost:8080/",

  }
});

registerServiceWorker();
