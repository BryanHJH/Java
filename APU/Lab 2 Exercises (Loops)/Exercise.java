import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        // Importing Scanner object to accept user input
        Scanner scan = new Scanner(System.in);

        // Asking how many numbers to calculate
        System.out.print("Please enter a number (Enter 0 to exit): ");
        int userChoice = scan.nextInt();

        // Keep asking which numbers to exponentiate
        while (userChoice != 0) {

            // Printing out the headers
            System.out.println("n\tn^2\tn^3\tn^4");
            
            // Looping through the user input
            for (int i = 1; i <= userChoice; i++) {    
                System.out.println(i + "\t" + (int)Math.pow(i, 2) + "\t" + (int)Math.pow(i, 3) + "\t" + (int)Math.pow(i, 4));
            }
            
            // Asking the user again, to avoid an infinite loop
            System.out.print("\nPlease enter a number (Enter 0 to exit): ");
            userChoice = scan.nextInt();
        }

        // Closing the scanner, to avoid memory leak (I think)
        scan.close();
    }
}
