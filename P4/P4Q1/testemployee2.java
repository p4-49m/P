package P4Q1;

public class testemployee2 {
    public static void main(String[] args) {
        //create an employee object
        Employee emp1 = new Employee();
        emp1.setName("Bryan");
        emp1.setSalary(3000.0);

        //create an employee object
        Employee emp2 = new Employee("Candy");
        emp2.setSalary(2500.0);

        //display employee with higher salary
        if(emp1.getSalary() > emp2.getSalary()){
            System.out.println(emp1.getName() + " has higher salary than " + emp2.getName());
        }else{
            System.out.println(emp2.getName() + " has higher salary than " + emp1.getName());
        }

        // compute and display thr salary of the 2 employees
        double totalSalary = emp1.getSalary() + emp2.getSalary();
        System.out.printf("Total salary of the 2 employees is RM%.2f", totalSalary);

    }

}
