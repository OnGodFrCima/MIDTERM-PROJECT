import java.awt.*;
import java.awt.geom.*;

public class Circle implements DrawingObject {

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Circle(double xPos, double yPos, double width, double height, Color color, double rotationAngle) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = color;
        this.rotationAngle = rotationAngle;
    }

    @Override
    public void draw(Graphics2D g2D) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(xPos, yPos, width, height);
        g2D.setColor(color);
        g2D.rotate(Math.toRadians(rotationAngle), xPos + width / 2, yPos + height / 2);
        g2D.fill(ellipse);
        g2D.rotate(-Math.toRadians(rotationAngle), xPos + width / 2, yPos + height / 2);
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

   
