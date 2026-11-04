class Vehicle18 {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car18 extends Vehicle18 {
    void drive() {
        System.out.println("Car is driving.");
    }
}

interface Electric18 {
    void chargeBattery();
}

class ElectricCar18 extends Car18 implements Electric18 {
    @Override
    public void chargeBattery() {
        System.out.println("Charging electric vehicle battery.");
    }
}

public class Labsheet5Q18 {
    public static void main(String[] args) {
        ElectricCar18 myElectricCar = new ElectricCar18();
        myElectricCar.start();
        myElectricCar.drive();
        myElectricCar.chargeBattery();
    }
}
