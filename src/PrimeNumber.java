import java.util.Scanner;

/**
 * Created by Adit on 4/1/2017.
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for (int i=2;i<=input;i++) {
            if (isPrime(i)) {
                System.out.print(String.valueOf(i)+" ");
            }
        }
    }

    public static boolean isPrime(int input) {
        if (input==2)
            return true;
        else if (input<2) {
            return false;
        }

        int divideCounter=1;

        for (int i=2;i<=input;i++) {
            if (input%i==0) {
                divideCounter++;
            }

            if (divideCounter>2)
                return false;
        }

        return true;
    }
}
