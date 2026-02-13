/*
 * HackerRank Problem: Java End-of-file
 * Difficulty: Easy
 * Topic: Input Handling
 * Link: https://www.hackerrank.com/challenges/java-end-of-file
 */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;

        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        sc.close();
    }
}
