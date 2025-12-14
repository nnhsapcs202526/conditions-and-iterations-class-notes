import java.util.Scanner;

/**
 * Write a description of class Dotsy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dotsy
{
    private int p1_first, p1_second, p1_third, p1_fourth, p1_fifth;
    private int p2_first, p2_second, p2_third, p2_fourth, p2_fifth;
    private int p3_first, p3_second, p3_third, p3_fourth, p3_fifth;
    private int p4_first, p4_second, p4_third, p4_fourth, p4_fifth;
    private int p5_first, p5_second, p5_third, p5_fourth, p5_fifth;
    
    private String player1;

    private int playerCount;

    Scanner in = new Scanner(System.in);

    private void create_vars(int playerCountInput)
    {
        playerCount = playerCountInput;

        if (playerCount < 1 || playerCount > 5) {
            System.out.println("Error: Player count must be between 1 and 5 inclusive.");
            return;
        }

        System.out.println("Variables created for " + playerCount + " players.");
    }

    private void Main()
    {
        System.out.println("Welcome to the Java Dotsy Game!");

        System.out.print("To start, how many people will be playing? (1-5) ");
        String playerCountInput = in.nextLine();

        int count = Integer.parseInt(playerCountInput);

        create_vars(count);
    }

    public static void main(String[] args)
        {
            Dotsy game = new Dotsy();
            game.Main();
        }
}