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
        // model a coin flip; 1:heads, 2: tails
        int coinFlip = (int) (Math.random() * 2);
        
        /*
         * if statement
         * 
         * Statements in the if block are executed if the conditional expression is true.
         * 
         * Conditional expressions evaluate to either true or false.
         *      It must go inside the parentheses (unlike Python, there is no colon after the expression).
         *      
         * Statements are grouped by blocks (i.e., { } ).
         *  (Unlike Python, indentation doesn't matter)
         */
        if (coinFlip == 1)
        {
            System.out.println("coin is heads");
        }
        
        /*
         * { } are not required for a single statement.
         *      However, they are always a good idea!
         *      Leaving them out can create bugs this this:
         */
        if (coinFlip == 0)
            System.out.println("coin is tails");
            System.out.println("better luck next time...");
        
            
        /*
         * if, else statement
         * 
         * The else block is executed if the if statment is false.
         *  
         */
        if (coinFlip == 1)
        {
            System.out.println("coin is heads.");
        }
        else  // no conditional expression required
        {
            System.out.println("coinis tails.");
        }
        
        // model the roll of a four-sided die (1-4)
        int dieRoll = (int) ((Math.random() * 4) + 1);
        
        /*
         * if, else if, else statement
         * 
         *      Unlike Python, Java uses else if instead of elif
         */
        if (dieRoll == 1)
        {
            System.out.println("rolled a one");
        }
        else if (dieRoll == 2)
        {
            System.out.println("rolled a two");
        }
        else if (dieRoll == 3)  // I can have as many else if statements as needed
        {
            System.out.println("rolled a three");
        }
        else  // the else statement is never required
        {
            System.out.println("rolled a four");
        }
        
        
        
        
        
        
        
        
        
        
    }
}
