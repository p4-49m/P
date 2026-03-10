public class Registration {
    // data fields
    private int regNo;
    private Owner owner;
    private Car car;

    //static variable to keep track of the next reg no
    private static int nextRegNo = 1001;

    //parameterised constructor
    public Registration(Owner owner, Car car) {
        this.regNo = nextRegNo++;
        this.owner = owner;
        this.car = car; 
        
    }

    public static int getNextRegNo() {
        return nextRegNo;
    }

    // toString() method
    public String toString(){
        return String.format("%-6d %-25s %-39s\n", regNo, owner, car);
    }

}
