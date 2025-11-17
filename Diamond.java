import java.util.ArrayList;
import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("n= ");
        int rows = s.nextInt();
       
        for(int i = 1; i < rows + 1; i ++)
        {
            for(int space = 0; space < rows - i; space ++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i == rows)
            {
                for(int j = (2 * i) - 3; j > 0; j --)
                {
                    System.out.print("*");
                }
                System.out.print("*");
            }
            else if (i != 1)
            {
                for(int j = (2 * i) - 3; j > 0; j --)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
