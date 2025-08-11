package july22;

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle...");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class vehicleCar {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive();

        Vehicle c = new Car();
        c.drive();
    }
}
