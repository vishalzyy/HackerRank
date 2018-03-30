/*
https://www.hackerrank.com/challenges/repeated-string/problem
 */
package HackerRank;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class RepeatedString {
    
    static long repeatedString(String s, long n) {
        long count=0;
        //count of a in string provided
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        if(count == 0){
            return 0;
        }
        count*= n/s.length();
        for(int i=0;i<n%s.length();i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
