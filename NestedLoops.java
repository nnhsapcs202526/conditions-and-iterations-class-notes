
/**
 * Write a description of class NestedLoops here.
 *
 * @author mcallaghan
 * @version 11nov2025
 */
public class NestedLoops
{
    /*
     * 1 1
     * 1 2
     * 1 3
     * 1 4
     * 2 1
     * 2 2
     * 2 3
     * 2 4
     */
    public static void nestedLoop1()
    {
        for(int i = 1; i <= 2; i++)
        {
            for(int j = 1; j <= 4; j++)
            {
                System.out.println(i + " " + j);
            }
        }
    }
    
    public static void nestedLoop2()
    {
        int i = 1;
        while(i <= 2)
        {
            int j = 1;
            while(j <= 4)
            {
                System.out.println(i + " " + j);
                j++;
            }
            i++;
        }
    }
}
