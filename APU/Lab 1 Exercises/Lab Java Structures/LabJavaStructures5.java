import java.util.Scanner;

public class LabJavaStructures5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int INSTATE = 3000, OUTSTATE = 4500, INROOMBOARD = 2500, OUTROOMBOARD = 3500, totalBill = 0;

        System.out.println("Please input \"I\" if you are in-state or \"O\" if you are out-of-state:");
        String state = scan.nextLine();

        System.out.println("\nPlease input \"Y\" if you require room and board and \"N\" if you do not:");
        String accomodation = scan.nextLine();

        if (state.equals("I")) {
            totalBill += INSTATE;

            if (accomodation.equals("Y")) {
                totalBill += INROOMBOARD;
            }
        } else {
            totalBill += OUTSTATE;
            
            if (accomodation.equals("Y")) {
                totalBill += OUTROOMBOARD;
            }
        }

        System.out.println("Your total bill for this semester is $" + totalBill);

        scan.close();
    }    
}
