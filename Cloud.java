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
public class Cloud {
    
    static int jumpingOnClouds(int[] c, int k) {
        // Complete this function
        int energy = 100;
        int position =0;
        do{
            position = (position+k)%c.length;
            energy--;
            if(c[position] == 1){
                energy-=2;
            }
        }while(position != 0);
        return energy;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }
}
