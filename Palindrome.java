
/**
 * Emily Zhuang
 * APCS:Period 4
 * Mr. Lantsberger
 * 11 October 2016
 */

public class Palindrome
{
    private String lowerPal;   
    private int length;
    
    /**
     * This constructor method contains the lowercase version of the String pal and also the 
     * initial length of the string.
     */
    public Palindrome(String pal)
    {
        lowerPal = pal.toLowerCase();
        length = lowerPal.length(); 
    }
    
    /**
     * This modifier method will first test to see if a string is a single character. If it is a single
     * character, the method returns that the String is not a palindrome. If it is more than one character,
     * the method will then remove all punctuation using a nested for and while loop. The for loops determines
     * which punctuation mark to test for while the while loops removes the character through substrings
     * and concatenation. The method then compares the first and last character in the string to see if 
     * they are the same and at the end of the while loop the method tests to see if all the characters
     * were tested through an if-else statement. 
     */
    public String testPal()
    {
        String output, allPunct, test;
        int character, back, punct;
        
        character = 0;
        back = 1;
        
        
        if (length == 1) 
            output = "No, the string you entered is NOT a palindrome. ";
            
        else
        {
            // remove spaces and punctuation
            allPunct = " ,.!?;:-";
            
            for (int many = 0; many < allPunct.length(); many++)
            {
                test = "";
                test += allPunct.charAt(many);
               
            
                punct = lowerPal.indexOf(test);
                while (punct != -1)
                {
                    length = lowerPal.length(); 
                    lowerPal = lowerPal.substring (0, punct) + lowerPal.substring ((punct + 1), (length));
                    punct = lowerPal.indexOf(test);
                }
            }

            length = lowerPal.length(); 
                
            //Compare the first char to the last char and so on.
            while ((character < (length / 2)) && (lowerPal.charAt(character) == lowerPal.charAt(length - back)))
            {
                character++;
                back++; 
            }
                
            if ((length > 1) && (character == (length / 2)))
                output = "Yes, the string you entered is a palindrome. ";
            else
                output = "No, the string you entered is NOT a palindrome. ";
            }
            
        return output;

        }

    //use a new string to store valid characters
    public String testPal_v1()
    {
        String output, test;
        int character, back;
        
        character = 0;
        back = 1;
        
        //using a new string to store alphabet
        test = "";
        for(int index = 0; index < length; index++) 
        {
            if (lowerPal.charAt(index) >= 'a' &&
                lowerPal.charAt(index) <= 'z') {
                test += lowerPal.charAt(index);
            }
        }
        //now use the new string test
        length = test.length();
        
        if (length == 1) 
            output = "No, the string you entered is NOT a palindrome. ";
            
        else
        {               
            //Compare the first char to the last char and so on.
            while ((character < (length / 2)) && (test.charAt(character) == test.charAt(length - back)))
            {
                character++;
                back++; 
            }
                
            if ((length > 1) && (character == (length / 2)))
                output = "Yes, the string you entered is a palindrome. ";
            else
                output = "No, the string you entered is NOT a palindrome. ";
            }
            
        return output;

        }

    //use a new string to store valid characters
    //to compare the strings, first do a reverse, then compare the two strings
    public String testPal_v2()
    {
        String output, test, reverse;
        int character, back;
        
        character = 0;
        back = 1;
        
        //using a new string to store alphabet
        test = "";
        for(int index = 0; index < length; index++) 
        {
            if (lowerPal.charAt(index) >= 'a' &&
                lowerPal.charAt(index) <= 'z') {
                test += lowerPal.charAt(index);
            }
        }
        //now use the new string test
        length = test.length();
        
        if (length == 1) 
            output = "No, the string you entered is NOT a palindrome. ";
    
        else
        {               
            reverse = "";
            for(index = length - 1; index < 0; index--) 
            {
                    reverse += test.charAt(index);
                }
            }                
            //now check if the two strings are equal
            if (test.equals(reverse))
                output = "Yes, the string you entered is a palindrome. ";
            else
                output = "No, the string you entered is NOT a palindrome. ";
            }
            
        return output;

        }
    }

