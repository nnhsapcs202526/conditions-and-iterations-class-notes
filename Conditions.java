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
    
    public static boolean doublesAreEqual(double num1, double num2)
    {
        /*
         * If we use the equality operator (==), it only returns true if all binary digits match.
         *  For "equal" numbers, this is propably not what we want due to floating point rounding.
         *  
         *  Instead, we check if the numbers are "close enough" (i.e., EPSILON value).
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
        System.out.print("Please enter two words: ");
        String str1 = s.next();
        String str2 = s.next();
        //str2 = str1;  create an alias
        
        /*
         * The equality operator returns true if two variables contain the same value.  For varaibles of a class type,
         *       , like Strings, this means they contain the same same reference to the same object in memory (NOT
         *       that they contain the same sequence of characters)
         *       
         *       Alias: two variables that refer to the same object.
         */
        if (str1 == str2)
        {
            System.out.println("String references are equal");
        }
        else
        {
            System.out.println("String references are NOT equal");
        }
        
        /*
         * The equals method returns true if the two obejcts referenced by the variables are "equal".  What "equal" 
         *      means is defined by the class.  For strings, it means it has the same sequence of characters.
         */
        if (str1.equals(str2))
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("String are NOT equal");
        }
        
        
        if (!str1.equals(str2))
        {
            System.out.println("Strings are NOT equal");
        }
    }
    
    
    
}
