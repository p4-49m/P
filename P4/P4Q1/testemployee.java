package P4Q1;

public class testemployee {
    public static void main(String args[]) {


        // create employee object
        Employee emp1 = new Employee("Alex", 2000.00);

        // display salary before the raise
        System.out.printf("Salary before the raise: RM%.2f", emp1.salary);

        //raise salary by 8%
        emp1.raiseSalary(8.0);

        // display salary after the raise
        System.out.printf("\nSalary after the raise: RM%.2f", emp1.salary);

    }

}
