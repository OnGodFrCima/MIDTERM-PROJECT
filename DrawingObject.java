import java.awt.*;


public interface DrawingObject {
    void draw(Graphics2D g2d);
    void adjustX(double distance);
    void adjustY(double distance);
    void adjustSize(double newSize);
    double getX();
    void rotate(double angle); 
}
