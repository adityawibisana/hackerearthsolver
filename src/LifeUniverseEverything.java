import java.util.Scanner;

/**
 * Created by Adit on 4/1/2017.
 */
public class LifeUniverseEverything {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int input = Integer.parseInt(scan.nextLine());
            if (input!=42) {
                System.out.println(String.valueOf(input));
            }
            else {
                return;
            }
        }

    }
}
