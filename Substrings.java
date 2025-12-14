import java.util.Scanner;

/**
 * Substrings nested loops assignment
 *
 * @author santigutierrezsch and Zeke Adefila
 * @version 11nov2025
 */
public class Substrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();


        for (int length = 1; length <= word.length(); length++) {
            for (int start = 0; start <= word.length() - length; start++) {
                String tempword = word.substring(start, start + length);
                System.out.println(tempword);
            }
        }
    }
}
