//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {
    
      // Example of Multiple Inheritance  
      Vehicle car = new Car(4, "Toyota", 120);
      Vehicle bike = new Bike(false, "Access", 60);
      Vehicle truck = new Truck("Faizer", 110, 360);
      
      Vehicle superCar = new SuperCar("Ferrari", 450);
      superCar.start();
      superCar.stop();
      superCar.displayInfo();
      System.out.println("-------------");

      if(superCar instanceof SuperCar sc) sc.superBoost();
    }
}


