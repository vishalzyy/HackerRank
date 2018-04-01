/*
https://www.hackerrank.com/challenges/countingsort2/problem
*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class CountingSort2 {

    static int[] countingSort(int[] arr) {
        int count[] = new int[100];
        for(int num : arr){
            count[num]++;
        }
        int k=0;
        for(int i = 0;i<100;i++){
            for(int j=0;j<count[i];j++){
                arr[k] = i;
                k++;
            }
            
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
