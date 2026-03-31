public class Clerk extends Employee {
    private double allowance;
    private int overtimeHours;
    private static double overtimeRate; // Static because it is underlined in the UML

    // Constructor
    public Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours) {
        super(name, yearJoined, basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
    }

    // Getters and Setters
    public double getAllowance() {
        return allowance;
    }
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }
    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public static double getOvertimeRate() {
        return overtimeRate;
    }
    public static void setOvertimeRate(double rate) {
        overtimeRate = rate;
    }

    public double calculateSalary() {
        return super.calculateSalary() + allowance + (overtimeHours * overtimeRate);
    }

    public String toString() {
        return super.toString() + "\nClerk [Allowance=" + allowance + ", Overtime Hours=" + overtimeHours + ", Overtime Rate=" + overtimeRate + "]";
    }
}