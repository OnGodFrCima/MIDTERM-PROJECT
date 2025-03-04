/**
	This is a template for a Java file.
	
	Ethan L. Yap (244883), Ethan Lawrence Cimafranca (241172)
	March 05, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

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
