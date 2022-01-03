public class DocComments {
    public static void main(String[] args) {
        
    }

    /**
     * Function Name: gret
     * 
     * Inside the function: 
     *  1. prints "Hi"
    */
    public static void greet() {
        
        System.out.println("Hi");
    }

    /**
     * Function Name: printString
     * 
     * @param name (String)
     * @param age (String)
     */
    public static void printString(String name, String age) {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old this year.");
    }

    /**
     * Function name: calculateArea
     * 
     * @param length    (double)
     * @param width     (double)
     * @return          (double)
     * 
     * Inside the function: 
     *  1. Calculating the area given the lenght and width
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}
