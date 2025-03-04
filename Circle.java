/**
	The circle class. One of the most basic shapes hence why it is utilized almost everywhere. Makes up majority of
    the composite shapes due to how versatiole it is. Is actually an ellispes with different dimensions.
    
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

public class Circle implements DrawingObject {

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Circle(double xPos, double yPos, double width, double height, Color color, double rotationAngle) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = color;
        this.rotationAngle = rotationAngle;
    }

    @Override
    public void draw(Graphics2D g2D) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(xPos, yPos, width, height);
        g2D.setColor(color);
        g2D.rotate(Math.toRadians(rotationAngle), xPos + width / 2, yPos + height / 2);
        g2D.fill(ellipse);
        g2D.rotate(-Math.toRadians(rotationAngle), xPos + width / 2, yPos + height / 2);
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

   
