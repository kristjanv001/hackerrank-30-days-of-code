public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        ArrayList <String> firstNames = new ArrayList<String>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            
            Pattern pattern = Pattern.compile("@gmail.com");
            Matcher matcher = pattern.matcher(emailID);
            boolean matchFound = matcher.find();

            if (matchFound) {
                firstNames.add(firstName);
            }
            
        }
        
        Collections.sort(firstNames);   
        
        for (int i = 0; i < firstNames.size(); i++) {
            System.out.println(firstNames.get(i));
        }
   scanner.close();
    }
}
