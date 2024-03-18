package payroll;

public class Boss {
    public Employee emp;

    public Boss(Employee emp) {
        this.emp = emp;
    }

    public void payEmployee() {
        emp.showSalary();
    }
}

