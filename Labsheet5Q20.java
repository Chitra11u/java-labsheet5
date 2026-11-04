interface Researcher20 {
    void conductResearch();
}

class Employee20 {
    private int employeeId;
    private String employeeName;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Calculated Salary: " + calculateSalary());
    }

    public double calculateSalary() {
        return salary;
    }
}

class Teacher20 extends Employee20 implements Researcher20 {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teaching subject: " + subject);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 15000.0;
    }

    @Override
    public void conductResearch() {
        System.out.println("Conducting academic research in " + subject);
    }
}

class VisitingTeacher20 extends Teacher20 {
    private int hoursWorked;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * 600.0;
    }
}

class Admin20 extends Employee20 {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void manageDepartment() {
        System.out.println("Managing administrative department: " + department);
    }
}

public class Labsheet5Q20 {
    public static void main(String[] args) {
        Teacher20 teacher = new Teacher20();
        teacher.setEmployeeId(101);
        teacher.setEmployeeName("Dr. Alan");
        teacher.setSalary(60000.0);
        teacher.setSubject("Computer Science");
        teacher.displayDetails();
        teacher.teach();
        teacher.conductResearch();

        System.out.println("-----------------------------------");

        VisitingTeacher20 vTeacher = new VisitingTeacher20();
        vTeacher.setEmployeeId(102);
        vTeacher.setEmployeeName("Sarah");
        vTeacher.setSubject("Mathematics");
        vTeacher.setHoursWorked(30);
        vTeacher.displayDetails();
        vTeacher.teach();

        System.out.println("-----------------------------------");

        Admin20 admin = new Admin20();
        admin.setEmployeeId(103);
        admin.setEmployeeName("Michael");
        admin.setSalary(70000.0);
        admin.setDepartment("Human Resources");
        admin.displayDetails();
        admin.manageDepartment();
    }
}
