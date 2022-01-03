public class Parameters {
    public static void main(String[] args) {
        measureRectangle(1.2, 2.4);
    }

    public static void measureRectangle(double width, double length) {
        double area = width * length;
        System.out.println("Area: " + area);
    }
}
