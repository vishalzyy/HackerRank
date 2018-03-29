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
public class Advert {
    
    static int viralAdvertising(int n) {
        // Complete this function
        int people = 5;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += people/2;
            people = people/2*3;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
