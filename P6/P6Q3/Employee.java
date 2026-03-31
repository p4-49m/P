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

    public void setName(String name){
        this.name = name;
    }

    public void setYearjoined(int yearjoined){
        this.yearjoined = yearjoined;
    }

    public void setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }

    public String toString(){
        return "Employee{name='" + name + "', yearjoined=" + yearjoined + ", basicSalary=" + basicSalary + "}";
    }

    public double calculateSalary(){
        return basicSalary;
    }
}