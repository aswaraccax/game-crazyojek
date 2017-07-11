import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jatuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jatuh extends World
{

    /**
     * Constructor for objects of class jatuh.
     * 
     */
    public jatuh()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1155, 610, 1);
        replay r = new replay();
        addObject(r,498,448);    
        Greenfoot.start();
        
        menu menu = new menu();
        addObject(menu,663,453);
        
       // Greenfoot.playSound("finish.mp3");


    }
}
