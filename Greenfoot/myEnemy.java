import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class myEnemy extends Player
{
    /**
     * Act - do whatever the myEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld myw1 = (MyWorld)getWorld();
        getWorld().showText("SKOR   : "+myw1.getskorlady(),70,30);
        getWorld().showText("LIVE  : "+myw1.getnyawalady(),70,60);
        gerak();
        makan();
        putar();
        kenamusuh();
    }    
    
    public void kenamusuh()
    {
        if (isTouching (myPlayer.class)) {
            MyWorld myw1 = (MyWorld)getWorld();
            myw1.updnyawa();
            
            if(myw1.getnyawalady()<1) {
                Greenfoot.setWorld (new gameover(myw1.getskorlady())) ;
            }
            setLocation(0,50);
        }  
    }
}
