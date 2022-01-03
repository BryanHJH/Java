public class ReturnValues {
    public static void main(String[] args) {
        measureRectangle(1.2, 2.4);
    }

    public static double measureRectangle(double width, double length) {
        double area = width * length;
        return area;
    }
}
