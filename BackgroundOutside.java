/**
    This class makes up the exterior scene, outside the restaurant. Another composite shape that uses multiple shapes to create the
    background outside which is different from the other background and serves as a scene change.
	
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


public class BackgroundOutside implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public BackgroundOutside(double xPos, double yPos, double width, double height, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){

        Rectangle skyBottom1 = new Rectangle(0, 355.7, 800, 244.6, new Color(134, 124, 202), 0);
        skyBottom1.draw(g2d);

        Rectangle skyBottom2 = new Rectangle(0, 274.3, 800, 81.4, new Color(124, 113, 198), 0);
        skyBottom2.draw(g2d);
        
        Rectangle skyBottom3 = new Rectangle(0, 192.8, 800, 81.4, new Color(90, 75, 193), 0);
        skyBottom3.draw(g2d);

        Rectangle skyBottom4 = new Rectangle(0, 111.4, 800, 81.4, new Color(66, 48, 186), 0);
        skyBottom4.draw(g2d);

        Rectangle skyBottom5 = new Rectangle(0, 0, 800, 111.4, new Color(50, 69, 148), 0);
        skyBottom5.draw(g2d);
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
