import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;


class SceneCanvas extends JComponent {
    private ArrayList<DrawingObject> drawingObjects;
    private AudioPlayerWithButton audioPlayer;
    private Rectangle clickableArea; // Invisible clickable area

    public SceneCanvas(AudioPlayerWithButton audioPlayer) {
        this.setPreferredSize(new Dimension(800, 600));
        this.audioPlayer = audioPlayer;
        this.drawingObjects = new ArrayList<>();

        // Add DrawingObjects
        drawingObjects.add(new Background(398.9, 117.9, 50, 100, 0));
        Tiles tiles1 = new Tiles(0, 0, 0);
        tiles1.adjustX(0);
        drawingObjects.add(tiles1);
        Tiles tiles2 = new Tiles(0, 0, 0);
        tiles2.adjustX(255);
        drawingObjects.add(tiles2);
        Tiles tiles3 = new Tiles(0, 0, 0);
        tiles3.adjustX(555);
        drawingObjects.add(tiles3);
        drawingObjects.add(new BackgroundStage(0, 0, 0, 0, 0));
        drawingObjects.add(new Cymbal(234, 78.2, 40, 0));
        drawingObjects.add(new Table(0, 0, 0));

        Table table1 = new Table(0, 0, 0);
        table1.adjustX(266.4);
        table1.adjustY(12.6);
        drawingObjects.add(table1);

        Table table2 = new Table(0, 0, 0);
        table2.adjustX(109.4);
        table2.adjustY(149.4);
        drawingObjects.add(table2);

        Table table3 = new Table(0, 0, 0);
        table3.adjustX(402.7);
        table3.adjustY(144.5);
        drawingObjects.add(table3);

        Table table4 = new Table(0, 0, 0);
        table4.adjustX(546.9);
        table4.adjustY(10.8);
        drawingObjects.add(table4);

        drawingObjects.add(new Mic(388.7, 36.3, -26));

        
          clickableArea = new Rectangle(360, 36, 50, 150, new Color(0, 0, 0, 0), 0);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getX() >= clickableArea.getX() && e.getX() <= clickableArea.getX() + 50 &&
                    e.getY() >= clickableArea.getY() && e.getY() <= clickableArea.getY() + 150 && audioPlayer != null) {
                    audioPlayer.togglePlayPause();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        for (DrawingObject obj : drawingObjects) {
            obj.draw(g2D);
        }
    }

    public void updateScene() {
        if (!drawingObjects.isEmpty() && drawingObjects.get(0) instanceof Circle) {
            Circle e1 = (Circle) drawingObjects.get(0);
            e1.adjustX(5);

            if (e1.getX() > this.getWidth()) {
                e1.adjustX(-this.getWidth());
            }
        }

        repaint();
    }
}

   
      

    
      
   
      

    
      
