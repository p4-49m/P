package P5;

import java.util.Scanner;

public class P5Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean invalid = false;

        // prompt user to enter the product code
        System.out.print("Enter a product code: ");
        String productCode = input.next();

        // check if the product code is 8 char long
        if(productCode.length() != 8){
            invalid  = true;

        }

        for(int i = 0; i < productCode.length(); i++){
            // get the character at current index
            char ch = productCode.charAt(i);

            // check if the character is not a letter or a digit
            if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                invalid = true;
                break;
            }

            // check if the first 2 characters are not uppercase letters
            else if(i < 2 ){
                if(!Character.isLetter(ch) == false || !Character.isUpperCase(ch) == false){
                    invalid = true;
                    break;
                }
            }

            //chack if the last 6 char are not digits
            else if(Character.isDigit(ch)){
                invalid = true;
                break;
            }

        }
        if(invalid){
            System.out.println("Invalid Product Code");
        }else{
            System.out.println("Valid Product Code");
        } 

        input.close();
    }

    
}
