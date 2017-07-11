import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class profil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class profil extends World
{

    /**
     * Constructor for objects of class profil.
     * 
     */
    public profil()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1155, 610, 1); 
        menu menu = new menu();
        addObject(menu,565,505);
    }
}
