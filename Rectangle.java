import java.awt.*;

public class Rectangle implements DrawingObject {

    private double xPos, yPos, width, height;
    private Color color;

    public Rectangle(double xPos, double yPos, double width, double height, Color color) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public void draw(Graphics2D g2D) {
        g2D.setColor(color);
        g2D.fillRect((int)xPos, (int)yPos, (int)width, (int)height);  
    }

  
    public void adjustX(double distance) {
        xPos += distance; 
    }

  
    public void adjustSize(double newSize) {
        width += newSize;
        height += newSize;
    }

    @Override
    public double getX() {
        return xPos;  
    }
}
