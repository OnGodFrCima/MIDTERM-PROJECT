import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    private ArrayList<DrawingObject>DrawingObjects;

    
    public SceneCanvas() {
        this.setPreferredSize(new Dimension(800, 600));
        this.DrawingObjects = new ArrayList<>();

        
       DrawingObjects.add(new Circle(100, 100, 50, Color.CYAN, 0));  
       DrawingObjects.add(new Circle(200, 200, 60, Color.GREEN, 0)); 
       DrawingObjects.add(new Rectangle(190, 250, 20, 50, Color.BLACK, 40)); 
       DrawingObjects.add(new Circle(500, 150, 40, Color.YELLOW, 0)); 
       DrawingObjects.add(new Triangle(600, 140, 40, Color.RED, 90)); 
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

           Graphics2D g2D = (Graphics2D) g; 

        
        for (DrawingObject obj :DrawingObjects) {
            obj.draw(g2D);
        }
    }

   
    public void updateScene() {
   
    Circle e1 = (Circle) DrawingObjects.get(0);  
    e1.adjustX(5);  

    
    if (e1.getX() > this.getWidth()) {
        e1.adjustX(-this.getWidth());  
    }

    repaint();  
}
}

   
      
   
      

    
      
