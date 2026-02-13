/*
 * HackerRank Problem: Java Loops II
 * Difficulty: Easy
 * Topic: Loops, Series
 * Link: https://www.hackerrank.com/challenges/java-loops
 */

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            int power = 1; // 2^0

            for (int j = 0; j < n; j++) {
                sum = sum + b * power;
                System.out.print(sum + " ");
                power = power * 2;
            }
            System.out.println(); // new line after each query
        }
        in.close();
    }
}
