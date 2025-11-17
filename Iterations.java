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
        
        // count = 1;
        
        // while(count != 50)
        // {
            // System.out.println(count);
            // count += 2;
        // }
        // System.out.println("done.");
    }
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         * Three parts of the for statement:
         *          1. initialization - executed once
         *          2. condition - boolean expression evaluated at the start of each loop iteration
         *          3. update the loop variable - executed at the end of each loop iteration
         *   
         * 
         */
        final int LIMIT = 5;
        int count;
        for (count=1;                            // initialization
            count <= LIMIT;                      // condition
            count++)                             // update of the loop variable
        {
            System.out.println(count);           // body
        }
        
        System.out.println("done");
        
        /*
         * Variables declared within the for statement are scoped to the for statement and its body
         *          Can't use the variable outside of the for loop unless initialized outside of the loop
         */
        
        System.out.println(count);

    }
    
    public static void offByOne()
    {
        /*
         * The infamour off-by-one error is common with for loops, executing one too many or one too few times.
         * 
         * Carefully ask:
         *                  Should the initial value start at 0 or 1
         *                  Should the condition be inclusive or exclusive ( <= or <)
         *                  
         * By convention, for simple for loops, we start at 0 and use the < operator.
         */
        
        // we want to print five *
        for (int i=0; i<5; i++) // if it was i<=5 then it would be 0,1,2,3,4 and 5, so 6 total stars, not 5.
        {
            System.out.println("*");
        }
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop)
         * 
         *      1. Executes the body of the loop first
         *      2. Evalutes the condition
         *          if true, execute the body again
         *          if false, continue execution after the loop
         */
        
        int count = 1;          // initialization
        
        do{
            System.out.println(count);      // body
            count++;                        // update the loop variable
        } 
        while (count <= 5);                 // condition
        
        System.out.println("Done");
    }
    
    public static int sum()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        /*
         * Sentinal value / variable
         *          value used to terminate a loop (e.g., -1). Often entered by a user
         */
        int value = 0;
        // int value = 1;                   // accounts for the -1 being summed
        
        do
        {
            System.out.print("Enter a positive integer: (-1 to quit)\t");
            
            value = s.nextInt();
            if (value != -1)                // accounts for the -1 being summed
            {
                sum += value;
            } else {
                sum += 0;
            }
        }
        while(value != -1);
        
        // sum += 1;                        // accounts for the -1 being summed
        
        return sum;
    }
    
    public static int sumWithBreak()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;

        int value = 0;
        
        do
        {
            System.out.print("Enter a positive integer: (-1 to quit)\t");
            
            value = s.nextInt();
            if (value == -1)
            {
                break;
            }
            
            sum += value;
        } while(value != -1);
                
        return sum;
    }
    
    public static int sumWithContinue()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value = 0;
        
        do
        {
            System.out.print("Enter a positive integer: (-1 to quit)\t");
            
            /*
             * The hasNextInt() method of the Scanner class returns true if the next token to be read is an integer;
             *      otherwise false.    It does not consume the next token, it just reads it. If there are tokens it
             *      will wait for the next one to be entered.
             */
            if (s.hasNextInt() == false){
                System.out.print(s.next() + "Is not an int, try again. ");
                
                continue;
            }
            value = s.nextInt();
            if (value != -1)
            {
                sum += value;
            } else {
                sum += 0;
            }
        }
        while(value != -1);
        
        
        return sum;
    }
}