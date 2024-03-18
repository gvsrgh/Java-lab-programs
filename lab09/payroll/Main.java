package payroll;

public class Main {
    public static void main(String args[]) {
        Employee emp = new Employee(1000000);
        Boss boss = new Boss(emp);
        boss.payEmployee();
    }
}

