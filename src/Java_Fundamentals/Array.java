package Java_Fundamentals;

import java.util.*;

public class Array {
    public static void main(String[] args) {

        // Problem 1
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : arr) sum += num;
        double average = (double) sum / arr.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        // Problem 2
        int[] arr1 = {10, 20, 5, 45, 32};
        int max = arr1[0], min = arr1[0];
        for (int num : arr1) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max = " + max + ", Min = " + min);

        // Problem 3
        int[] arr2 = {1, 4, 34, 56, 7};
        int search = 56;
        int index = -1;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == search) {
                index = i;
                break;
            }
        }
        System.out.println("Index: " + index);

        // Problem 4
        int[] ascii = {65, 66, 67, 68};
        for (int code : ascii)
            System.out.print((char) code + " ");

        // Problem 5
        int[] arr3 = {12, 34, 1, 56, 78, 3};
        Arrays.sort(arr3);
        System.out.println("Smallest two: " + arr3[0] + ", " + arr3[1]);
        System.out.println("Largest two: " + arr3[arr3.length - 2] + ", " + arr3[arr3.length - 1]);

        // Problem 6
        int[] arr4 = {20, 10, 40, 30};
        Arrays.sort(arr4);
        for (int num : arr4) System.out.print(num + " ");

        // Problem 7
        int[] arr5 = {12, 34, 12, 45, 67, 89};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr5) set.add(num);
        System.out.println(set);

        // Problem 8
        int[] arr6 = {10, 3, 6, 1, 2, 7, 9};
        int sum1 = 0;
        boolean skip = false;
        for (int num : arr6) {
            if (num == 6) skip = true;
            if (!skip) sum1 += num;
            if (num == 7 && skip) skip = false;
        }
        System.out.println("Sum: " + sum1);

        // Problem 9
        int[] arr7 = {1, 10, 10, 2};
        int[] result = new int[arr7.length];
        int index1 = 0;
        for (int num : arr7) {
            if (num != 10) result[index1++] = num;
        }
        System.out.println(Arrays.toString(result));

        // Problem 10
        int[] arr8 = {1, 0, 1, 0, 0, 1, 1};
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int num : arr8) {
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }
        even.addAll(odd);
        System.out.println(even);

        // Problem 11
        int[] arr9 = {1, 4, 1, 4};
        boolean result1 = true;
        for (int num : arr9) {
            if (num != 1 && num != 4) {
                result1 = false;
                break;
            }
        }
        System.out.println(result1);

        // Problem 12
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] result2 = {a[1], b[1]};
        System.out.println(Arrays.toString(result2));

        // Problem 13
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }
        int[][] arr10 = new int[2][2];
        int k = 0;
        System.out.println("The given array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr10[i][j] = Integer.parseInt(args[k++]);
                System.out.print(arr10[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The reverse of the array is:");
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(arr10[i][j] + " ");
            }
            System.out.println();
        }

        // Problem 14
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }
        int[][] arr11 = new int[3][3];
        int k1 = 0, max1 = Integer.MIN_VALUE;
        System.out.println("The given array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr11[i][j] = Integer.parseInt(args[k1++]);
                System.out.print(arr11[i][j] + " ");
                if (arr11[i][j] > max1) max1 = arr11[i][j];
            }
            System.out.println();
        }
        System.out.println("The biggest number in the given array is " + max);
    }
}
