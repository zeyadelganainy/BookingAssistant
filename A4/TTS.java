import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TTS {
//String voiceName = "kevin16";
VoiceManager freeVM;
Voice voice;
public TTS(String words) {
    System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
    voice = VoiceManager.getInstance().getVoice("kevin16");
    if (voice != null) {
        voice.allocate();// Allocating Voice
        try {
            voice.setRate(160);// Setting the rate of the voice
            voice.setPitch(110);// Setting the Pitch of the voice
            voice.setVolume(3);// Setting the volume of the voice
            SpeakText(words);// Calling speak() method

        } catch (Exception e1) {
            e1.printStackTrace();
        }

    } else {
        throw new IllegalStateException("Cannot find voice: kevin16");
    }
}



public void SpeakText(String words) {
    voice.speak(words);
}
}