import java.util.Scanner;

public class P1Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 8 digit creadit crad number: ");
        int cardNummber = input.nextInt();

        // first sum
        int sum1 = 0;
        int temp1 = cardNummber;

        //i = i + 2
        for(int i = 1; i < 8; i += 2){
            sum1 += temp1 % 10;
            temp1 /= 100; //temp1 = temp1 / 100
        }

        //second sum
        int sum2 = 0;
        int temp2 = cardNummber / 10;

        //i = i + 1
        for(int i = 1; i < 8; i += 2){
            int digit = (temp2 % 10) * 2;
            sum2 += digit % 10;
            digit /= 10;
            sum2 += digit % 10;
            digit /=100;
        }
    input.close();
    }
    
}
