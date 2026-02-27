/*
 * Pattern Syntax Checker - HackerRank (Java)
 * Difficulty Level: Easy
 * Link: https://www.hackerrank.com/challenges/pattern-syntax-checker
 *
 * Checks whether given regex patterns are valid.
 * Uses Pattern.compile() inside try-catch.
 * If PatternSyntaxException occurs → Invalid,
 * otherwise → Valid.
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n > 0) {
            String pattern = sc.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

            n--;
        }

        sc.close();
    }
}
