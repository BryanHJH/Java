import java.util.Scanner;

public class Tutorial3 {
    public static void main(String[] args) {
        String firstName = "", lastName = "", question = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter your first name: ");
        firstName = scanner.nextLine();

        System.out.print("\nEnter your last name: ");
        lastName = scanner.nextLine();

        System.out.print("\nEnter your question: ");
        question = scanner.nextLine();

        System.out.printf("Hello %s %s! Hi %s, %s", lastName, firstName, firstName, question);

        scanner.close();
    }    
}
