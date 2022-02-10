import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, value;

        System.out.println("Enter a value, 0 to exit: ");
        value = scan.nextInt();

        while (value != 0) {
            sum += value;
            System.out.println("\nSum: " + sum);
            System.out.println("Enter a value, 0 to exit: ");
            value = scan.nextInt();
        }
        
        scan.close();
    }
}
