//Name -
//Date -
//Lab  -
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Graphics;



class RandomSigns extends Canvas
{
	public RandomSigns()    //constructor method - sets up the class
    {
	    setBackground(new Color(0xCCFFFF));
   	}

	public void paint( Graphics window )
   	{
       
		window.setColor(new Color(0x009999));
		window.setFont(new Font("Georgia", Font.ITALIC, 14));
		window.drawString("Random Shape LAB ", 35, 35 );

		window.setFont(new Font("ARIAL",Font.BOLD,72));
		//generate a random number (0, 1, or 2) and store it in random.
		// based on the number, draw a different shape.
		// Use if else if structure (multiway selection)
    
int random = (int)(Math.random() * 3);



     if (random == 0) 
     {		
 	    int[] xPoints = {400,200,300};  // array of x coordinates
		int[] yPoints = {200,200,400};
   	    int nPoints = 3;
		Polygon triangle = new Polygon(xPoints,yPoints,nPoints);
    		window.setColor(new Color(0xFFFF00));
    		window.fillPolygon(triangle);
    		System.out.println("yield sign");
       }
     






     else if (random == 1)
     {
    int[] xPoints = {90, 180, 300, 390, 390, 300, 180, 90 };
	int[] yPoints = {180, 90, 90,  180,  300, 390, 390, 300 };
	int nPoints = 8;
		Polygon triangle = new Polygon(xPoints,yPoints,nPoints);
    		window.setColor(new Color(0xce1c1c));
    		window.fillPolygon(triangle);
    System.out.println("stoplight");
     }
     







     else if (random == 2)
      {
         	window.setColor(Color.gray);
		window.fillRect(410,30,70,240);

     window.setColor(Color.green);
		window.fillOval(420,60,50,50);//eye

        window.setColor(Color.BLUE);
		window.fillOval(420,120,50,50);

         window.setColor(Color.red);
		window.fillOval(420,180,50,50);

 
    
    System.out.println("stoplight");
      }
     }
    }


     










