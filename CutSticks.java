/*
https://www.hackerrank.com/challenges/cut-the-sticks/problem
*/
package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class CutSticks {
    static int getMin(ArrayList<Integer> arr){
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < min && num !=0){
                min = num;
            }
        }
        return min;
    }
    static int reduce(ArrayList<Integer> arr ,int n){
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) != 0){
                count++;
                arr.set(i, arr.get(i)-n);
            }
        }
        return count;
    }
    static boolean allCut(ArrayList<Integer> arr){
        int sum = 0;
        for(int num : arr){
            sum+= num;
        }
        if(sum == 0 ){
            return true;
        }
        return false;
    }
    static ArrayList<Integer> cutTheSticks(ArrayList<Integer> arr) {
        // Complete this function
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(!allCut(arr)){
            list.add(reduce(arr , getMin(arr)));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr.add(in.nextInt());
        }
        ArrayList<Integer> result = cutTheSticks(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        in.close();
    }
}
