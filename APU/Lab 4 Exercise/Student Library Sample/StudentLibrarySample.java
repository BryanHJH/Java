import java.util.ArrayList;

public class StudentLibrarySample {
    public static void main(String[] args) {
        ArrayList<Student> StudentList = new ArrayList<Student>();

        Student s1 = new Student("TPNo.1", "Marcus");
        Student s2 = new Student("TPNo.2", "Chong");
        Student s3 = new Student("TPNo.3", "Jeanne");
        Student s4 = new Student("TPNo.4", "Darren");
        Student s5 = new Student("TPNo.5", "Mark");

        StudentList.add(s1);
        StudentList.add(s2);
        StudentList.add(s3);
        StudentList.add(s4);
        StudentList.add(s5);

        System.out.println(StudentList);
    }
}
