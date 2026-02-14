/*
Problem: Java Substring Comparisons
Difficulty: Easy
Link: https://www.hackerrank.com/challenges/java-string-compare
Approach:
1. Generate all substrings of length k
2. Compare using compareTo()
3. Track smallest and largest lexicographically
*/

import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);

            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        System.out.println(getSmallestAndLargest(s, k));
        
        sc.close();
    }
}
