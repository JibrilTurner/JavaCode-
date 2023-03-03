//Name - Jibril Turner 
//Date -2/25/25/21
//lab1 - Loops






import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class ForLoopCircles extends Canvas
{
	public ForLoopCircles()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));

	  	window.drawString("Drawing Using a for loop ", 20, 20 );
	  	drawCircles(window);
	  	fillCircles(window);
	}

	public void drawCircles(Graphics window)
	{
		window.setColor(Color.BLUE);
		int y = 80;
		//add in a for loop to draw circles with a diameter of 40
		//  start at 0
		//  stop when you are 40 pixels from the width of the window
		//  move 20 pixels each time
	}

	public void fillCircles(Graphics window)
	{
		Color rc;
		int width = 400;
		int x = 100;
		int y = 150;
		// draw 10 circles in random colors to create a "bullseye"
		for(int k = 0; k < 10; k++)
		{
			rc =new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
			window.setColor(rc);
			window.fillOval(x, y, width, width);
			width = width - 40;
			x = x + 20;
			y = y + 20;
		}
	}
}