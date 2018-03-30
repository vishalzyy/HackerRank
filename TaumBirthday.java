/*
https://www.hackerrank.com/challenges/taum-and-bday/problem
 */
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class TaumBirthday {
    
    static long taumBday(long b, long w, long costBlack, long costWhite, long conversionCost) {
        // Complete this function
        int convert=0;
        if((costWhite+conversionCost) < costBlack){//cost will be less if buy white and convert them to black
            convert = -1;
        }
        else if((costBlack+conversionCost) <  costWhite){//cost will be less if buy black and convert them to white
            convert = 1;
        }
        switch(convert){
            case -1:
                return w*costWhite + b*(costWhite+conversionCost);
            case 1:
                return b*costBlack + w*(costBlack+conversionCost);
            case 0:
                return w*costWhite + b*costBlack;
        }
        return w*costWhite + b*costBlack;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int b = in.nextInt();
            int w = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            long result = taumBday(b, w, x, y, z);
            System.out.println(result);
        }
        in.close();
    }
}
