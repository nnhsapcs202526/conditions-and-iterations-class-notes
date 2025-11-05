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
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         *  Three parts of the for statement:
         *          1. initialization - executed once
         *          2. condition - boolean expression evaluated at the start of each loop iteration
         *          3. update the loop variable - executed at the end of each loop iteration
         */
        
        for (int count = 1;         // initialization
                 count <= 5;        // condition
                 count++)           // update of the loop variable
        {
            System.out.println(count);      // body
        }
        
        System.out.println("done");
    }
    
    public static void forExample2()
    {
        int count = 1;
        for (               ;       // initialization
                 count <= 5;        // condition
                 )           // update of the loop variable
        {
            System.out.println(count);      // body
            count++;
        }
        
        System.out.println("done");
        
        /*
         * Variables declared within the for statement are scoped to the for statement and its body
         */
        System.out.println("The final value of count is: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error is common with for loops, executing one too many or one too few times.
         * 
         * Carefully ask: 
         *                  Should the initial value start at 0 or 1?
         *                  Should the condtion be  < or <= ?
         *                  
         * By convention, for simple for loops, we start at 0 and use the < operator.
         */
        
        // we want to print five *
        for(int i = 0; i <= 5; i++)
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
         *      2. evaluate the condition:
         *          if true, execute the body again
         *          if false, continue execution after the loop
         */
        
        int count = 1;          // initialization
        
        do
        {
            System.out.println(count);      // body
            count++;            // update the loop variable
        }
        while(count<=5);        // condition
        
        System.out.println("done.");
    }
    
    public static int sum()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value = 0;
        
        do 
        {
            
            
            System.out.print("Enter a positive integer (-1 to quit): ");
            
            /*
             * Sentinel value / variable
             *      value used to terminate a loop (e.g., -1), often entered by a user
             */
            value = s.nextInt();  // scan a number in
            
            if(value != -1)
            {
                sum += value;
            }
            
        }
        while(value != -1);
        
        return sum;
    
    }
    
    
    
    
    
    
    
    
}
