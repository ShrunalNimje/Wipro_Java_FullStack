package Oops_Inheritance;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {

        // Problem 1
        String[] names = new String[5];
        Optional<String> name = Optional.ofNullable(names[0]);
        System.out.println(name.map(String::length).orElse(0));

        // Problem 2
        String address = null;
        System.out.println(Optional.ofNullable(address).orElse("India"));

        // Problem 3
        Employees1 emp = null;
        try {
            Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));
        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Employees1 {
}

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}