/*
Problem Name: Java Anagrams
Platform: HackerRank
Link: https://www.hackerrank.com/challenges/java-anagrams

Description:
Given two strings, determine whether they are anagrams of each other.
Two strings are anagrams if they contain the same characters with
the same frequency, ignoring case sensitivity.

Approach:
1. Convert both strings to lowercase to make comparison case-insensitive.
2. Check if lengths are equal.
3. Use a frequency array of size 26 (for letters a–z).
4. Increment count for characters in first string.
5. Decrement count for characters in second string.
6. If all frequency values become zero, strings are anagrams.

Concepts Used:
- Strings
- Character indexing
- ASCII value mapping (char - 'a')
- Arrays
- Time complexity optimization

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        // Convert to lowercase (case-insensitive)
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // If lengths are different → not anagrams
        if (a.length() != b.length()) {
            return false;
        }

        int[] freq = new int[26];  // for letters a-z

        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        // Check if all frequencies are zero
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        
        boolean ret = isAnagram(a, b);
        System.out.println(ret ? "Anagrams" : "Not Anagrams");
        
        scan.close();
    }
}


