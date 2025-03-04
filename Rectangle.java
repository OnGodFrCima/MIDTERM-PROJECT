/**
    Another base shape. The recatngle is great because it can be used for many other shapes, such as the drums
    and car shapes. A very important base shape for other composite shapes and just overall very useful.
	
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
import java.awt.geom.*;

public class Rectangle implements DrawingObject {

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;
/** Collects the x , y, width, height, color, and rotation of the chosen shape**/
    public Rectangle(double xPos, double yPos, double width, double height, Color color, double rotationAngle) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = color;
        this.rotationAngle = rotationAngle;
    }

/** Refer to the drawing object explanation**/
    public void draw(Graphics2D g2D) {

        g2D.rotate(Math.toRadians(rotationAngle), xPos + width / 2, yPos + height / 2);
        
        Rectangle2D.Double rectangle = new Rectangle2D.Double(xPos, yPos, width, height);
        g2D.setColor(color);
        g2D.fill(rectangle); 
        
        g2D.rotate(-Math.toRadians(rotationAngle), xPos + width / 2, yPos + height / 2);
    }

  
    public void adjustX(double distance) {
        xPos += distance; 
    }

    public void adjustY(double distance) {
        yPos += distance; 
    }

  
    public void adjustSize(double newSize) {
        width += newSize;
        height += newSize;
    }


    public double getX() {
        return xPos;  
    }

    public double getY() {
        return yPos;  
    }

    public void rotate(double angle) {
        this.rotationAngle += angle;
    }
}
