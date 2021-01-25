package module4.practice.prac;

public class Student extends module4.practice.Person {
    private int studentID;
    public Student(String name, int studentID) {
        super(name);
        this.studentID = studentID;
    }

    public int getSID() {
        return this.studentID;
    }
    public String toString() {
        return this.getSID() + " : " + super.getName() ;
    }

     public String msg() {
        return "Student Hi";
    }
}
