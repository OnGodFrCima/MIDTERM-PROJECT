import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class AudioPlayer {
    public static void main(String[] args) {
        try {
            
            File audioFile = new File("Heaven.wav"); 
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

           
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            
            clip.start();
            System.out.println("Playing audio...");

            
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            clip.close();
            audioStream.close();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}