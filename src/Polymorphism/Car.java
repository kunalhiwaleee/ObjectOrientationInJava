package Polymorphism;
// Example of Dyanmic Polymorphism, Inheritance and Generalization

public class Car implements Vehicle{

    private int totalCapacity;
    private String brand;
    public int speed; 
    

    public Car() {
    }

    public Car(int totalCapacity, String brand, int speed) {
        this.brand = brand;
        
        this.totalCapacity = totalCapacity;
    }

    @Override
    public void start() {
        System.out.println(super.brand + " car starts at " + speed + " km/h.");
    }
    
    public void openTrunk() {
        System.out.println(brand + " trunk opened.");
    }

    
}
