import java.awt.*;
import java.awt.geom.Line2D;

public class Line implements DrawingObject{

    private Double xPos1, yPos1, xPos2, yPos2;
    private Color color;
    private float thickness;

    public Line(double xPos1, double yPos1, double xPos2, double yPos2, Color color, float thickness){
        this.xPos1 = xPos1;
        this.yPos1 = xPos1;
        this.xPos2 = xPos1;
        this.xPos2 = xPos1;
        this.color = color;
        this.thickness = thickness;
    }

    public void draw(Graphics2D g2d){
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.draw(new Line2D.Double(xPos1, yPos1, xPos2, yPos2));
    }

    public void adjustX(double distance){

    }
    public void adjustSize(double newSize){

    }

    public double getX(){
        return xPos;
    }
}
