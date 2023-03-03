//if statement example

public class IfOne
{
	public static void main(String args[])
	{
		// generate a random score in the range 40-99
		int score = (int)(Math.random()*60 + 40);
		System.out.println("Score: " + score);

		/*** TO DO **/
      //if score is greater than or equal to 70
            //print out something saying score is a passing grade


		// generate two random numbers 1-100
		int n1 = (int)(Math.random()*100 + 1);
		int n2 = (int)(Math.random()*100 + 1);
		System.out.println("\n\nnumber 1: " + n1 + " number 2: " + n2);

      /*** TO DO **/
		//if n1 is greater than n2
		    //print out something saying n1 is larger than n2


		//if n2 is greater than n1
		    //print out something saying n2 is larger than n1


	}
}

