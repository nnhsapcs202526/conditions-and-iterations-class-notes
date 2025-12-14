import java.util.Scanner;

/**
 * Examples and notes on conditions (Chapter 5)
 *
 * @santigutierrezsch 
 * @21oct2025 
 */
public class Conditions
{
    public static void ifExample()
    {
        // model a coin flip; 1 is heads, 2 is tails
        int coinFlip = (int) (Math.random() * 2);
        
        /*
         * if statement
         * 
         * statements in the if block are executed if the conditional expression is true
         * 
         * Conditional expressions evaluate to either true or false
         *      It must go inside the parenthesis (unlike Python, there is no colon after the expression.
         * Statements are grouped by blocks, not indentation (i.e. {})
         *      (unlike Python, indentation doesnt matter)
         *  
         */
        
        if (coinFlip == 1)
        {
            System.out.println("coin is heads");
        }
        
        /*
         * {} are not required for a single statement
         *      However, they are always a good idea!
         *      Leaving them out can create bugs
         */
        if (coinFlip == 0)
            System.out.println("coin is tails");
            System.out.println("Better luck next time...");
            
        /*
         * if, else statement
         * 
         * The else statement gets executed if the if statement is false.
         */
        if (coinFlip == 1)
        {
            System.out.println("coin is heads");
        } else {
            System.out.println("coin is tails");
        }
        
        // model the roll of a four sided die (1-4)
        int dieRoll = (int) ((Math.random() * 4) + 1);
        
        /*
         * if, else if, else statement
         * 
         *      unlike Python, Java uses else if instead of elif
         */
        if (dieRoll == 1)
        {
            System.out.println("Rolled a 1");
        } else if (dieRoll == 2)
        {
            System.out.println("Rolled a 2");
        } else if (dieRoll == 3) // can have as many else if statements as needed
        {
            System.out.println("Rolled a 3");
        } else // the else statement is never required
        {
            System.out.println("Rolled a 4");
        }
        
        // conditional/logic block new block starts at every singular if statement
    }   
    
    
    
    
    
    
    
    
    public static boolean doublesAreEqual(double num1, double num2)
    {
        /*
         * If we use the equality operator with doubles, it will only return true if all binary digits match.
         * 
         * For "equal" numbers, this is probably not what we want to use due to floating point rounding.
         * 
         * We will check if they are "close enough" (i.e., epsilon value)
         */
        final double EPSILON = 1e-6;
        
        if (Math.abs(num1 - num2) < EPSILON)
        {
            return true;
        } else
        {
            return false;
        }
    }
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two words:" );
        String str1 = s.next();
        String str2 = s.next();
        // str2 = str1; // create an alias
        
        /*
         * The equality operator (==) returns true if the two variables (str1 and str2) contain the same value.
         *      For variables of type String, or any other class. This means they contain the same reference to
         *      the same object in memory, NOT that the strings have the same sequence of characters.
         *      
         * Alias: two variables refer to the same object.
         */
        if (str1 == str2)
        {
            System.out.println("string references are equal.");
        } else
        {
            System.out.println("string references are not equal.");
        }
        
        /*
         * The equals method returns true if the two objects referenced by the variables are "equal. For Strings,
         *      it means the two objects have the same sequence of characters.
         */
        if (str1.equals(str2))
        {
            System.out.println("strings are equal.");
        } else
        {
            System.out.println("strings are not equal.");
        }
        
        /*
         * if we want to check if the stringts are not equal, we use the logical compliment
         */
        if(! str1.equals(str2))
        {
            System.out.println("strings are not equal.");     
        }
    }
}
