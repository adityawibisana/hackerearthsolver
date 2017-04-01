import java.util.Scanner;

/**
 * Created by Adit on 4/1/2017.
 */
public class PalindromicString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
