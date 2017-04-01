import java.util.Scanner;

/**
 * Created by Adit on 4/1/2017.
 */
public class CountDivisor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputs=scan.nextLine().split(" ");
        int l = Integer.valueOf(inputs[0]);
        int r = Integer.valueOf(inputs[1]);
        int k = Integer.valueOf(inputs[2]);

        int output=0;
        for (int i=l;i<=r;i++) {
            if (i%k==0) {
                output++;
            }
        }

        System.out.print(String.valueOf(output));
    }
}
