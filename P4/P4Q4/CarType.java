public class CarType {
    // data fields
    private String make;
    private String model;
    private double engineCapacity;

    // paramterised constructor
    public CarType(String make, String model, double engineCapacity) {
        this.make = make;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }


    //toString method
    public String toString() {
        // use String.format to format the output in a tabular form
        return String.format("%-10s %-10s %5.1f", make, model, engineCapacity);

    }
}