/**
	Circles galore. It's all circles. It's literally just circles grouped together to make a lumpy mess.
    How fluffy. Voila it's a cloud, a composite shape made of exclusively circles.
    
	
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

public class Cloud implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Cloud(double xPos, double yPos, double width, double height, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){
        Circle cloud1 = new Circle(16 + xPos, 65.7 + yPos, 72.1, 72.1, new Color(255,255,255), 0);
        cloud1.draw(g2d);

        Circle cloud2 = new Circle(32 + xPos, 45.2 + yPos, 72.1, 72.1, new Color(255,255,255), 0);
        cloud2.draw(g2d);

        Circle cloud3 = new Circle(58.6 + xPos, 77.7 + yPos, 79.2, 79.2, new Color(255,255,255), 0);
        cloud3.draw(g2d);

        Circle cloud4 = new Circle(70.8 + xPos, 39.7 + yPos, 79.2, 79.2, new Color(255,255,255), 0);
        cloud4.draw(g2d);

        Circle cloud5 = new Circle(101.2 + xPos, 65.7 + yPos, 79.2, 79.2, new Color(255,255,255), 0);
        cloud5.draw(g2d);

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
