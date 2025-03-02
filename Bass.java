import java.awt.*;
import java.awt.geom.Path2D;

public class Bass implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Bass(double xPos, double yPos, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){

        
        Path2D.Double BassFill = new Path2D.Double();
        BassFill.moveTo(538.5 + xPos, 99.4 + yPos);
        BassFill.lineTo(508.5 + xPos, 137.5 + yPos);
        BassFill.lineTo(533.9 + xPos, 127.9 + yPos);
        BassFill.lineTo(548.2 + xPos, 150.6 + yPos);
        BassFill.lineTo(545 + xPos, 100.7 + yPos);
        BassFill.closePath();
        g2d.setColor(new Color(217, 217, 217));
        g2d.fill(BassFill);

        Line Bass1 = new Line(532.5 + xPos, 131.6 + yPos, 549.7 + xPos, 158.1 + yPos, new Color(0,0,0), 2);
        Bass1.draw(g2d);

        Line Bass2 = new Line(539.1  + xPos, 96.3 + yPos, 503.5 + xPos, 141.1 + yPos, new Color(0,0,0), 2);
        Bass2.draw(g2d);
                
        Line Bass3 = new Line(503.7 + xPos, 141.4 + yPos, 532.4 + xPos, 131.3 + yPos, new Color(0,0,0), 2);
        Bass3.draw(g2d);
        
        Line Bass4 = new Line(547.7 + xPos, 100.1 + yPos, 549.6 + xPos, 158 + yPos, new Color(0,0,0), 2);
        Bass4.draw(g2d);

        //Guitar neck

        Line GuitarNeck = new Line(558 + xPos, 52.5 + yPos, 533.2 + xPos, 126.8 + yPos, new Color(0, 0,0), 5);
        GuitarNeck.draw(g2d);

        //Guitar Ellipse

        Circle tuner = new Circle(555.9 + xPos, 37.3 + yPos, 8.4, 18.7, new Color(0,0,0), 15.8);
        tuner.draw(g2d);

        //Guitar Strings

        Line LineString1 = new Line(531.5 + xPos, 124 + yPos, 557.6 + xPos, 46.4 + yPos, new Color(217, 217, 217), 1);
        LineString1.draw(g2d);

        Line LineString2 = new Line(533 + xPos, 124.6 + yPos, 559.1 + xPos, 46.9 + yPos, new Color(217, 217, 217), 1);
        LineString2.draw(g2d);
        
        Line LineString3 = new Line(534.7 + xPos, 125 + yPos, 560.7 + xPos, 47.4 + yPos, new Color(217, 217, 217), 1);
        LineString3.draw(g2d);
         
        Line LineString4 = new Line(536.3 + xPos, 125.3 + yPos, 562.3 + xPos, 47.7 + yPos, new Color(217, 217, 217), 1);
        LineString4.draw(g2d);

        Circle circle1 = new Circle(538.3 + xPos, 132.4 + yPos, 3.5, 3.6, new Color(0, 0, 0), 0);
        circle1.draw(g2d);

        Circle circle2 = new Circle(543.1 + xPos, 130.4 + yPos, 2.8, 2.8, new Color(0, 0, 0), 0);
        circle2.draw(g2d);
        
        Circle circle3 = new Circle(542.3 + xPos, 136.2 + yPos, 2.8, 2.8, new Color(0, 0, 0), 0);
        circle3.draw(g2d);
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
