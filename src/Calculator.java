public class Calculator {

    // Method Overloading :
    // Creating multiple method has same name but have different parameter
    // Java Compiler will resolve at the time of compile time based on no of parameter, datatypes of parameter and order of parameter
    // Compile Time Polymorphism (False Polymorphism)
    // Only depends on parameter not on datatype
    // main method can be overloaded, But JVM will only call the standard signature (public static void main(String[] args)) as the program’s starting point. and other main function is helper function
    

    int add(int a, int b) {
        return a + b;
    }

    int add(int a,int b,int c) {
        return a + b + c;
    }

    double add(double a,double b) {
        System.out.println("2 Double");
        return a + b;
    }

    double add(int a , double b) {
        System.out.println("First is Integer and Second is Double");
        return a + b;
    }

    float add(float a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double results = calc.add(4 , 5.0);
        System.out.println(results);

    }


}
