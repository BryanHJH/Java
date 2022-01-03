import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers (on the same line): ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter two large integers (on the same line): ");
        long long1 = scan.nextLong();
        long long2 = scan.nextLong();

        System.out.println("Enter two decimals (on the same line): ");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();

        System.out.println("Enter two string values: ");
        String sentence1 = scan.next();
        String sentence2 = scan.next();

        scan.close();

        System.out.println("\tIntegers: " + num1 + " " + num2);
        System.out.println("\tLarge Integers: " + long1 + " " + long2);
        System.out.println("\tDecimals: " + decimal1 + " " + decimal2);
        System.out.println("\tString: " + sentence1 + " " + sentence2);
    }
}
