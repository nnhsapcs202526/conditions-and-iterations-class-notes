import java.util.Scanner;

/**
 * Examples and notes on iterations (Chapter 6)
 *
 * @author mrcallaghan
 * @version 03nov2025
 */
public class Iterations
{
    public static void whileExample()
    {
        /*
         * while loop:
         * 
         *      evaluates a condition (i.e., boolean expression)
         *        if true, executes the body of the loop and then reevaluates the condition
         *        if false, skips the body of the loop and continues
         */
        
        int count = 1;              // initialization
        
        while (count <= 5)          // condition
        {
            System.out.println(count);      // loop body
            
            count++;                        // update loop variable
        }
        
        System.out.println("done.");
        
        /*
         * This is an example of an infinte loop!
         * 
         * A better condition would be:
         *      while (count < 50):
         * 
         */
        
        count = 1;
        
        while(count != 50)
        {
            System.out.println(count);
            
            count += 2;
        }
        
        System.out.println("done.");
        
        
    }
}
