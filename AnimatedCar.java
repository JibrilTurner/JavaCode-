//Name -Jibril
//Date -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Canvas;

class AnimatedCar extends Canvas
{
	private int x;
	private int y;
	private Timer timer;
	private final static int SLEEP = 509;  //bigger # = slower animation

	public AnimatedCar()
	{
		setVisible(true);
		setBackground(Color.CYAN);

		x = 0;		// initial coordinates of the car
		y = 50;

		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();  //each time timer fires it will call paint
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}

	public void paint( Graphics window )
	{

    window.setColor(Color.BLACK);
    window.fillOval(x+170,y+180,65,65);

    window.setColor(Color.BLACK);
    window.fillRect(x+-1000,y+230,5585,5);


		x = x + 45;
		y = y + 0;

		if(x > getWidth()-100 || y > getHeight()-100)
		{
			x = 0;
			y = 0;	


		//draw two wheels. Use x and y in your calculations for where to place the wheels

		//increment x by 50

		//if x has reached the far right side of the screen (getWidth())
		//	set it back to zero


		/* For 100 points, change y by 50 when x reaches the far right side.
		 * if y reaches the bottom (getHeight()), set it back to 50
		 */
        
    
        
    }
  }
}


    
  


