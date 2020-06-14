import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mulai mulai = new mulai();
        addObject(mulai,346,224);
        selesai selesai = new selesai();
        addObject(selesai,346,295);
        mulai.setLocation(326,187);
        selesai.setLocation(353,258);
        selesai.setLocation(347,264);
    }
}
