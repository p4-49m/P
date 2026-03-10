public class P2Q2 {
    //create a method to calculate the square root
    public static double squareRoot(double n){
        double lower, upper;
        double mid;
        double mid2;

        //case 1:n < 0
        if(n < 0){
            System.out.println("Error: Unable to square root negative number");
            // 1 => system terminate when ecountered error
            // 0 => system terminate cz everythimg processed
            System.exit(1);
        }
        // case 2: n = 0
        if(n == 0){
            return 0;
        }

        // case 3 : (n < 1) & (n > 0) [e.g. 0.5]
        if(n < 1.0){
            lower = n;
            upper = 1;
        }

        // case 4: n > 1
        else if(n > 1.0){
            lower = 1;
            upper = n;
        }

        // case 5: n = 1
        else{
            return 1.0;
        }

        while ((upper - lower) / lower >= (1 / Math.pow(10, 8))){
            mid = (lower + upper) / 2.0;
            mid2 = mid * mid;
            // if mid2 > n, adjust upper limit to mid
            if(mid2 > n){
                upper = mid;
            }

            //else if mid2 <= n, adjust lower limit to mid
            else{
                lower = mid;
            }
        }
        return ((lower + upper) / 2.0);
    }

    //create another driver method (driver program)
    public static void main(String[] args){
        for (double i = 0.0; i <= 20.0; i += 0.5){
            System.out.println("x = " + i + " root = " + squareRoot(i));
        }
    }
}
