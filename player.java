import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duke here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class player extends Actor
{
    private int speed = 6;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = 18;
    
    
    GifImage player = new GifImage("KnightForward.gif");
    GifImage playerR = new GifImage("KnightRight.gif");
    GifImage playerL = new GifImage("KnightLeft.gif");
    
    /**
     * Act - do whatever the Duke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeys();
        checkFall();
        detectPlatform();
        vSpeedCap();
        death();
        win();
        nextLevel();
        
        
       
    }
   
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
            setImage(playerR.getCurrentImage());
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            setImage(playerL.getCurrentImage());
        }
        
        if (Greenfoot.isKeyDown("space") && onPlatForm())
        {
            jump();
        }

    }  
   
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
   
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }
   
    public void fall()
    {
        setLocation (getX(), getY() + vSpeed);
        vSpeed += acceleration;
    }
 
    public boolean onPlatForm()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, platForm.class);
        return under != null;
    }
    
    
   
    public void detectPlatform()
    {
        for(int i = 0; i < vSpeed; i++)
        {
            Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, platForm.class);
            if(under != null)
            {
                vSpeed = i - 1;
            }
        }
    }
    
    
    
    public void checkFall()
    {
        if(onPlatForm())
        {
            vSpeed = 0;
           
        }
        else
        {
            fall();
        }
        
        
    }
    
    
    public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }  
   
    public void vSpeedCap()
    {
        if(vSpeed > 10)
        {
            vSpeed = 10;
        }
    }

    public void death()
    {
        Actor enemy = getOneIntersectingObject(enemy.class);
        if(enemy!=null)
        {
            Greenfoot.setWorld(new deathLevel());
        }
    }
   
    public void win()
    {
        Actor crystalBall = getOneIntersectingObject(crystalBall.class);
        if(crystalBall!=null)
        {
            Greenfoot.setWorld(new winLevel());
        }
    }
   
    public void nextLevel()
    {
        Actor door = getOneIntersectingObject(door.class);
        if(door!=null)
        {
            Greenfoot.setWorld(new Level2());
            setLocation(70,856);
        }
    }
    
    
}
