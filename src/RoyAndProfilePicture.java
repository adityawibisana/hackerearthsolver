import java.util.Scanner;

/**
 * Created by Adit on 4/1/2017.
 */
public class RoyAndProfilePicture {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = Integer.valueOf(scan.nextLine());
        int N = Integer.valueOf(scan.nextLine());

        for (int i=0;i<N;i++) {
            String[] size = scan.nextLine().split(" ");
            int w = Integer.valueOf(size[0]);
            int h = Integer.valueOf(size[1]);

            if (w<L || h<L) {
                System.out.println("UPLOAD ANOTHER");
            }
            else {
                if (w==h) {
                    System.out.println("ACCEPTED");
                }
                else {
                    System.out.println("CROP IT");
                }
            }
        }
    }
}
