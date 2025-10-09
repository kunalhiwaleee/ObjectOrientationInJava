package Polymorphism;
public abstract class Vehicle {
    String brand;
    int speed;

    public Vehicle() {
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public abstract void start();  

    public void stop() {
        System.out.println(brand + " vehicle stops.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

