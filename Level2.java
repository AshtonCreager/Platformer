import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    GifImage castleIn = new GifImage("castle In.gif");
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 900, 1); 
        
        GreenfootSound sound = new GreenfootSound("rainIn.wav");
        sound.playLoop();
        
        player Player = new player();
        addObject(Player, 90, 850);
       
        ground Ground = new ground();
        addObject(Ground, 700, 900);
        
        objectPlatform ObjectPlatForm = new objectPlatform();
        addObject(ObjectPlatForm, 733, 434);
        
        platForm platform = new platForm();
        addObject(platform, 148, 79);
        
        platForm platform1 = new platForm();
        addObject(platform1, 526, 79);
        
        platForm platform2 = new platForm();
        addObject(platform2, 928, 79);
        
        platForm platform3 = new platForm();
        addObject(platform3, 1295, 79);
        
        platForm platform4 = new platForm();
        addObject(platform4, 336, 359);
        
        platForm platform5 = new platForm();
        addObject(platform5, 1131, 359);
        
        platForm platform6 = new platForm();
        addObject(platform6, 99, 532);
        
        platForm platform7 = new platForm();
        addObject(platform7, 1300, 532);
        
        platForm platform8 = new platForm();
        addObject(platform8, 378, 696);
        
        platForm platform9 = new platForm();
        addObject(platform9, 1060, 696);
        
        platForm platform10 = new platForm();
        addObject(platform10, 715, 801);
        
        crystalBall crystalball = new crystalBall();
        addObject(crystalball, 734, 281);
        
        enemy Enemy = new enemy();
        addObject(Enemy, 534, 311);
        
        enemy Enemy1 = new enemy();
        addObject(Enemy1, 935, 311);
        
        enemy Enemy2 = new enemy();
        addObject(Enemy2, 1062, 647);
        
        enemy Enemy3 = new enemy();
        addObject(Enemy3, 378, 647);
        
    }
    public void act()
    {
        setBackground(castleIn.getCurrentImage());
    }
}
