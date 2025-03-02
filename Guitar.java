import java.awt.*;

public class Guitar implements DrawingObject{

    private double xPos, yPos, width, height;
    private Color color;
    private double rotationAngle = 0;

    public Guitar(double xPos, double yPos, double rotationAngle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = new Color(255, 165, 0);
        this.rotationAngle = rotationAngle;
    }

    public void draw(Graphics2D g2d){
        


        //bottom half of guitar
        Circle circle1 = new Circle(398.9 + xPos, 117.9 + yPos, 52.7, 52.7, new Color(255,165,0), 0); 
        circle1.draw(g2d);

        Circle circle2 = new Circle(410.1 + xPos, 105.2 + yPos, 44.5, 43, new Color(255,165,0), 0); 
        circle2.draw(g2d);

        Rectangle rectangle = new Rectangle(417.4 + xPos, 137.7 + yPos, 21.8, 5.1, new Color(0,0,0), 20.8);
        rectangle.draw(g2d);

        Circle hole = new Circle(424.4 + xPos, 118.5 + yPos, 18.7, 18.7, new Color(0,0,0), 0); 
        hole.draw(g2d);


        //NECK
        Rectangle neck = new Rectangle(404.5 + xPos, 83.5 + yPos, 90.7, 9.4, new Color(0,0,0), -68.1);
        neck.draw(g2d);

        Rectangle fret1 = new Rectangle(434.3 + xPos, 113.3 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret1.draw(g2d);

        Rectangle fret2 = new Rectangle(435.4 + xPos, 110.6 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret2.draw(g2d);

        Rectangle fret3 = new Rectangle(437.2 + xPos, 106.4 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret3.draw(g2d);


    

        Rectangle fret4 = new Rectangle(438.9 + xPos, 101.6 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret4.draw(g2d);

        Rectangle fret5 = new Rectangle(440.6 + xPos, 97.9 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret5.draw(g2d);



        Rectangle fret6 = new Rectangle(442.2 + xPos, 94.3 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret6.draw(g2d);


        Rectangle fret7 = new Rectangle(444.7 + xPos, 87.5 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret7.draw(g2d);
  

        Rectangle fret8 = new Rectangle(447.2 + xPos, 81.5 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret8.draw(g2d);

        Rectangle fret9 = new Rectangle(450.2 + xPos, 74.6 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret9.draw(g2d);

        Rectangle fret10 = new Rectangle(452.1 + xPos, 69.1 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret10.draw(g2d);

        Rectangle fret11 = new Rectangle(454.8 + xPos, 63.4 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret11.draw(g2d);

        Rectangle fret12 = new Rectangle(457.1 + xPos, 56.8 + yPos, 9.7, 1.7, new Color(255, 165, 0), 21.9);
        fret12.draw(g2d);
        
        Circle neckEnd = new Circle(460.8 + xPos, 39.2 + yPos, 11, 16, new Color(0,0,0), 21.8);
        neckEnd.draw(g2d);

        //STRINGS

        Line string1 = new Line(426.5 + xPos,  137.5 + yPos,  464.1 + xPos,  43.7 + yPos, new Color(211, 211, 211), 1); 
        string1.draw(g2d);

        Line string2 = new Line(428.3 + xPos,  138.3 + yPos,  466 + xPos,  44.5 + yPos, new Color(211, 211, 211), 1); 
        string2.draw(g2d);

        Line string3 = new Line(430.3 + xPos,  139 + yPos,  467.9 + xPos,  45.2 + yPos, new Color(211, 211, 211), 1); 
        string3.draw(g2d);

        Line string4 = new Line(432.3 + xPos,  139.5 + yPos,  469.9 + xPos,  45.7 + yPos, new Color(211, 211, 211), 1); 
        string4.draw(g2d);

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
