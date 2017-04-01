import java.util.Scanner;

/**
 * Created by Adit on 4/1/2017.
 */
public class FindProduct {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.nextLine(); // we don't need this value
        String[] inputString = scan.nextLine().split(" ");

        double output = 1;
        for (int i=0;i<inputString.length;i++) {
            output*=Integer.valueOf(inputString[i]);
            output = output % 1000000007;
        }
        System.out.printf("%.0f", output);
    }
}
