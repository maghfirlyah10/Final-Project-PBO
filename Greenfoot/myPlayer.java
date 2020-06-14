import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myPlayer extends Player
{
    /**
     * Act - do whatever the myPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
    
    public void act() 
    {
        MyWorld myw1 = (MyWorld)getWorld();
        getWorld().showText("SKOR   : "+myw1.getskorsnake(),70,30);
        gerak();
        makan();
        putar();
    }
}

