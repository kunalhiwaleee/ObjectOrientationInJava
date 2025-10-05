// Example of Dyanmic Polymorphism, Inheritance and Generalization
public class Car extends Vehicle {

    int totalCapacity;

    public Car() {
    }

    public Car(int totalCapacity, String brand, int speed) {
        super(brand, speed);
        this.totalCapacity = totalCapacity;
    }

    @Override
    public void start() {
        System.out.println(super.brand + " car starts at " + speed + " km/h.");
    }
    
    public void openTrunk() {
        System.out.println(brand + " trunk opened.");
    }


    @Override
    public String toString() {
        return "Car toString Called";
    }

}
