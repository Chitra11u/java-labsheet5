class Employee14 {
    double calculateSalary() {
        return 50000.0;
    }
}

class Manager14 extends Employee14 {
    @Override
    double calculateSalary() {
        return 85000.0;
    }
}

public class Labsheet5Q14 {
    public static void main(String[] args) {
        Employee14 emp = new Employee14();
        Employee14 mgr = new Manager14();

        System.out.println("Employee Salary: " + emp.calculateSalary());
        System.out.println("Manager Salary: " + mgr.calculateSalary());
    }
}
