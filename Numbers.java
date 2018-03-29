/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class Numbers {
    
    static ArrayList<String> split(String s ,int num){
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<s.length();i=i+num){
            list.add(s.substring(i,i+num));
        }
        return list;
    }
    static ArrayList<Integer> factors(int num){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i = 1;i<=num/2;i++){
            if(num%i == 0){
                factors.add(i);
            }
        }
        return factors;
    }
    static void separateNumbers(String s) {
        // Complete this function
        if(s.length() == 1){
            System.out.println("NO");
            return;
        }
        ArrayList<Integer> factors = factors(s.length());
        for(int fact : factors){
            ArrayList<String> list = split(s , fact);
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i).charAt(0) == '0' || list.get(i+1).charAt(0) == '0'){
                    System.out.println("NO");
                    return;
                }
                int a = Integer.parseInt(list.get(i));
                int b = Integer.parseInt(list.get(i+1));
                if(b-a != 1){
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            separateNumbers(s);
        }
        in.close();
    }
}
