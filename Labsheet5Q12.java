class Employee12 {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

class Developer12 extends Employee12 {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Writing code in: " + programmingLanguage);
    }
}

class Manager12 extends Employee12 {
    String department;

    void conductMeeting() {
        System.out.println("Conducting meeting for department: " + department);
    }
}

public class Labsheet5Q12 {
    public static void main(String[] args) {
        Developer12 dev = new Developer12();
        dev.employeeId = 101;
        dev.employeeName = "Bob";
        dev.programmingLanguage = "Java";
        dev.displayEmployee();
        dev.writeCode();

        Manager12 mgr = new Manager12();
        mgr.employeeId = 102;
        mgr.employeeName = "Carol";
        mgr.department = "HR";
        mgr.displayEmployee();
        mgr.conductMeeting();
    }
}
