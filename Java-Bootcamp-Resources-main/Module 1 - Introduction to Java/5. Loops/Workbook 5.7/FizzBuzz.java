public class FizzBuzz {
    public static void main(String[] args) {

       // Task 1 – Make a for loop that counts from 0 to 18. 
        for (int i = 0; i < 19; i++) {
            if (i%15 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }
    }
}
