import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;

class SceneCanvas extends JComponent {
    private ArrayList<DrawingObject> DrawingObjects;
    private ArrayList<DrawingObject> DrawingObjectsOutside;

    private boolean micMoving = true; 
    private boolean guitarMoving = true; 
    private boolean drumsMoving = true; 
    private boolean bassMoving = true;  
    private boolean cymbalMoving1 = true;  
    private boolean cymbalMoving2 = true;  
    private boolean cymbalMoving3 = true;     
   

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
    private Rectangle clickableArea6;
    private Rectangle clickableArea7;
    private boolean inside = true;

    public SceneCanvas(AudioPlayerWithButton audioPlayer1, AudioPlayerWithButton audioPlayer2, AudioPlayerWithButton audioPlayer3, AudioPlayerWithButton audioPlayer4, AudioPlayerWithButton audioPlayer5) {
        this.setPreferredSize(new Dimension(800, 600));
        this.audioPlayer1 = audioPlayer1;
        this.audioPlayer2 = audioPlayer2;
        this.audioPlayer3 = audioPlayer3;
        this.audioPlayer4 = audioPlayer4;
        this.audioPlayer5 = audioPlayer5;
        this.DrawingObjects = new ArrayList<>();
        this.DrawingObjectsOutside = new ArrayList<>();

        //INSIDE THE RESTAURANT
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


        Mic mic = new Mic(0, 0, 0);
        DrawingObjects.add(mic);
        
        Timer timerMic = new Timer(100, y -> { 
            if (micMoving) {
                mic.adjustY(2); 
                if (mic.getY() >= 10.4) {  
                    micMoving = false; 
                }
            } 
            
            else {
                mic.adjustY(-5);
                if (mic.getY() <= 20.4) { 
                    micMoving = true; 
                }
            }
            repaint();
        });
        timerMic.start();
  
        Guitar guitar = new Guitar(20, 0, 0);
        DrawingObjects.add(guitar);
        
        Timer timerGuitar = new Timer(100, y -> { 
            if (guitarMoving) {
                guitar.adjustY(2); 
                
                if (mic.getY() >= 10.4) {  
                    guitarMoving = false; 
                }
            } 
            
            else {
                guitar.adjustY(-5);
                if (guitar.getY() <= 20.4) { 
                    guitarMoving = true; 
                }
            }
            repaint();
        });
        timerGuitar.start();

        Drums drums = new Drums(0, 0, 0);
        DrawingObjects.add(drums);

        Timer timerDrum = new Timer(100, y -> { 
            if (drumsMoving) {
                drums.adjustY(2); 
                
                if (drums.getY() >= 10.4) {  
                    drumsMoving = false; 
                }

            } 
            
            else {
                drums.adjustY(-5);
                if (drums.getY() <= 20.4) { 
                    drumsMoving = true; 
                }
            }
            repaint();
        });
        timerDrum.start();

        Bass bass = new Bass(0, 0, 0);
        DrawingObjects.add(bass);

        Timer timerBass = new Timer(100, y -> { 
            if (bassMoving) {
                bass.adjustY(2); 
                if (mic.getY() >= 10.4) {  
                    bassMoving = false; 
                }
            } 
            
            else {
                bass.adjustY(-5);
                if (bass.getY() <= 20.4) { 
                    bassMoving = true; 
                }
            }
            repaint();
        });
        timerBass.start();
        
        Cymbal cymbal1 = new Cymbal(234, 78.2, 40, 0);
        DrawingObjects.add(cymbal1);

        Timer timerCymbal1 = new Timer(100, y -> { 
            if (cymbalMoving1) {
                cymbal1.adjustY(2); 
                if (cymbal1.getY() >= 88.6) {  
                    cymbalMoving1 = false; 
                }
            } 
            
            else {
                cymbal1.adjustY(-5);
                if (cymbal1.getY() <= 98.6) { 
                    cymbalMoving1 = true; 
                }
            }
            repaint();
        });
        timerCymbal1.start();

        Cymbal cymbal2 = new Cymbal(313, 78.2, 40, 0);
        DrawingObjects.add(cymbal2);

        Timer timerCymbal2 = new Timer(100, y -> { 
            if (cymbalMoving2) {
                cymbal2.adjustY(2); 
                if (cymbal2.getY() >= 88.6) {  
                    cymbalMoving2 = false; 
                }
            } 
            
            else {
                cymbal2.adjustY(-5);
                if (cymbal2.getY() <= 98.6) { 
                    cymbalMoving2 = true; 
                }
            }
            repaint();
        });
        timerCymbal2.start();


        Cymbal cymbal3 = new Cymbal(313, 88.2, 40, 180);
        DrawingObjects.add(cymbal3);

        Timer timerCymbal3 = new Timer(100, y -> { 
            if (cymbalMoving3) {
                cymbal3.adjustY(2); 
                if (cymbal3.getY() >= 98.6) {  
                    cymbalMoving3 = false; 
                }
            } 
            
            else {
                cymbal3.adjustY(-5);
                if (cymbal3.getY() <= 108.6) { 
                    cymbalMoving3 = true; 
                }
            }
            repaint();
        });
        timerCymbal3.start();

        
        clickableArea1 = new Rectangle(100, 170, 50, 150, new Color(250, 0, 0, 0), 0);
        clickableArea2 = new Rectangle(360, 170, 50, 150, new Color(0, 0, 0, 0), 0);
        clickableArea3 = new Rectangle(630, 170, 50, 150, new Color(0, 0, 0, 0), 0);
        clickableArea4 = new Rectangle(200, 300, 50, 150, new Color(0, 0, 0, 0), 0);
        clickableArea5 = new Rectangle(500, 300, 50, 150, new Color(0, 0, 0, 0), 0);
        clickableArea6 = new Rectangle(68.3, 70.8, 64.2, 103.2, new Color(0, 0, 0, 0), 0);
                                
        clickableArea7 = new Rectangle(349, 471.1, 73.8, 118.4, new Color(0, 0, 0, 0), 0);



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

                if (e.getX() >= clickableArea6.getX() && e.getX() <= clickableArea6.getX() + 64.2 && 
                    e.getY() >= clickableArea6.getY() && e.getY() <= clickableArea6.getY() + 103.2){
                        System.out.println("yes daddy");
                        DrawingObjects.clear();
                        inside = false;
                        clickableArea1 = new Rectangle(0, 0, 0, 0, new Color(0,0,0), 0);
                        clickableArea2 = new Rectangle(0, 0, 0, 0, new Color(0,0,0), 0);
                        clickableArea3 = new Rectangle(0, 0, 0, 0, new Color(0,0,0), 0);
                        clickableArea4 = new Rectangle(0, 0, 0, 0, new Color(0,0,0), 0);
                        clickableArea5 = new Rectangle(0, 0, 0, 0, new Color(0,0,0), 0);
                        clickableArea6 = new Rectangle(0, 0, 0, 0, new Color(0,0,0), 0);
                    
                        repaint();
                    }

                    if (e.getX() >= clickableArea7.getX() && e.getX() <= clickableArea7.getX() + 73.8 && 
                    e.getY() >= clickableArea7.getY() && e.getY() <= clickableArea7.getY() + 118.4){
                        System.out.println("Going inside daddy");
                        DrawingObjects.clear();
                        inside = true;

                        clickableArea1 = new Rectangle(100, 170, 50, 150, new Color(250, 0, 0, 0), 0);
                        clickableArea2 = new Rectangle(360, 170, 50, 150, new Color(0, 0, 0, 0), 0);
                        clickableArea3 = new Rectangle(630, 170, 50, 150, new Color(0, 0, 0, 0), 0);
                        clickableArea4 = new Rectangle(200, 300, 50, 150, new Color(0, 0, 0, 0), 0);
                        clickableArea5 = new Rectangle(500, 300, 50, 150, new Color(0, 0, 0, 0), 0);
                        clickableArea6 = new Rectangle(68.3, 70.8, 64.2, 103.2, new Color(0, 0, 0, 0), 0);
                        
                        //INSIDE THE RESTAURANT
                        DrawingObjects.add(new Background(398.9, 117.9, 50, 100, 0));

                        DrawingObjects.add(tiles1);


                        DrawingObjects.add(tiles2);
           
                        DrawingObjects.add(tiles3);
                        
                        DrawingObjects.add(new BackgroundStage(0, 0, 0, 0, 0));
                        DrawingObjects.add(new Table(0, 0, 0));

                        DrawingObjects.add(table1);

                        DrawingObjects.add(table2);
                
                        DrawingObjects.add(table3);
                
                        DrawingObjects.add(table4);
                
                        DrawingObjects.add(mic);

                        DrawingObjects.add(guitar);
                        
                        DrawingObjects.add(drums);
                        
                        DrawingObjects.add(cymbal1);
                        DrawingObjects.add(cymbal2);
                        DrawingObjects.add(cymbal3);

                        DrawingObjects.add(bass);
                    }
            }
            });


    //OUTSIDE THE RESTAURANT
        DrawingObjectsOutside.add(new BackgroundOutside(0, 0, 0, 0, 0));
        DrawingObjectsOutside.add(new HouseOutside(0, 0, 0, 0, 0));

        Cloud e1 = new Cloud(0,0,0,0,0);
        DrawingObjectsOutside.add(e1);

        Cloud e2 = new Cloud(255,52,0,0,0);
        DrawingObjectsOutside.add(e2);

        Cloud e3 = new Cloud(555,0,0,0,0);
        DrawingObjectsOutside.add(e3);

        Cloud e4 = new Cloud(700,22,0,0,0);
        DrawingObjectsOutside.add(e4);

        int randomNumX = (int)(Math.random() * 800);
        int randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX,randomNumY,0,0,0));

        DrawingObjectsOutside.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX + 50, randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX + 150,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX + 200,randomNumY,0,0,0));

        DrawingObjectsOutside.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX,randomNumY,0,0,0));

        DrawingObjectsOutside.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX + 50, randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX + 150,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 800);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjectsOutside.add(new Star(randomNumX + 200,randomNumY,0,0,0));

        
        Timer timer = new Timer(50, e -> { 
            e1.adjustX(5); 

            if (e1.getX() > this.getWidth()) {
                e1.adjustX(-this.getWidth()-300); 
            }
            repaint(); 
        });
        timer.start();

        Timer timer2 = new Timer(100, e -> { 
            e2.adjustX(4); 

            if (e2.getX() > this.getWidth()) {
                e2.adjustX(-this.getWidth()-300); 
            }
            repaint(); 
        });
        timer2.start();

        Timer timer3 = new Timer(40, e -> { 
            e3.adjustX(8); 

            if (e3.getX() > this.getWidth()) {
                e3.adjustX(-this.getWidth()-300); 
            }
            repaint(); 
        });
        timer3.start();

        Timer timer4 = new Timer(40, e -> { 
            e4.adjustX(6); 

            if (e4.getX() > this.getWidth()) {
                e4.adjustX(-this.getWidth()-300); 
            }
            repaint(); 
        });
        timer4.start();

        }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        if (inside == true){
        for (DrawingObject obj : DrawingObjects) {
            obj.draw(g2D);
        }
        
    }
        else if (inside != true){
            for (DrawingObject obj : DrawingObjectsOutside) {
                obj.draw(g2D);
            }
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
