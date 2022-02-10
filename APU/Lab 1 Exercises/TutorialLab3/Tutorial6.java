import java.util.Scanner;

public class Tutorial6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bonus = 0;

        System.out.println("Salary Program");
        System.out.println("==============");
        System.out.println("Employment basis");
        System.out.println("1 - Permanent\n2 - Contract");
        System.out.print("Enter employment basis: ");
        int employment = scan.nextInt();

        System.out.print("Enter salary: ");
        double salary = scan.nextInt();

        switch (employment) {
            case 1: 
                if (salary >= 3000) {
                    bonus = 300;
                } else if (salary >= 1000) {
                    bonus = 200;
                } else {
                    bonus = 100;
                }
                break;
            case 2:
                bonus = 50;
                break;
        }
        
        System.out.println("New salary is $" + (salary + bonus));

        scan.close();
    }
}
