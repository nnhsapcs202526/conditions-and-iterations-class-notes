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
         * while loops
         * 
         *      evaluate a condition (i.e., boolean expression)
         *              if true, executes the body of the loop and then re-evaluate the condition
         *              if false, skip the body and continue 
         * 
         */
        
        int count = 1;  // initialization
        
        while (count <= 5)  // condition
        {
            System.out.println(count);  // loop body
            count++;                    // updating of loop variable
            // same as: count += 1 or count = count + 1
        }
        
        System.out.println("done.");  // end of loop
        
    }
    
    public static void whileExample2()
    {
        /*
         * inifinite loop example
         */
        
        int count = 1;  // initialization
        
        while (count != 6)  // condition
        {
            System.out.println(count);  // loop body
            count+=2;                    // updating of loop variable
            // same as: count += 1 or count = count + 1
        }
        
        System.out.println("done.");  // end of loop
        
    }
}
