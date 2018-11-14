import './main.css';
import { Elm } from './Main.elm';
import registerServiceWorker from './registerServiceWorker';
import createPlayer from 'web-audio-player'

const app = Elm.Main.init({
    node: document.getElementById('root'),
    flags: {
        apiUrl : process.env.NODE_ENV === "production" ? "/" : "http://localhost:8080/",
    }
});

function registerAudioPorts() {
    let audio = null;
    app.ports.startAudio.subscribe(({ url }) => {
        console.info("Playing " + url);
        if (audio == null) {
            audio =  createPlayer(url);
            audio.on('load', () => {
                audio.play();
                audio.node.connect(audio.context.destination);
            })
        }
        else {
            audio.play();
        }
    });
    app.ports.stopAudio.subscribe(() => {
        if (audio == null) {
            console.error("Tried to stop playing audio when none was playing.")
        }
        else {
            audio.stop();
            audio = null;
        }
    });
    app.ports.pauseAudio.subscribe(() => {
        if (audio == null) {
            console.error("Tried to pause audio when none was playing.")
        }
        else {
            audio.pause()
        }
    });
}

registerAudioPorts();
registerServiceWorker();
