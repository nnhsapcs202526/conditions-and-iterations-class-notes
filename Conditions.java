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
}
