import java.awt.*;
import javax.swing.*;

public class SceneFrame extends JFrame {
    private SceneCanvas canvas;
    private AudioPlayerWithButton player;
    private AudioPlayerWithButton player2;
    private AudioPlayerWithButton player3;
    private AudioPlayerWithButton player4;
    private AudioPlayerWithButton player5;

    public SceneFrame() {
        setTitle("Midterm Project - Cimafranca - Yap.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        player = new AudioPlayerWithButton("Heaven.wav"); 
        player2 = new AudioPlayerWithButton("Ventura.wav");  
        player3 = new AudioPlayerWithButton("Ligaya.wav");
        player4 = new AudioPlayerWithButton("Parokya.wav");
        player5 = new AudioPlayerWithButton("Maselang.wav");  
        
        canvas = new SceneCanvas(player, player2, player3, player4, player5);
        add(canvas, BorderLayout.CENTER);
        

        pack();
        setVisible(true);
    }
}

