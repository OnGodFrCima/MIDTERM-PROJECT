/**
    (╯°□°）╯Drawing with lines is hard huhu. The outline is made using lines manipulated to create shapes,
    while the color is from an ellipse that was manipulated to fit inside the outline of the shape. This took
    a lot longer than I thought. Also a composite shape.
	
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

public class Cymbal implements DrawingObject {
    private double x, y, width, height, angle;

    public Cymbal(double x, double y, double width, double angle) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = width / 6; 
        this.angle = angle;
    }

    @Override
    public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform();
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.rotate(Math.toRadians(angle), x + width / 2, y + height / 2);

        Circle body = new Circle(x, y + height / 6, width, height, new Color(189, 166, 120), 0); // Raised circle even higher
        body.draw(g2d);

        Line line1 = new Line(x, y + height / 2, x + width, y + height / 2, Color.BLACK, 1);
        Line line2 = new Line(x, y + height / 2, x + width / 2, y, Color.BLACK, 1);
        Line line3 = new Line(x + width, y + height / 2, x + width / 2, y, Color.BLACK, 1);

        line1.draw(g2d);
        line2.draw(g2d);
        line3.draw(g2d);

        g2d.setColor(new Color(255, 215, 0));
        g2d.fillArc((int) (x + width / 3), (int) (y + height / 15), (int) (width / 3), (int) (height / 2.5), 0, 180);

        g2d.setColor(Color.BLACK);
        g2d.drawArc((int) (x + width / 3), (int) (y + height / 15), (int) (width / 3), (int) (height / 2.5), 0, 180);
    
        g2d.setTransform(reset);
    }

    @Override
    public void adjustX(double distance) {
        this.x += distance;
    }

    public void adjustY(double distance) {
        this.y += distance; 
    }

    @Override
    public void adjustSize(double newSize) {
        this.width = newSize;
        this.height = newSize / 6; // Keep the flatter ratio
    }

    @Override
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public void rotate(double angle) {
        this.angle = angle;
    }
}
