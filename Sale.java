/*
https://www.hackerrank.com/challenges/halloween-sale/problem
*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class Sale {

    static int howManyGames(int initial, int discount, int min, int money) {
        // Return the number of games you can buy
        int count = 1;
        if(money < initial){
            return 0;
        }
        int currentCost = initial;
        money -= currentCost;
        while(money >= currentCost){
            if((currentCost-discount) > min){
                currentCost -= discount;
            }else{
                currentCost = min;
            }
            money -= currentCost;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}
