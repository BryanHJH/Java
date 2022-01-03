public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 68;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congratulations, you got the scholarship!");
        } else {
            System.out.println("We're sorry, you didn't get the scholarship.");
        }

        int credits = 26;
        double CGPA = 1.2;

        if (credits >= 40 && CGPA >= 2.0) {
            System.out.println("You've earned your Diploma");
        } else if (credits < 40 && CGPA >= 2.0) {
            System.out.println("You need to have at least 40 credits to get your Diploma.");
        } else if (credits >= 40 && CGPA < 2.0) {
            System.out.println("You need to have at least a CGPA of 2.0 to get your Diploma.");
        } else {
            System.out.println("You need to have at least 40 credits and a CGPA of 2.0 to get your Diploma.");
        }
    }
}
