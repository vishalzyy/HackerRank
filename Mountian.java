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
public class Mountian {
    
    static int countingValleys(int n, String s) {
        // Complete this function
        int count = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            char updown = s.charAt(i);
            if(sum == 0 && updown == 'D'){
                count++;
                sum--;
            }else if(updown == 'D'){
                sum--;
            }else if(updown == 'U'){
                sum++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
