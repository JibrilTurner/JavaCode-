//graphics frame to run graphics examples

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);

		/* The following program demonstrates animation.
		   A Timer is used, and everytime if fires, paint()
		   is called and the image is drawn at a new location.
		*/
		//getContentPane().add(new Animation());


		***** uncomment to test your Lab Solutions *******
		getContentPane().add(new AnimatedCar());
	//	getContentPane().add(new RandomDrawing());
    //getContentPane().add(new RandomSigns());

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}