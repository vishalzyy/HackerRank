/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class Encryption {
    
    static String encryption(String s) {
        // Complete this function
        s = s.replaceAll(" ", "");
        StringBuilder str = new StringBuilder("");
        int rows = (int)Math.floor(Math.sqrt(s.length()));
        int columns = (int)Math.ceil(Math.sqrt(s.length()));
        //Ensuring rows*colums > L L is length of string
        if(rows*columns < s.length()){      
            int max = (columns > rows)?columns : rows;
            rows = max;
            columns = max;
        }
        String []arr = new String[rows];
       //creating array of string
        for(int i=0;i<rows;i++){
            arr[i] = s.substring(i*columns , (i == rows-1) ? s.length() : i*columns+columns);
        }
        
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                if(i >= arr[j].length()){//making sure not running out of index for last line
                    continue;
                }
                str.append(arr[j].charAt(i));
            }
            str.append(' ');
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String result = encryption(s);
        System.out.println(result);
        in.close();
    }
}
