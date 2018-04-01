/*
https://www.hackerrank.com/challenges/insertionsort2/problem
*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class InsertionSort2 {
     static void print(int []arr){
        for(int i=0;i<arr.length;i++){
			if(i == arr.length-1){
            System.out.print(arr[i]);
				break;
			}
				
            System.out.print(arr[i] + " ");
        }
        System.out.println();
            
    }
    static void insertionSort1(int n, int[] arr) {
        // Complete this function
        if(n==1){
            return;
        }
        if(arr[n-2] <= arr[n-1]){
            return;
        }
        int e = arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            if(arr[i] > e){
                arr[i+1] = arr[i];
            }else{
                arr[i+1] = e;
                return;
            }
        }
        arr[0] = e;
    }
    static void insertionSort2(int n, int[] arr) {
        // Complete this function
        for(int i=2;i<=n;i++){
            insertionSort1( i , arr);
            print(arr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }
}
