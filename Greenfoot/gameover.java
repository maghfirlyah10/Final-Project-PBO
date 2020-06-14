import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameover extends World
{

    /**
     * Constructor for objects of class gameover.
     * 
     */
    public gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public gameover(int skor)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        showText("SKOR   : "+skor,70,30);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        starbutton starbutton = new starbutton();
        addObject(starbutton,300,189);
    }
}
