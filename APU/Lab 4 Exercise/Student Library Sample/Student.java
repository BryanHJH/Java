public class Student {
    private String studentID;
    private String studentName;

    // Constructors
    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    // Getters
    public String getStudentName() {
        return this.studentName;
    }

    public String getStudentID() {
        return this.studentID;
    }

    // Setters
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName =studentName;
    }

    // toString method
    @Override
    public String toString() {
        return (this.studentName + ": " + this.studentID);
    }
}
