class Animal7 {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog7 extends Animal7 {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Puppy extends Dog7 {
    void play() {
        System.out.println("Puppy is playing.");
    }
}

public class Labsheet5Q7 {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.play();
    }
}
