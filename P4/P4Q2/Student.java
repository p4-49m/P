public class Student {

    // data fields
    private String studentID;
    private String name;
    private int quizCount;
    private double totalScore;


    //No-arg constructor
    public Student(){
        studentID = "";
        name = "";
    }

    // constructor with 2 parameters
    public Student(String stuID, String stuName){
        studentID = stuID;
        name = stuName;
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

    //mutator / setter methods
    public void setStudentID(String stuID) {
        studentID = stuID;
    }

    //setName
    public void setName(String stuName){
        name = stuName;
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
