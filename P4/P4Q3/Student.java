package P4Q3;

public class Student {

    // data fields
    private String studentID;
    private String name;
    private int quizCount;
    private double totalScore;

    //Static vaiable is created here to store
    // quiz contribution percentage
    // only ONE COPY of this variable exists
    // shared by all the objects of the class
    // for the Student class
    private static double quizContribution;

    //No-arg constructor
    public Student(){
        //studentID = "";
        //name = "";
        this("", "");
    }

    // constructor with 2 parameters
    public Student(String studentID, String name){
        this.studentID = studentID;
        this.name = name;
        quizCount = 0;
        totalScore = 0.0;
    }

    //accessor / getter
    //accessinng the data fields of the
    //student object
    public String getStudentID() {
        return studentID;
    }

    //get name()
    public String getName() {
        return name;
    }

    //get quizCount()
    public int getQuizCount() {
        return quizCount;
    }

    //get totalScore()
    public double getTotalScore() { 
        return totalScore;
    }


    // static method for quizContribution
    public static double getQuizContribution() {
        return quizContribution;
    }


    //mutator / setter methods
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    //setName
    public void setName(String name){
        this.name = name;
    }


    // static setter method for quizContribution
    public static void setQuizContribution(double quizContribution){
        Student.quizContribution = quizContribution;
    }
    

    //methods
    public void addQuiz(int score) {
        // totalScore = totalScore + score;
        totalScore += score;
        quizCount++;
    }

    public double getAverageScore(){
        // double avgScore = totalScore / quizCount;
        // return avgScore;
        return totalScore / quizCount;

    }

}
