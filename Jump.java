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
public class Jump {

    static int jumpingOnClouds(int[] c) {
        // Complete this function
        int jump = 0;
        int position = 0;
        while(position != c.length-1){
            if(c[position+2] != 1 && position+2 < c.length){
                position += 2;
            }else{
                position+=1;
            }
            jump++;
        }
        return jump;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}
