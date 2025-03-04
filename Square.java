/**
    Another important base shape, although made purely for convenience as the rectangle can usually fulfill it's role and vice versa.
    Still dosen't change how important the square is in making more complex composite shapes.
	
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
import java.awt.geom.Rectangle2D;

public class Square implements DrawingObject{

    private double xPos, yPos, size, rotationAngle;
    private Color color;
    
    public Square(double xPos, double yPos, double size, Color color){
        this.xPos = xPos;
        this.yPos = yPos;
        this.size = size;
        this.color = color;
        this.rotationAngle = rotationAngle;
    }

    //size is same since square namanS
    public void draw(Graphics2D g2D){
        Rectangle2D.Double r = new Rectangle2D.Double(xPos, yPos, size, size);

    }

    public void adjustX(double distance){
        xPos += distance;
    }   

    public void adjustY(double distance){
        yPos += distance;
    }   

    public void adjustSize(double newSize){
        size = newSize;
    }

    public double getX(){
        return xPos;
    }

    public double getY() {
        return yPos;
    }

    public void rotate(double angle) {
        this.rotationAngle += angle;
      }
}
