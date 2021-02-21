// takes a decimal number, converts it into a binary and then counts the longest sequence of 1's.
// e.g. 207 in binary is 11001111, so the longest sequence of 1's is 4.
    
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        String binaryNumStr = Integer.toBinaryString(n);

        int count = 0;
        int longest = 0;

        for (int i = 0; i < binaryNumStr.length(); i++) {
            if (binaryNumStr.charAt(i) == '1') {
                count++;
                if (count > longest) {
                    longest = count;
                }
            }
            else {
                count = 0;
            }
        }

        System.out.println(longest);
    }
