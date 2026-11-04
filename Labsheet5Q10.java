class Animal10 {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog10 extends Animal10 {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat10 extends Animal10 {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class Labsheet5Q10 {
    public static void main(String[] args) {
        Dog10 dog = new Dog10();
        Cat10 cat = new Cat10();

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();
    }
}
