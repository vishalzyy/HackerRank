/*
https://www.hackerrank.com/challenges/append-and-delete/problem
incomplete solution
*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class AppendDelete {
    
     static String appendAndDelete(String s, String t, int k) {
         //remove common string from both s and t
         String s1 = s;
         String s2 = t;
         while(true){
             if(s.length() == 0 || t.length() == 0){
                 break;
             }
             if(s.charAt(0) != t.charAt(0)){
                 break;
             }
                 s = s.substring(1);
                 t = t.substring(1);
         }
//         
//         if(s.length() == 0){
//             if(t.length()%2-k%2 == 0){
//                 return "Yes";
//             }else{
//                 return "No";
//             }
//         }
         return (s.length()+t.length() <= k ) ? "YES" : "NO";
     }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
         String result = appendAndDelete(s, t, k);
         System.out.println(result);
        in.close();
    }
}
