public class OneMoreProgram {
    public static void main(String[] args) {
        // Loop 1
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            
        }
        System.out.println("Sum (1 to 10): " + sum);

        // Loop 2
        int sum2 = 0;
        int i = 1;
        while (sum2 < 100) {
            sum2 += i;
            i++;
        }
        System.out.println("Sum will be greater than 100 after " + i + " numbers. Final sum is " + sum2);
    }
}
