import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        // Initiating a Scanner object
        Scanner scan = new Scanner(System.in);

        // Setting the answer to be between 1 to 10
        double number = Math.random() * 10;
        int answer = (int)number + 1;

        int count = 1;

        System.out.print("Turn " + count + ": Please guess a number between 1 to 10: ");
        int userAnswer = scan.nextInt();

        while (userAnswer != answer) {
            count++;
            if (userAnswer < answer) {
                System.out.print("Turn " + count + ": Your answer is too low. Please guess again: ");
                userAnswer = scan.nextInt();
            } else {
                System.out.print("Turn " + count + ": Your answer is too high. Please guess again: ");
                userAnswer = scan.nextInt();
            }

        }

        System.out.println("Congratulations, you got it correct! You took " + count + " attempts");

        scan.close();
    }
}
