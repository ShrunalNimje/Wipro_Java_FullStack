package Java_Fundamentals;

public class LanguageBasics {
    public static void main(String[] args) {

        // Problem 1
        String s1 = args[0];
        String s2 = args[1];
        System.out.println(s1 + " Technologies " + s2);

        // Problem 2
        System.out.println("Welcome " + args[0]);

        // Problem 3
        int i1 = Integer.parseInt(args[0] );
        int i2 = Integer.parseInt(args[1] );
        int sum = i1 + i2;
        System.out.println("The sum of 10 and 20 is " + sum);
    }
}
