import java.util.Scanner;

/**
 * Created by Adit on 3/30/2017.
 */
public class ToggleString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] inputArr = input.toCharArray();

        for (int i=0;i< inputArr.length;i++) {
            if (Character.isUpperCase(inputArr[i])) {
                System.out.print(Character.toLowerCase(inputArr[i]));
            }
            else {
                System.out.print(Character.toUpperCase(inputArr[i]));
            }
        }
    }
}
