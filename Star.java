


import java.awt.*;
import java.awt.geom.Path2D;

public class Star implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Star(double xPos, double yPos, double width, double height, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){

        Path2D.Double starCurve = new Path2D.Double();

        starCurve.moveTo(13.8 + xPos, 45 + yPos);
        starCurve.curveTo(36 + xPos, 42.8 + yPos, 45.6 + xPos, 35 + yPos, 48.5 + xPos, 10 + yPos);
        starCurve.curveTo(50 + xPos, 28.5 + yPos, 55.6 + xPos, 43.2 + yPos, 83.5 + xPos, 45 + yPos);
        starCurve.curveTo(59.3 + xPos, 48.2 + yPos, 51.3 + xPos, 55 + yPos, 48.5 + xPos, 80.6 + yPos);
        starCurve.curveTo(45.7 + xPos, 57.9 + yPos, 39.5 + xPos, 47.8 + yPos, 12.4 + xPos, 45 + yPos);
        
        g2d.fill(starCurve);
 

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
