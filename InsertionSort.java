/*
https://www.hackerrank.com/challenges/insertionsort1/problem
*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class InsertionSort {
    static void print(int []arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
            
    }
    static void insertionSort1(int n, int[] arr) {
        // Complete this function
        if(arr[arr.length-2] <= arr[arr.length-1]){
            return;
        }
        int e = arr[arr.length-1];
        
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] > e){
                arr[i+1] = arr[i];
            }else{
                arr[i+1] = e;
                print(arr);
                return;
            }
            print(arr);
        }
        arr[0] = e;
        print(arr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }
}
