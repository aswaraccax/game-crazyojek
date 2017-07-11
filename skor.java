import greenfoot.*;


import java.util.Calendar;

/**
 * Write a description of class skor here.
 * 
 * @author Nunut <kurnia8998@gmail.com>  
 * @version 1.0.0
 */
public class skor extends Actor
{
    /**
     * Act - do whatever the skor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    
    /**
     * Create a score board with dummy result for testing.
     */
    public skor(){
        this(100);
    }

    /**
     * Create a score board for the final result.
     */
    public skor(int score){
        makeImage("Game Over", "Skor: ", score);
    }

    /**
     * Make the score board image.
     */
    private void makeImage(String title, String prefix, int score){
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new Color(0, 0, 0, 160));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(255, 255, 255, 0));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.YELLOW);
        image.drawString(title, 60, 100);
        image.drawString(prefix + score, 60, 200);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
