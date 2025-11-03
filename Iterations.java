import java.util.Scanner;


/**
 * Examples and notes on iterations (Chapter 6)
 *
 * @author mcallaghan
 * @version 03nov2025
 */
public class Iterations
{
    public static void whileExample()
    {
        /*
         * while loop:
         * 
         *  evaluate a condition (i.e., boolean expression)
         *      if true, executes the body of the loop and then reevaluates the condition
         *      if false, skips the body and continue
         */
        int count = 1;          // initialization
        
        while (count <= 5)      // condition
        {
            System.out.println("The count is: " + count); // body
            count++;            // update the loop variable
            
        }
        
        System.out.println("done.");
        
        // same loop with break keyword
        count = 1;          // initialization
        
        while (true)      // condition
        {
            System.out.println("The count is: " + count); // body
            count++;            // update the loop variable
            if(count > 5)
            {
                break;
            }
            
        }
        
        System.out.println("done.");
        
        /*
         * infinite loop example
         * 
         * The count of 50 will never be reached!  Counting up from 1 by twos.
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
