import java.util.Scanner;

public class Dice {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        int result1 = rollDice();
        int result2 = rollDice();
        int result3 = rollDice();

        System.out.println("Please provide 3 numbers (1 to 6). Enter in the same line:");
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        int input3 = scan.nextInt();

        if (input1 < 1 || input2 < 1 ||input3 < 1) {
            System.out.println("Your input cannot be less than 1");
            System.exit(0);
        }

        if (input1 > 6 || input2 > 6 ||input3 > 6) {
            System.out.println("Your input cannot be more than 6");
            System.exit(0);
        }

        int sumOfDiceRolls = result1 + result2 + result3;
        int sumOfInput = input1 + input2 + input3;
        System.out.println("Dice sum: " + sumOfDiceRolls + "\nYour sum: " + sumOfInput);


        if (checkWin(sumOfDiceRolls, sumOfInput)) {
            System.out.println("Congrats, you win!");
        } else {
            System.out.println("You lose.");
        }

        scan.close();
    }
    
    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    } 

    public static boolean checkWin(int sumDiceRolls, int sumInput) {
        return (sumInput > sumDiceRolls && sumInput-sumDiceRolls <= 3);
    }
}
