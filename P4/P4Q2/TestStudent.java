public class TestStudent {
    public static void main(String[]args){
        // create 2 student objects
        // create using no-arg constructors
        Student stu1 = new Student();
   
        // create using parameterised constructor
        Student stu2 = new Student("14WAB11223", "Sim");

        //use the mutator to set the stuID and name
        //fort stu1 object
        stu1.setStudentID("14WAB11224");
        stu1.setName("Alex");

        //use addQuiz methods to add the quiz score
        // to the created student object

        stu1.addQuiz(10);
        stu1.addQuiz(8);
        stu1.addQuiz(5);
        stu1.addQuiz(4);

        //addQuiz score to stu2
        stu2.addQuiz(8);
        stu2.addQuiz(6);
        stu2.addQuiz(9);
        stu2.addQuiz(10);

        //print result
        System.out.println("ID: " + stu1.getStudentID());
        System.out.println("-".repeat(30));
        System.out.println("Name: " + stu1.getName());
        System.out.println("Questions Completed: " + stu1.getQuizCount());
        System.out.println("Total Score: " + stu1.getTotalScore());
        System.out.println("Average Score: " + stu1.getAverageScore());

        System.out.println("ID: " + stu2.getStudentID());
        System.out.println("-".repeat(30));
        System.out.println("Name: " + stu2.getName());
        System.out.println("Questions Completed: " + stu2.getQuizCount());
        System.out.println("Total Score: " + stu2.getTotalScore());
        System.out.println("Average Score: " + stu2.getAverageScore());
    }
    
}
