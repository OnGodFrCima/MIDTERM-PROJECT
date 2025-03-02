


import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;


public class Background implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Background(double xPos, double yPos, double width, double height, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();
        //backgruonds
        Rectangle wall = new Rectangle(0, 0, 800, 173.3, new Color(61, 39, 20), 0);
        wall.draw(g2d);

        Rectangle floor = new Rectangle(0, 172.7, 800, 426.3, new Color(204, 110, 0), 0);
        floor.draw(g2d);

        Rectangle door = new Rectangle(68.3, 70.8, 64.2, 103.2, new Color(211, 146, 60), 0);
        door.draw(g2d);

        Circle doorHandle = new Circle(71.2, 115.1, 9.6, 9.6, new Color(0, 0, 0), 0);
        doorHandle.draw(g2d);

        Rectangle exitSign = new Rectangle(71.2, 39.7, 58.5, 31.1, new Color(224, 18, 18), 0);
        exitSign.draw(g2d);


        Path2D.Double exitSign2 = new Path2D.Double();
        exitSign2.moveTo(73.2, 41.7);
        exitSign2.lineTo(127.2, 41.7);
        exitSign2.lineTo(127.2, 68.8);
        exitSign2.lineTo(73.2, 68.8);
        exitSign2.closePath();
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(exitSign2);

        
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("EXIT", 78, 63);

        
        g2d.setTransform(reset);
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
