import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;

class SceneCanvas extends JComponent {
    private ArrayList<DrawingObject> DrawingObjects;
    private AudioPlayerWithButton audioPlayer1;
    private AudioPlayerWithButton audioPlayer2;
    private AudioPlayerWithButton audioPlayer3;
    private AudioPlayerWithButton audioPlayer4;
    private AudioPlayerWithButton audioPlayer5;
    private Rectangle clickableArea1;
    private Rectangle clickableArea2;
    private Rectangle clickableArea3;
    private Rectangle clickableArea4;
    private Rectangle clickableArea5;
    

    public SceneCanvas(AudioPlayerWithButton audioPlayer1, AudioPlayerWithButton audioPlayer2, AudioPlayerWithButton audioPlayer3, AudioPlayerWithButton audioPlayer4, AudioPlayerWithButton audioPlayer5) {
        this.setPreferredSize(new Dimension(800, 600));
        this.audioPlayer1 = audioPlayer1;
        this.audioPlayer2 = audioPlayer2;
        this.audioPlayer3 = audioPlayer3;
        this.audioPlayer4 = audioPlayer4;
        this.audioPlayer5 = audioPlayer5;
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
        DrawingObjects.add(new Table(0, 0, 0));

        Table table1 = new Table(0, 0, 0);
        table1.adjustX(266.4);
        table1.adjustY(12.6);
        DrawingObjects.add(table1);

        Table table2 = new Table(0, 0, 0);
        table2.adjustX(109.4);
        table2.adjustY(149.4);
        DrawingObjects.add(table2);

        Table table3 = new Table(0, 0, 0);
        table3.adjustX(402.7);
        table3.adjustY(144.5);
        DrawingObjects.add(table3);

        Table table4 = new Table(0, 0, 0);
        table4.adjustX(546.9);
        table4.adjustY(10.8);
        DrawingObjects.add(table4);

        DrawingObjects.add(new Mic(388.7, 36.3, -26));
        DrawingObjects.add(new Guitar(20, 0, 0));
        DrawingObjects.add(new Drums(0, 0, 0));
        DrawingObjects.add(new Bass(0, 0, 0));

        
        clickableArea1 = new Rectangle(100, 170, 50, 150, new Color(0, 0, 0, 0), 0);
        clickableArea2 = new Rectangle(360, 170, 50, 150, new Color(0, 0, 0, 0), 0);
        clickableArea3 = new Rectangle(630, 170, 50, 150, new Color(0, 0, 0, 0), 0);
        clickableArea4 = new Rectangle(200, 300, 50, 150, new Color(0, 0, 0, 0), 0);
        clickableArea5 = new Rectangle(500, 300, 50, 150, new Color(0, 0, 0, 0), 0);



        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getX() >= clickableArea1.getX() && e.getX() <= clickableArea1.getX() + 50 &&
                    e.getY() >= clickableArea1.getY() && e.getY() <= clickableArea1.getY() + 150 && audioPlayer1 != null) {
                    audioPlayer2.stopPlayback();
                    audioPlayer3.stopPlayback();
                    audioPlayer4.stopPlayback();
                    audioPlayer5.stopPlayback();
                    audioPlayer1.togglePlayPause();
                }
                if (e.getX() >= clickableArea2.getX() && e.getX() <= clickableArea2.getX() + 50 &&
                    e.getY() >= clickableArea2.getY() && e.getY() <= clickableArea2.getY() + 150 && audioPlayer2 != null) {
                    audioPlayer1.stopPlayback();
                    audioPlayer3.stopPlayback();
                    audioPlayer4.stopPlayback();
                    audioPlayer5.stopPlayback();
                    audioPlayer2.togglePlayPause();

                }
                if (e.getX() >= clickableArea3.getX() && e.getX() <= clickableArea3.getX() + 50 &&
                    e.getY() >= clickableArea3.getY() && e.getY() <= clickableArea3.getY() + 150 && audioPlayer3 != null) {
                    audioPlayer1.stopPlayback();
                    audioPlayer2.stopPlayback();
                    audioPlayer4.stopPlayback();
                    audioPlayer5.stopPlayback();
                    audioPlayer3.togglePlayPause();
                }
                 if (e.getX() >= clickableArea4.getX() && e.getX() <= clickableArea4.getX() + 50 &&
                    e.getY() >= clickableArea4.getY() && e.getY() <= clickableArea4.getY() + 150 && audioPlayer4 != null) {
                    audioPlayer1.stopPlayback();
                    audioPlayer2.stopPlayback();
                    audioPlayer3.stopPlayback();
                    audioPlayer5.stopPlayback();
                    audioPlayer4.togglePlayPause();
                }
                if (e.getX() >= clickableArea5.getX() && e.getX() <= clickableArea5.getX() + 50 &&
                    e.getY() >= clickableArea5.getY() && e.getY() <= clickableArea5.getY() + 150 && audioPlayer5 != null) {
                    audioPlayer1.stopPlayback();
                    audioPlayer2.stopPlayback();
                    audioPlayer3.stopPlayback();
                    audioPlayer4.stopPlayback();
                    audioPlayer5.togglePlayPause();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        for (DrawingObject obj : DrawingObjects) {
            obj.draw(g2D);
        }
    }

    public void updateScene() {
        if (!DrawingObjects.isEmpty() && DrawingObjects.get(0) instanceof Circle) {
            Circle e1 = (Circle) DrawingObjects.get(0);
            e1.adjustX(5);

            if (e1.getX() > this.getWidth()) {
                e1.adjustX(-this.getWidth());
            }
        }
        repaint();
    }
}