import java.awt.*;
import javax.swing.*;

public class SceneFrame extends JFrame {
    private SceneCanvas canvas;
    private AudioPlayerWithButton player;

    public SceneFrame() {
        setTitle("Midterm Project - Cimafranca - Yap.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        player = new AudioPlayerWithButton("Heaven.wav");  
        canvas = new SceneCanvas(player);
        add(canvas, BorderLayout.CENTER);
        

        pack();
        setVisible(true);
    }
}

