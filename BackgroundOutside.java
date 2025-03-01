        this.setPreferredSize(new Dimension(800, 600)); 
        this.audioPlayer = audioPlayer;
        this.DrawingObjects = new ArrayList<>();
        this.DrawingObjectsOutside = new ArrayList<>();
       
        DrawingObjects.add(new BackgroundOutside(0, 0, 0, 0, 0));
        DrawingObjects.add(new HouseOutside(0, 0, 0, 0, 0));

        Cloud e1 = new Cloud(0,0,0,0,0);
        DrawingObjects.add(e1);

        Cloud e2 = new Cloud(255,52,0,0,0);
        DrawingObjects.add(e2);

        Cloud e3 = new Cloud(555,0,0,0,0);
        DrawingObjects.add(e3);

        Cloud e4 = new Cloud(700,22,0,0,0);
        DrawingObjects.add(e4);

        int randomNumX = (int)(Math.random() * 600);
        int randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX,randomNumY,0,0,0));

        DrawingObjects.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX + 50, randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX + 150,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX + 200,randomNumY,0,0,0));

        DrawingObjects.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX,randomNumY,0,0,0));

        DrawingObjects.add(new Star(randomNumX,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX + 50, randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX + 150,randomNumY,0,0,0));

        randomNumX = (int)(Math.random() * 600);
        randomNumY = (int)(Math.random() * 150);

        DrawingObjects.add(new Star(randomNumX + 200,randomNumY,0,0,0));
 
        
        Timer timer = new Timer(50, e -> { 
            e1.adjustX(5); 
    
            if (e1.getX() > this.getWidth()) {
                e1.adjustX(-this.getWidth()-300); 
            }
            repaint(); 
        });
        timer.start();

        Timer timer2 = new Timer(100, e -> { 
            e2.adjustX(4); 
    
            if (e2.getX() > this.getWidth()) {
                e2.adjustX(-this.getWidth()-300); 
            }
            repaint(); 
        });
        timer2.start();

        Timer timer3 = new Timer(40, e -> { 
            e3.adjustX(8); 
    
            if (e3.getX() > this.getWidth()) {
                e3.adjustX(-this.getWidth()-300); 
            }
            repaint(); 
        });
        timer3.start();

        Timer timer4 = new Timer(40, e -> { 
            e4.adjustX(6); 
    
            if (e4.getX() > this.getWidth()) {
                e4.adjustX(-this.getWidth()-300); 
            }
            repaint(); 
        });
        timer4.start();
