
import javax.swing.*;
import java.awt.*;

public class SceneStarter{

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Animated Scene");
        SceneCanvas canvas = new SceneCanvas();
        frame.add(canvas);

        
        JButton updateButton = new JButton("Update Scene");
        updateButton.addActionListener(e -> canvas.updateScene());  

        
        frame.setLayout(new BorderLayout());
        frame.add(updateButton, BorderLayout.SOUTH);  
        frame.add(canvas, BorderLayout.CENTER);  

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

    
    
}