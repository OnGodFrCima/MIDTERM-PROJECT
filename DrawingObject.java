/**
    The MVP. Just by existing, this interface ties all the shapes togeteher by providing the methods by which
    all the shapes function. Simple yet effective.
	
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

/** Contains a set of methods used by all drawing objects. Void draw allows the manipulation of shapes in an object such as setting up the
conditions of the shapes dimensions, as well as adding
shapes and other manipulations of related shapes. adjustX/Y allows for the x and y values to be edited,
similarly with adjustSize for width and height of the drawing object. getX/Y returns the x and y values of the shape
and rotate allows said shapes to be rotated. All drawing object share these methods so I won't bother explaining this on other class files
, as most of them follow exactly the same principles.**/
public interface DrawingObject {
    void draw(Graphics2D g2d);
    void adjustX(double distance);
    void adjustY(double distance);
    void adjustSize(double newSize);
    double getX();
    double getY();
    void rotate(double angle); 
}
