import java.util.*;

public class Hangman {

    // Creating a Scanner object that's accessible for the whole project
    static Scanner scan = new Scanner(System.in);

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {

        /**
         * Arrays that might be needed
         * 1. missedGuesses (used to store all the missedGuesses and can be used during the while loop in Step 3)
         * 2. String --> array of characters (Use "String".toCharArray()) - answerArray
         * 3. userInput (used to check for final confirmation ?maybe)
         * 4. dummyArr --> all are '_', update after each correct input
         * 
         *  */ 
        char[] missedGuesses = new char[6]; // Maximum of 6 wrong guesses only, since after 6 guesses the player loses


        // Step 1: Choose randomWord from words array --> Function 1
            // Step 1.1: Run words[randomNumber]
            // Step 1.2: Convert randomWord into char Array
        String chosenWord = words[randomNumber()];
        char[] answerArr = chosenWord.toCharArray();
        char[] dummyArr = new char[answerArr.length];
        
        for (int i = 0; i < dummyArr.length; i++) {
            dummyArr[i] = '_';
        }

        // Step 2: Print gallows -- System.out.println(gallows[0])
        System.out.println(gallows[0]);
        System.out.println(); // Prints a new lin

        // Start of while loop
        int turn = 1;

        while (turn < 7) {
            
            // Step 3: Print length of randomWord
                // Step 3.1 Replace all characters in char Array into '_' --> Function 2: printWord()
            System.out.println("Turn " + turn);
            printArray(dummyArr, " ");
            System.out.print("\nMissed guesses: "); 
            printArray(missedGuesses, "");

            // Step 4: Ask user to give input
                // Step 4.1 After each input use checkInput() --> Function 3
            // Step 5: Check user input is correct or not
                // Step 5.1: If correct, change the _ in the length of randomWord to the character
                // Step 5.2: If wrong, add the wrong guess into an array
            // Step 6: If user guesses all correctly, print congratulatory message. End the game.
                // Step 6.1 If Arrays.equal(dummyArr, answerArray) = win
            // Step 7: If user makes 6 incorrect guesses, end the game.
                // Step 7.1 Once turn reaches 7 then it's the end. 
            turn++;
        }

        System.out.println("You lost. The answer is " + chosenWord);


    }
    // Function 1: Create a function to choose a randomWord
    /**
     * Function name: randomNumber()
     * @return int: 0 - words.length
     * 
     * Inside the function:
     *  Generate a random double * words.length
     *  + 1 to the random double
     *  Typecast it to an int
     */
    public static int randomNumber() {
        return (int)(Math.random() * words.length);
    }

    // Function 2: Create a function to print out the dummyWord
    /**
     * Function name: printArray()
     * @param char[] arr
     * @param String separator
     * 
     * Inside the function:
     *  1. Prints out each element in the given array separated by the separator param
     *   */
    public static void printArray(char[] arr, String separator) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + separator);
        }
        System.out.println();
    }
    
    // Function 3: Create a function to check the input
    /**
     * Function name: checkInput()
     * @param char: userInput
     * @param char[]: randomWord arr
     * @return bool: true/false
     * 
     * Inside the function:
     *  takes in userInput and checks with the randomWord chosen
     *  if userInput matches with any of the elements in randomWord arr, return True
     *  else return False
     */

}





