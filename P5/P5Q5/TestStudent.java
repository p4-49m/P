package P5.P5Q5;

public class TestStudent {
    public static void main(String[] args) {
        // create a student object
        Student stu1 = new Student("A12345", "TTT", "FACS");
        System.out.println(Student.validateStudentID(stu1));
        System.out.println(stu1.getname() + " is studying in " + stu1.getschool());
    }
}