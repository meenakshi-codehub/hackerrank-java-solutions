/*
 * HackerRank Problem: Java Date and Time
 * Difficulty: Easy
 * Topic: Date & Time API
 * Link: https://www.hackerrank.com/challenges/java-date-and-time
 */

import java.util.*;

public class Solution {

    public static String getDay(String day, String month, String year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
        cal.set(Calendar.MONTH, Integer.parseInt(month) - 1);
        cal.set(Calendar.YEAR, Integer.parseInt(year));

        String[] days = {
            "SUNDAY", "MONDAY", "TUESDAY",
            "WEDNESDAY", "THURSDAY",
            "FRIDAY", "SATURDAY"
        };

        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        String day = sc.next();
        String year = sc.next();
        sc.close();

        System.out.println(getDay(day, month, year));
    }
}
