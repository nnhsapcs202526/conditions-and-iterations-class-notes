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

        Scanner s = new Scanner(System.in);  // making scanner variable
        int count = 0; // initializing variables
        System.out.println("Enter 'quit' if you want it to end: " ); // asking user for input
        String word = "";  // initializing string variable

        while (true)
        {
            word = s.next();  // scanning user input
            if (word.equals("quit"))
            {
                break; // breaks loop if they enter quit
            }

            int user = word.length(); // getting to know the length of the word
            if (user > 4)
            {
                count++;  // adds number of words that are greater than 4 to return
            }
        }
        return count;
        //Challenge: using while loops, making it stop and keep running again. Didn't know the methods at the start had to look them up.

    } 
    //alternate 1
    public static int countMatchesForLength2()
    {
        /*
         * High-level description: Goes through a series of
         * words and returns the number of words longer than 4 characters
         * (stopping at 'quit')
         *
         * Challenges: We forgot that s.next() existed when writting
         * it, which was probably what you were looking for. This made it
         * look more complicated.
         */
       
        Scanner s = new Scanner(System.in); // makes a scanner
        String[] words = s.nextLine().split(" "); // turns a user input int
       
        int n = 0; // makes a variable to count with
        for (String word: words) { // for every 'word' in the 'words' array
            if (word.length() > 4) { // if word length is greater than 4
                n++; // add 1 to the variable
            } else if (word.equals("quit")) { // if the word is quit
                break; // quits
            }
        }
       
        return n; // returns the variable
    }
    // alt 2
    public static int countMatchesForLength3()
    {
       
        Scanner s = new Scanner(System.in);  // making scanner variable
        int count = 0; // initializing variables
        System.out.println("Enter 'quit' if you want it to end: " ); // asking user for input
        String word = "";  // initializing string variable
       
        while (true)
        {
            word = s.next();  // scanning user input
            if (word.equals("quit"))
            {
                break; // breaks loop if they enter quit
            }
           
            int user = word.length(); // getting to know the length of the word
            if (user > 4)
            {
                count++;  // adds number of words that are greater than 4 to return
            }
        }
        return count;
        /*
         * Challenges: When we first started writing the code, we were confused because we weren't sure how to read 
         * multiple words or how to get the lengths of multiple words from one user input. But then we realized that 
         * we could just use a while loop and loop it for however many words the user inputs so that we can read each 
         * length and then return it. With the power of thinking and struggling for a little bit, we were able to eventually 
         * figure it out. 
         */
    }
    // alt 3
    public static int countMatchesForLength4()
    {
        Scanner in = new Scanner(System.in);
        int count = 0; // keeps track of how many words are longer than 4 letters

        System.out.println("Enter words (type 'quit' to stop):");

        while (true)  // infinite loop until "quit" is typed
        {
            String word = in.next();  // read the next word

            if (word.equalsIgnoreCase("quit"))  // stop if user enters "quit"
            {
                break;
            }

            if (word.length() > 4)  // check if word length is greater than 4
            {
                count++;  // add 1 to count
            }
        }

        System.out.println("Number of words longer than 4 letters: " + count);
        return count;
    }
    // alt 4
     public static int countMatchesForLength5()
    {
        Scanner s = new Scanner(System.in); //makes scanner
        System.out.println("Enter series of words: "); //prints prompt
       
        int count = 0; //makes variable count
        String word=""; //makes variable to store a word
        do
        {
            word=s.next(); //takes in text word
            if (word.length()>4) //checks if word if s longer than 4 characters
            {
                count++; //adds one to count
            }
        }
       
        while(!word.equals("quit")); //keeps going if not quit
        return count; //return number of words that have greater than 4 characters
        
        /*
         * Our code prompts the user to enter a series of words and then scans each word checking if it is longer than 
         * 4 characters, if so it adds one to the count variable, and then runs until the word quit is reached. 
         * Returns the count variable.
         * 
         * Challenges: 
         * -Figuring out which type of loop would work the best
         * -Figuring out how to take in one word only
         */
    }


    /*
     * Loop Algorithm #2: Count Matches for Prefix
     * reads a series of words (ends with "quit")
     * counts the number of words that start with the substring "con"
     * @return the number of words  that start with the substring "con"
     */
    public static int countMatchesForPrefix()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word (enter 'quit' to stop): ");
        String word = scanner.next();
        int count = 0;
        do {
            if (word.substring(0,3).equals("con")) {
                count += 1;
            }
            System.out.println("Enter another word (enter 'quit' to stop): ");
            word = scanner.next();
        } while (word.equals("quit") != true);
       
        return count;
    }
    
    // alt
    public static int countMatchesForPrefix2()
    {
        Scanner s = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter words (type quit to stop): ");
       
        while(true)
        {
            String word = s.nextLine();
            if (word.equals("quit"))
            {
                break;
               
            }
            if (word.startsWith("con"))
            {
                count++;
            }
        }
       
        return count;
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        String word = null; // initializes word variable
        int count = 0; //  initializes count variable for word count
        Scanner s = new Scanner(System.in); // initalizes scanner for use

        do
        {
            System.out.println("Please enter a word ('quit' to quit): "); // requests user to input word
            word = s.nextLine(); // assigns the word the user inputs to the variable word

            int n = word.length(); // intializes the variable "n" that is the wordlength
            String ending = word.substring(n-3); // initializes the variable "ending" that takes the last three letters of the word inputted

            if (ending.equals("est")) // sets up the if statement
            {
                count += 1; // if the variable ending (the last three letters of the inputted words is equal to "est" then the word count goes up)
            }
        }
        while (!word.equals("quit")); // if the word inputted by the user is "quit" the while loop terminates

        System.out.println(count); // prints the final count of words that end in "est"
        return count; // returns the count of words that end in "est"

        /*
         * Description:  Dev side - The code initializes a String called "word" set to null, 
         *              an int called count (set to 0), and then a Scanner that will take user 
         *              input in the do-while loop. In the do-while loop, it starts by asking the 
         *              user to input a string which the scanner consequently picks up and assigns 
         *              it to the previously initialized "word" variable. Then, a new int variable, n, 
         *              is assigned the value of the word length, and then a new String variable, "ending", 
         *              that is the last three characters of the inputted word. Then, an if statement evaluates 
         *              if the "ending" variable has a value equal to "est", and if it does, it adds 1 to the count. 
         *              As words that end in "est" are inputted the word count goes up, counting all of them. 
         *              When the while part of the do-while evaluates whether or not the word variable has the same 
         *              value as "quit", the terminating condition. Finally, when the loop is over, the code prints 
         *              the count of words that ended in "est" and also returns it. All done!
         *              
         *              User side - The code prompts the user for a word input and as long as it isn't the word "quit" 
         *              it continues to run until "quit" is inputted. The user may enter any word or string and if the 
         *              word ends in "est" the code adds to an outside count that, once terminated via inputting "quit", 
         *              returns the final word count.
         *              
         * Struggles:  Not many struggles faced, just deciding which loop type to use and how to implement the 
         * "quit" part of it as we momentarily forgot about the .equals() method. Other than that, no struggles, 
         * just stubbornness from both team members but we got it done.
         */
    }
    // alt 
    public static int countMatchesForSuffix2()
    {
        Scanner s = new Scanner(System.in);
       
        int numOfWords = 0;
        String value = "";
       
        do
        {
            System.out.print("Enter any word: ");
           
            value = s.next();
           
            if (value.substring(value.length() - 3, value.length()).equals("est"))
            {
                numOfWords += 1;
            }
           
        }
        while(value.equals("quit") == false);
       
       
        return + numOfWords;
    }
    /*
     * Loop Algorithm #4: Reverse String
     * reads one word
     * reverses the characters in the word
     * @return a new string with the characters reversed
     */
    public static String reverseWord()
    {
        Scanner s = new Scanner(System.in);//asks the user for the word
        String word = s.next();//store reference to the variable word
        int num = word.length();//get the total length of the word
        num-=1;//minus one, so the loop doesn't go out of bounds
        int num2 = word.length();//duplicated the number of length of the word for the loop
        String newWord = " ";//make a new variable for the new word
        for( int i = 0; i< num2; i++)//loop conditions, initialization, and update the loop
        {
            String letter = word.substring(num,num+1);//takes each letter of the word but starting at the last letter
            newWord += letter;//adds the letter to the variable new word
            num-=1;//update num, so each loop, it will take the letter before the previous letter

        }
        System.out.println(newWord);//prints the new word, to make sure it works
        return newWord;//returns the new word
        /*
         * We were struggling to get the index right, we often went out of bounds, we also didn't add the letter to the newWord variable correctly. These are the challenges.
         */
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        Scanner s = new Scanner(System.in); //create scanner object for user to input

        int numberOfWords = 0; //set the number of words entered to 0

        System.out.print("Please enter a word: "); //asks user to enter word
        String previousWord = s.next(); // assigns the first word to a variable

        numberOfWords++; //increments the number of words entered by 1

        System.out.print("Please enter a word: "); //asks user for second word
        String currentWord = s.next(); // assigns the second word to a variable

        while(!previousWord.equals(currentWord)) //loops until there is duplicated adjacent word
        {
            previousWord = currentWord; // sets the second word to first word
            numberOfWords++; //increments the number of words entered by 1

            System.out.print("Please enter a word: ");//asks user to enter word
            currentWord = s.next(); //sets this new word as the current word
        }

        return numberOfWords; //returns the number of words before a duplicated adjacent occurs.

        /*
         * Challenges we faced: it was hard for us to figure out how we would update the word every time within the loop so that a
         * new word could be entered, read, and compared to the most recent previous word. We figured out eventually to set
         * two different variables for words that would be updated within the loop. This took some time to come to though because
         * we were struggling to figure out how we could update the string from the scanner since we know strings are immutable.
         */

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
        int count = 0;
        String word = "";
        System.out.println("Enter a word that is alphabetically after 'north' that has more than six characters: ");
        do
        {
            word = s.next();
            String north = "north";
            int n = word.length();
            if(n<7)
            {
                System.out.println("Sorry! Your word should have more than six characters.");
            }
            else
            {
                int compare = word.compareTo(north);
                if(compare<=0){
                    System.out.println("Sorry! Your word should be alphabetically after the word 'north'.");
                }
                else
                {
                    count++;
                }
            }
           
        } while(count<1);
        return word;
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