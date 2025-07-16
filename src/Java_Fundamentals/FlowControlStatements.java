package Java_Fundamentals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FlowControlStatements {
    public static void main(String[] args) {

        // Problem 1 - A
        int num = -5;
        if(num > 0)
            System.out.println("Positive");
        else if(num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");


        // Problem 1 - B
        int a = 7, b = 17;
        System.out.println((a % 10) == (b % 10));


        // Problem 2
        int num1 = 4;
        if(num1 % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");


        // Problem 3
        if(args.length == 0)
            System.out.println("No values");
        else {
            for(int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if(i < args.length - 1)
                    System.out.print(",");
            }
        }

        // Problem 4
        char ch1 = 's', ch2 = 'e';
        if(ch1 < ch2) {
            System.out.println(ch1 + "," + ch2);
        }
        else {
            System.out.println(ch2 + "," + ch1);
        }

        // Problem 5
        char ch = '@';
        if(Character.isLetter(ch))
            System.out.println("Alphabet");
        else if(Character.isDigit(ch))
            System.out.println("Digit");
        else
            System.out.println("Special Character");

        // Problem 6
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        if(gender.equalsIgnoreCase("Female")) {
            if(age >= 1 && age <= 58)
                System.out.println("8.2%");
            else if(age >= 59 && age <= 100)
                System.out.println("9.2%");
        } else if(gender.equalsIgnoreCase("Male")) {
            if(age >= 1 && age <= 58)
                System.out.println("8.4%");
            else if(age >= 59 && age <= 100)
                System.out.println("10.5%");
        }

        // Problem 7
        char ch3 = 'A';
        if(Character.isLowerCase(ch3))
            System.out.println("i/p:" + ch3 + "\no/p:" + Character.toUpperCase(ch3));
        else if(Character.isUpperCase(ch3))
            System.out.println("i/p:" + ch3 + "\no/p:" + Character.toLowerCase(ch3));

        // Problem 8
        char code = 'B';
        switch(code) {
            case 'R': System.out.println("Red"); break;
            case 'B': System.out.println("Blue"); break;
            case 'G': System.out.println("Green"); break;
            case 'O': System.out.println("Orange"); break;
            case 'Y': System.out.println("Yellow"); break;
            case 'W': System.out.println("White"); break;
            default: System.out.println("Invalid Code");
        }

        // Problem 9
        if(args.length == 0)
            System.out.println("Please enter the month in numbers");
        else {
            int month = Integer.parseInt(args[0]);
            switch(month) {
                case 1: System.out.println("January"); break;
                case 2: System.out.println("February"); break;
                case 3: System.out.println("March"); break;
                case 4: System.out.println("April"); break;
                case 5: System.out.println("May"); break;
                case 6: System.out.println("June"); break;
                case 7: System.out.println("July"); break;
                case 8: System.out.println("August"); break;
                case 9: System.out.println("September"); break;
                case 10: System.out.println("October"); break;
                case 11: System.out.println("November"); break;
                case 12: System.out.println("December"); break;
                default: System.out.println("Invalid month");
            }
        }

        // Problem 10
        for(int i = 1; i <= 10; i++)
            System.out.print(i + "\t");

        // Problem 11
        for(int i = 23; i <= 57; i++) {
            if(i % 2 == 0)
                System.out.println(i);
        }

        // Problem 12
        int num2 = 17;
        boolean isPrime = true;
        for(int i = 2; i <= num2 / 2; i++) {
            if(num2 % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");

        // Problem 13
        for(int i = 10; i <= 99; i++) {
            boolean isPrime1 = true;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    isPrime1 = false;
                    break;
                }
            }
            if(isPrime1)
                System.out.println(i);
        }

        // Problem 14
        int num3 = 1234, sum = 0;
        for(; num3 > 0; num3 /= 10)
            sum += num3 % 10;
        System.out.println(sum);

        // Problem 15
        int n = Integer.parseInt(args[0]);
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Problem 16
        int num4 = 1234, rev = 0;
        while(num4 != 0) {
            rev = rev * 10 + num4 % 10;
            num4 /= 10;
        }
        System.out.println(rev);

        //Problem 17
        int num5 = 110011, rev1 = 0, original = num5;
        while(num5 != 0) {
            rev1 = rev1 * 10 + num5 % 10;
            num5 /= 10;
        }
        if(original == rev1)
            System.out.println(original + " is a palindrome");
        else
            System.out.println(original + " is not a palindrome");

    }
}
