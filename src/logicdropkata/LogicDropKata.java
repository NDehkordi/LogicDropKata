/*Foo Bar : Program that outputs "foo","bar", or "foobar" depending on the 
user input
Author: Nadia Dehkordi
*/
package logicdropkata;

import java.util.Scanner;

public class LogicDropKata 
{

    public static void main(String[] args) 
    {
     int userInput = 0;// Number give by user 
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Please enter a number: ");
     userInput= keyboard.nextInt();
    // If- else-if loop, that checks userInput's divisibility to 3,5, and 15
    // and prints result of "foo","bar", or "foobar", depending on what number
    // it is divisible to. 
    
      if (userInput % 15 ==0)
       {
        System.out.print("foobar");
       }
       else if (userInput % 5 ==0)
       {
         System.out.print("bar");
       }
      else if (userInput % 3 == 0)
       {
        System.out.print("foo");
       }
      else 
       {
        System.out.print(userInput);
       }


    }
    
}
