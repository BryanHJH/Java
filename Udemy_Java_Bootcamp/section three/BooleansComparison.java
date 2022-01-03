public class BooleansComparison {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;
        boolean result = biologyGrade < chemistryGrade;
        System.out.println(result);

        System.out.println(chemistryGrade > biologyGrade);
        System.out.println(englishGrade == biologyGrade);

        String sentence = "Hello";
        String check = "Hello!";
        System.out.println(!sentence.equals(check));
    }
}
