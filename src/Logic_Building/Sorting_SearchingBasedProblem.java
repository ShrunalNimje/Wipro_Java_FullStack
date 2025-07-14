package Logic_Building;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_SearchingBasedProblem {
    public static void main(String[] args) {

        // Activity 1
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Array in Descending Order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        // Activity 2
        int[] arr1 = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr1[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        System.out.println("Sorted Array: " + Arrays.toString(arr1));

        System.out.print("Array without duplicates: ");
        System.out.print(arr1[0] + " ");
        for (int i = 1; i < 10; i++) {
            if (arr1[i] != arr1[i - 1]) {
                System.out.print(arr1[i] + " ");
            }
        }

        // Activity 3
        int[] arr2 = new int[25];
        System.out.println("Enter 25 numbers:");
        for (int i = 0; i < 25; i++) {
            arr2[i] = sc.nextInt();
        }

        int max = arr2[0], first = 0, last = 0;
        for (int i = 1; i < 25; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
                first = last = i;
            } else if (arr2[i] == max) {
                last = i;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("First Occurrence at Index: " + first);
        System.out.println("Last Occurrence at Index: " + last);

        // Activity 4
        int[] arr3 = new int[15];

        System.out.println("Enter 15 numbers:");
        for (int i = 0; i < 15; i++) {
            arr3[i] = sc.nextInt();
        }

        System.out.print("Enter number to find (X): ");
        int x = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 15; i++) {
            if (arr3[i] == x) {
                System.out.println("Number found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Number not found.");

        // Activity 5
        int[] arr4 = new int[5];
        int[] arr5 = new int[5];

        System.out.println("Enter 5 numbers for first array:");
        for (int i = 0; i < 5; i++) arr4[i] = sc.nextInt();

        System.out.println("Enter 5 numbers for second array:");
        for (int i = 0; i < 5; i++) arr5[i] = sc.nextInt();

        Arrays.sort(arr4);
        Arrays.sort(arr5);

        int[] merged = new int[10];
        for (int i = 0; i < 5; i++) merged[i] = arr4[4 - i]; // Descending
        for (int i = 0; i < 5; i++) merged[5 + i] = arr5[4 - i]; // Descending

        System.out.println("Merged Array (Descending): " + Arrays.toString(merged));
    }
}
