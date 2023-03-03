
import java.util.Scanner;
public class Quadratic
{
	// instance variables
   private int a, b, c;
	private double rootOne;
	private double rootTwo;

	// constructors - give values to all instance variables
  public Quadratic()  //default constructors
	{
    a = 0;
    b = 0;
    c = 0;
    rootOne = 0; 
    rootTwo = 0; 
	} // ennd of default constructors

	public Quadratic(int quadA, int quadB, int quadC)
	{
    a = quadA;
    b = quadB;
    c = quadC; 
 

    rootOne = 0;
    rootTwo = 0;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
    a = quadA;
    b = quadB;
    c = quadC; 
 	}

	// calculate the two roots and assign the value to rootOne and rootTwo
	public void calcRoots( )
	{
  rootOne = ( -b + Math.sqrt( (b*b)- a*c *4 )) / (2*a);
  rootTwo = ( -b - Math.sqrt( (b*b)- 4*a*c  )) / (2*a);
	}

	// use printf to display the value of the two roots
	public void print( )
	{
    System.out.printf("pos. root: %.2f \n neg. root %.2f", rootOne, rootTwo);
  
	}
}