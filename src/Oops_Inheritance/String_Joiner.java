package Oops_Inheritance;

import java.util.StringJoiner;

public class String_Joiner {
    public static void main(String[] args) {

        // Problem 1
        StringJoiner sj = new StringJoiner(",", "{", "}");
        sj.add("John").add("Jane").add("Doe");
        System.out.println(sj);

        // Problem 2
        StringJoiner s1 = new StringJoiner("-", "", "");
        s1.add("Delhi").add("Mumbai");
        StringJoiner s2 = new StringJoiner("-", "", "");
        s2.add("Pune").add("Chennai");

        System.out.println("Merged s1 into s2: " + s2.merge(s1));
        System.out.println("Merged s2 into s1: " + s1.merge(s2));
    }
}
