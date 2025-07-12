package Logic_Building;

public class SectionB {
    public static void main(String[] args) {

        // 1. 10 rows right-angled left-justified numbers
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // 2. 10 rows right-angled right-justified stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. 10 rows triangle of incr-decr numbers
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Practice 1. 10 rows triangle incr-nums decr-alphabet
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            if (i > 1) {
                char ch = (char) ('A' + i - 2);
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(ch--);
                }
            }
            System.out.println();
        }

        // Practice 2. 10 rows rhombus incr-decrnumbers
        // Upper triangle
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 10 - 1; i >= 1; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
