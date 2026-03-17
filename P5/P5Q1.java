package P5;

import java.util.Scanner;

public class P5Q1 {
    private static final String VOWELS = "aeiou";
    // countVowels method
    public static int[] countVowels(String str) {
        //create a constant variable to store the vowels
        

        // create an array to store the count of each vowel
        int[] occurence = {0, 0, 0, 0, 0};
        //                 a, e, i, o, u

        //if the string is empty or null, return the occurence 
        // array with all 0s
        if (str == null || str.isEmpty()) {
            return occurence;
        }

        //if the string is not empty, then you count
        // the occurence of the vowels
        char[] charArr = str.toCharArray();
        for(char ch: charArr){
            //check and see if vowel is found
            int  indexFound = VOWELS.indexOf(Character.toLowerCase(ch));
            if (indexFound != -1) {
                occurence[indexFound]++;
            } 
        }
        return occurence;
    }

    //main method (to test it out)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next();

        System.out.println("The word '" + word + "' contains: ");

        int[] occurences = countVowels(word);
        for (int i = 0; i < occurences.length; i++) {
            System.out.println(VOWELS.charAt(i) + ": " + occurences[i]);
        }

        input.close();
        
    
    }
    
}   
