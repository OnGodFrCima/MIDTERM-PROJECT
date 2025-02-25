import java.awt.*;
import java.awt.geom.Line2D;

public class Line implements DrawingObject {

    private double xPos1, yPos1, xPos2, yPos2;
    private Color color;
    private float thickness;

    // Constructor
    public Line(double xPos1, double yPos1, double xPos2, double yPos2, Color color, float thickness) {
        this.xPos1 = xPos1;
        this.yPos1 = yPos1;
        this.xPos2 = xPos2;
        this.yPos2 = yPos2;
        this.color = color;
        this.thickness = thickness;
    }

    
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.draw(new Line2D.Double(xPos1, yPos1, xPos2, yPos2));
    }

    @Override
    public void adjustX(double distance) {
        this.xPos1 += distance;
        this.xPos2 += distance;
    }

    public void adjustY(double distance) {
        this.yPos1 += distance;
        this.yPos2 += distance;
    }

    
    @Override
    public void adjustSize(double newSize) {
        double deltaX = xPos2 - xPos1;
        double deltaY = yPos2 - yPos1;

       
        xPos2 = xPos1 + deltaX * newSize;
        yPos2 = yPos1 + deltaY * newSize;
    }

    @Override
    public double getX() {
        return xPos1;
    }

    @Override
    public void rotate(double angle) {
        double radians = Math.toRadians(angle);

        double newX1 = Math.cos(radians) * xPos1 - Math.sin(radians) * yPos1;
        double newY1 = Math.sin(radians) * xPos1 + Math.cos(radians) * yPos1;

    
        double newX2 = Math.cos(radians) * xPos2 - Math.sin(radians) * yPos2;
        double newY2 = Math.sin(radians) * xPos2 + Math.cos(radians) * yPos2;

       
        xPos1 = newX1;
        yPos1 = newY1;
        xPos2 = newX2;
        yPos2 = newY2;
    }
}
