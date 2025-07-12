package Logic_Building;

import java.util.Scanner;

public class SectionA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Conditional Statement
        // 1. Write a Program to accept a number N and a print whether the number is EVEN or ODD.
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }

        // 2. Write a Program to accept two numbers and print whether their sum is EVEN or ODD.
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        if (sum % 2 == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }

        // Looping Constructs
        // 1. Write a program to print all numbers from 1 to 100.
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Write a program to print alternate numbers starting from 1 to 99.
        for (int i = 1; i <= 99; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 3. Write a program to print alternate numbers starting from 0 to 100.
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 4. Write a program to print all numbers backwards from 100 to 0.
        for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4. Write a program to print numbers backwards from 100 to 1 by skipping 2 numbers.
        for (int i = 100; i >= 0; i = i - 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
