import java.util.Scanner;

public class LabJavaStructures3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int RETAIL = 12;
        double discountRate=0 , finalPrice=0;

        System.out.println("How many shirts would you like?");
        int numOfShirt = scan.nextInt();

        if (numOfShirt >= 31) {
            discountRate = 0.25;
        } else if (numOfShirt >= 21) {
            discountRate = 0.2;
        } else if (numOfShirt >= 11) {
            discountRate = 0.15;
        } else if (numOfShirt >= 5) {
            discountRate = 0.1;
        } else if (numOfShirt >= 0) {
            discountRate = 0;
        } else {
            System.out.println("Invalid input: Please enter a nonnegative integer");
        }

        finalPrice = RETAIL * (1-discountRate);
        System.out.println("The cost per shirt is$ " + finalPrice + " and the total cost is $" + (finalPrice * numOfShirt));

        scan.close();
    }
}
