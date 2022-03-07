public class Pyramid {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (j == 0) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
