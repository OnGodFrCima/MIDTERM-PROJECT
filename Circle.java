import java.awt.*;
import java.awt.geom.*;

public class Circle implements DrawingObject{

    private double xPos, yPos, size;
    private Color color;
    private double rotationAngle = 0;
    
    public Circle(double xPos, double yPos, double size, Color color, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.size = size;
        this.color = color;
        this.rotationAngle = rotationAngle;
    }

    //size is same since square naman
    public void draw(Graphics2D g2D){
        Ellipse2D.Double r = new Ellipse2D.Double(xPos, yPos, size, size);
        g2D.setColor(color); 
        g2D.fill(r); 

        g2D.rotate(Math.toRadians(rotationAngle), xPos + size / 2, yPos + size / 2);
        
        g2D.rotate(-Math.toRadians(rotationAngle), xPos + size / 2, yPos + size / 2);

    }

    public void adjustX(double distance){
        xPos += distance;
    }   

    public void adjustSize(double newSize){
        size += newSize;
    }

    public double getX(){
        return xPos;
    }

    public void rotate(double angle) {
        this.rotationAngle += angle;
      }
}
