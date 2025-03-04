/**
	Another composite shape. Multiple shapes were used to form the stage shape seen in the background class.
    These may get shorter because I'm tired huhu (1:04am).
    
	
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


public class BackgroundStage implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;
/** Constructor recieves the x , y, width, height, color, and rotation of the chosen shape**/
    public BackgroundStage(double xPos, double yPos, double width, double height, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }
/** Mostly similar to other objects, aside from the use of g2d.setTransform which is used to store 
the original set after the scene change which allows free switching between the two scenes. Other than that the
rest can be referred to the drawing object.**/
    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();
        
        //Stage wall
        Rectangle stageWall = new Rectangle(217.7, 0, 364.5, 189, new Color(211, 146, 60), 0);
        stageWall.draw(g2d);
        
        Rectangle stageFloor = new Rectangle(197.3, 181.1, 403.5, 46.9, new Color(250, 205, 106), 0);
        stageFloor.draw(g2d);

        Rectangle stageFloor2 = new Rectangle(197.3, 147.1, 403.5, 35.9, new Color(243, 138, 0), 0);
        stageFloor2.draw(g2d);

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
