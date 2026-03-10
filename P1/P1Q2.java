import java.util.Scanner;

public class P1Q2 {
    public static void main(String[] args){
        final int KM_TO_M = 1000;
        final int M_TO_CM = 100;
        final int CM_TO_MM = 10;

        //create a scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance (kilometer): ");
        int km = input.nextInt();

        //conversion logic
        int m = km * KM_TO_M;
        int cm = m * M_TO_CM;
        int mm = cm * CM_TO_MM;

        System.out.println("Distance in kilometers: " + km + " kilometers");
        System.out.println("Distance in meters: " + m + " meters");
        System.out.println("Distance in centimeters: " + cm + " centimeters");
        System.out.println("Distance in millimeters: " + mm + " millimeters");

        System.out.println("\nProcess completed.\n");

        input.close();
    }
}
