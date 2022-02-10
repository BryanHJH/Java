public class LabJavaStructures1 {
    public static void main(String[] args) {
        double tuitionFees = 10000;
        double percentIncrease = 0.05;

        for (int i = 1; i <= 10; i++) {
            double amountIncrease = tuitionFees * percentIncrease;
            tuitionFees += amountIncrease;
        }
    }
}