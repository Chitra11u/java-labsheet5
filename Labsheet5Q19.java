class Employee19 {
    private String name;
    private int employeeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

interface Programmer19 {
    void writeCode();
}

interface Researcher19 {
    void conductResearch();
}

class Developer19 extends Employee19 implements Programmer19, Researcher19 {
    @Override
    public void writeCode() {
        System.out.println("Writing software code...");
    }

    @Override
    public void conductResearch() {
        System.out.println("Conducting technology research...");
    }
}

public class Labsheet5Q19 {
    public static void main(String[] args) {
        Developer19 dev = new Developer19();
        dev.setName("Daniel");
        dev.setEmployeeId(305);
        dev.displayEmployee();
        dev.writeCode();
        dev.conductResearch();
    }
}
