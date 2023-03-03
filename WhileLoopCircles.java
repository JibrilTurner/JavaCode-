//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class WhileLoopCircles extends Canvas
{
	public WhileLoopCircles()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
 		window.setColor(Color.WHITE);
 		window.fillRect(0,0,640,480);

		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));

		window.drawString("Lab", 20, 40 );
	  	window.drawString("Drawing Circles Using a while loop ", 20, 80 );
	  	drawCircles(window);
	}

	public void drawCircles(Graphics window)
	{
	
		window.setColor(Color.BLUE);                                                                           ;

int run = 0;
//0 – start

while(run<5)
//1 - stop

{

run = run + 1; //2 - increment

System.out.println(run); //3 - code

}
	int radius = 20;
  int x = 0;

  while(x <= 150) {
    		window.setColor(Color.BLUE);
    window.drawOval(x , x , radius, radius);              
     {

    }
    x++;
    x = x + 10;
    radius++;
    radius = radius + 5;

	}
}
}