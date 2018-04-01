/*
https://www.hackerrank.com/challenges/big-sorting/problem
sorting numbers with upto 10^6 digits
*/
package HackerRank;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class BigSort {
    
    static String[] bigSorting(String[] arr) {
        // Complete this function
        Arrays.sort(arr , new Comparator<String>(){
            public int compare(String t, String t1) {
                if(t.equals(t1)){
                    return 0;
                }else if(t.length() > t1.length()){
                    return 1;
                }else if(t.length() < t1.length()){
                    return -1;
                }
            //using BigInteger data type to store integer upto 10^6 digits
            BigInteger a = new BigInteger(t);
            BigInteger b = new BigInteger(t1);
            return a.compareTo(b);
            }

        });
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        String[] result = bigSorting(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
