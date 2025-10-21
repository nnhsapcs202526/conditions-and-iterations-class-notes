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
        // model a coin flip; 1:heads, 0:tails
        int coinFlip = (int)(Math.random() * 2);
        
        /*
         * If statement
         * 
         * Statements in the if block are executed if the condtional expression is true
         * 
         * Conditional expressions evaluate to either true or false.
         *      The conditional expression must go inside the parentheses.
         *      (Unlike python, there is no colon)
         *      
         * Statements are grouped by block (i.e., { } )
         *      (unlike Python, blocks are not defined by indentation)
         */
        if(coinFlip == 1)
        {
            System.out.println("coin is heads");
        }
        
        /*
         * { } are not required for a single statement
         *          However, they are a good idea always!
         *          Leaving them out can produce bugs, like this:
         */
        if(coinFlip == 0)
            System.out.println("coin is tails");
            System.out.println("better luck next time...");  // not in the if block above

        /*
         * if, else statement
         * 
         * The else block is executed if the conditional expresison is false.
         */
        if (coinFlip == 1)
        {
            System.out.println("coin is heads");
        }
        //System.out.println("hello!");  cannot have statements between if/else
        else  // no expression required!
        {
            System.out.println("coin is tails");
        }
        
        // model the roll of a four-sided die (1-4)
        int dieRoll = (int) (Math.random() * 4) + 1;
        
        /*
         * if, else if, else
         * 
         * (unlike Python, Java uses "else if" instead of "elif")
         */
        
        if (dieRoll == 1)
        {
            System.out.println("roll was 1");
        }
        else if (dieRoll == 2)
        {
            System.out.println("roll was 2");
        }
        else if (dieRoll == 3)
        {
            System.out.println("roll was 3");
        }
        else 
        {
            System.out.println("roll was 4");
        }
        
        
        
        
        
        
        
        
        
    }
}
