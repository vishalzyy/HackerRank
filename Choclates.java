/*

*/
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class Choclates {

    static int chocolateFeast(int n, int c, int m) {
        // Complete this function
        int count = n/c;
        int wrappers = count;
        while(wrappers >= m){
            int choc = wrappers/m;
            wrappers =wrappers - choc*m + choc;
            count += choc;
            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int result = chocolateFeast(n, c, m);
            System.out.println(result);
        }
        in.close();
    }
}
