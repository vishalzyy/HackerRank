/*
https://www.hackerrank.com/challenges/kaprekar-numbers/problem
*/
package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class Kaprekar {
    static boolean isKaprekar(long i){
        if(i==1){
            return true;
        }
        String sqr = "" + i*i;
        if(sqr.length()==1){
            return false;
        }
        int left = Integer.parseInt(sqr.substring(0,sqr.length()/2));
        int right = Integer.parseInt(sqr.substring(sqr.length()/2));
        return (i == (left+right)) ? true: false;
    }
    static ArrayList<Integer> kaprekarNumbers(int p, int q) {
        // Complete this function
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=p;i<=q;i++){
            if(isKaprekar(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        ArrayList<Integer> result = kaprekarNumbers(p, q);
        if(result.size() == 0){
            System.out.println("INVALID RANGE");
        }
            
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }


        in.close();
    }
}
