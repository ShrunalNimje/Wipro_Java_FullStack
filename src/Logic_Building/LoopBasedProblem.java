package Logic_Building;

import java.util.Scanner;

public class LoopBasedProblem {
    public static void main(String[] args) {

        // Activity 1 & 2
        int num = 1234567;
        int rem;
        int count = 0;
        int sum = 0;

        while(num > 0) {
            rem = num % 10;
            num = num / 10;
            count++;
            sum += rem;
        }
        System.out.println("count is " +count + " and sum is " + sum);

        // Activity 3 & 4

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal integer: ");
        int a = sc.nextInt();

        System.out.print("Enter binary integer: ");
        String b = sc.next();

        System.out.println("Binary representation:" + Integer.toBinaryString(a));
        System.out.println("Decimal representation: " + Integer.parseInt(b, 2));

        // Activity 5
        System.out.print("Enter number: ");
        int e = sc.nextInt();
        boolean found = false;

        for(int i = 2; i < e; i++) {
            if(e % i == 0) {
                System.out.println("Smallest exact divisor is: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No divisor found");
        }

    }
}
