//© A+ Computer Science  -  www.apluscompsci.com

//for loop example with graphics

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class RandomColoredBoxes extends Canvas
{
	public RandomColoredBoxes()
   	{
   		setBackground(Color.white);
   	}

   	public void paint(Graphics window)
   	{
   		window.setColor(Color.white);
   		window.fillRect(0,0,getWidth(),getHeight());
   	
      	for(int run=50; run<=360; run+=20)
      	{
			window.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
			
			for(int i=0; i<20000000;i++){ }  //pauses for a second
			
			window.fillRect( run, run, 15, run/3);
      	}
      
      	for(int run=370; run<=700; run+=20)
      	{
			window.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
			
			for(int i=0; i<20000000;i++){ }  //pauses for a second
			
			window.fillRect( run, 740-run, 15, (740-run)/3);
      	}
   	}
}