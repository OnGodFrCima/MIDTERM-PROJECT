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
        BassFill.moveTo(538.5, 99.4);
        BassFill.lineTo(508.5, 137.5);
        BassFill.lineTo(533.9, 127.9);
        BassFill.lineTo(548.2, 150.6);
        BassFill.lineTo(545, 100.7);
        BassFill.closePath();
        g2d.setColor(new Color(217, 217, 217));
        g2d.fill(BassFill);

        Line Bass1 = new Line(532.5 , 131.6, 549.7, 158.1, new Color(0,0,0), 2);
        Bass1.draw(g2d);

        Line Bass2 = new Line(539.1 , 96.3, 503.5, 141.1, new Color(0,0,0), 2);
        Bass2.draw(g2d);
                
        Line Bass3 = new Line(503.7, 141.4, 532.4, 131.3, new Color(0,0,0), 2);
        Bass3.draw(g2d);
        
        Line Bass4 = new Line(547.7, 100.1, 549.6, 158, new Color(0,0,0), 2);
        Bass4.draw(g2d);

        //Guitar neck

        Line GuitarNeck = new Line(558, 52.5, 533.2, 126.8, new Color(0, 0,0), 5);
        GuitarNeck.draw(g2d);

        //Guitar Ellipse

        Circle tuner = new Circle(555.9, 37.3, 8.4, 18.7, new Color(0,0,0), 15.8);
        tuner.draw(g2d);

        //Guitar Strings

        Line LineString1 = new Line(531.5, 124, 557.6, 46.4, new Color(217, 217, 217), 1);
        LineString1.draw(g2d);

        Line LineString2 = new Line(533, 124.6, 559.1, 46.9, new Color(217, 217, 217), 1);
        LineString2.draw(g2d);
        
        Line LineString3 = new Line(534.7, 125, 560.7, 47.4, new Color(217, 217, 217), 1);
        LineString3.draw(g2d);
         
        Line LineString4 = new Line(536.3, 125.3, 562.3, 47.7, new Color(217, 217, 217), 1);
        LineString4.draw(g2d);

        Circle circle1 = new Circle(538.3, 132.4, 3.5, 3.6, new Color(0, 0, 0), 0);
        circle1.draw(g2d);

        Circle circle2 = new Circle(543.1, 130.4, 2.8, 2.8, new Color(0, 0, 0), 0);
        circle2.draw(g2d);
        
        Circle circle3 = new Circle(542.3, 136.2, 2.8, 2.8, new Color(0, 0, 0), 0);
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

    @Override
    public void rotate(double angle) {
        this.rotationAngle += angle;
    }
}