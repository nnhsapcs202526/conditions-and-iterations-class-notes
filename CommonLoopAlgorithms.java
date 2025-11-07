import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Count Matches for Length
     * reads a series of words (ends with "quit")
     * counts the number of words of length greater than four
     * @return the number of words of length greater than four
     */
    public static int countMatchesForLength()
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a word ('quit' to exit): ");
        int numOfWords = 0;
        String word = s.next();

        while (!word.equals("quit"))
        {   if (word.length() > 4)
            {
                numOfWords++;
            }
            System.out.print("Enter a word ('quit' to exit): ");
            word = s.next();
        }
        return numOfWords;
    }

    /*
     * Loop Algorithm #2: Count Matches for Prefix
     * reads a series of words (ends with "quit")
     * counts the number of words that start with the substring "con"
     * @return the number of words  that start with the substring "con"
     */
    public static int countMatchesForPrefix()
    {
        Scanner s = new Scanner(System.in);     //Creates a scanner to take user input
        String word = "";       //Creates a string that is used to store the word the user inputs
        int count = 0;      // Will be incramented to count the number of words starting with 'con'

        while (!word.equals("quit"))        // Starts a while loop that ends if the user inputs the word 'quit'
        {
            System.out.println("Enter a word (quit to stop): ");        // Prompts the user to input a word
            word = s.nextLine().toLowerCase();      //Takes in the word from the user and makes it lower case

            if (word.substring(0,3).equals("con"))      // If statement to check if the word starts with 'con'
            {
                count += 1;         // If the word starts with 'con', count is incramented by 1
            }
        }

        return count;           //Returns the number of words that start with 'con'
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        Scanner s = new Scanner(System.in);
        //quit leaves, just est words
        int words = 0;
        String word;
        String substringedWord;
        int wordLength;
        while (true){
            System.out.println("Tell me a word. If the word ends with est, then it will count");
            word = s.next();
            if (word.equals("quit")){
                break;
            }

            wordLength = word.length();

            if (wordLength >= 3){
                substringedWord = word.substring(wordLength-3);
            }

            else{
                substringedWord = "For Now";
            }

            if (substringedWord.equals("est")){
                words++;
            }
        }
        return words;
    }

    /*
     * Loop Algorithm #4: Reverse String
     * reads one word
     * reverses the characters in the word
     * @return a new string with the characters reversed
     */
    public static String reverseWord()
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = s.nextLine();
        int wordLength = word.length();
        String reversed = "";

        for (int i = 0;
        i < wordLength;
        i++)
        {
            reversed += word.substring(wordLength-(i+1),wordLength-i);
        }

        return reversed;
    }
    // alternate
    public static String reverseWord2()
    {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = inputScanner.nextLine();

        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reverseWord += word.charAt(i);
            System.out.println("Reversed word: " + reverseWord);

        }
        return reverseWord;
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        Scanner s = new Scanner(System.in);

        String word1 = "";
        String word2 = "";
        int uniqueWords = 0;
        do {
            word1 = word2;  // save previous word

            System.out.print("Word: ");
            word2 = s.next();
            uniqueWords++;

        }while(!word1.equals(word2));
        return uniqueWords-1;
    }
    // alternate
    public static int compareAdjacent2()
    {
        Scanner s = new Scanner(System.in);

        boolean Same = true;
        int count = 0;
        String prevWord = "";

        while (Same)
        {
            System.out.println("Enter the target word");
            String target = s.next();
            System.out.println("Enter another word");
            String word = s.next();

            if (target.equals(word))
            {
                Same = false;
            }

            if (! word.equals(prevWord))
            {
                count++;
            }

            System.out.println(prevWord);
            prevWord = prevWord.replace(prevWord, word);
        }

        return count;
    }

    /*
     * Loop Algorithm #6: Prompting until Criteria Is Met
     * prompts the user to enter a word that is alphabetically after "north"
     *        and has more than six characters
     * continues to prompt the user until the word meets the criteria
     * @return the word that meets the criteria
     */
    public static String promptUntilMatch()
    {
        Scanner s = new Scanner(System.in);
        String inp = "";
        do{
            System.out.print("Enter a word (after or equal to 'north' and ≥ 6 letters): ");
            inp = s.next();
        } while (!((inp.compareTo("north") > 0) && (inp.length() >= 6)));
        return inp;
    }

    /*
     * Loop Algorithm #7: Identify Individual Digits in an Integer (Extension)
     * Write an algorithm to identify the individual digits in an integer.
     * For example, if the integer 123456 is entered by a user, print each digit
     * on its own line (right-most digit first).
     */
    public static void identifyDigits(int intValue)
    {
    }
}