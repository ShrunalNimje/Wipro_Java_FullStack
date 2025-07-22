package Oops_Inheritance;

// Problem 1
class Box {

    float width;
    float height;
    float depth;

    public Box(float width, float height, float depth) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public float volumeOfBox() {
        return width * depth * height;
    }
}

// Problem 2
class Calculator {

    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}

public class Classes_Objects {
    public static void main(String[] args) {

        Box b = new Box(1.2f, 8.6f, 3.4f);
        System.out.println("Volume of Box is: " + b.volumeOfBox());

        System.out.println(Calculator.powerInt(2, 3));
        System.out.println(Calculator.powerDouble(12.4, 23.4));
    }
}
