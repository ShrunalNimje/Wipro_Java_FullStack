package Oops_Inheritance;

public class String_StringBuffer {
    public static void main(String[] args) {

        // Problem 1
        String input = "Sanas";
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // Problem 2
        String str1 = "Mark";
        String str2 = "kate";

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            str1 = str1.substring(0, str1.length() - 1);
        }
        System.out.println((str1 + str2).toLowerCase());

        // Problem 3
        String input1 = "Wipro";
        String first2 = input1.substring(0, 2);
        System.out.println(first2.repeat(input1.length()));

        // Problem 4
        String input2 = "TomCat";
        if (input2.length() % 2 == 0) {
            System.out.println(input2.substring(0, input2.length() / 2));
        } else {
            System.out.println("null");
        }

        // Problem 5
        String input3 = "Suman";
        System.out.println(input3.substring(1, input3.length() - 1));

        // Problem 6
        String a = "hi", b = "hello";
        String result = a.length() < b.length() ? a + b + a : b + a + b;
        System.out.println(result);

        // Problem 7
        String input4 = "xHix";
        if (input4.startsWith("x")) input4 = input4.substring(1);
        if (input4.endsWith("x")) input4 = input4.substring(0, input4.length() - 1);
        System.out.println(input4);

        // Problem 8
        String input5 = "ab*cd";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input5.length(); i++) {
            if (input5.charAt(i) == '*' || (i > 0 && input5.charAt(i - 1) == '*') || (i < input5.length() - 1 && input5.charAt(i + 1) == '*')) {
                continue;
            }
            output.append(input5.charAt(i));
        }
        System.out.println(output);

        // Problem 9
        String a1 = "Hello", b1 = "World";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < a1.length() || i < b1.length()) {
            if (i < a1.length()) sb.append(a1.charAt(i));
            if (i < b1.length()) sb.append(b1.charAt(i));
            i++;
        }
        System.out.println(sb.toString());

        // Problem 10
        String str = "Wipro";
        int n = 3;
        String lastN = str.substring(str.length() - n);
        System.out.println(lastN.repeat(n));
    }
}
