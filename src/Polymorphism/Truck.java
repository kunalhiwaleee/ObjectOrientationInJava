package Polymorphism;
public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String brand, int speed, int loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println(brand + " truck carrying " + loadCapacity + " tons is starting...");
    }

}