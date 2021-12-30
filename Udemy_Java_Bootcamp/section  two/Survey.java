import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        // Initializing the scanner instance
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        System.out.println("Welcome. Thank you for taking the survey!");
        System.out.println("What is your name?");
        String name = scan.nextLine(); // Waits for the user to input a string
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeeMoney = scan.nextDouble(); // Waits for the user to input a double
        counter ++;

        System.out.println("\nHow much money do you spend on fast food?");
        double fastFoodMoney = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times you buy coffee in a week?");
        int coffeeNumber = scan.nextInt(); // Waits for the user to input an integer
        counter++;

        System.out.println("\nHow many times do you buy fast food in a week?");
        int foodNumber = scan.nextInt();
        counter++;

        scan.close();

        System.out.println("\nThank you, " + name + " for answering all " + counter + " questions.");
        System.out.println("Your fast food expense are " + (fastFoodMoney/coffeeMoney) + " times more than your coffee expense");
        System.out.println("Weekly, you spend $" + (coffeeMoney*coffeeNumber) + " on coffee.");
        System.out.println("Weekly, you spend $" + (fastFoodMoney*foodNumber) + " on fast food.");
    }
}
