/*
https://www.hackerrank.com/challenges/quicksort1/problem
*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class QuickSort1 {
    static int[] quickSort(int[] arr) {
        int size = arr.length;
        int []left = new int[size];
        int []right = new int[size];
        int []equals = new int[size];
        int lsize , rsize , esize , p;
        lsize = rsize = esize = 0;
        p = arr[0];
        int []result = new int[size];
        for(int num : arr){
            if(num < p){
                left[lsize] = num;
                lsize++;
            }else if(num == p){
                equals[esize] = num;
                esize++;
            }else{
                right[rsize] = num;
                rsize++;
            }
        }
        System.arraycopy(left, 0, result, 0, lsize);
        System.arraycopy(equals, 0, result, lsize, esize);
        System.arraycopy(right, 0, result, lsize + esize, rsize);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
