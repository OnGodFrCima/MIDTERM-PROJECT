/**
    A compositeshape made exclusively of paths. These paths were then curved and manipulated so that
    we could get the star shape. Can be seen in the scene change to the outside of the restaurant.
    
	Ethan L. Yap (244883), Ethan Lawrence Cimafranca (241172)
	March 05, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/



import java.awt.*;
import java.awt.geom.Path2D;

public class Star implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;
/** Constructor recieves the x , y, width, height, color, and rotation of the chosen shape**/
    public Star(double xPos, double yPos, double width, double height, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }
/** The star is a unique shape, hence we manipulate a path in order to create the shape. Everything
else is standard to a drawing object.**/
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
