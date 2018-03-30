/*
https://www.hackerrank.com/challenges/flipping-bits/problem
*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class BitFlip {

    static long flippingBits(long N) {
        return (~N*1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            long N = in.nextLong();
            long result = flippingBits(N);
            System.out.println(result);
        }
        in.close();
    }
}
