import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square implements DrawingObject{

    private double xPos, yPos, size;
    private Color color;
    
    public Square(double xPos, double yPos, double size, Color color){
        this.xPos = xPos;
        this.yPos = yPos;
        this.size = size;
        this.color = color;
    }

    //size is same since square namanS
    public void draw(Graphics2D g2D){
        Rectangle2D.Double r = new Rectangle2D.Double(xPos, yPos, size, size);

    }

    public void adjustX(double distance){
        xPos += distance;
    }   

    public void adjustSize(double newSize){
        size = newSize;
    }

    public double getX(){
        return xPos;
    }

}
