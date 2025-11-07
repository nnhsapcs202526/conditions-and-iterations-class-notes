import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Count Matches for Length (
     * reads a series of words (ends with "quit")
     * counts the number of words of length greater than four
     * @return the number of words of length greater than four
     */
    public static int countMatchesForLength()
    {
        Scanner s = new Scanner(System.in); //initializes scanner
        int count = 0; //initializes count. Will keep track of words over 4 letters long
        String word; //initializes word. Will store each word inputted

        System.out.println("Enter your words (type quit to stop): "); //prompts user to enter words
        word = s.next(); //reads first word in print statement

        while(!word.equals("quit")) //repeats until user types the word "quit"
        {
            if (word.length() > 4) //checks if word is over 4 letters long
            {
                count++; //adds 1 to count if while statement is true
            }
            word = s.next(); //reads next word
        }

        return count; //returns total count
    }

    /*
     * Loop Algorithm #2: Count Matches for Prefix
     * reads a series of words (ends with "quit")
     * counts the number of words that start with the substring "con"
     * @return the number of words  that start with the substring "con"
     */
    public static int countMatchesForPrefix()
    {
        Scanner s = new Scanner(System.in);

        //Variables used in code
        int counter = 0;
        int spaceFinder = 0;
        boolean quit = false;
        String sentence = "";

        while(!quit)
        {
            System.out.println("Type your sentence (Type 'quit' to quit): ");
            sentence = s.nextLine();
            sentence = sentence.toLowerCase();

            if(sentence.equals("quit"))
            {
                return counter;
            }

            //Uses spaces to separate the words
            String[] words = sentence.split(" ");

            for (String word : words)
            {
                if(word.startsWith("con"))
                {
                    counter++;
                }
            }     
        }
        return counter;
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix  (Joshua)
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        Scanner eii = new Scanner(System.in);
        int count = 0;
        System.out.println("enter words (quit to end): ");
        while (true)
        {
            String w = eii.next();
            if (w.equals("quit"))
                break;
            if (w.endsWith("est"))
                count++;
        }

        return count;
    }

    /*
     * Loop Algorithm #4: Reverse String (Abdul-rahman)
     * reads one word
     * reverses the characters in the word
     * @return a new string with the characters reversed
     */
    public static String reverseWord(String word)
    {   String reversedWord = "";
        // Apple
        for (int i = word.length(); i >= 1; i --) {
            reversedWord += word.substring(i-1, i);
        }
        return reversedWord;
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words 
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        Scanner s = new Scanner(System.in);
        String[] inps = new String[1000];
        int cnt = 0;
        boolean unique = true;
        String inp = "", lastInp = "";
        do{
            lastInp = inp;
            cnt++;
            inp = s.next();
            unique = true;
            for(int i = 0; i < cnt; i++)
            {
                if(inp.equals(inps[i]))
                {
                    unique = false;
                    break;
                }
            }
            // System.out.println(unique);
            if(unique)
            {
                inps[cnt] = inp;
            }
            else
            {
                cnt--;
            }
        } while(!inp.equals(lastInp));
        return cnt;
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
        String inp = "", lastInp = "";
        do{
            inp = s.next();
        } while(!(inp.compareTo("north") > 0));
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