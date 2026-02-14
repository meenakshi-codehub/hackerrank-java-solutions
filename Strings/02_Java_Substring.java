/*
 * HackerRank: Java Substring
 * Difficulty: Easy
 * Topic: Strings
 * Link: https://www.hackerrank.com/challenges/java-substring
 *
 * Description:
 * Print the substring in the inclusive range from 'start' to 'end-1'.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        // substring(start, end) -> start index inclusive, end index exclusive
        String result = s.substring(start, end);
        
        System.out.println(result);
        
        sc.close();
    }
}
