import './main.css';
import { Elm } from './Main.elm';
import registerServiceWorker from './registerServiceWorker';

const app = Elm.Main.init({
    node: document.getElementById('root'),
    flags: {
        apiUrl : process.env.NODE_ENV === "production" ? "/" : "http://localhost:8080/",
    }
});
console.log(app.ports)
function registerAudioPorts() {
    let audio = null;
    function sendAudioState() {
        if (audio !== null) {
            app.ports.audioUpdated.send({
                currentTime : audio.currentTime,
                duration : audio.duration,
                playing : !audio.paused
            })
        }
    }
    app.ports.startAudio.subscribe(({ url }) => {
        console.info("Playing " + url);
        if (audio == null) {
            audio = new Audio(url);
            audio.addEventListener("timeupdate", sendAudioState);
            audio.play();
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
            audio.pause();
            audio = null;
        }
    });
    app.ports.pauseAudio.subscribe(() => {
        if (audio == null) {
            console.error("Tried to pause audio when none was playing.")
        }
        else {
            audio.pause();
            sendAudioState();
        }
    });
}

registerAudioPorts();
registerServiceWorker();
