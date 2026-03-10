public class P2Q1{
    public static void main(String[] args){
        System.out.println("Number \t Square \t Cube");
        for(int i = 0; i <= 20; i+=2){
            int num = i;
            double squareRoot = Math.sqrt(num);
            double cube = Math.pow(num, 3);
            System.out.printf("%d \t %.4f \t %.4f\n", num, squareRoot, cube);


            
        }
    }   
}
