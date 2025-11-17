import java.util.ArrayList;
import java.util.Scanner;

public class diamond
{
    private static char getCharToPrint(int row, int column, int middle)
    {
        char toPrint;
       
        int area = row - 1;
       
        int leftarea = middle - area;
        int rightarea = middle + area;
       
        if(column >= leftarea && column <= rightarea)
        {
            toPrint = '*';
        } else {toPrint = ' ';}
       
        return toPrint;
    }
   
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
       
        int toprows = rows;
        int bottomrows = rows - 1;
       
        int totalrows = toprows + bottomrows;
       
        double middle = ((double)totalrows/2) + .5;
        int middletoint = (int)middle;
       
        System.out.println(middletoint);
       

        for(int row = 1; row <= toprows; row++)
        {
            for(int column = 1; column <= totalrows; column++)
            {
                System.out.print(diamond.getCharToPrint(row, column, middletoint));
            }
            System.out.println();
        }
       
        for(int row = toprows - 1; row > 0; row--)
        {
            for(int column = totalrows; column > 0; column--)
            {
                System.out.print(diamond.getCharToPrint(row, column, middletoint));
            }
            System.out.println();
        }
       
       
       
    }
}
