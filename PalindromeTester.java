
/**
 * Write a description of class PalindromeTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import chn.util.*;

public class PalindromeTester
{
    public static void main(String[] args)
    {
        ConsoleIO keyboard = new ConsoleIO();
        Palindrome machine;
        
        String pal, lowerPal, output;  
        
        System.out.println("Welcome to the Palindrome Program!");
        System.out.println();
        
        System.out.print("Enter a string (Q or q to quit): ");
        pal= keyboard.readLine();
        
        while (!pal.equals("Q") && !pal.equals("q")) 
        {
            machine = new Palindrome(pal);
                
            output = machine.testPal();
            System.out.println(output);
            System.out.println();
            
            System.out.print("Enter a string (Q or q to quit: ");
            pal= keyboard.readLine();
        
        }
    }
      
}

