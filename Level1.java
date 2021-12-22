import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    GifImage castleOut = new GifImage("castleOut.gif");
    
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 900, 1);
        
        GreenfootSound sound = new GreenfootSound("rainOut.wav");
        sound.playLoop();
        
        player Player = new player();
        addObject(Player, 90, 850);
        
        ground Ground = new ground();
        addObject(Ground, 700, 900);
        
        door Door = new door();
        addObject(Door, 1243, 850);
       
    }
    public void act()
    {
        setBackground(castleOut.getCurrentImage());
    }
}