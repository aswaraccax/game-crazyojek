import greenfoot.*;

public class bg extends World
{
    Counter counter = new Counter("Skor = ");
    
    int time = 1000;
    
    public bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1145, 610, 1); 
        setPaintOrder(pelanggan.class, skor.class, motor.class, musuh.class, koin.class, Counter.class);
        addObject(new motor(),77,375);
        addObject(new koin(),790,320);      
        addObject(new musuh(),792,321);
        addObject(counter,97,571);
        

        prepare();
    }


    public void act(){                
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new koin(),1600,Greenfoot.getRandomNumber(479));
        }
        if(Greenfoot.getRandomNumber(1000)<1){
            addObject(new musuh(),1600,Greenfoot.getRandomNumber(479));
        }
       
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.stop();
        }
        
        countTime();
        
    }

    public void tambah(){
        counter.add(5);
    }

    /**
     * Called when game is up. Stop running and display score.
     */
    public void selesai() 
    {
        addObject(new skor(counter.getValue()), getWidth()/2, getHeight()/2);
        replay r = new replay();
        addObject(r,575,552);
        
        //keluar k = new keluar();
        //addObject(k,726,394);
        Greenfoot.start();
        //Greenfoot.setWorld(new bg());
    }
    
    public void countTime()
    {
        time--;
        showTime();
        if(time==0)
        {
            //Greenfoot.setWorld(new jatuh());
            addObject(new skor(counter.getValue()), getWidth()/2, getHeight()/2);
        replay r = new replay();
        addObject(r,575,548);
        
       // keluar k = new keluar();
        //addObject(k,726,394);
            Greenfoot.start();        
        }
        if (time==300)
        {
         addObject(new pelanggan(),1035,76);
        }
            
    }

    private void showTime()
    {
        showText("Timer = " + time, 1066,571);
    }    
    
    public void prepare()
    {

        img_skor img_skor = new img_skor();
        addObject(img_skor,104,573);
        img_skor.setLocation(12,575);
        img_skor img_skor2 = new img_skor();
        addObject(img_skor2,1086,587);
        img_skor2.setLocation(1071,580);
        img_skor2.setLocation(387,583);
        img_skor2.setLocation(584,601);
        removeObject(img_skor2);

        showTime();
        img_timer img_timer = new img_timer();
        addObject(img_timer,954,578);
        //img_skor img_skor = new img_skor();
        addObject(img_skor,172,573);
        img_skor.setLocation(168,570);
        img_timer.setLocation(980,567);
        img_timer.setLocation(978,567);
        img_skor.setLocation(165,571);
        img_timer.setLocation(982,569);
    }
    private int timer = 0;
    {
        if (timer>0)
        {timer--;
            if(timer == 0) Greenfoot.stop();}
        }
}
