package Polymorphism;
public class Bike extends Vehicle {
    public boolean hasKickStart;

    public Bike(boolean hasKickStart, String brand, int speed) {
        super(brand, speed);
        this.hasKickStart = hasKickStart;
    }
    
    @Override
    public void start() {
        if(hasKickStart) {
            System.out.println(brand + " bike starts with a kick.");
        }
        else {
             System.out.println(brand + " bike starts with a self-start button.");
        }
    }

    public void doWheelie() {
        System.out.println(brand + " bike is doing a wheelie!");
    }
}
