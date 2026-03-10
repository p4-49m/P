import java.util.Scanner;

public class P3Q3 {
    public static void main(String[] args){
        // declare and initialize arrays of items and their unit costs
        String[] item = {"Apples", "Bananas", "Oranges", "Grapes", "Mangoes"};
        double[] unitCost = {2.00, 2.00, 2.50, 5.00, 5.00};


        // create an array to hold the quantity for each item
        int[] quantity = new int[item.length];

        Scanner input = new Scanner(System.in);


        // prompt the user to enter quantity for each item
        System.out.println("Item \t\t Quantity");
        for (int i = 0; i < item.length; i++) {
            System.out.printf(item[i] + "\t\t ");
            quantity[i] = input.nextInt();
        }

        //display the item with their quantity and total values
        System.out.println("Item \t\t Quantity \t Value (MYR)");
        for(int i = 0; i < item.length; i++){
            if(quantity[i] > 0 ){
                double value = quantity[i] * unitCost[i];
                System.out.printf("%s   \t %d \t\t %.2f\n", item[i], quantity[i], value);
            }
        
        }
        input.close();


    }

}
