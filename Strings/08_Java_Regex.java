// Implements a regex pattern to validate IPv4 addresses.
// Ensures the address contains four octets separated by dots.
// Each octet is restricted to values between 0 and 255.
// Designed according to HackerRank Java Regex problem requirements.
// Link: https://www.hackerrank.com/challenges/java-regex
// Difficulty: Medium

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {

    String pattern =
        "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}"
      + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}
