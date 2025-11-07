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
        return 0;
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
        /*
         * What our algorithm does:
         *
         * Creates a do while loop.
         * Inside the loop askes the user for a word.
         * If the word's length if greater than 3, then check if it ends in "est".
         * If it doesn't end in "est", then it will not be counted.
         * If the word's length isn't greater than 3, then warn the user and continue because this might create an index error
         * At the end of the loop, check if the word given is "quit".
         * If it is "quit", then end the loop.
         * Return the total words counted that ended with "est".
         *
         * Challenges:
         * We accidently didn't noticed that we placed a ";" after the if statements.
         * This caused a normal statement rather than a conditional statement. Which caused it to count every word, even if it didn't end with "est".
         *
         * We could imagine that some other groups would forget to lowercase their word, which would make quitting out of the loop harder since its case sensitive.
         * This would also make counting if the word ended in "est" harder. Since it would also be case sensitive.
         *
         */
       
       
        int wordSuffixCount = 0; // initializes a count to return
        String word; // initializes a word to turn into the input's given word
       
        Scanner s = new Scanner(System.in); // scanner to use to get the next word
       
        do //starts a do-while loop to ask the user a series of words repeatedly
        {
            System.out.print("Enter a word (quit to end): "); //gives instructions
            word = s.next(); //lets the user enter their next word as input
           
            if(word.length() >= 3) //if statement to check if the word is greater or equal to 3 letters long, because if it is shorter, then indexing will malfunction
            {
                if(word.substring(word.length() - 3, word.length()).toLowerCase().equals("est")) //gets the last 3 letters in lowercase to prevent case sensitivity, checks if they are equal to "est"
                {
                    wordSuffixCount++; //adds to the count because it was a word that ended in "est"
                }
            }
            else//if the word isnt 3 letters long or more
            {
                System.out.println("That was wasn't 3 letter long, try again"); //warning
                continue; //retrys the loop again if the word isnt 3 letters long
            }
           
        }
        while(!word.toLowerCase().equals("quit")); // keeps the loop running until the next word is "quit"
        //also in lowercase to prevent it being case sensitive
       
        return wordSuffixCount; // returns the amount of words with the suffix "est"
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
            word1 = word2;
           
            System.out.print("Word: ");
            word2 = s.next();
            uniqueWords++;
           
        }while(!word1.equals(word2));
        return uniqueWords-2;
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
        return "";
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