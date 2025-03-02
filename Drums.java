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
        Line stand1 = new Line(241.6 + xPos, 163.3 + yPos, 254.7 + xPos, 150.4 + yPos, new Color(0,0,0), 1);
        stand1.draw(g2d);

        Line stand2 = new Line(254.7 + xPos, 159.7 + yPos, 254.7 + xPos, 91 + yPos, new Color(0,0,0), 1);
        stand2.draw(g2d);

        Line stand3 = new Line(269.5 + xPos, 166.1 + yPos, 254.7 + xPos, 150.4 + yPos, new Color(0,0,0), 1);
        stand3.draw(g2d);

        Rectangle standHolder1 = new Rectangle(253.2 + xPos, 116.3 + yPos, 3.9, 4.7, new Color(0,0,0), 0);
        standHolder1.draw(g2d);

        Rectangle standHolder2 = new Rectangle(253.7 + xPos, 85.7 + yPos, 2.3, 5.2, new Color(0,0,0), 0);
        standHolder2.draw(g2d);

        Rectangle standHolder3 = new Rectangle(267.5 + xPos, 138.5 + yPos, 3.3, 3.1, new Color(0,0,0), 0);
        standHolder3.draw(g2d);
 
        Line stand4 = new Line(257.1 + xPos, 167.5 + yPos, 269.5 + xPos, 156.9 + yPos, new Color(0,0,0), 1);
        stand4.draw(g2d);
        
        Line stand5 = new Line(282.2 + xPos, 164.5 + yPos, 269 + xPos, 156.9 + yPos, new Color(0,0,0), 1);
        stand5.draw(g2d);

        Line stand6 = new Line(269 + xPos, 156.8 + yPos, 269 + xPos, 141.6 + yPos, new Color(0,0,0), 1);
        stand6.draw(g2d);
        
        //stands rightside
        Line stand7 = new Line(313.4 + xPos, 167.5 + yPos, 306.9 + xPos, 161 + yPos, new Color(0,0,0), 1);
        stand7.draw(g2d);

        Line stand8 = new Line(318.2 + xPos, 156.9 + yPos, 305.1 + xPos, 164.5 + yPos, new Color(0,0,0), 1);
        stand8.draw(g2d);

        Line stand9 = new Line(318.5 + xPos, 157.2 + yPos, 330.6 + xPos, 167.5 + yPos, new Color(0,0,0), 1);
        stand9.draw(g2d);

        Rectangle standHolder4 = new Rectangle(316.7 + xPos, 137.5 + yPos, 3, 4.1, new Color(0,0,0), 0);
        standHolder4.draw(g2d);

        Rectangle standHolder5 = new Rectangle(316.7 + xPos, 124.6 + yPos, 3, 3, new Color(0,0,0), 0);
        standHolder5.draw(g2d);

        Rectangle standHolder6 = new Rectangle(330.6 + xPos, 116.3 + yPos, 3.6, 4.7, new Color(0,0,0), 0);
        standHolder6.draw(g2d);
 
        Line stand10 = new Line(318.3 + xPos, 127.6 + yPos, 318.2 + xPos, 156.8 + yPos, new Color(0,0,0), 1);
        stand10.draw(g2d);

        Line stand11 = new Line(332.2 + xPos, 150.9 + yPos, 318.2 + xPos, 166.1 + yPos, new Color(0,0,0), 1);
        stand11.draw(g2d);

        Line stand12 = new Line(333.1 + xPos, 96.1 + yPos, 332.6 + xPos, 159.7 + yPos, new Color(0,0,0), 1);
        stand12.draw(g2d);

        Line stand13 = new Line(332.6 + xPos, 150.7 + yPos, 345.7 + xPos, 163.3 + yPos, new Color(0,0,0), 1);
        stand13.draw(g2d);

        //Low Tom outline
        Line lowTom1 = new Line(254.3 + xPos, 134.7 + yPos, 272.8 + xPos, 138.1 + yPos, new Color(0, 0,0), 2);
        lowTom1.draw(g2d);

        Line lowTom2 = new Line(259.7 + xPos, 112.8 + yPos, 255.7 + xPos, 134.6 + yPos, new Color(0, 0,0), 2);
        lowTom2.draw(g2d);

        Line lowTom3 = new Line(265.9 + xPos, 117.9 + yPos, 262.3 + xPos, 137.3 + yPos, new Color(0, 0,0), 2);
        lowTom3.draw(g2d);

        Line lowTom4 = new Line(274.7 + xPos, 121.5 + yPos, 271 + xPos, 141.3 + yPos, new Color(0, 0,0), 2);
        lowTom4.draw(g2d);

        Line lowTom5 = new Line(262.8 + xPos, 112.7 + yPos, 257.7 + xPos, 111.7 + yPos, new Color(0, 0,0), 2);
        lowTom5.draw(g2d);

        Line lowTom6 = new Line(281.8 + xPos, 122 + yPos, 280.7 + xPos, 129 + yPos, new Color(0, 0,0), 2);
        lowTom6.draw(g2d);
        
        //actual Low Tom
        Rectangle lowTomFill1 = new Rectangle(258 + xPos, 113.4 + yPos, 5.1, 21.1, new Color(224, 91, 91), 10.4);
        lowTomFill1.draw(g2d);
   
        Rectangle lowTomFill2 = new Rectangle(265.6 + xPos, 118.6 + yPos, 7.4, 17.2, new Color(224, 91, 91), 10.4);
        lowTomFill2.draw(g2d);
           
        Rectangle lowTomFill3 = new Rectangle(275.8 + xPos, 121 + yPos, 5.4, 11.2, new Color(224, 91, 91), 10.4);
        lowTomFill3.draw(g2d);

        //mid tom outline and fill
        Circle midTomOutline5 = new Circle(268.8 + xPos, 94.9 + yPos, 24.7, 5.4, new Color(0,0,0), 14.1);
        midTomOutline5.draw(g2d);

        Rectangle midTomFill2 = new Rectangle(269.2 + xPos, 96.7 + yPos, 5.7, 13.3, new Color(224, 91, 91), 13.9);
        midTomFill2.draw(g2d);

        Rectangle midTomFill3 = new Rectangle(276.5 + xPos, 97.2 + yPos, 8.8, 14.3, new Color(224, 91, 91), 13.9);
        midTomFill3.draw(g2d);
        
        Rectangle midTomFill4 = new Rectangle(285.9 + xPos, 99.9 + yPos, 5.4, 14.4, new Color(224, 91, 91), 13.9);
        midTomFill4.draw(g2d);

        Line midTomOutline1 = new Line(268.8 + xPos, 97.4 + yPos, 265 + xPos, 111.6 + yPos, new Color(0,0,0), 2);
        midTomOutline1.draw(g2d);

        Line midTomOutline2 = new Line(275.8 + xPos, 97.3 + yPos, 272.2 + xPos, 110.8 + yPos, new Color(0,0,0), 2);
        midTomOutline2.draw(g2d);

        Line midTomOutline3 = new Line(285.6 + xPos, 99.4 + yPos, 281.8 + xPos, 112.8 + yPos, new Color(0,0,0), 2);
        midTomOutline3.draw(g2d);

        Line midTomOutline4 = new Line(291.6 + xPos, 102.5 + yPos, 287.4 + xPos, 117.1 + yPos, new Color(0,0,0), 2);
        midTomOutline4.draw(g2d);

        //middle part of the DRUMS idk what theyre called(int) (114.8 + 11 / 2));

        Circle middlepart8 = new Circle(294.5 + xPos, 97 + yPos, 26.4, 15, new Color(0,0,0), -13.9);
        middlepart8.draw(g2d);

        Rectangle middlePartFill1 = new Rectangle(296 + xPos, 102.4 + yPos, 5.8, 15.5, new Color(224, 91, 91), -17.9);
        middlePartFill1.draw(g2d);

        Rectangle middlePartFill2 = new Rectangle(302.2 + xPos, 99.2 + yPos, 8.4, 15.5, new Color(224, 91, 91), -17.9);
        middlePartFill2.draw(g2d);

        Rectangle middlePartFill3 = new Rectangle(310.8 + xPos, 97.4 + yPos, 7.1, 15, new Color(224, 91, 91), -17.9);
        middlePartFill3.draw(g2d);

        Rectangle middlePartFill4 = new Rectangle(305.2 + xPos, 121.7 + yPos, 5.8, 3.5, new Color(224, 91, 91), -17.9);
        middlePartFill4.draw(g2d);

        Rectangle middlePartFill5 = new Rectangle(312.4 + xPos, 119.9 + yPos, 7.5, 4.3, new Color(224, 91, 91), -17.9);
        middlePartFill5.draw(g2d);
        
        Rectangle middlePartFill6 = new Rectangle(319 + xPos, 111.7 + yPos, 7.5, 11, new Color(224, 91, 91), -17.9);
        middlePartFill6.draw(g2d);

        Line middlePart1 = new Line(293.7 + xPos, 110.8 + yPos, 293.5 + xPos, 121.8 + yPos, new Color(0,0,0), 2);
        middlePart1.draw(g2d);

        Line middlePart2 = new Line(297.6 + xPos, 111.3 + yPos, 289.9 + xPos, 111.2 + yPos, new Color(0,0,0), 2);
        middlePart2.draw(g2d);

        Line middlePart3 = new Line(295.7 + xPos, 102.7 + yPos, 299.7 + xPos, 117.2 + yPos, new Color(0,0,0), 2);
        middlePart3.draw(g2d);

        Line middlePart4 = new Line(301.8 + xPos, 100.1 + yPos, 305.7 + xPos, 113.5 + yPos, new Color(0,0,0), 2);
        middlePart4.draw(g2d);

        Line middlePart5 = new Line(311.5 + xPos, 97.3 + yPos, 315 + xPos, 110.2 + yPos, new Color(0,0,0), 2);
        middlePart5.draw(g2d);

        Line middlePart6 = new Line(318.5 + xPos, 97 + yPos, 321 + xPos, 110 + yPos, new Color(0,0,0), 2);
        middlePart6.draw(g2d);

        Circle OutlineDrumRight = new Circle (298.4 + xPos, 112.3 + yPos, 27.2, 10, new Color(0, 0, 0), -13.9);
        OutlineDrumRight.draw(g2d);

        Circle middlePart7 = new Circle (298.8 + xPos, 114.3 + yPos, 25.2, 8, new Color(255, 223, 194), -14.2);
        middlePart7.draw(g2d);


        g2d.setTransform(reset); 

        //Fix this later tangina 
        // AffineTransform transform1 = new AffineTransform();
        // transform1.rotate(Math.toRadians(13.9), 273.6, 112.95);
        // g2d.setTransform(transform1);     
        
        // g2d.setColor(Color.BLACK);
        // g2d.setStroke(new BasicStroke(5));  
        // g2d.drawOval((int)336, (int)122.5, (int)28.4, (int)11.9); 

        // g2d.setTransform(reset); 


        //Snare drums

        Line snareOutline1 = new Line(322.8 + xPos, 110 + yPos, 329.1 + xPos, 109.2 + yPos, new Color(0, 0, 0), 2);
        snareOutline1.draw(g2d);

        Line snareOutline2 = new Line(327.3 + xPos, 110.1 + yPos, 328.6 + xPos, 121.7 + yPos, new Color(0, 0, 0), 2);
        snareOutline2.draw(g2d);

        Line snareOutline3 = new Line(304.7 + xPos, 125.8 + yPos, 330.7 + xPos, 122.2 + yPos, new Color(0, 0, 0), 2);
        snareOutline3.draw(g2d);

        Line snareOutline4 = new Line(305 + xPos, 122 + yPos, 305.3 + xPos, 124.5 + yPos, new Color(0, 0, 0), 2);
        snareOutline4.draw(g2d);
        
        Line snareOutline5 = new Line(312.1 + xPos, 122 + yPos, 312.4 + xPos, 124.5 + yPos, new Color(0, 0, 0), 2);
        snareOutline5.draw(g2d);

        Line snareOutline6 = new Line(321 + xPos, 118.4 + yPos, 321.5 + xPos, 122.6 + yPos, new Color(0, 0, 0), 2);
        snareOutline6.draw(g2d);


        Circle OutlineDrumLeft = new Circle (260  + xPos, 108.5 + yPos, 29.4, 12.9, new Color(0, 0, 0), 13.9);
        OutlineDrumLeft.draw(g2d);

        //actual mid tom
        Circle midTomFill1 = new Circle(262  + xPos, 110.5 + yPos, 27.4, 10.9, new Color(255, 223, 194), 13.9);
        midTomFill1.draw(g2d);

        g2d.setTransform(reset); 

        //bassDrum
        Circle bassDrumOutline = new Circle(273.3 + xPos, 123.6 + yPos, 41, 41, new Color(0, 0, 0), 0);
        g2d.setStroke(new BasicStroke(5));
        bassDrumOutline.draw(g2d);

        Circle bassDrum = new Circle(274.2 + xPos, 124.2 + yPos, 39.2, 39.2, new Color(255, 223, 194), 0);
        g2d.setStroke(new BasicStroke(5));
        bassDrum.draw(g2d);      
        
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
