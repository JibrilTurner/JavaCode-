//Name - Jibril Turner 
//Date -2/25/25/21
//Lab Lab3 - Line-Fill 



import java.util.Random; 
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
/** class LineFill fills the graphic window with random colored lines.
 ** Useful methods:
 *	 getWidth() returns the width of the canvas
 *	 getHeight() returns the height of the canvas
*/
public class LineFill extends Canvas
{
	public LineFill()
	{
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window)
	{
		//drawHorizDown(page);		// 70 pts
		//pause(1000);
		//clearScreen(page);
		//drawHorizUp(page);		// 80 pts
		//pause(1000);
		//clearScreen(page);
		//drawVerticalLeft(page);	// 90 pts
		//pause(1000);
		//clearScreen(page);
		//drawVerticalRight(page);	// 100 pts



   
int x = 0; 
int y = 0;
int z = 0; 
int a = 0;


    for(x = 10 ; x < 650; x++) {
    for(y = 10 ; y < 650; y++) 
    for(z = 10 ; z < 650; z++) 
    for(a = 10 ; a < 650; a++) 


          if(x==y){
          if(x==y)
            x = x + 60;
            y = y + 60;
            z = z + 60;
            a = a + 60;

Random rand = new Random();
Color color = new Color(rand.nextInt(0xFFFFFF));


    window.setColor(color);
		window.drawLine(0,y,600,a);

    window.setColor(color);
		window.drawLine(x,0,z,600);

		
    
          }
      }
      System.out.println("Working");     
	}	//======================
	
	
	public void drawHorizDown(Graphics window)
	{
		// the two x values in drawLine() do not change - the left & right sides of the screen
		// the for loop will need to change the y value. Increment by 1 each time
		//for ()
		{

		}
	}
	
	/** Draw randomly colored, horizontal lines across the 
	  * screen from bottom to top.                         */
	public void drawHorizUp(Graphics window)
	{
	}
	
	/** Draw randomly colored, vertical lines across the 
	  * screen from left to right.  (change x)             */
	public void drawVerticalLeft(Graphics window)
	{
	}
	
	
	/** Draw randomly colored, vertical lines across the 
	  * screen from right to left.                         */
	public void drawVerticalRight(Graphics window)
	{
	}	//======================
	

	/** Paint the screen white to erase anything
	  * previously drawn on the drawing surface   */
	public void clearScreen(Graphics window)
	{
		window.setColor(Color.white);
		window.fillRect(0, 0, getWidth(), getHeight());
	}	//======================
	
	
	
	/** Pause for wait milliseconds.  */
	public void pause (int wait)
	{	long timeToQuit = System.currentTimeMillis() + wait;
		while (System.currentTimeMillis() < timeToQuit)
			;   // take no action
	}	//======================			
}