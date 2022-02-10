import java.util.Scanner;

public class Tutorial1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("FORMULAE CALCULATION");
        System.out.println("\n1. Area of Circle\n2. Area of Triangle\n");
        System.out.print("Enter your choice: ");
        int userChoice = scan.nextInt();

        if (userChoice == 2) {
            System.out.print("Enter breadth and height: ");
            double breadth = scan.nextDouble();
            double height = scan.nextDouble();
            System.out.println("Area of Triangle: " + (0.5 * breadth * height));
        } else {
            System.out.print("Enter the radius of the Circle: ");
            double radius = scan.nextDouble();
            System.out.println("Area of Circle: " + (Math.PI * Math.pow(radius, 2)));
        }

        scan.close();
    }
}
