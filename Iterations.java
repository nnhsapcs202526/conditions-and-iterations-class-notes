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
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         * Three parts to the for statement:
         *          1. initialization
         *          2. condition
         *          3. updating of the loop variable
         */
        
        for (int count = 1;         // initialization
                 count <= 5;        // condition
                 count++)           // update the loop variable
        {
            System.out.println(count);  // body
        }
        
        System.out.println("done");
        
        /*
         * Variables declared inside of the for statment are scoped to the for loop and its body.
         */
        //System.out.println("Final value of count: " + count);
    }
    
    public static void forExample2()
    {
        int count = 1;
        for (           ;         // initialization
                 count <= 5;        // condition
            count++)           // update the loop variable
        {
            System.out.println(count);  // body
            count++;
        }
        
        System.out.println("done");
        
        System.out.println("Final value of count: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error  is common for loops executing one too many or one too few times!
         * 
         * Carefully ask:
         * 
         *          Should the intial value be 0 or 1?
         *          Should the condition by < or <= ?
         *          
         *  By convention, for simple for loops we start at 0 and use the < operator.
         */
        
        // we want to print five *
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("*");
        }
    
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop)
         * 
         *      1. executes the loop body first
         *      2. evaluates the condition:
         *          if true, reruns the body
         *          if false, continues after the loop
         */
        int count = 1; // initialization
        
        do
        {
            System.out.println(count);  // body
            count++;                    // increment
        }   
        while(count<=5);                // condition
        
        System.out.println("done");
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
             * Sentinel value or variable
             *      A value to end a loop, often in the context of user input (e.g., -1).
             */
            value = s.nextInt();
            
            if (value != -1)
            {
                sum += value;
            }
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
                        
            System.out.print("Enter a positive integer (-1 to quit): ");
            
            value = s.nextInt();
            
            if (value == -1)
            {
                /*
                 * break: immediately exits the innermost loop
                 */
                break;
            }
            
            if (value != -1)
            {
                sum += value;
            }
        }
        while(true);
        
        return sum;
    }
    
    
    public static int sumWithContinue()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value = 0;
        
        do
        {

            System.out.print("Enter a positive integer (-1 to quit): ");
            
            /*
             * The hasNextInt method of the Scanner class return ture is teh next token is an integer, false otherwise.
             *      It does not consume the next token, only reads it.  If there are no tokens in teh input stream, it
             *      waits for the next one to be entered.
             */
            if(s.hasNextInt() == false)
            {
                System.out.println(s.next() + " is not an integer; try again.");
                
                /*
                 * continue:
                 *      1. immediately skips the rest of the innermost loop
                 *      2. reevaluates the loop condition and continues with the next iteration if true.
                 */
                continue;
            }

            value = s.nextInt();
            
            if (value != -1)
            {
                sum += value;
            }
        }
        while(value != -1);
        
        return sum;
    }
    
    
    
    
    
    
    
    
    
    
    
}
