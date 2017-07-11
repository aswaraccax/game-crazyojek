import greenfoot.*;
/**
 * Write a description of class ps here.
 * 
 * @author Nunut <kurnia8998@gmail.com>  
 * @version 1.0.0
 */
public class motor extends Actor
{
    private int movingSpeed =4;
    private String moveUP ="up";
    private String moveDOWN ="down";
    private String moveLEFT ="left";
    private String moveRIGHT ="right";
        
    private bg pl;
    public void addedToWorld(World bg)
    {
        pl=(bg)bg;
    }
    
  
    
   
    public void act()
    {
        if (Greenfoot.isKeyDown(moveUP)) {
            setLocation(this.getX(), this.getY()-movingSpeed) ;
        }
          if (Greenfoot.isKeyDown(moveDOWN)) {
            setLocation(this.getX(), this.getY()+movingSpeed) ;
        }
          if (Greenfoot.isKeyDown(moveLEFT)) {
            setLocation(this.getX()-movingSpeed, this.getY()) ;
        }
         if (Greenfoot.isKeyDown(moveRIGHT)) {
            setLocation(this.getX()+movingSpeed, this.getY()) ;
        }
        Actor a=getOneObjectAtOffset(0,0,koin.class);
        if(a!=null){
            getWorld().removeObject(a);
            ((bg)getWorld()).tambah();
            //getWorld().removeObject(this)
            Greenfoot.playSound("koin.mp3");
        }  
       
        if (this.isTouching(pelanggan.class))
       {
           Greenfoot.setWorld(new jatuh()); 
           // ((bg)getWorld()).selesai();
       }
        
        
        if (this.isTouching(musuh.class) && a!=null)
       {
           //Greenfoot.setWorld(new jatuh()); 
            ((bg)getWorld()).selesai();
            Greenfoot.playSound("tabrak.WAV");
            Greenfoot.stop();
       }
       
       
       
    }
        
        // Add your action code here.
        /*
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        if(Greenfoot.mouseClicked(null)) {
            pl.addObject(new pelor1(),getX()+getImage().getHeight(),getY());
            Greenfoot.playSound("p1.wav");
        }
        
    } */
}

