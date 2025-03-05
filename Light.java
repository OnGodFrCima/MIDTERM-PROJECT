/** 
    Stage Lights that alternate colors every few seconds. 
	
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


public class Light implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    //initialize values
    public Light(double xPos, double yPos, double height, Color color, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.height = height;
        this.color = color;
        this.rotationAngle = rotationAngle;
    }

    //draw graphics
    public void draw(Graphics2D g2d){
        Triangle lightLeft = new Triangle(xPos, yPos, height, color, rotationAngle);
        lightLeft.draw(g2d);

   }

    //change x distance
    @Override
    public void adjustX(double distance) {
        xPos += distance;
    }

    
    //change y distance
    public void adjustY(double distance) {
        yPos += distance;
    }

    
    //change size
    @Override
    public void adjustSize(double newSize) {
        width += newSize;
        height += newSize;
    }

    
    //get x
    @Override
    public double getX() {
        return xPos;
    }

    
    //get y value
    public double getY() {
        return yPos;
    }
    
    
    //rotates at an angle
    @Override
    public void rotate(double angle) {
        this.rotationAngle += angle;
    }

    //gets current color to swap later on
    public Color getColor(){
        return color;
    }  

    //sets color to a new one inputted
    public void setColor(Color newColor){
        this.color = newColor;
    }
    
}
