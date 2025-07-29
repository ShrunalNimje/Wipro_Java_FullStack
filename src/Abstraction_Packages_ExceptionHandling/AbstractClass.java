package Abstraction_Packages_ExceptionHandling;

// problem 1
abstract class Compartment {
    abstract void displayNotice();
}

class FirstClass extends Compartment {
    void displayNotice() {
        System.out.println("This is First Class.");
    }
}

class Ladies extends Compartment {
    void displayNotice() {
        System.out.println("This is Ladies Compartment.");
    }
}

class General extends Compartment {
    void displayNotice() {
        System.out.println("This is General Compartment.");
    }
}

class Luggage extends Compartment {
    void displayNotice() {
        System.out.println("This is Luggage Compartment.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Compartment[] coaches = new Compartment[10];
        for (int i = 0; i < coaches.length; i++) {
            int rand = (int) (Math.random() * 4);
            switch (rand) {
                case 0 -> coaches[i] = new FirstClass();
                case 1 -> coaches[i] = new Ladies();
                case 2 -> coaches[i] = new General();
                case 3 -> coaches[i] = new Luggage();
            }
            coaches[i].displayNotice();
        }
    }
}
