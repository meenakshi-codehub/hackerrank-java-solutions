/*
Problem: Java String Tokens
Platform: HackerRank
Link: https://www.hackerrank.com/challenges/java-string-tokens

Approach:
Used regular expression to split the string based on
non-alphabetic characters and printed all tokens.

Concepts:
- String methods
- Regular Expressions
- Arrays
- Input handling using Scanner
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Remove leading & trailing spaces
        s = s.trim();

        // If string becomes empty
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        // Split using non-alphabet characters
        String[] words = s.split("[^A-Za-z]+");

        ArrayList<String> tokens = new ArrayList<>();

        // Remove empty tokens explicitly
        for (String w : words) {
            if (!w.isEmpty()) {
                tokens.add(w);
            }
        }

        System.out.println(tokens.size());

        for (String token : tokens) {
            System.out.println(token);
        }

        scan.close();
    }
}
