class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Labsheet5Q5 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Eva";
        student.age = 20;
        student.rollNo = 105;
        student.course = "Computer Science";
        student.displayStudent();
    }
}
