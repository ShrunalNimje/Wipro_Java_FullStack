package Abstraction_Packages_ExceptionHandling;

// problem 1
interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

class Car implements Vehicle, FourWheeler {
    public void message() {
        Vehicle.super.message();
        FourWheeler.super.message();
        System.out.println("Inside Car");
    }
}

// problem 2
@FunctionalInterface
interface Test {
    int myFunction(int a, int b, int c);
}

public class Interface2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.message();

        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;

        int sum = t1.myFunction(2, 3, 4);
        int product = t2.myFunction(2, 3, 4);

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}
