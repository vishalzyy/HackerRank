/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class Fact {
    
    static BigDecimal extraLongFactorials(int n) {
        // Complete this function
        BigDecimal fact = BigDecimal.ONE;
        for(int i=2;i<=n;i++){
            fact = fact.multiply(BigDecimal.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(extraLongFactorials(n));
        in.close();
    }
}
