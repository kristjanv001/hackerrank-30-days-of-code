import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
           
        scanner.close();

        int result = hourGlass(arr);
        System.out.println(result);
        
    }
    
    // SOLUTION:
    public static int hourGlass(int[][] arr) {
        int max = 0;

        for (int i = 0; i < arr.length-2; i++) { 
            for (int j = 0; j < arr[0].length-2; j++) {
                // Because the matrix can have negative values. 
                // -9 is the max negative an item can be. 
                // 7 (max hour glass items) * -9 = -63
                int chunkMax = -63;
                
                chunkMax = 
                    // row 1 cols 1-3
                    arr[i][j] +
                    arr[i][j+1] +
                    arr[i][j+2] +
                    // row 2 col 2
                    arr[i+1][j+1] +
                    // row 3 col 1-3
                    arr[i+2][j] +
                    arr[i+2][j+1] +
                    arr[i+2][j+2];
                
                if (chunkMax > max) {
                    max = chunkMax;        
                }
            }

        }
        return max;
    }
        

}
