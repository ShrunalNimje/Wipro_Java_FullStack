package Oops_Inheritance;

// Problem 1
class Fruit {
    protected String name, taste;
    protected int size;

    public Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

class Apple extends Fruit {
    public Apple() {
        super("Apple", "Sweet", 5);
    }

    @Override
    void eat() {
        System.out.println("Eating Apple: Taste is " + taste);
    }
}

class Orange extends Fruit {
    public Orange() {
        super("Orange", "Sour", 4);
    }

    @Override
    void eat() {
        System.out.println("Eating Orange: Taste is " + taste);
    }
}

// Problem 2
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }

    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing Triangle");
    }

    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }

    void erase() {
        System.out.println("Erasing Square");
    }
}

public class Overriding_Polymorphism {
    public static void main(String[] args) {

        Fruit f1 = new Apple();
        Fruit f2 = new Orange();
        f1.eat();
        f2.eat();

        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();
        c.draw(); c.erase();
        t.draw(); t.erase();
        s.draw(); s.erase();
    }
}
