import Polymorphism.Bike;
import Polymorphism.Car;
import Polymorphism.SuperCar;
import Polymorphism.Truck;
import Polymorphism.Vehicle;

public class Main {
    public static void main(String[] args) {
      Vehicle car = new Car(4, "Honda", 120);
      Vehicle bike = new Bike(false, "Royal Enfield", 80);
      Vehicle truck = new Truck("Faizer", 180, 550);
      Vehicle superCar = new SuperCar("Ferrari", 360);

      Vehicle[] vehicles = {car,bike, truck, superCar};

      for(Vehicle v : vehicles) {
        v.start();
        v.stop();

        System.out.println("---------------------------------");
      }


    }
}
