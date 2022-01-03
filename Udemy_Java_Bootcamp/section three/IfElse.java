public class IfElse {
    public static void main(String[] args) {
        int grade = 45;

        if (grade >= 80) { // Will only run if the condition is true
            System.out.println("Great job! You got an A!");
        } else if (grade >= 70) {
            System.out.println("You got a B.");
        } else if (grade >= 60) {
            System.out.println("You got a C");
        } else if (grade >= 50) {
            System.out.println("You got a D");
        } else {
            System.out.println("You failed.");
        }
    }
}
