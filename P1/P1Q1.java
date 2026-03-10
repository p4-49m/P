import java.util.Scanner;

public class P1Q1 {
    public static void main(String[] args){
        //create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = input.next();

        System.out.print("\nHow many subjects you have in this semester: ");
        int subject_num = input.nextInt();

        input.nextLine();

        System.out.print("\nWhat is the programme that you're currently studying? ");
        String programme = input.nextLine();

        System.out.println("\nWelcome "  + name + " from "  + programme + "!");
        System.out.println("Good Luck in all " + subject_num  + " courses you have in this semester!");
        
        input.close();
    }
}
