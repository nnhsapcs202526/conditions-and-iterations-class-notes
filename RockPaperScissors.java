import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, paper, or scissors:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, paper, or scissors:");
        String player2 = scan.next().toLowerCase(); 
        
        // if (player1.equals("rock")) {
            // if (player2.equals("rock")) {
                // System.out.println("Tie");
            // } else if (player2.equals("paper")) {
                // System.out.println("Player 2 Wins");
            // } else if (player2.equals("scissors")) {
                // System.out.println("Player 1 Wins");
            // } else {
                // System.out.println("Error");
            // }
        // } else if (player1.equals("paper")) {
            // if (player2.equals("rock")) {
                // System.out.println("Player 1 Wins");
            // } else if (player2.equals("paper")) {
                // System.out.println("Tie");
            // } else if (player2.equals("scissors")) {
                // System.out.println("Player 2 Wins");
            // } else {
                // System.out.println("Error");
            // }
        // } else if (player1.equals("scissors")) {
            // if (player2.equals("rock")) {
                // System.out.println("Player 2 Wins");
            // } else if (player2.equals("paper")) {
                // System.out.println("Player 1 Wins");
            // } else if (player2.equals("scissors")) {
                // System.out.println("Tie");
            // } else {
                // System.out.println("Error");
            // }
        // } else {
            // System.out.println("Error");
        // }
        
        if (
            (player1.equals("rock") && player2.equals("scissors")) ||
            (player1.equals("scissors") && player2.equals("paper")) ||
            (player1.equals("paper") && player2.equals("rock"))
        ) {
            System.out.println("Player 1 Wins!");
        } 
        else if (
            (player2.equals("rock") && player1.equals("scissors")) ||
            (player2.equals("scissors") && player1.equals("paper")) ||
            (player2.equals("paper") && player1.equals("rock"))
        ) {
            System.out.println("Player 2 Wins!");
        } 
        else if (player1.equals(player2)) {
            System.out.println("It's a Tie!");
        } 
        else {
            System.out.println("Error: Invalid input.");
        }
    }
}