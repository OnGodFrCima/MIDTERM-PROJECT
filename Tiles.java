import java.awt.*;


public class Tiles implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Tiles(double xPos, double yPos, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){
      //THE FLOOR TILES - HORIZONTAL

      Line floorTile1 = new Line(0, 209, 194.5, 209, new Color(0,0,0), 4);
      floorTile1.draw(g2d);
      
      Line floorTile1two = new Line(603.3, 209, 800, 209, new Color(0,0,0), 4);
      floorTile1two.draw(g2d);

      Line floorTile2 = new Line(0, 246, 800, 246, new Color(0,0,0), 4);
      floorTile2.draw(g2d);

      Line floorTile3 = new Line(0, 281, 800, 281, new Color(0,0,0), 4);
      floorTile3.draw(g2d);

      Line floorTile4 = new Line(0, 305.6, 800, 305.6, new Color(0,0,0), 4);
      floorTile4.draw(g2d);

      Line floorTile5 = new Line(0, 336.3, 800, 336.3, new Color(0,0,0), 4);
      floorTile5.draw(g2d);

      Line floorTile6 = new Line(0, 367.3, 800, 367.3, new Color(0,0,0), 4);
      floorTile6.draw(g2d);

      Line floorTile7 = new Line(0, 404, 800, 404, new Color(0,0,0), 4);
      floorTile7.draw(g2d);
      
      Line floorTile8 = new Line(0, 428.6, 800, 428.6, new Color(0,0,0), 4);
      floorTile8.draw(g2d);

      Line floorTile9 = new Line(0, 456, 800, 456, new Color(0,0,0), 4);
      floorTile9.draw(g2d);

      Line floorTile10 = new Line(0, 486.6, 800, 486.8, new Color(0,0,0), 4);
      floorTile10.draw(g2d);

      Line floorTile11 = new Line(0, 523.8, 800, 523.8, new Color(0,0,0), 4);
      floorTile11.draw(g2d);

      Line floorTile12 = new Line(0, 548.3, 800, 548.3, new Color(0,0,0), 4);
      floorTile12.draw(g2d);

      Line floorTile13 = new Line(0, 574.6, 800, 574.6, new Color(0,0,0), 4);
      floorTile13.draw(g2d);

      
      //THE FLOOR TILES - VERTICAL

      Line tile1 = new Line(42 + xPos, 244, 42 + xPos, 211, new Color(0,0,0), 4);
      tile1.draw(g2d);

      Line tile2 = new Line(71.2 + xPos, 280.9, 71.2 + xPos, 246.7, new Color(0,0,0), 4);
      tile2.draw(g2d);

      Line tile3 = new Line(42 + xPos, 301, 42 + xPos, 281, new Color(0,0,0), 4);
      tile3.draw(g2d);

      Line tile4 = new Line(96.7 + xPos, 337.7, 96.7 + xPos, 308.6, new Color(0,0,0), 4);
      tile4.draw(g2d);

      Line tile5 = new Line(44 + xPos, 365.1, 44 + xPos, 340.1, new Color(0,0,0), 4);
      tile5.draw(g2d);
      
      Line tile6 = new Line(98.1 + xPos, 404, 98.1 + xPos, 369.1, new Color(0,0,0), 4);
      tile6.draw(g2d);
      
      Line tile7 = new Line(71.2 + xPos, 428.6, 71.2 + xPos, 406, new Color(0,0,0), 4);
      tile7.draw(g2d);
      
      Line tile8 = new Line(40 + xPos, 485.4, 40 + xPos, 457.6, new Color(0,0,0), 4);
      tile8.draw(g2d);
      
      Line tile9 = new Line(102.4 + xPos, 522.4, 102.4 + xPos, 486.8, new Color(0,0,0), 4);
      tile9.draw(g2d);
      
      Line tile10 = new Line(76 + xPos, 547.3, 76 + xPos, 523.7, new Color(0,0,0), 4);
      tile10.draw(g2d);
      
      Line tile11 = new Line(127.6 + xPos, 575.6, 127.6 + xPos, 549.1, new Color(0,0,0), 4);
      tile11.draw(g2d);
      
      Line tile12 = new Line(62 + xPos, 606.4, 62 + xPos, 574.6, new Color(0,0,0), 4);
      tile12.draw(g2d);
   }

    
    @Override
    public void adjustX(double distance) {
        xPos += distance;
    }

    public void adjustY(double distance) {
        yPos += distance;
    }

    @Override
    public void adjustSize(double newSize) {
        width += newSize;
        height += newSize;
    }

    @Override
    public double getX() {
        return xPos;
    }

    public double getY() {
        return yPos;
    }
    
    @Override
    public void rotate(double angle) {
        this.rotationAngle += angle;
    }
}
