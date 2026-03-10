public class Car {
    //data fields
    private String plateNo;
    private String colour;
    private int yearManufactured;
    private CarType carType;

    //parameterised constructor
    public Car(String plateNo, String colour, int yearManufactured, CarType carType) {
        this.plateNo = plateNo;
        this.colour = colour;
        this.yearManufactured = yearManufactured;
        this.carType = carType;
    }

    //toString() method
    public String toString() {
        // use String.format to format the output
        return String.format ("%-10s %-8s %-6s %-15s", plateNo, colour, yearManufactured, carType);
    }

}
