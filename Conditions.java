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
    
    
    public static boolean doublesAreEqual(double num1, double num2)
    {
        /*
         * If we use the equality operator with doubles, it will only return true if all binary digits match.
         * 
         * For "equal" numbers, this is probably not what we want to use due to floating point rounding.
         * 
         * We will check if they are "close enough"  (i.e., epsilon value)
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
        System.out.print("Enter two words: ");
        String str1 = s.next();
        String str2 = s.next();
        //str2 = str1;  // create an alias
        
        /*
         * The equality operator (==) returns true is the two variables (str and str2) contain the same value.
         *      For variables of type String, or any class, this means they conatain the same reference to 
         *      the same object in memory, NOT that the strings have the same sequence of characters.
         *      
         * Alias: two variables refer to the same object.
         */
        if(str1 == str2)
        {
            System.out.println("String references are equal");
        }
        else
        {
            System.out.println("String  references are NOT equal");
        }
        
        /*
         * The equals method returns true id the two objects referenced by the variables are "equal". For Strings,
         *      it means the two objects have the same sequence of characters.
         */
        
        if(str1.equals(str2))
        {
            System.out.println("the strings are equal");
        }
        else
        {
            System.out.println("the strings are NOT equal");
        }
        
        /*
         * If we want to check if the strings are not equal, we use logical complement
         */
        if(! str1.equals(str2))
        {
            System.out.println("the strings are NOT equal");
        }
        
        /*
         * We will determine which string comes first lexicographically using the
         *      compareTo method of the String class.
         *      
         *  compareTo return an int value:
         *      0:      if the strings are equal (same sequence of characters)
         *      <0:     if str1 < str2 lexicographically
         *      >0:     if str1 > str2 lexicographically
         */
        int result = str1.compareTo(str2);
        System.out.println("Result of compareTo: " + result);
        
        
        if(result < 0)
        {
            String firstStr = str1;
        }
        else if(result > 0)
        {
            String firstStr = str2;
        }
        
        if(firstStr != null)
        {
            System.out.println("\nThe first string is: " + firstStr);
        }
        else
        {
            System.out.println("\nStrings are equal.");
        }
        
        /*
         * This is an example of a "short circuit".
         * 
         *  For an AND operation, if the left operand is false, the right operand will
         *      not be evaluated. This is because we have already determined the AND
         *      operation will be false.
         */
        if(firstStr != null && firstStr.length() > 3)
        {
            System.out.println("The first string has more than 3 characters.");
        }
        
        /*
         * This is another "short circuit" example.
         * 
         *  For an OR operation, if the left operand is true, the right operand will
         *      not be evaluated. This is because we have already determined the OR
         *      operation will be true.
         *      
         *  This results in a bug if the first word is "kiwi".
         */
        System.out.print("Enter your two favorite fruits: ");
        if(s.next().equals("kiwi") || s.next().equals("kiwi"))
        {
            System.out.println("Yum! Kiwis!");
        }
        
        System.out.print("Enter your favorite ice cream flavor: ");
        String flavor = s.next();
        System.out.println("Favorite ice cream flavor: " + flavor);
    }
    
    
    
    
    
    
    
}
