import java.util.Scanner;

public class LabJavaStructures2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please type 'Yes' to continue: ");
        String userInput = scan.nextLine();

        while (!userInput.equals("No")) {
            System.out.print("Please type 'Yes' to continue, 'No' to exit: ");
            userInput = scan.nextLine();
        }
        
        scan.close();
    }    
}
