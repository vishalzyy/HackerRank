/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class Permutation {
    
    static int[] permutationEquation(ArrayList<Integer> list) {
        // Complete this function
        int []arr = new int[list.size()];
        for(int i=1;i<=arr.length;i++){
            //arr[i] = list.get(list.get(i)+1)+1;
            arr[i-1] = list.indexOf(list.indexOf(i)+1)+1;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int p_i = 0; p_i < n; p_i++){
            list.add(in.nextInt());
        }
        int[] result = permutationEquation(list);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        in.close();
    }
}
