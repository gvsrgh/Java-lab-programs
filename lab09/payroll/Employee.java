package payroll;

public class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("Salary: $" + salary);
    }
}

