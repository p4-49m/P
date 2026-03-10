import java.util.Scanner;

public class testCarRegistration {
    public static void main(String [] args) {
        // create an array of CarType objects
        // each CaraType object is created using parameterised constructor
        CarType[] carTypeArr = {
            new CarType ("Toyota", "Vios", 1.5),
            new CarType ("Nissan", "Teana", 2.0),
            new CarType ("Honda", "City", 1.6)
        };
        
        // create an array to store Registration objects
        Registration[] regArr = new Registration[6];

        // create a scanner object ro read the user input
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < regArr.length; i++) {
            System.out.println("Registation Number: " + Registration.getNextRegNo());
            System.out.println("-".repeat(30));

            // enter owner's details
            System.out.print("Enter owner's name: ");
            String name = input.nextLine();
            System.out.print("Enter IC number: ");
            String icNo = input.next();

            //cteaye new owner obkect using the parameterised constructor
            Owner owner = new Owner(name, icNo);
            
            // enter car details
            System.out.print("Enter car plate number:");
            String plateNo = input.next();
            System.out.print("Enter car color: ");
            String color = input.next();
            System.out.print("Enter years manufactured: ");
            int yearManufactured = input.nextInt(); 

            // display car types to user
            System.out.println("nCar Types: ");
            for(int j = 0; j < carTypeArr.length; j++){
                System.out.println((j+1) + ". " + carTypeArr[j]);
            }
            System.out.println("Select cat type [1.." + carTypeArr.length + "]: ");
            int selection = input.nextInt();
            CarType carTypeSelected = carTypeArr[selection - 1];

            // create a new Car object
            Car car = new Car(plateNo, color, yearManufactured, carTypeSelected);

            // create a registration object
            regArr[i] = new Registration(owner, car);
        }
        displayListing(regArr);

    }

    public static void displayListing(Registration[] regisArr) {
        //displat the car registration listing
        // %50 means print the string in a field of 50 char
        // right aligned 
        System.out.printf("\n\n%50s", "Car Registration Listing");
        System.out.printf("%-6s %-12s %-12s %-10s %-8s %-6s %-10s %-10s %-5s \n",
                          "Reg No", "Name", "IC No.", "Palte No", "Color", 
                          "Years", "Make", "Model", "Capacity");
        for(int i = 0; i < regisArr.length; i++) {
            System.out.println(regisArr[i]);
        }


    }
    
}
