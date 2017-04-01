import java.util.Scanner;

/**
 * Created by Adit on 4/1/2017.
 */
public class Factorial {

    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        int output=1;
        for (int i=2;i<=input;i++) {
            output*=i;
        }

        System.out.println(String.valueOf(output));
    }
}
