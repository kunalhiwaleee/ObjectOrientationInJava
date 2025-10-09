package Polymorphism;
public class SuperCar extends Car {

    final private static int totalCapacity = 2;

    public SuperCar(String brand, int speed) {
        super(totalCapacity, brand, speed);
    }

    @Override
    public void start() {
        System.out.println(super.brand + " supercar starts at " + speed + " km/h.");
    }

    public void superBoost () {
        System.out.println(brand + " car running on turbo boost");
    }
}
