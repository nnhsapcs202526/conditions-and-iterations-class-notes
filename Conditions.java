import java.util.Scanner;

/**
 * Examples and notes on conditions (Chapter 5)
 *
 * @author mrcallaghan
 * @version 21oct2025
 */
public class Conditions
{
    public static void ifExample()
    {
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int)(Math.random() * 2);

        /*
         * if statement
         * 
         * Statements in the if block are executed if the condtional expression is true.
         * 
         * Conditional expressions evaluate to true or false.
         *      The condional expression must go inside of parentheses.
         *          (Unlike Python, there is no colon after the statement.)
         *          
         * Statements are grouped by block (i.e., { })
         *      Unlike Python, blocks are not defined by indentation.
         *      
         */
        if(coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        
        /*
         * { } are not required for single statements
         *      However they are always a good idea!
         *      Leaving them out can lead to bugs like below...
         */
        if(coinFlip == 0)
            System.out.println("coin is tails!");
            System.out.println("better luck next time...");  // runs regardless
            
        
        /*
         * if, else statement
         * 
         * The else block is executed if the conditonal expression evaluates to false
         */
        if(coinFlip == 1)
        {
            System.out.println("Coin is heads!");
        }
        else
        {
            System.out.println("Coin is Tails!");
        }
        
        // model a roll of a four-sided die (1-4)
        int dieRoll = (int)(Math.random() * 4) + 1;
        
        /*
         * if, else if, else statment
         * 
         *      Unlike Python, Java uses "else if" instead of "elif"
         */
        if(dieRoll == 1)
        {
            System.out.println("rolled a one");
        }
        else if (dieRoll == 2)
        {
            System.out.println("rolled a two");
        }
        else if (dieRoll == 3)  // you can have as many else ifs in series as is necessary
        {
            System.out.println("rolled a three");
        }
        else  // else is not necessary!
        {
            System.out.println("rolled a four");
        }

    }
    
    public static boolean doublesAreEqual(double num1, double num2)
    {
        
        /*
         * If we use the equality operator with doubles, it will only return true if all binary digits match.
         * 
         * For "equal" numbers, this may not be case due to floating point rounding and therefor,
         *      not what we want.
         *      
         *      We will instead check if they are "close enough" (i.e., use an EPSILON).
         */
        final double EPSILON = 1e-6;
        
        if(Math.abs(num1 - num2) < EPSILON)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter two words: ");
        String str1 = s.next();
        String str2 = s.next();
        
        
        /*
         * The equality operator (==) returns true if the two variables (e.g., str1 and str2)
         *  contain the same value.  For variables of a class type, including Strings,
         *  this means that they must contain the same reference.  That is, they refer to the same object,
         *  in memory, NOT that the two strings contain the same sequence of characters.
         *  
         *  Alias: two variables that refer to the same object.
         */
        if(str1 == str2)
        {
            System.out.println("The string references are equal!");
            
        }
        else
        {
            System.out.println("The string references are NOT equal.");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
