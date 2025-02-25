import java.awt.*;
import javax.swing.*;

public class SceneFrame extends JFrame{

    private SceneCanvas test;

    public SceneFrame(){
        setUpGUI();
    }

public void setUpGUI(){

    setTitle("Midterm Project - Cimafranca - Yap.");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());  

    test = new SceneCanvas();  // Initialize SceneCanvas
    add(test, BorderLayout.CENTER);

    // JButton updateButton = new JButton("Update Scene");
    // updateButton.addActionListener(e -> test.updateScene());
    // add(updateButton, BorderLayout.SOUTH);
    pack();

    setVisible(true);
    }
}   
