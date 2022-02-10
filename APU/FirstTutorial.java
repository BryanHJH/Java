import java.util.Scanner;

public class FirstTutorial {
    public static void main(String[] args) {
        // Creating a new scan object
        Scanner scan = new Scanner(System.in);

        // Printing
        System.out.println("Welcome to JAVA programming!");
        System.out.print("Asia Pacific University");
        System.out.println("Malaysia");
        System.out.print("Bukit Jalil");
        System.out.print("KL");
        System.out.println();

        // Variables declaration and accepting user inputs
        System.out.print("Please provide your student's marks (3 separate marks in one line): ");
        int mark1 = scan.nextInt();
        int mark2 = scan.nextInt();
        int mark3 = scan.nextInt();
        System.out.print("Please enter your name: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("Good morning, " + name + ". Your total marks are " + (mark1 + mark2 + mark3) + ".");
        
        // Closing the scanner
        scan.close();
    }
}
