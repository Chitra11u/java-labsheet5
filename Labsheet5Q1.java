public class Labsheet5Q1 {
    private String name;
    private int rollNo;
    private double marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks: " + getMarks());
    }

    public static void main(String[] args) {
        Labsheet5Q1 student = new Labsheet5Q1();
        student.setName("Alice");
        student.setRollNo(101);
        student.setMarks(88.5);
        student.displayDetails();
    }
}
