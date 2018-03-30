/*
https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class Letter {
//    static boolean isPalindrome(String s){
//        String s1 = "";
//        String s2 = "";
//        int length = s.length();
//        if(s.length()%2 == 0){
//            s1 = s.substring(0 , length/2);
//            s2 = s.substring(length/2);
//        }else{
//            s1 = s.substring(0 , length/2);
//            s2 = s.substring(length/2+1);
//        }
//        s2 = new StringBuilder(s2).reverse().toString();
//        return (s1.equals(s2))? true:false;
//    }
    static int theLoveLetterMystery(String s){
        // Complete this function
        int count = 0;
        String s1 = "";
        String s2 = "";
        int length = s.length();
        if(s.length()%2 == 0){
            s1 = s.substring(0 , length/2);
            s2 = s.substring(length/2);
        }else{
            s1 = s.substring(0 , length/2);
            s2 = s.substring(length/2+1);
        }
        s2 = new StringBuilder(s2).reverse().toString();
        if(s1 == s2){
            return 0;
        }
        for(int i=0;i<s1.length();i++){
            count += Math.abs(s2.charAt(i)-s1.charAt(i));
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
