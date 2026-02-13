/*
 * HackerRank Problem: Java Datatypes
 * Difficulty: Easy
 * Topic: Data Types
 * Link: https://www.hackerrank.com/challenges/java-datatypes
 */
import java.util.*;

class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
              
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
                  System.out.println("* byte");
              
                // Check if value fits in 16-bit signed short (-32,768 to 32,767)
                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) 
                    System.out.println("* short");
                
                // Check if value fits in 32-bit signed int (-2^31 to 2^31-1)
                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) 
                    System.out.println("* int");
                
                // Check if value fits in 64-bit signed long (-2^63 to 2^63-1)
                if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) 
                    System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
