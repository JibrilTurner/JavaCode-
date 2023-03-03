import javax.swing.JFrame;

public class LineFillRunner extends JFrame
{
	// constants
	private static final int WIDTH = 300;
	private static final int HEIGHT = 300;

	public LineFillRunner()
	{
		super("Line Fill Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new LineFill());
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		LineFillRunner run = new LineFillRunner();
		run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}