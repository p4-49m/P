package P4Q1;

public class Employee {
    // Data firlds
    String name;
    double salary;

    // no-argument constructor
    public Employee() {
        name = "";
        salary = 0.0;
    }

    // Constructor with 2 parameters
    public Employee(String employeeName, double currentSalary) {
        // storing employeeName value -> name data field
        name = employeeName;
        // storing currentSalary value -> salary data field
        salary = currentSalary;
    }
    
    // constructor with 1 parameter
    public Employee(String employeeName) {
        name = employeeName;
        salary = 0.0;
    }
    
    //getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    //setters 
    public void setName(String employeeName) {
        name = employeeName;
    }

    public void setSalary(double currentSalary) {
        salary = currentSalary;
    }
    

    //methods
    public void raiseSalary(double percentage) {
        salary = salary + (salary * percentage) / 100.0;
    }
}
