import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class welcome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class welcome extends World
{

    /**
     * Constructor for objects of class welcome.
     * 
     */
    public welcome()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1145, 610, 1); 
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        replay replay = new replay();
        addObject(replay,582,531);
        replay.setLocation(563,467);
        bhelp bhelp = new bhelp();
        addObject(bhelp,741,494);
        bhelp.setLocation(740,479);
        bhelp.setLocation(425,413);
        bhelp.setLocation(438,413);
        replay.setLocation(567,404);
        bhelp.setLocation(722,422);
        bprofil bprofil = new bprofil();
        addObject(bprofil,450,433);
        bhelp.setLocation(688,437);
        bhelp.setLocation(687,434);
        Greenfoot.start();
        //Greenfoot.playSound("awal.mp3");

    }
}
