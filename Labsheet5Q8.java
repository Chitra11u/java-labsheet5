class Person8 {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Employee8 extends Person8 {
    int employeeId;

    void displayEmployee() {
        displayName();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager8 extends Employee8 {
    String department;

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class Labsheet5Q8 {
    public static void main(String[] args) {
        Manager8 manager = new Manager8();
        manager.name = "Grace";
        manager.employeeId = 501;
        manager.department = "Operations";
        manager.displayManager();
    }
}
