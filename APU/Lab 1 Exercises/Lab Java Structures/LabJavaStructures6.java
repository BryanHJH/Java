import java.util.Scanner;

public class LabJavaStructures6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count=1, coffee=0, tea=0, coke=0, orangeJuice=0;

        System.out.println("Survey items: \n1. Coffee \n2. Tea \n3. Coke \n4. Orange Juice");

        System.out.println("\nPleae input the favourite beverage of person #" + count + ": Choose 1, 2, 3, or 4 from the above menu or -1 to exit the program");
        int userInput = scan.nextInt();

        while (userInput != -1) {
            count++;

            switch (userInput) {
                case 1: coffee += 1; break;
                case 2: tea += 1; break;
                case 3: coke += 1; break;
                case 4: orangeJuice += 1; break;
            }

            System.out.println("\nPleae input the favourite beverage of person #" + count + ": Choose 1, 2, 3, or 4 from the above menu or -1 to exit the program");
            userInput = scan.nextInt();
        }

        System.out.println("\t\tBeverage Number of Votes");
        System.out.println("\t\t########################");
        System.out.println("Cofee\t\t\t" + coffee);
        System.out.println("Tea\t\t\t" + tea);
        System.out.println("Coke\t\t\t" + coke);
        System.out.println("Orange Juice\t\t" + orangeJuice);
    }    
}
