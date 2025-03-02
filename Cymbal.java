import java.awt.*;
import java.awt.geom.AffineTransform;

public class Cymbal implements DrawingObject {
    private double x, y, width, height, angle;

    public Cymbal(double x, double y, double width, double angle) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = width / 6; // Adjusted to make the shape flatter
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
