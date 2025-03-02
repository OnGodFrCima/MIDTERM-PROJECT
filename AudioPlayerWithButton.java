import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;

class AudioPlayerWithButton extends JPanel {
    private static AudioPlayerWithButton currentlyPlaying = null;
    private Clip clip;
    private JButton playPauseButton;

    public AudioPlayerWithButton(String filePath) {
        playPauseButton = new JButton("Play");
        playPauseButton.setPreferredSize(new Dimension(100, 50));
        playPauseButton.setOpaque(false);
        playPauseButton.setContentAreaFilled(false);
        playPauseButton.setBorderPainted(false);
        playPauseButton.setForeground(new Color(0, 0, 0, 0));

        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);

            playPauseButton.addActionListener(e -> togglePlayPause());
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void togglePlayPause() {
    if (clip != null) {
            if (currentlyPlaying != null && currentlyPlaying != this) {
                currentlyPlaying.stopPlayback(); 
            }

            clip.setFramePosition(0); 
            clip.start();
            currentlyPlaying = this;

        }
}
    public void stopPlayback() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            currentlyPlaying = null;
        }
    }

    public JButton getPlayPauseButton() {
        return playPauseButton;
    }
}
