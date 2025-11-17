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
    
    public static int sumWithBreak()
    {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int value = 0;
        
        do
        {
            /*
             * Sentinel value / variable
             *  value (e.g., -1) used to exit a loop
             *  It is often entered by a user.
             */
            System.out.print("enter a postitive integer (-1 to quit): ");
            
            value = s.nextInt();
            
            if (value == -1)
            {
                /*
                 * break: immediately exits the inner-most loop
                 */
                break;
            }
            
            sum += value;

        }
        while(value != -1);
        
        
        return sum;
    }
    
    public static int sumWithContinue()
    {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int value = 0;
        
        do
        {

            System.out.print("enter a postitive integer (-1 to quit): ");
            
            /*
             * The hasNextInt method of the Scanner class returns true if the next token to be read is an integer; otherwise,
             *      it return false.  It does not consume the next token.  If there are no tokens in the stream, it 
             *      waits until there are.
             */
            if(s.hasNextInt() == false)
            {
                System.out.println(s.next() + " is not an integer; try again.");
                
                /*
                 * continue:
                 *      1. immediately skips teh the end of the innermost loop
                 *      2. reevaluates the loop condition and continues with the next iteration if the 
                 *              condition is true.
                 */
                continue;
            }
            
            value = s.nextInt();
            
            if(value != -1)
            {
                sum += value;
            }
        }
        while(value != -1);
        
        
        return sum;
    }
    
    
}
