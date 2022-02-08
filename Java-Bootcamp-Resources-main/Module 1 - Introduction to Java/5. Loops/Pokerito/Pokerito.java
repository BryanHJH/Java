import java.util.Scanner;

import javax.swing.plaf.ComponentInputMapUIResource;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Task 2: Explain the rules

        >>Let's play Pokerito. Type anything when you're ready.
        |
        >>It's like Poker, but a lot simpler.
        >> (new line)
        >> • There are two players, you and the computer.
        >> • The dealer will give each player one card.
        >> • Then, the dealer will draw five cards (the river)
        >> • The player with the most river matches wins!
        >> • If the matches are equal, everyone's a winner!
        >> (new line)
        >> • Ready? Type anything if you are.
        |
        */
        
        System.out.println("Let's play Pokerito. Type something when you're ready.");
        System.out.print("> ");
        scan.nextLine();

        System.out.println(">>It's like Poker, but a lot simpler.\n>> There are 2 players, you and the computer.\n>>The dealer will give each player one card.\n>>Then, the dealer will draw five cards (the river)\n>> The player with th emost river matches wins!\n>> If the matches are equal, everyone's a winner!\n>>\n>> Ready? Type anything fi you are\n >>");
        scan.nextLine();

        /*Task 3: Present the user with a card
         println 'Here's your card:'
         <show card>
         <new line>
         println 'Here's the computer's card:'
         <show computer's card>
        */

        // User card
        System.out.println("Here's you card:");
        String userCard = randomCard();
        System.out.println(userCard);
        System.out.println("\n");

        // Computer card
        System.out.println("Here's the computer's card:");
        String computerCard = randomCard();
        System.out.println(computerCard);
        System.out.println("\n");

        int yourMatches = 0;
        int computerMatches =0;

        /** Task 4 - Draw five cards
         * 
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1 
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        int userScore = 0, computerScore = 0;

        for (int i = 1; i <= 5; i++) {
            scan.nextLine();
            String dealer = randomCard();
            System.out.println(dealer);
            if (userCard.equals(dealer)) {
                userScore ++;
            } else if (computerCard.equals(dealer)) {
                computerScore++;
            }
        }
/*         System.out.println(">>");
        scan.nextLine();
        String dealer1 = randomCard();
        System.out.println(dealer1);
        System.out.println("\n\n");

        System.out.println(">>");
        scan.nextLine();
        String dealer2 = randomCard();
        System.out.println(dealer2);
        System.out.println("\n\n");
        
        System.out.println(">>");
        scan.nextLine();
        String dealer3 = randomCard();
        System.out.println(dealer3);
        System.out.println("\n\n");

        System.out.println(">>");
        scan.nextLine();
        String dealer4 = randomCard();
        System.out.println(dealer4);
        System.out.println("\n\n");

        
        System.out.println(">>");
        scan.nextLine();
        String dealer5 = randomCard();
        System.out.println(dealer5);
        System.out.println("\n\n"); */

        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */


        if (userScore > computerScore) {
            System.out.println("Your score: " + userScore + "\nComputer score: " + computerScore + "\nYou win!");
        } else if (userScore < computerScore) {
            System.out.println("Your score: " + userScore + "\nComputer score: " + computerScore + "\nThe computer wins!");
        } else {
            System.out.println("Everyone wins!");
        }

        scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */
    public static String randomCard() {
        double number = Math.random() * 12;
        number += 1;
        int randomNumber = (int)number;
        String card = "";

        switch (randomNumber) {
            case 1: 
                card = ("   _____\n"+
                        "  |A _  |\n"+ 
                        "  | ( ) |\n"+
                        "  |(_'_)|\n"+
                        "  |  |  |\n"+
                        "  |____V|\n");
                break;
            case 2:
                card = ( "   _____\n"+              
                        "  |2    |\n"+ 
                        "  |  o  |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____Z|\n");
                break;
            case 3:
                card = ("   _____\n" +
                        "  |3    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____E|\n");
                break;
            case 4: 
                card = ("   _____\n" +
                        "  |4    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  | o o |\n"+
                        "  |____h|\n");
                break;
            case 5: 
                card = ("   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n");
                break;                        
            case 6:
                card = ("   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n");
                break;
            case 7: 
                card = ("   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n");
                break;
            case 8:
                card = ("   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n");
                break;
            case 9:
                card = ("   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n");
                break;
            case 10:
                card = ("   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n");
                break;
            case 11:
                card = ("   _____\n" +
                        "  |J  ww|\n"+ 
                        "  | o {)|\n"+ 
                        "  |o o% |\n"+ 
                        "  | | % |\n"+ 
                        "  |__%%[|\n");
                break;
            case 12: 
                card = ("   _____\n" +
                        "  |Q  ww|\n"+ 
                        "  | o {(|\n"+ 
                        "  |o o%%|\n"+ 
                        "  | |%%%|\n"+ 
                        "  |_%%%O|\n");
                break;
            case 13:
                card = ("   _____\n" +
                        "  |K  WW|\n"+ 
                        "  | o {)|\n"+ 
                        "  |o o%%|\n"+ 
                        "  | |%%%|\n"+ 
                        "  |_%%%>|\n");
                break;
        }
        return card;
    }
}
