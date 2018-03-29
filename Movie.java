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
public class Movie {
    
    static int reverse(int num){
        int rev = 0;
        while(num != 0){
            int digit = num%10;
            rev = rev*10 + digit;
            num /=10;
        }
        return rev;
    }
    static int beautifulDays(int i, int j, int k) {
        // Complete this function
        int count = 0;
        for(int num=i;num<j;num++){
            int diff = Math.abs(num-reverse(num));
            if(diff %k == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
