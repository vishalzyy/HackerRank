/*
https://www.hackerrank.com/challenges/the-time-in-words/problem
*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class TimeWords {
    static final String []NUMBERS = {
        "zero", 
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "quarter",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twenty one",
        "twenty two",
        "twenty three",
        "twenty four",
        "twenty five",
        "twenty six",
        "twenty seven",
        "twenty eight",
        "twenty nine",
    };
    
    
    static String timeInWords(int h, int m) {
        // Complete this function
        if(m == 0){
            return NUMBERS[h] + " o' clock";
        }else if(m == 1){
            return "one minute past " + NUMBERS[h];
        }else if(m == 30){
            return "half past " + NUMBERS[h];
        }else if(m == 15){
            return "quarter past " + NUMBERS[h];
        }else if(m == 45){
            return "quarter to " + NUMBERS[h+1];
        }else if(m > 30){
            return NUMBERS[60-m] + " minutes to " + NUMBERS[h+1];
        }else{
            return NUMBERS[m] + " minutes past " + NUMBERS[h];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String result = timeInWords(h, m);
        System.out.println(result);
        in.close();
    }
}
