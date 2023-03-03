/**
 * StringConditionals.java
 *
 * @author - Jibrl Turner
 * @author - B6 
 *
* @author - I received help from ... My Brain 
 *
 */

import java.util.Scanner;

public class StringConditionals  {
    public static void main(String[] args) {
//ref var
        Scanner Keyboard = new Scanner(System.in);
// user promts
        System.out.println("enter lineone::");
        String lineone = Keyboard.nextLine();
        System.out.println(lineone);


        System.out.println("enter linetwo::");
        String linetwo = Keyboard.nextLine();
        System.out.println(linetwo);

        int lineonelength = lineone.length();

        int linetwolength = linetwo.length();
// if 
      if (linetwolength > lineonelength) {
      System.out.println(lineone + " has more characters than characters then " + linetwo);
 //another if
      }
      if  (linetwolength < lineonelength) {
      System.out.println(lineone + " does not have the same number of characters as " + linetwo);
//another cooler if 
      }
      if(linetwolength == lineonelength) {
       System.out.println(lineone + " has the same number of characters as " + linetwo);
      }
    }
} 