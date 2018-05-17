import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String regEx = "[a-zA-Z0-9_]+@gmail\\.com";
        Pattern pattern = Pattern.compile(regEx);


        for (int i = 0; i < n; i++) {
            String[] firstNameEmailID = scan.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailId = firstNameEmailID[1];

            Matcher matcher = pattern.matcher(emailId);
            if (matcher.matches()) {
                System.out.println(firstName);
            }
        }

        scan.close();
    }
}
