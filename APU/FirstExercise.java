import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double GST = 0.06;

        System.out.print("Please provide the total cost of the meal (before GST): RM");
        double mealCost = scan.nextDouble();
        double mealCostGST = mealCost + (mealCost * GST);

        System.out.print("Please provide the amount of tips the customer provided: RM");
        double tip = scan.nextDouble();
        double finalMealCost = mealCostGST + tip;

        System.out.println("Cost of meal (before GST)\t:\t RM" + mealCost);
        System.out.println("Cost of meal (after GST)\t:\t RM" + mealCostGST);
        System.out.println("Cost of meal (after GST & tips) :\t RM" + finalMealCost);
    
        scan.close();
    }
}
