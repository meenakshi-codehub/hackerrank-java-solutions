/*
 * HackerRank Problem: Java Strings Introduction
 * Difficulty: Easy
 * Topic: Strings
 * Link: https://www.hackerrank.com/challenges/java-strings-introduction
 *
 * Description:
 * Read two strings and:
 * 1. Print sum of lengths
 * 2. Check lexicographical order
 * 3. Capitalize first letter of both strings
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        // 1. Sum of lengths
        System.out.println(A.length() + B.length());

        // 2. Lexicographically compare
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize first letter
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(A + " " + B);
    }
}

