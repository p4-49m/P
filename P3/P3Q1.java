import java.util.Scanner;

public class P3Q1 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter number of quiz scores to process: ");
        int quizCount = input.nextInt();

        //new line
        System.out.println();

        //create array with [] to hold the quiz scores
        int[] scores = new int[quizCount];

        // initialize a sum variable
        int sum = 0;

        for (int i = 0; i < quizCount; i++){
            System.out.print("Score " + (i+1) + ": ");
            scores[i] = input.nextInt();
            sum += scores[i];
        }
        
        // Calculate average
        double average = (double)sum / quizCount;

        // count number of scores above and below average
        int numOfabove = 0;
        int numOfbelow = 0;

        //use for-each loop when you ONLY NEED TO READ VALUES
        //use only when INDEX NUMBER IS NOT NEEDED
        for(int score: scores){
            if(score >= average){
                numOfabove++;
            } else {
                numOfbelow++;
            }
        }




        System.out.println("\nResults");
        System.out.println("=======");
        System.out.println("Average is " + average);
        System.out.println("Number of scores above or equal to the average is " + numOfabove);
        System.out.println("Number of scores below the average is " + numOfbelow);
        input.close();
    }


}
