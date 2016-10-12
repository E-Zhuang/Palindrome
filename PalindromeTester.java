
/**
 * This code tests to see if a line of text is a palindrome or not.
 * 
 * Emily Zhuang
 * APCS:Period 4
 * Mr. Lantsberger
 * 12 October 2016
 */

import chn.util.*;

public class PalindromeTester
{
    /**
     * This method will continuously prompt the user for a string and test whether the string
     * is a palindrome or not using a while loop. If the user inputs "Q" or "q" the loop will
     * not reiterate and the code will end. The method called is testPal() which is defined in
     * the Palindrome class. 
     */
    
    public static void main(String[] args)
    {
        //Declares object refrences
        ConsoleIO keyboard = new ConsoleIO();
        Palindrome machine;
        
        //Declares primatives 
        String pal, lowerPal, output;  
        
        //Introduces the program
        System.out.println("Welcome to the Palindrome Program!");
        System.out.println();
        
        //Prompts the user for a string
        System.out.print("Enter a string (Q or q to quit): ");
        pal= keyboard.readLine();
        
        //Continues to test if a string is a palindrome and prompts the user for another line
        while (!pal.equals("Q") && !pal.equals("q")) 
        {
            //instantiates Palindrome object
            machine = new Palindrome(pal);
            
            //calls method to test the Palindrome and prints whether it is a Palindrome or not
            output = machine.testPal();
            System.out.println(output);
            System.out.println();
            
            //reprompts the user
            System.out.print("Enter a string (Q or q to quit): ");
            pal= keyboard.readLine();
        
        }
    }
      
}

