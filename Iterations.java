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
    
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         *      Three parts of the for statement:
         *              1. initializaiton - executed once at the start
         *              2. condition - boolean expression evaluated at he start of each loop iteration
         *              3. increment or update the loop variable - executed at the end of each loop iteration
         *                                                          *before* evaluating the condition again
         */
        for(int count = 1;      // initialization
                count <= 5;     // condition
                count++)        // increment or update the loop variable
        {
            System.out.println(count);  // body
        }
        
        System.out.println("done.");
        
        /*
         * variables declared within the for statement are scoped to the for statement and its body
         */
        //System.out.println("the final value of count is: " + count);
        
        
    }
    
    public static void forExample2()
    {
        int count = 1;
        
        for(            ;      // initialization
                count <= 5;     // condition
                )        // increment or update the loop variable
        {
            System.out.println(count);  // body
            count++;
        }
        
        System.out.println("done.");
        
       
        System.out.println("the final value of count is: " + count);
        
        
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error is common with for loops executing one too many times or one too few.
         * 
         * Carefully ask: Should the initial a=value start at 1 or 0?
         *                Should the condition be <  or <= ?
         *                
         *                "Think! Don't just compile at random!"
         *                
         * By convention, for simple for loops we start at 0 and use the <.
         */
        
        // we want to print five stars
        for(int i = 0; 
            i <= 5;   // should be < instead of <=
            i++)  
        {
            System.out.println("*");
        }
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop)
         * 
         *      1. executes the body of the loop first
         *      2. evaluates the condition:
         *          if true, executes the body of the loop again
         *          if false, continues execution after the loop
         */
        int count = 1;          // initialization
        
        do
        {
            System.out.println(count);      // body
            count++;                        // update the loop variable
        }
        while (count <= 5);                 // condition
        
        System.out.println("done.");
        
    }
    
    public static int sum()
    {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int value = 0;
        
        do
        {
            sum += value;
            
            /*
             * Sentinel value / variable
             *  value (e.g., -1) used to exit a loop
             *  It is often entered by a user.
             */
            System.out.print("enter a postitive integer (-1 to quit): ");
            
            value = s.nextInt();
            
            
        }
        while(value != -1);
        
        
        return sum;
    }
    
    
    
    
}
