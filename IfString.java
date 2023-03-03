//String charAt(), equals(), and length() methods
// if statements and return methods

public class IfString
{
	/*
	 * method compare() compares the length of s1 and s2
	 * if s1 is longer than s2, return s1
	 * if s1 is shorter than s2, return s2
	 * if s1 is the same length as s2 return "equal"
	 */
	public static String compare( String s1, String s2 )
	{
		return "";
	}

	/*
	 * method firstLetterSame() returns true if the first
	 * character in s1 is equal to the first character in s2,
	 * otherwise returns false
	 */
	public static boolean firstLetterSame( String s1, String s2 )
	{
		return false;
	}

   /*
	 * method sameName() returns true
    * if s1 is equal to s2, otherwise returns false
	 */
   public static boolean sameName( String s1, String s2 )
	{
      return false;
   }


  	public static void main( String args[] )
  	{
		System.out.println( compare("elephants", "alligators") );    //outs alligators
		System.out.println( compare("dogs", "cats") );    //outs equal
		System.out.println( compare("penguins", "bears") );   //outs penquins

		System.out.println("\nFirst letter the same");
		boolean same;
		same = firstLetterSame("parrots","parrots");
		System.out.println("penguins and parrots: " + same  );    //outs true
		same = firstLetterSame("penguins","egrets");
		System.out.println("penguins and egrets: " + same  );    //outs false

      	System.out.println("\nSame word");
      	String feline = new String("lion");
      	same = sameName("cheetah", feline);
		System.out.println("cheetah and lion: " + same  );    //outs false
		same = sameName("lion", feline);
		System.out.println("lion and lion: " + same  );    //outs true

		System.out.println("\n");
	}
}