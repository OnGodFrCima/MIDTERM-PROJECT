import java.awt.*;

public class Table implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Table(double xPos, double yPos, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){
        
        Rectangle tableLeg1 = new Rectangle(122.2 + xPos, 316.7 + yPos, 7.4, 21, new Color(61, 39, 20), 0);
        tableLeg1.draw(g2d);

        Rectangle tableLeg2 = new Rectangle(107.5 + xPos, 336.3 + yPos, 36.3, 9.4, new Color(61, 39, 20), 0);
        tableLeg2.draw(g2d);

        Rectangle tableLeg3 = new Rectangle(91.5 + xPos, 345.7 + yPos, 68.8, 10.8, new Color(61, 39, 20), 0);
        tableLeg3.draw(g2d);

        Circle table = new Circle(54.1 + xPos, 264.3 + yPos, 142, 52.7, new Color(255, 138, 0), 0);
        table.draw(g2d);

        g2d.setColor(Color.BLACK); 
        g2d.setStroke(new BasicStroke(3));  
        g2d.drawOval(54 + (int)xPos, 262 + (int)yPos, 144, 57);
        

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

    @Override
    public void rotate(double angle) {
        this.rotationAngle += angle;
    }
}
