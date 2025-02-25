import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    private ArrayList<DrawingObject>DrawingObjects;

    
    public SceneCanvas() {
        this.setPreferredSize(new Dimension(800, 600));
        this.DrawingObjects = new ArrayList<>();

       DrawingObjects.add(new Background(398.9, 117.9, 50, 100, 0));

       Tiles tiles1 = new Tiles(0, 0, 0);
       tiles1.adjustX(0);
       DrawingObjects.add(tiles1);

       Tiles tiles2 = new Tiles(0, 0, 0);
       tiles2.adjustX(255);
       DrawingObjects.add(tiles2);

       Tiles tiles3 = new Tiles(0, 0, 0);
       tiles3.adjustX(555);
       DrawingObjects.add(tiles3);

       DrawingObjects.add(new BackgroundStage(0, 0, 0, 0, 0));

       DrawingObjects.add(new Cymbal(234, 78.2, 40, 0)); 
       
       DrawingObjects.add(new Guitar(0, 0, 0));

       DrawingObjects.add(new Drums(0, 0, 0));

       DrawingObjects.add(new Table(0,0,0));


       Table table1 = new Table(0,0,0);
       table1.adjustX(266.4);
       table1.adjustY(12.6);
       DrawingObjects.add(table1);

       Table table2 = new Table(0,0,0);
       table2.adjustX(109.4);
       table2.adjustY(149.4);   
       DrawingObjects.add(table2);

       Table table3 = new Table(0,0,0);
       table3.adjustX(402.7);
       table3.adjustY(144.5);
       DrawingObjects.add(table3);

       Table table4 = new Table(0,0,0);
       table4.adjustX(546.9);
       table4.adjustY(10.8);
       DrawingObjects.add(table4);

       DrawingObjects.add(new Mic(0,0,0));

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

   
      

    
      
   
      

    
      
