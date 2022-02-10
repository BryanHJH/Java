import java.util.Scanner;

public class LabJavaStructures4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumWaterBill = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Please input your water bill for quarter " + i + ":");
            int quarterWaterBill = scan.nextInt();
            sumWaterBill += quarterWaterBill;
        }

        double averageWaterBill = Math.floor((sumWaterBill*100)/12)/100;

        if (averageWaterBill > 75) {
            System.out.println("Your average monthly bill is $" + averageWaterBill + ". You are using excessive amounts of water.");
        } else if (averageWaterBill > 25) {
            System.out.println("Your average monthly bill is $" + averageWaterBill + ". You are using a typical amount of water.");
        } else {
            System.out.println("Your average monthly bill is $" + averageWaterBill + ". Thanks for conserving water!");
        }
    }    
}
