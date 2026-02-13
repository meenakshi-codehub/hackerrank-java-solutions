/*
 * HackerRank Problem: Java Int to String
 * Difficulty: Easy
 * Topic: Type Conversion
 * Link: https://www.hackerrank.com/challenges/java-int-to-string
 */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Convert int to String
        String s = String.valueOf(n);

        if (s instanceof String) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
