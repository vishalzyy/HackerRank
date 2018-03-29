/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class anagram {
    static HashMap<Character , Integer> frequency(String s1 , String s2){
        HashMap<Character , Integer> h = new HashMap<Character, Integer>();
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(h.get(c) == null){
                h.put(c, 1);
            }else{
                h.put(c, h.get(c)+1);
            }
        }
        
        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            if(h.get(c) == null){
                h.put(c, -1);
            }else{
                h.put(c, h.get(c)-1);
            }
        }
        return h;
    }
    static int anagram(String s){
        // Complete this function
        if(s.length()%2 == 1){
            return -1;
        }
        int sum=0;
        HashMap<Character , Integer> freq = frequency(s.substring(0 , s.length()/2),s.substring(s.length()/2));
        for(int value : freq.values()){
            sum+=Math.abs(value);
        }
        
        return sum/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
