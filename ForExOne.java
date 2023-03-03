//for loop example

public class ForExOne
{
	public static void main(String args[])
	{
		System.out.println("For loops");
		           //Start	  Stop      Increment
		for(int  run=1;   run<=10;   run=run+1)
		{
		   System.out.println(run);
		}

		System.out.println("\ncan start at 0. And print on the same line");
		for(int  run = 0;   run < 10;   run++)
		{
		   System.out.print(run + ".");
		}
		System.out.println();

		System.out.println("\nincrement can actually be a decrement:");
		for(int  run = 10;   run > 0;   run--)
		{
		   System.out.println(run);
		}

		System.out.println("\nincrement can add more than one");
		for(int  run = 2;   run < 21;   run=run+2)
		{
		   System.out.println("  " + run);
		}

		System.out.println("\nincrement can multiply");
		for(int  run = 1;   run <= 500;   run=run*5)
		{
		   System.out.printf("%6d\n", run);
		}
		System.out.println("\nloop control variable can just be a counter");
		for(int  run = 0;   run < 6;   run++)
		{
		   System.out.println("Loops are fun!");
		}
		System.out.println();
	}
}
