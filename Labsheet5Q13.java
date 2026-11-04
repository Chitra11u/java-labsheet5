class Animal13 {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog13 extends Animal13 {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat13 extends Animal13 {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class Labsheet5Q13 {
    public static void main(String[] args) {
        Animal13 myAnimal = new Animal13();
        Animal13 myDog = new Dog13();
        Animal13 myCat = new Cat13();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}
