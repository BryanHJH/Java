import java.util.Scanner;

public class Tutorial4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your height in centimeters: ");
        int height = scanner.nextInt();

        System.out.print("Enter your weight in kilograms: ");
        int weight = scanner.nextInt();

        double heightInch = Math.round(height/2.54);
        double weightPound = Math.round(weight/0.459359);

        System.out.println("Hello " + userName + ", you height is " + heightInch + " inches, and your weight is " + weightPound + " pounds.");

        scanner.close();
    }    
}
