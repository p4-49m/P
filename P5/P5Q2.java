package P5;

import java.util.Scanner;

public class P5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input .nextLine();

        //couvert all the charaters in the string
        // to uppercase
        String newStr = str.toUpperCase();

        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        for(char vowel: vowels){
            //replace all the vowels with the lowercase
            // characters 'x'
            newStr = newStr.replace(vowel, 'x');
        }
        System.out.println("Modified string: " + newStr);
        input.close();

    }
    
}
