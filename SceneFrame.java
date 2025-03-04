/**
    Creates the JFrame upon which the grand canvas will be displayed. Also doubles as an instantiator for the audiplayerwithbutton
    class, where each one plays a differnt song when their button is pushed. Other than that, it acts as the layout and outline for the canvas
    screen where the shapes are drawn.
	
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
import javax.swing.*;

public class SceneFrame extends JFrame {
    private SceneCanvas canvas;
    private AudioPlayerWithButton player;
    private AudioPlayerWithButton player2;
    private AudioPlayerWithButton player3;
    private AudioPlayerWithButton player4;
    private AudioPlayerWithButton player5;

    public SceneFrame() {
        setTitle("Midterm Project-Cimafranca241172-Yap244883.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        player = new AudioPlayerWithButton("Heaven.wav"); 
        player2 = new AudioPlayerWithButton("Ventura.wav");  
        player3 = new AudioPlayerWithButton("Ligaya.wav");
        player4 = new AudioPlayerWithButton("Parokya.wav");
        player5 = new AudioPlayerWithButton("ComeTogether.wav");  
        
        canvas = new SceneCanvas(player, player2, player3, player4, player5);
        add(canvas, BorderLayout.CENTER);
        

        pack();
        setVisible(true);
    }
}

