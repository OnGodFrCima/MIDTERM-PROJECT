/**
	A very scuffed looking car made using other shapes. Made using rectangles, squares, and circles.
    Vroom-vroom.
    
	
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
import java.awt.geom.AffineTransform;

public class Car implements DrawingObject {
    private Rectangle body, roof, window;
    private Circle wheel1, wheel2;
    private double width, length;
    private double rotation;
    private double centerX, centerY;

    public Car(double x, double y, double width, double length, Color bodyColor, Color wheelColor, Color windowColor) {
        this.width = width;
        this.length = length;
        this.rotation = 0;
        double bodyWidth = width;
        double bodyHeight = length * 0.3;
        double wheelSize = length * 0.2;
        double roofWidth = width * 0.5;
        double roofHeight = length * 0.25;
        double windowWidth = width * 0.3;
        double windowHeight = roofHeight * 0.6;

        body = new Rectangle(0 + centerX, centerY + 530, bodyWidth, bodyHeight, bodyColor, 0);
        roof = new Rectangle(0 + centerX + width * 0.25, centerY + 530 - roofHeight ,roofWidth, roofHeight, bodyColor, 0);
        window = new Rectangle(0 + centerX + width * 0.35, centerY + 530 - roofHeight + length * 0.05, windowWidth, windowHeight, windowColor, 0);
        wheel1 = new Circle(0 + centerX + width * 0.1, centerY + 530 + bodyHeight ,wheelSize, wheelSize, wheelColor,0);
        wheel2 = new Circle(0 + centerX + width * 0.7, centerY + 530 + bodyHeight, wheelSize, wheelSize, wheelColor, 0);

    }

    @Override
    public void draw(Graphics2D g2D) {
        AffineTransform oldTransform = g2D.getTransform();
        g2D.translate(centerX, centerY);
        g2D.rotate(Math.toRadians(rotation));
        g2D.translate(-centerX, -centerY);
        
        body.draw(g2D);
        roof.draw(g2D);
        window.draw(g2D);
        wheel1.draw(g2D);
        wheel2.draw(g2D);
        
        g2D.setTransform(oldTransform);
    }

    @Override
    public void adjustX(double distance) {
        centerX += distance;
        body.adjustX(distance);
        roof.adjustX(distance);
        window.adjustX(distance);
        wheel1.adjustX(distance);
        wheel2.adjustX(distance);
    }

    @Override
    public void adjustY(double distance) {
        centerY += distance;
    }

    @Override
    public void adjustSize(double newLength) {
        double scaleFactor = newLength / this.length;
        this.length = newLength;
        this.width *= scaleFactor;
        
        body.adjustSize(scaleFactor);
        roof.adjustSize(scaleFactor);
        window.adjustSize(scaleFactor);
        wheel1.adjustSize(scaleFactor);
        wheel2.adjustSize(scaleFactor);
        
        centerX = body.getX() + width / 2;
        centerY = body.getY() + length * 0.3 / 2;
    }

    @Override
    public double getX() {
        return body.getX();
    }

    @Override
    public double getY() {
        return body.getY();
    }
    
    @Override
    public void rotate(double angle) {
        this.rotation += angle;
    }
}
