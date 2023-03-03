//Name -
//Date -
//Lab  -
import java.util.Random; 
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Diagonals extends Canvas
{
	public Diagonals()
	{
		setBackground(Color.WHITE);
	}

	/** Draw filled randomly colored squares diagonally down the screen.
	  * Make the width of the square 20 pixels
	  * The condition in the loop:  y must be less than the height. Fit it on the screen! 
	  * 1 diagonal: 85 pts / 2 diagonals: 100 pts */
	public void paint( Graphics window )
	{
int x = 0; 
int y = 0;



    for(x = -20 ; x < 350; x++) {
    for(y = -20 ; y < 350; y++) 
          if(x==y) {

            x = x + 20;
            y = y + 20;

Random rand = new Random();
Color color = new Color(rand.nextInt(0xFFFFFF));


    window.setColor(color);
        window.fillRect(x,y,20,20);


          }
      }
      System.out.println("Working");
	}	//======================
}