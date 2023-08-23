package inheritance;

public class Vehicle {
    int noDoors;

    Vehicle() {
        System.out.println("Vehicle constructor");
    }

    public void vroom() {
        System.out.println("Vroom vroom");
    }

    int maxSpeed = 120;
}

class Car extends Vehicle {
    int maxSpeed = 100;

    public void display() {
        System.out.println(super.maxSpeed);
    }

    public void vroom() {
//        System.out.println("Skuuuurt");
        super.vroom();
    }

    Car() {
        super();
        System.out.println("Car constructor");

    }
}
