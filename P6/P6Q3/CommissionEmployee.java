public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate; // Note: Corrected spelling from 'commissonRate' in the image

    // Constructor
    public CommissionEmployee(String name, int yearJoined, double basicSalary, double grossSale, double commissionRate) {
        super(name, yearJoined, basicSalary);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    // Getters and Setters
    public double getGrossSale() {
        return grossSale; 
    }
    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale; 
    }

    public double getCommissionRate() {
        return commissionRate; 
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;  
    }

    public double calculateSalary() {
        return super.calculateSalary() + (grossSale * commissionRate);
    }

    public String toString() {
        return super.toString() + "\nCommissionEmployee [Gross Sale=" + grossSale + ", Commission Rate=" + commissionRate + "]";
    }
}