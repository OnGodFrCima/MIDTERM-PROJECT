/**
	This the class for the background of the interior of the bar. It is a composite shape made 
    of multiple shapes in order to create the image of a bar or restaurant.
	
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
import java.awt.geom.Path2D;


public class Background implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;
/** Constructor recieves the x , y, width, height, color, and rotation of the chosen shape**/
    public Background(double xPos, double yPos, double width, double height, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }
/** Normally I would refer to the drawing object explanation, but in this case, the difference between the other
objects is the use of Paths and words to make the exit sign. The rest is standard drawing object though**/
    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();
        //backgruonds
        Rectangle wall = new Rectangle(0, 0, 800, 173.3, new Color(61, 39, 20), 0);
        wall.draw(g2d);

        Rectangle floor = new Rectangle(0, 172.7, 800, 426.3, new Color(204, 110, 0), 0);
        floor.draw(g2d);

        Rectangle door = new Rectangle(68.3, 70.8, 64.2, 103.2, new Color(211, 146, 60), 0);
        door.draw(g2d);

        Circle doorHandle = new Circle(71.2, 115.1, 9.6, 9.6, new Color(0, 0, 0), 0);
        doorHandle.draw(g2d);

        Rectangle exitSign = new Rectangle(71.2, 39.7, 58.5, 31.1, new Color(224, 18, 18), 0);
        exitSign.draw(g2d);


        Path2D.Double exitSign2 = new Path2D.Double();
        exitSign2.moveTo(73.2, 41.7);
        exitSign2.lineTo(127.2, 41.7);
        exitSign2.lineTo(127.2, 68.8);
        exitSign2.lineTo(73.2, 68.8);
        exitSign2.closePath();
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(exitSign2);

        
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("EXIT", 78, 63);

        
        g2d.setTransform(reset);
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
