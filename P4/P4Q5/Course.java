package P4Q5;

public class Course {
    // data fields
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String [] studentNames = new String[100];

    private static int courseCount;

    // constructor
    public Course(String courseTitle, double feesPerStudent) {
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        courseCount++;
    }


    // getter / accessor methods
    public String getCourseTitle() {
        return courseTitle;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public static int getCourseCount() {
        return courseCount;
    }

    // setter / mutator methods
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }

    public void setnoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }

    public static void setCourseCoun(int courseCount) {
        Course.courseCount = courseCount;
    }

    // 
    public double calcFeesCollected() {
        return feesPerStudent * noOfStudents;
    }

    public void addStudent(String studName) {
        studentNames[noOfStudents] = studName;
        noOfStudents++;
    }

    public String toString() {
        return String.format("Course title: %s\n Fees: RM %.2f \nNo. of Students: %d", 
                             courseTitle, feesPerStudent, noOfStudents); 

    }

}
