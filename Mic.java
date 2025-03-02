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
       Circle mic = new Circle(388.7 + xPos, 36.3 + yPos, 6.4, 5.1, new Color(0, 0, 0), -26);
       mic.draw(g2d);

       Line micHousing = new Line(380 + xPos, 44 + yPos, 390.6 + xPos, 38.3 + yPos, new Color(0,0,0), 2);
       micHousing.draw(g2d);

       Triangle micButt = new Triangle(373.5 + xPos, 43.7 + yPos, 3.1, new Color(0,0,0), 100);
       micButt.draw(g2d);

       Line micLine1 = new Line(375.4 + xPos, 50 + yPos, 377.7 + xPos, 46 + yPos, new Color(0,0,0), 1);
       micLine1.draw(g2d);
       
       Line micLine2 = new Line(375.3 + xPos, 85.2 + yPos, 375.4 + xPos, 50.4 + yPos, new Color(0,0,0), 1);
       micLine2.draw(g2d);

       Line micLine3 = new Line(376.7 + xPos, 114.2 + yPos, 375.3 + xPos, 85.4 + yPos, new Color(0,0,0), 1);
       micLine3.draw(g2d);

       Line micLine4 = new Line(376.1 + xPos, 146.5 + yPos, 376.8 + xPos, 113.9 + yPos, new Color(0,0,0), 1);
       micLine4.draw(g2d);

       Path2D.Double micCurve = new Path2D.Double();
       micCurve.moveTo(376.1 + xPos, 146.5 + yPos);
       micCurve.curveTo(374.9 + xPos, 151.1 + yPos, 367.7 + xPos, 155.9 + yPos, 363.3 + xPos, 154.7 + yPos);
       g2d.draw(micCurve);

       Line micStand1 = new Line(382.5 + xPos, 48.9 + yPos, 382.6 + xPos, 42.9 + yPos, new Color(0,0,0),2);
       micStand1.draw(g2d);

       Line micStand2 = new Line(381.5 + xPos, 86.8 + yPos, 382.2 + xPos, 48.7 + yPos, new Color(0,0,0),1);
       micStand2.draw(g2d);

       Line micStand3 = new Line(381.5 + xPos, 94.6 + yPos, 381.6 + xPos, 86.8 + yPos, new Color(0,0,0),2);
       micStand3.draw(g2d);

       Line micStand4 = new Line(381.5 + xPos, 149.7 + yPos, 381.3 + xPos, 94.6 + yPos, new Color(0,0,0),1);
       micStand4.draw(g2d);


       Circle micStand5 = new Circle(379.5 + xPos, 149.4 + yPos, 4.3, 4.3, new Color(0,0,0),1);
       micStand5.draw(g2d);

       
       Circle micStand6 = new Circle(378.2 + xPos, 151.6 + yPos, 7.5, 6.4, new Color(0,0,0),1);
       micStand6.draw(g2d);

       Line micLegs1 = new Line(359.1 + xPos, 159.4 + yPos, 378.9 + xPos, 155.4 + yPos, new Color(0,0,0), 1);
       micLegs1.draw(g2d);  

       Line micLegs2 = new Line(383.4 + xPos, 151.3 + yPos, 386.9 + xPos, 148.8 + yPos, new Color(0,0,0), 1);
       micLegs2.draw(g2d);

       Line micLegs3 = new Line(403 + xPos, 165.9 + yPos, 383.6 + xPos, 155.6 + yPos, new Color(0,0,0), 1);
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

    public double getY() {
        return yPos;
    }
    
    @Override
    public void rotate(double angle) {
        this.rotationAngle += angle;
    }
    
    public boolean contains(int mouseX, int mouseY) {
    return mouseX >= xPos && mouseX <= xPos + 50 && mouseY >= yPos && mouseY <= yPos + 150;
}
}
