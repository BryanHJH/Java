import javax.swing.BoundedRangeModel;

import java.util.*;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership!");
        System.out.println(" > Select option 'a' to buy a car");
        System.out.println(" > Select option 'b' to sell a car \n>>");
        String option = scan.nextLine();

        switch (option) {
            case "a": 
                System.out.println("\nWhat is your budget?");
                int budget = scan.nextInt();

                if (budget >= 10000) {
                    System.out.println("Great, we have a Nissan Altima available!");
                    System.out.println("\nDo you have insurance? (yes or no): ");
                    scan.nextLine(); //Throwaway line
                    String insurance = scan.nextLine();

                    System.out.println("\nDo you hava a license? (yes or no): ");
                    String license = scan.nextLine();

                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();

                    if (insurance.equals("yes") && license.equals("yes") && creditScore >= 600) {
                        System.out.println("\nGlad doing business with you!");
                    } else {
                        System.out.println("\nSorry, you're not eligible.");
                    }
                } else {
                    System.out.println("Sorry, we don't sell cars less than 10000");
                }
                break;
            case "b": 
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();

                System.out.println("\nWhat is your selling price?");
                int sellingPrice = scan.nextInt();

                if (value > sellingPrice && sellingPrice < 30000) {
                    System.out.println("Glad doing business with you!");
                } else {
                    System.out.println("Sorry, we're not interested.");
                }
            break;
            default: System.out.println("Invalid option.");
        }

        scan.close();
    }
}
