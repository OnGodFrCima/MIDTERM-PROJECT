


import java.awt.*;

public class Cloud implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Cloud(double xPos, double yPos, double width, double height, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){
        Circle cloud1 = new Circle(16 + xPos, 65.7 + yPos, 72.1, 72.1, new Color(255,255,255), 0);
        cloud1.draw(g2d);

        Circle cloud2 = new Circle(32 + xPos, 45.2 + yPos, 72.1, 72.1, new Color(255,255,255), 0);
        cloud2.draw(g2d);

        Circle cloud3 = new Circle(58.6 + xPos, 77.7 + yPos, 79.2, 79.2, new Color(255,255,255), 0);
        cloud3.draw(g2d);

        Circle cloud4 = new Circle(70.8 + xPos, 39.7 + yPos, 79.2, 79.2, new Color(255,255,255), 0);
        cloud4.draw(g2d);

        Circle cloud5 = new Circle(101.2 + xPos, 65.7 + yPos, 79.2, 79.2, new Color(255,255,255), 0);
        cloud5.draw(g2d);

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

    @Override
    public void rotate(double angle) {
        this.rotationAngle += angle;
    }
}
