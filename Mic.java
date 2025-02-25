import java.awt.*;
import java.awt.geom.Path2D;


public class Mic implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Mic(double xPos, double yPos, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){
       Circle mic = new Circle(388.7, 36.3, 6.4, 5.1, new Color(0, 0, 0), -26);
       mic.draw(g2d);

       Line micHousing = new Line(380, 44, 390.6, 38.3, new Color(0,0,0), 2);
       micHousing.draw(g2d);

       Triangle micButt = new Triangle(373.5, 43.7, 3.1, new Color(0,0,0), 100);
       micButt.draw(g2d);

       Line micLine1 = new Line(375.4, 50, 377.7, 46, new Color(0,0,0), 1);
       micLine1.draw(g2d);
       
       Line micLine2 = new Line(375.3, 85.2, 375.4, 50.4, new Color(0,0,0), 1);
       micLine2.draw(g2d);

       Line micLine3 = new Line(376.7, 114.2, 375.3, 85.4, new Color(0,0,0), 1);
       micLine3.draw(g2d);

       Line micLine4 = new Line(376.1, 146.5, 376.8, 113.9, new Color(0,0,0), 1);
       micLine4.draw(g2d);

       Path2D.Double micCurve = new Path2D.Double();
       micCurve.moveTo(376.1, 146.5);
       micCurve.curveTo(374.9, 151.1, 367.7, 155.9, 363.3, 154.7);
       g2d.draw(micCurve);

       Line micStand1 = new Line(382.5, 48.9, 382.6, 42.9, new Color(0,0,0),2);
       micStand1.draw(g2d);

       Line micStand2 = new Line(381.5, 86.8, 382.2, 48.7, new Color(0,0,0),1);
       micStand2.draw(g2d);

       Line micStand3 = new Line(381.5, 94.6, 381.6, 86.8, new Color(0,0,0),2);
       micStand3.draw(g2d);

       Line micStand4 = new Line(381.5, 149.7, 381.3, 94.6, new Color(0,0,0),1);
       micStand4.draw(g2d);


       Circle micStand5 = new Circle(379.5, 149.4, 4.3, 4.3, new Color(0,0,0),1);
       micStand5.draw(g2d);

       
       Circle micStand6 = new Circle(378.2, 151.6, 7.5, 6.4, new Color(0,0,0),1);
       micStand6.draw(g2d);

       Line micLegs1 = new Line(359.1, 159.4, 378.9, 155.4, new Color(0,0,0), 1);
       micLegs1.draw(g2d);  

       Line micLegs2 = new Line(383.4, 151.3, 386.9, 148.8, new Color(0,0,0), 1);
       micLegs2.draw(g2d);

       Line micLegs3 = new Line(403, 165.9, 383.6, 155.6, new Color(0,0,0), 1);
       micLegs3.draw(g2d);


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
