/*
https://www.hackerrank.com/challenges/runningtime/problem
*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class RunningTime {
   
   
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
    static int insertionSort1(int n, int[] arr ,int count) {
        // Complete this function
        if(n==1){
            return count;
        }
        if(arr[n-2] <= arr[n-1]){
            return count;
        }
        int e = arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            if(arr[i] > e){
                arr[i+1] = arr[i];
                count++;
            }else{
                arr[i+1] = e;
                return count;
            }
        }
        arr[0] = e;
        return count;
    }
    static int insertionSort2(int n, int[] arr) {
        // Complete this function
        int count = 0;
        for(int i=2;i<=n;i++){
            count = insertionSort1( i , arr , count);
        }
        return count;
    }
    static int runningTime(int[] arr) {
        // Complete this function
        return insertionSort2(arr.length  ,arr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = runningTime(arr);
        System.out.println(result);
        in.close();
    }
}
