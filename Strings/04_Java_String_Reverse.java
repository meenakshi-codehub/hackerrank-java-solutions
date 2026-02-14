/*
Problem: Java String Reverse
Platform: HackerRank
Difficulty: Easy
Link: https://www.hackerrank.com/challenges/java-string-reverse
Approach:
Used two-pointer technique (i and j indices).
Compared characters from start and end moving inward.
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverse = "";
        
        for(int i=A.length()-1; i>=0; i--){
            reverse += A.charAt(i);
        }
            if(A.equals(reverse)){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
    
    }
}

