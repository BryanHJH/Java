import java.util.Scanner;

public class Tutorial2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double item1 = 0.0, item2 = 0.0;
        System.out.print("Enter your purchase amount: ");
        int purchaseAmount = scan.nextInt();

        if (purchaseAmount > 300) {
            item1 = 0.1;
            item2 = 0.15;
        } else if (purchaseAmount > 200) {
            item1 = 0.075;
            item2 = 0.1;
        } else if (purchaseAmount > 100) {
            item1 = 0.05;
            item2 = 0.075;
        } else {
            item2 = 0.05;
        }

        System.out.println("Item 1: " + item1 + "\nItem 2: " + item2);
        scan.close();
    }    
}
