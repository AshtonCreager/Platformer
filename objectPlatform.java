import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class objectPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class objectPlatform extends platForm
{
    GifImage ObjPlat = new GifImage("ObjectPlatform.gif");
    /**
     * Act - do whatever the objectPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(ObjPlat.getCurrentImage());
    }
}
