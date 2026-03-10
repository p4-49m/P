public class P3Q2 {
    public static void main(String[] args) {
        // create an array of integer number
        int[] list = {1, -2, 4, 5, 10, 200, -32, -22};
        // invoke the method to find the index of the smallest value
        int smallestIdx = findSmallestIndex(list);
        System.out.println("The index of the main is " + smallestIdx + " which the value is " + list[smallestIdx]);
        System.out.println("\u001B[33mBUILD SUCCESSFULL (total time: 0 seconds)\u001B[0m");

    }    
    
    //create a method to find the INDEX of the
    //smallest value in the array
    public static int findSmallestIndex(int[] array){
        //assume the first element in the array is SMALLEST
        int smallest = array[0]; // index 0 is the first element
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++){
            if (smallest > array[i]){
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;

        
    }
   

}

