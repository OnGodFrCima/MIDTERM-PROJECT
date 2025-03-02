


import java.awt.*;
import java.awt.geom.AffineTransform;


public class BackgroundStage implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public BackgroundStage(double xPos, double yPos, double width, double height, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();
        
        //Stage wall
        Rectangle stageWall = new Rectangle(217.7, 0, 364.5, 189, new Color(211, 146, 60), 0);
        stageWall.draw(g2d);
        
        Rectangle stageFloor = new Rectangle(197.3, 181.1, 403.5, 46.9, new Color(250, 205, 106), 0);
        stageFloor.draw(g2d);

        Rectangle stageFloor2 = new Rectangle(197.3, 147.1, 403.5, 35.9, new Color(243, 138, 0), 0);
        stageFloor2.draw(g2d);

        g2d.setTransform(reset);
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
