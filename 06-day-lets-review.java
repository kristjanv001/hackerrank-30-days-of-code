import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int testsAmount = scan.nextInt();
        scan.nextLine();
        
        for(int i = 0; i < testsAmount; i++) {
            String str = scan.nextLine();
            String leftEven = "";
            String rightOdd = "";
            char[] charArr = str.toCharArray();
            
            for(int j = 0; j < str.length(); j++) {
                if(j % 2 == 0) {
                    leftEven += charArr[j];
                } else {
                    rightOdd += charArr[j];
                }
            }
            System.out.println(leftEven + " " + rightOdd);
        }
    }
}
