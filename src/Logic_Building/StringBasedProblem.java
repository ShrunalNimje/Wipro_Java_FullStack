package Logic_Building;

import java.util.HashMap;
import java.util.Scanner;

public class StringBasedProblem {
    public static void main(String[] args) {

        // Activity 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed String: " + reversed);

        // Activity 2
        System.out.print("Enter a string: ");
        String input1 = sc.nextLine();

        String vowels = "aeiouAEIOU";
        boolean hasVowel = false;
        StringBuilder result = new StringBuilder();

        for (char ch : input1.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                result.append('z');
                hasVowel = true;
            } else {
                result.append(ch);
            }
        }

        if (hasVowel) {
            System.out.println("Modified String: " + result);
        }
        else {
            System.out.println("No vowels present. Original String: " + input1);
        }

        // Activity 3
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String result1 = str1 + str2;
        System.out.println("Concatenated String: " + result1);

        // Activity 4
        System.out.print("Enter a string: ");
        String input2 = sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : input2.toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character frequencies:");
        for (char ch : freq.keySet()) {
            System.out.println(ch + " - " + freq.get(ch));
        }

        // Activity 5
        System.out.print("Enter first string: ");
        String str3 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str4 = sc.nextLine();

        String str4Reversed = new StringBuilder(str4).reverse().toString();
        String result2 = str3 + str4Reversed;

        System.out.println("Result String: " + result2);
    }
}
