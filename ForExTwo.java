//for loop example

public class ForExTwo
{
	public static void main(String args[])
	{
		System.out.println("More on for loops");
		System.out.println("\nUsing a loop to sum values");
		int total = 0;
		for(int run = 1; run <= 5; run++)  //change the 5 stop value and rerun
		{
			total = total + run;
		}
		System.out.println("sum is " + total);

		System.out.println("\nFor loops and strings");
		String str = "compsci";
		for(int i = 0; i < str.length(); i++)
		{
		    System.out.println(str.charAt(i));
		}

		System.out.println("\nuse loop to print backwards");
		for(int  i = str.length()-1;   i >= 0;   i--)
		{
		   System.out.print(str.charAt(i));
		}

		System.out.println("\n");
	}
}
