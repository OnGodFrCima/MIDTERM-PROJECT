


import java.awt.*;


public class BackgroundOutside implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public BackgroundOutside(double xPos, double yPos, double width, double height, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){

        Rectangle skyBottom1 = new Rectangle(0, 355.7, 800, 244.6, new Color(134, 124, 202), 0);
        skyBottom1.draw(g2d);

        Rectangle skyBottom2 = new Rectangle(0, 274.3, 800, 81.4, new Color(124, 113, 198), 0);
        skyBottom2.draw(g2d);
        
        Rectangle skyBottom3 = new Rectangle(0, 192.8, 800, 81.4, new Color(90, 75, 193), 0);
        skyBottom3.draw(g2d);

        Rectangle skyBottom4 = new Rectangle(0, 111.4, 800, 81.4, new Color(66, 48, 186), 0);
        skyBottom4.draw(g2d);

        Rectangle skyBottom5 = new Rectangle(0, 0, 800, 111.4, new Color(50, 69, 148), 0);
        skyBottom5.draw(g2d);
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
