/*
https://www.hackerrank.com/challenges/minimum-distances/problem
*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class MinDistances {

    static int minimumDistances(int[] a) {
        // Complete this function
        boolean flagMin = false;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length-1;i++){
            for(int j = i+1;j<a.length;j++){
                if(i != j && a[i] == a[j] && Math.abs(i-j) < min){
                    min = Math.abs(i-j);
                    flagMin = true;
                }
            }
        }
        if(flagMin){
        return min;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = minimumDistances(a);
        System.out.println(result);
        in.close();
    }
}
