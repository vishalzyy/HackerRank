/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class Service {
    static int getMinWidth(int[] width , int start , int end) {
        // Complete this function
        int min = Integer.MAX_VALUE;
        for(int i=start;i<=end;i++){
            if(width[i] < min){
                min = width[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int i=0;i<n;i++){
            width[i] = in.nextInt();
        }
        for(int i=0;i<t;i++){
            int start = in.nextInt();
            int end = in.nextInt();
            System.out.println(getMinWidth(width , start , end));
        }
        in.close();
    }
}
