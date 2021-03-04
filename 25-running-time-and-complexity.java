public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scan = new Scanner(System.in);
        int numsAmount = scan.nextInt();
           
        for(int i = 0; i < numsAmount; i++) {

            int n = scan.nextInt();
            
            String result = "Prime";
            
            // we can cut the number in half because,
            // the last maximum diviser is its half
            // e.g. 12 is not cleanly divisable with 6+ numbers,
            // so we don't need to check these
            for(int j = 2; j <= n/2; j++) {
                if (n % j == 0) {
                    result = "Not prime";
                    // if our number divides with any of the numbers from j (included) and up,
                    // then it's clear it's not a prime, and we can break
                    break;
                }  
            }
        
            if (n == 1) {
                result = "Not prime";
            }
                   
            System.out.println(result);         
        }     
        scan.close();
    }
}
