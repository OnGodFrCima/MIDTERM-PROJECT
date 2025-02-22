import java.awt.*;
import java.awt.geom.*;

public class Rectangle implements DrawingObject {

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Rectangle(double xPos, double yPos, double width, double height, Color color, double rotationAngle) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = color;
        this.rotationAngle = rotationAngle;
         
    }


    public void draw(Graphics2D g2D) {

        g2D.rotate(Math.toRadians(rotationAngle), xPos + width / 2, yPos + height / 2);
        
        Rectangle2D.Double rectangle = new Rectangle2D.Double(xPos, yPos, width, height);
        g2D.setColor(color);
        g2D.fill(rectangle); 
        
        g2D.rotate(-Math.toRadians(rotationAngle), xPos + width / 2, yPos + height / 2);
    }

  
    public void adjustX(double distance) {
        xPos += distance; 
    }

  
    public void adjustSize(double newSize) {
        width += newSize;
        height += newSize;
    }


    public double getX() {
        return xPos;  
    }

    public void rotate(double angle) {
        this.rotationAngle += angle;
    }
}