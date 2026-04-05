public class Employee{

    private String name;
    private int yearjoined;
    private double basicSalary;

    public Employee(String name, int yearjoined, double basicSalary) {
        this.name = name;
        this.yearjoined = yearjoined;
        this.basicSalary = basicSalary;       
    }

    public String getName(){
        return name;
    }

    public int getYearjoined(){
        return yearjoined;
    }

    public double getbasicSalary(){
        return basicSalary;
    }

    public String setName(String name){
        this.name = name;
    }

    public int setYearjoined(int yearjoined){
        this.yearjoined = yearjoined;
    }

    public double setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }

    public String toString(){
        return toString;
    }

    public double calculateSalary(){
        return calculateSalary;
    }
}