package Logic_Building;

import java.util.Scanner;

public class NumberBasedProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
//        //Activity 1. Swap three values
//        System.out.print("Enter value of a, b & c: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int temp;
//        temp = c;
//        c = b;
//        b = a;
//        a = temp;
//        System.out.println("After swapping a, b & c are: " + a + "," + b + ", " + c);
//
//        // Activity 2
//        int[] marks = new int[3];
//        int count = 0;
//
//        System.out.print("Enter marks of 3 students: ");
//        for(int i = 0; i < marks.length; i++) {
//            marks[i] = sc.nextInt();
//        }
//
//        for(int i : marks) {
//            if(i > 35) {
//                count++;
//            }
//        }
//        System.out.println(count + " Students are passed!");
//
//        // Activity 3.
//        int[] num = new int[5];
//        int countPos = 0;
//        int countNeg = 0;
//
//        System.out.print("Enter 5 numbers: ");
//        for(int i = 0; i < num.length; i++) {
//            num[i] = sc.nextInt();
//        }
//
//        for(int n : num) {
//            if (n >= 0) {
//                countPos++;
//            }
//            else {
//                countNeg++;
//            }
//        }
//
//        System.out.println("Count of +ve numbers are " + countPos + " and count of -ve numbers are " + countNeg);
//
//        // Activity 4
//        System.out.print("Enter number: ");
//        int num1 = sc.nextInt();
//
//        if(num1 == 0) {
//            System.out.println("Zero");
//        }
//        else if (num1 % 2 == 0) {
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }
//
//        // Activity 5
//        int[] numSet = new int[3];
//        int sum = 0;
//
//        System.out.print("Enter 3 numbers: ");
//        for(int i = 0; i < numSet.length; i++) {
//            numSet[i] = sc.nextInt();
//        }
//
//        for (int e : numSet) {
//            sum += e;
//        }
//
//        System.out.println(sum);

        // Day 3 : Is even
        System.out.print("Enter number: ");
        int s = sc.nextInt();

        if(s % 2 == 0) {
            System.out.println(2);
        }
        else {
            System.out.println(1);
        }

        // Day 3 : Is odd
        System.out.print("Enter number: ");
        int s1 = sc.nextInt();

        if(s % 2 != 0 || s == 0) {
            System.out.println(2);
        }
        else {
            System.out.println(1);
        }

        // Day 3 : last digit of number
        System.out.print("Enter number: ");
        int s2 = sc.nextInt();
        System.out.println(s2 % 10);

        // Day 3 : second last digit of number
        System.out.print("Enter number: ");
        int s3 = sc.nextInt();
        int quotient = s3 / 10;
        if(quotient == 0) {
            System.out.println(-1);
        }
        System.out.println(quotient % 10);

        // Day 3 : sum of last digit of two number
        System.out.print("Enter two number: ");
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();
        System.out.println((s4 % 10) + (s5 % 10));
    }
}
