import java.awt.*;
import java.awt.geom.AffineTransform;

public class Drums implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Drums(double xPos, double yPos, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){
        
        AffineTransform reset = g2d.getTransform();

        //stands leftside
        Line stand1 = new Line(241.6, 163.3, 254.7, 150.4, new Color(0,0,0), 1);
        stand1.draw(g2d);

        Line stand2 = new Line(254.7, 159.7, 254.7, 91, new Color(0,0,0), 1);
        stand2.draw(g2d);

        Line stand3 = new Line(269.5, 166.1, 254.7, 150.4, new Color(0,0,0), 1);
        stand3.draw(g2d);

        Rectangle standHolder1 = new Rectangle(253.2, 116.3, 3.9, 4.7, new Color(0,0,0), 0);
        standHolder1.draw(g2d);

        Rectangle standHolder2 = new Rectangle(253.7, 85.7, 2.3, 5.2, new Color(0,0,0), 0);
        standHolder2.draw(g2d);

        Rectangle standHolder3 = new Rectangle(267.5, 138.5, 3.3, 3.1, new Color(0,0,0), 0);
        standHolder3.draw(g2d);
 
        Line stand4 = new Line(257.1, 167.5, 269.5, 156.9, new Color(0,0,0), 1);
        stand4.draw(g2d);
        
        Line stand5 = new Line(282.2, 164.5, 269, 156.9, new Color(0,0,0), 1);
        stand5.draw(g2d);

        Line stand6 = new Line(269, 156.8, 269, 141.6, new Color(0,0,0), 1);
        stand6.draw(g2d);
        
        //stands rightside
        Line stand7 = new Line(313.4, 167.5, 306.9, 161, new Color(0,0,0), 1);
        stand7.draw(g2d);

        Line stand8 = new Line(318.2, 156.9, 305.1, 164.5, new Color(0,0,0), 1);
        stand8.draw(g2d);

        Line stand9 = new Line(318.5, 157.2, 330.6, 167.5, new Color(0,0,0), 1);
        stand9.draw(g2d);

        Rectangle standHolder4 = new Rectangle(316.7, 137.5, 3, 4.1, new Color(0,0,0), 0);
        standHolder4.draw(g2d);

        Rectangle standHolder5 = new Rectangle(316.7, 124.6, 3, 3, new Color(0,0,0), 0);
        standHolder5.draw(g2d);

        Rectangle standHolder6 = new Rectangle(330.6, 116.3, 3.6, 4.7, new Color(0,0,0), 0);
        standHolder6.draw(g2d);
 
        Line stand10 = new Line(318.3, 127.6, 318.2, 156.8, new Color(0,0,0), 1);
        stand10.draw(g2d);

        Line stand11 = new Line(332.2, 150.9, 318.2, 166.1, new Color(0,0,0), 1);
        stand11.draw(g2d);

        Line stand12 = new Line(333.1, 96.1, 332.6, 159.7, new Color(0,0,0), 1);
        stand12.draw(g2d);

        Line stand13 = new Line(332.6, 150.7, 345.7, 163.3, new Color(0,0,0), 1);
        stand13.draw(g2d);

        //Low Tom outline
        Line lowTom1 = new Line(254.3, 134.7, 272.8, 138.1, new Color(0, 0,0), 2);
        lowTom1.draw(g2d);

        Line lowTom2 = new Line(259.7, 112.8, 255.7, 134.6, new Color(0, 0,0), 2);
        lowTom2.draw(g2d);

        Line lowTom3 = new Line(265.9, 117.9, 262.3, 137.3, new Color(0, 0,0), 2);
        lowTom3.draw(g2d);

        Line lowTom4 = new Line(274.7, 121.5, 271, 141.3, new Color(0, 0,0), 2);
        lowTom4.draw(g2d);

        Line lowTom5 = new Line(262.8, 112.7, 257.7, 111.7, new Color(0, 0,0), 2);
        lowTom5.draw(g2d);

        Line lowTom6 = new Line(281.8, 122, 280.7, 129, new Color(0, 0,0), 2);
        lowTom6.draw(g2d);
        
        //actual Low Tom
        Rectangle lowTomFill1 = new Rectangle(258, 113.4, 5.1, 21.1, new Color(224, 91, 91), 10.4);
        lowTomFill1.draw(g2d);
   
        Rectangle lowTomFill2 = new Rectangle(265.6, 118.6, 7.4, 17.2, new Color(224, 91, 91), 10.4);
        lowTomFill2.draw(g2d);
           
        Rectangle lowTomFill3 = new Rectangle(275.8, 121, 5.4, 11.2, new Color(224, 91, 91), 10.4);
        lowTomFill3.draw(g2d);

        //mid tom outline and fill
        Circle midTomOutline5 = new Circle(268.8, 94.9, 24.7, 5.4, new Color(0,0,0), 14.1);
        midTomOutline5.draw(g2d);

        Rectangle midTomFill2 = new Rectangle(269.2, 96.7, 5.7, 13.3, new Color(224, 91, 91), 13.9);
        midTomFill2.draw(g2d);

        Rectangle midTomFill3 = new Rectangle(276.5, 97.2, 8.8, 14.3, new Color(224, 91, 91), 13.9);
        midTomFill3.draw(g2d);
        
