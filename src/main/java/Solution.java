import java.util.Scanner;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String[] firstNameEmailID = scan.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailId = firstNameEmailID[1];
        }

        scan.close();
    }
}
