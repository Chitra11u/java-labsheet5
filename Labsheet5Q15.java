class Shape15 {
    double calculateArea() {
        return 0.0;
    }
}

class Circle15 extends Shape15 {
    double radius;

    Circle15(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle15 extends Shape15 {
    double length;
    double width;

    Rectangle15(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Labsheet5Q15 {
    public static void main(String[] args) {
        Shape15 circle = new Circle15(5.0);
        Shape15 rectangle = new Rectangle15(4.0, 6.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
