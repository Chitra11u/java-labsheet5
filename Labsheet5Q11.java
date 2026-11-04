class Person11 {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student11 extends Person11 {
    String course;

    void study() {
        System.out.println("Studying course: " + course);
    }
}

class Teacher11 extends Person11 {
    String subject;

    void teach() {
        System.out.println("Teaching subject: " + subject);
    }
}

public class Labsheet5Q11 {
    public static void main(String[] args) {
        Student11 student = new Student11();
        student.name = "Alice";
        student.course = "Mathematics";
        student.displayName();
        student.study();

        Teacher11 teacher = new Teacher11();
        teacher.name = "Mr. Smith";
        teacher.subject = "Physics";
        teacher.displayName();
        teacher.teach();
    }
}
