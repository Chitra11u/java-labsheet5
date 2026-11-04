public class Labsheet5Q3 {
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
        if (salary >= 0 && salary <= 1000000) {
            this.salary = salary;
            System.out.println("Salary set successfully.");
        } else {
            System.out.println("Invalid salary. Salary must be between 0 and 1,000,000.");
        }
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Labsheet5Q3 emp1 = new Labsheet5Q3();
        emp1.setEmployeeId(1);
        emp1.setEmployeeName("Charlie");
        emp1.setSalary(75000.0);
        emp1.displayDetails();

        Labsheet5Q3 emp2 = new Labsheet5Q3();
        emp2.setEmployeeId(2);
        emp2.setEmployeeName("David");
        emp2.setSalary(-5000.0);
        emp2.setSalary(1500000.0);
        emp2.displayDetails();
    }
}
