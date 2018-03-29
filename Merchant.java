/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class Merchant {
    
    static int sockMerchant(HashMap<Integer, Integer> map) {
        int pairs = 0;
        for(int count: map.values()){
            pairs += count/2;
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for(int ar_i = 0; ar_i < n; ar_i++){
            int color = in.nextInt();
            if(hmap.get(color) == null){
                hmap.put(color , 1);
            }else{
                hmap.put(color , hmap.get(color) + 1);
            }
        }
        int result = sockMerchant(hmap);
        System.out.println(result);
    }
}
