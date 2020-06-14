import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int skorlady;
    private int skorsnake;
    private int nyawalady = 3;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        myEnemy myEnemy = new myEnemy();
        addObject(myEnemy,481,299);
        myEnemy myEnemy2 = new myEnemy();
        addObject(myEnemy2,473,93);
        myPlayer myPlayer = new myPlayer();
        addObject(myPlayer,77,240);
        myPlayer myPlayer2 = new myPlayer();
        addObject(myPlayer2,70,165);
        myPlayer.setLocation(68,256);
        muffin muffin = new muffin();
        addObject(muffin,548,37);
        muffin muffin2 = new muffin();
        addObject(muffin2,291,206);
        muffin muffin3 = new muffin();
        addObject(muffin3,192,100);
        muffin muffin4 = new muffin();
        addObject(muffin4,140,329);
        muffin muffin5 = new muffin();
        addObject(muffin5,493,232);
        pear pear = new pear();
        addObject(pear,536,116);
        pear pear2 = new pear();
        addObject(pear2,42,29);
        pear pear3 = new pear();
        addObject(pear3,356,253);
        pear pear4 = new pear();
        addObject(pear4,132,198);
        pear pear5 = new pear();
        addObject(pear5,60,331);
        pear pear6 = new pear();
        addObject(pear6,396,48);
        pizza pizza = new pizza();
        addObject(pizza,452,178);
        pizza pizza2 = new pizza();
        addObject(pizza2,529,352);
        pizza pizza3 = new pizza();
        addObject(pizza3,106,82);
        pizza pizza4 = new pizza();
        addObject(pizza4,166,263);
        pizza pizza5 = new pizza();
        addObject(pizza5,398,310);
        pear3.setLocation(378,242);
        pizza pizza6 = new pizza();
        addObject(pizza6,266,134);
        muffin muffin6 = new muffin();
        addObject(muffin6,398,122);
        muffin muffin7 = new muffin();
        addObject(muffin7,315,347);
        pear pear7 = new pear();
        addObject(pear7,226,353);
        pizza pizza7 = new pizza();
        addObject(pizza7,277,277);
        pear pear8 = new pear();
        addObject(pear8,286,42);
        muffin muffin8 = new muffin();
        addObject(muffin8,181,36);
        muffin3.setLocation(180,128);
        muffin muffin9 = new muffin();
        addObject(muffin9,428,359);
        pizza5.setLocation(392,297);
        pizza pizza8 = new pizza();
        addObject(pizza8,218,194);
        muffin2.setLocation(302,205);
        pizza6.setLocation(284,130);
        pizza.setLocation(468,181);
        muffin5.setLocation(535,253);
        pear3.setLocation(404,232);
        muffin2.setLocation(326,210);
        pizza8.setLocation(250,203);
        myEnemy.setRotation(135);
        myEnemy2.setRotation(210);
        myPlayer2.setRotation(-45);
        myPlayer.setRotation(45);
        myPlayer2.setLocation(79,166);
        myPlayer2.setRotation(-20);
        myPlayer2.setLocation(53,209);
        myPlayer.setLocation(76,265);
    }
    
    public int getskorlady() {
        return skorlady;
    }
    
    public int getskorsnake() {
        return skorsnake;
    }
    
    public int getnyawalady() {
        return nyawalady;
    }
    
    public void updskor(int x) {
        skorlady+=x;
        skorsnake+=x;
    }
    
    public void updnyawa() {
        nyawalady--;
    }
}