        Rectangle midTomFill4 = new Rectangle(285.9, 99.9, 5.4, 14.4, new Color(224, 91, 91), 13.9);
        midTomFill4.draw(g2d);

        Line midTomOutline1 = new Line(268.8, 97.4, 265, 111.6, new Color(0,0,0), 2);
        midTomOutline1.draw(g2d);

        Line midTomOutline2 = new Line(275.8, 97.3, 272.2, 110.8, new Color(0,0,0), 2);
        midTomOutline2.draw(g2d);

        Line midTomOutline3 = new Line(285.6, 99.4, 281.8, 112.8, new Color(0,0,0), 2);
        midTomOutline3.draw(g2d);

        Line midTomOutline4 = new Line(291.6, 102.5, 287.4, 117.1, new Color(0,0,0), 2);
        midTomOutline4.draw(g2d);

        //middle part of the DRUMS idk what theyre called
        Rectangle middlePartFill1 = new Rectangle(296, 102.4, 5.8, 15.5, new Color(224, 91, 91), -17.9);
        middlePartFill1.draw(g2d);

        Rectangle middlePartFill2 = new Rectangle(302.2, 99.2, 8.4, 15.5, new Color(224, 91, 91), -17.9);
        middlePartFill2.draw(g2d);

        Rectangle middlePartFill3 = new Rectangle(310.8, 97.4, 7.1, 15, new Color(224, 91, 91), -17.9);
        middlePartFill3.draw(g2d);

        Rectangle middlePartFill4 = new Rectangle(305.2, 121.7, 5.8, 3.5, new Color(224, 91, 91), -17.9);
        middlePartFill4.draw(g2d);

        Rectangle middlePartFill5 = new Rectangle(312.4, 119.9, 7.5, 4.3, new Color(224, 91, 91), -17.9);
        middlePartFill5.draw(g2d);
        
        Rectangle middlePartFill6 = new Rectangle(319, 111.7, 7.5, 11, new Color(224, 91, 91), -17.9);
        middlePartFill6.draw(g2d);


        Line middlePart1 = new Line(293.7, 110.8, 293.5, 121.8, new Color(0,0,0), 2);
        middlePart1.draw(g2d);

        Line middlePart2 = new Line(297.6, 111.3, 289.9, 111.2, new Color(0,0,0), 2);
        middlePart2.draw(g2d);

        Line middlePart3 = new Line(295.7, 102.7, 299.7, 117.2, new Color(0,0,0), 2);
        middlePart3.draw(g2d);

        Line middlePart4 = new Line(301.8, 100.1, 305.7, 113.5, new Color(0,0,0), 2);
        middlePart4.draw(g2d);

        Line middlePart5 = new Line(311.5, 97.3, 315, 110.2, new Color(0,0,0), 2);
        middlePart5.draw(g2d);

        Circle middlePart6 = new Circle (298.8, 114.3, 25.2, 8, new Color(255, 223, 194), -14.2);
        middlePart6.draw(g2d);

        //Fix this later tangina 
        // AffineTransform transform1 = new AffineTransform();
        // transform1.rotate(Math.toRadians(13.9), 273.6, 112.95);
        // g2d.setTransform(transform1);     
        
        // g2d.setColor(Color.BLACK);
        // g2d.setStroke(new BasicStroke(5));  
        // g2d.drawOval((int)336, (int)122.5, (int)28.4, (int)11.9); 

        // g2d.setTransform(reset); 


        //Snare drums

        Line snareOutline1 = new Line(322.8, 110, 329.1, 109.2, new Color(0, 0, 0), 2);
        snareOutline1.draw(g2d);

        Line snareOutline2 = new Line(327.3, 110.1, 328.6, 121.7, new Color(0, 0, 0), 2);
        snareOutline2.draw(g2d);

        Line snareOutline3 = new Line(304.7, 125.8, 330.7, 122.2, new Color(0, 0, 0), 2);
        snareOutline3.draw(g2d);

        Line snareOutline4 = new Line(305, 122, 305.3, 124.5, new Color(0, 0, 0), 2);
        snareOutline4.draw(g2d);
        
        Line snareOutline5 = new Line(312.1, 122, 312.4, 124.5, new Color(0, 0, 0), 2);
        snareOutline5.draw(g2d);

        Line snareOutline6 = new Line(321, 118.4, 321.5, 122.6, new Color(0, 0, 0), 2);
        snareOutline6.draw(g2d);

        AffineTransform transform2 = new AffineTransform();
        transform2.rotate(Math.toRadians(13.9), 277.4, 112.95);
        g2d.setTransform(transform2);
        
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(5));  
        g2d.drawOval((int)336, (int)122.5, (int)28.4, (int)11.9); 


        //actual mid tom
        Circle midTomFill1 = new Circle(336, 122.5, 27.4, 10.9, new Color(255, 223, 194), 0);
        midTomFill1.draw(g2d);

        g2d.setTransform(reset); 


        //bassDrum
        Circle bassDrum = new Circle(274.2, 124.2, 39.2, 39.2, new Color(255, 223, 194), 0);
        bassDrum.draw(g2d);

        g2d.setColor(Color.BLACK); 
        g2d.setStroke(new BasicStroke(2));  
        g2d.drawOval(273, 123, 42, 42); 
        
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