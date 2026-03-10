public class P2Q4 {
    //method 1: with 2 integer parameters
    public static double calculateAverage(int num, int num2) {
        return (num + num2) / 2.0;
    }

    //method 2: with 3 integer parameters
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
    
    //method 3: with 2 double parameters
    public static double calculateAverage(double num1, double num2) {
        return (num1 + num2) / 2.0;
    }

    //method 4: with 3 double parameters
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }
    
    
    // Driver program
    public static void main(String[] args) {
        // Demoo calculate average with 2 int
        System.out.println("Average of 2 integers: " + calculateAverage(4, 8));

        //Demo calculate average with 3 int
        System.out.println("Average of 3 integers: " + calculateAverage(4, 8, 12));

        //Demo calculate average with 2 double  
        System.out.println("Average of 2 doubles: " + calculateAverage(4.5, 8.5));

        //Demo calculate average with 3 double
        System.out.println("Average of 3 doubles: " + calculateAverage(4.5, 8.5, 12.5));


    }


}
