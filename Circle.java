import java.awt.*;
import java.awt.geom.*;

public class Circle {

    private double xPos, yPos, size;
    private Color color;
    
    public Circle(double xPos, double yPos, double size, Color color){
        this.xPos = xPos;
        this.yPos = yPos;
        this.size = size;
        this.color = color;
    }

    //size is same since square naman
    public void draw(Graphics2D g2D){
        Ellipse2D.Double r = new Ellipse2D.Double(xPos, yPos, size, size);

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
}
