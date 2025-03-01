


import java.awt.*;
import java.awt.geom.Path2D;

public class HouseOutside implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public HouseOutside(double xPos, double yPos, double width, double height, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){

        Rectangle floor = new Rectangle(94.9, 584.2, 604.7, 16.1, new Color(91, 51, 15), 0);
        floor.draw(g2d);
        
        Rectangle house = new Rectangle(212.1, 417.3, 347, 167.5, new Color(143, 78, 39), 0);
        house.draw(g2d);

        Rectangle plankSign1 = new Rectangle(209.3, 429.6, 352.6, 22.5, new Color(93, 50, 22), 0);
        plankSign1.draw(g2d);

        Rectangle plankSign2 = new Rectangle(222.1, 553.8, 117.5, 8.5, new Color(93, 50, 22), 0);
        plankSign2.draw(g2d);

        Rectangle plankSign3 = new Rectangle(222.1, 553.8, 117.5, 8.5, new Color(93, 50, 22), 0);
        plankSign3.draw(g2d);

        Rectangle jsecSign = new Rectangle(301.9, 413.3, 167.3, 47.3, new Color(245, 173, 46), 0);
        jsecSign.draw(g2d);

        Rectangle windowLeft = new Rectangle(227, 471.6, 107.8, 82.1, new Color(103, 170, 171), 0);
        windowLeft.draw(g2d);

        Rectangle windowRight = new Rectangle(227 + 208.2, 471.6, 107.8, 82.1, new Color(103, 170, 171), 0);
        windowRight.draw(g2d);

        Rectangle door = new Rectangle(349, 471.1, 73.8, 118.4, new Color(103, 170, 171), 0);
        door.draw(g2d);

        Path2D.Double doorOutline = new Path2D.Double();
        doorOutline.moveTo(351, 588.7); //bottom life
        doorOutline.lineTo(351, 473.3); //top left
        doorOutline.lineTo(421.5, 473.3); //top right
        doorOutline.lineTo(420.8, 588.7); // bottm right
        doorOutline.lineTo(350.4, 588.7); // bottm left
        doorOutline.closePath();

        g2d.setStroke(new BasicStroke(3));  
        g2d.setColor(new Color(217, 217, 217));
        g2d.draw(doorOutline);

        Line doorOutlineMiddle = new Line(384.4, 586.8, 384.4, 473, new Color(217, 217, 217), 3);
        doorOutlineMiddle.draw(g2d);


        Path2D.Double windowOutline = new Path2D.Double();
        windowOutline.moveTo(229.9, 550.7); //bottom life
        windowOutline.lineTo(229.9, 473.8); //top left
        windowOutline.lineTo(332.3, 474.3); //top right
        windowOutline.lineTo(332.6, 473.7); // bottm right
        windowOutline.lineTo(332.6, 550.6); // bottm left
        windowOutline.closePath();
        

        windowOutline.moveTo(229.9 + 208.2, 550.7); //bottom life
        windowOutline.lineTo(229.9 + 208.2, 473.8); //top left
        windowOutline.lineTo(332.3 + 208.2, 474.3); //top right
        windowOutline.lineTo(332.6 + 208.2, 473.7); // bottm right
        windowOutline.lineTo(332.6 + 208.2, 550.6); // bottm left
        windowOutline.closePath();

        g2d.setStroke(new BasicStroke(3));  
        g2d.setColor(new Color(217, 217, 217));
        g2d.draw(windowOutline);

        Triangle roofLeft = new Triangle(190.2, 420, 185.1, new Color(28, 63, 70), 0);
        roofLeft.draw(g2d);

        Rectangle roofMiddle = new Rectangle(283.4, 235, 200, 185, new Color(28, 63, 70), 0);
        roofMiddle.draw(g2d);

        Triangle roofRight = new Triangle(390.4, 420, 185.1, new Color(28, 63, 70), 0);
        roofRight.draw(g2d);

        g2d.setColor(new Color(255, 255, 255));
        g2d.setFont(new Font("Canva Sans", Font.BOLD, 40));
        g2d.drawString("JSEC", 334, 455);


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
