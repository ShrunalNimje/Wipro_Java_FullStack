package Logic_Building;

import java.util.Scanner;

public class ArrayBasedProblem {
    public static void main(String[] args) {

        // Activity 1
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of all elements: " + sum);

        // Activity 2
        int[] arr1 = new int[20];

        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            arr1[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE;

        for (int num : arr1) {
            if (num > max1) {
                max3 = max2; max2 = max1; max1 = num;
            } else if (num > max2 && num != max1) {
                max3 = max2; max2 = num;
            } else if (num > max3 && num != max2 && num != max1) {
                max3 = num;
            }

            if (num < min1) {
                min3 = min2; min2 = min1; min1 = num;
            } else if (num < min2 && num != min1) {
                min3 = min2; min2 = num;
            } else if (num < min3 && num != min2 && num != min1) {
                min3 = num;
            }
        }

        System.out.println("Top 3 Maximum: " + max1 + ", " + max2 + ", " + max3);
        System.out.println("Top 3 Minimum: " + min1 + ", " + min2 + ", " + min3);

        // Activity 3
        int[] arr2 = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Reversed Array:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }

        // Activity 4
        int[] marks = new int[30];
        int[] count = new int[101];

        System.out.println("Enter marks of 30 students:");
        for (int i = 0; i < 30; i++) {
            marks[i] = sc.nextInt();
            if (marks[i] >= 0 && marks[i] <= 100) {
                count[marks[i]]++;
            }
        }

        System.out.println("Frequency of each mark:");
        for (int i = 0; i <= 100; i++) {
            if (count[i] > 0)
                System.out.println(i + ": " + count[i] + " students");
        }

        // Activity 5
        int[] marks1 = new int[30];
        int[] range = new int[10];

        System.out.println("Enter marks of 30 students (0-100):");
        for (int i = 0; i < 30; i++) {
            int mark = sc.nextInt();
            if (mark >= 0 && mark <= 100) {
                int bucket = Math.min(mark / 10, 9);
                range[bucket]++;
            }
        }

        System.out.println("Count in ranges:");
        for (int i = 0; i < 10; i++) {
            int start = i * 10 + (i == 0 ? 0 : 1);
            int end = (i + 1) * 10;
            if (i == 0) start = 0;
            System.out.println(start + "% to " + end + "% : " + range[i] + " students");
        }

    }
}
