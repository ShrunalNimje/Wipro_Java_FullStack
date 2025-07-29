package Abstraction_Packages_ExceptionHandling;

import java.util.Scanner;

// Problem 3
class MarksOutOfRangeException extends Exception {
    MarksOutOfRangeException(String message) {
        super(message);
    }
}

// Problem 4
class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }
}

// Problem 5
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class UserRegistration {
    void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {

        // Problem 1
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in the array");
            int size = Integer.parseInt(sc.nextLine());
            int[] arr = new int[size];

            System.out.println("Enter the elements in the array");
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(sc.nextLine());
            }

            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        // Problem 2
        int[] nums = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(args[i]);
            sum += nums[i];
        }

        double avg = sum / 5.0;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

        // Problem 3
        try {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter name of student " + i + ":");
                String name = sc.nextLine();

                int total = 0;
                for (int j = 1; j <= 3; j++) {
                    System.out.println("Enter marks in subject " + j + ":");
                    int marks = Integer.parseInt(sc.nextLine());
                    if (marks < 0 || marks > 100) {
                        throw new MarksOutOfRangeException("Marks should be between 0 and 100");
                    }
                    total += marks;
                }
                double avg1 = total / 3.0;
                System.out.println("Average marks of " + name + " = " + avg1);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integer marks.");
        }
        catch (MarksOutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        // Problem 4
        UserRegistration user = new UserRegistration();

        try {
            user.registerUser("Mickey", "US");  // Change to "India" to test other scenario
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

        // Problem 5
        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be >= 18 and < 60");
            }

            System.out.println("Name: " + name + ", Age: " + age);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide name and age as command-line arguments.");
        }
        catch (NumberFormatException e) {
            System.out.println("Age must be a valid number.");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
