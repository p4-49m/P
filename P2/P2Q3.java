public class P2Q3 {
    // method 1: Coverts celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }


    // method 2: Converts Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // main method
    public static void main(String[] args){
        System.out.println("Celsius \t Fahrenheit \t Fahrenheit \t Celsius");
        // double fahrenheit = 50.0;
        // for (double i = 0.0; i <= 50; i += 10.0){
        //     System.out.printf("%.1f \t\t %.4f \t %.1f \t\t %.4f%n", 
        //     i, celsiusToFahrenheit(i), fahrenheit, fahrenheitToCelsius(fahrenheit));       
        //     fahrenheit += 10.0;
        // }
        
        for (double i = 0.0; i <= 50; i += 10.0){
            System.out.printf("%.1f \t\t %.4f \t %.1f \t\t %.4f%n", 
            i, celsiusToFahrenheit(i), i + 50.0, fahrenheitToCelsius(i + 50.0));
        }
    }
}
