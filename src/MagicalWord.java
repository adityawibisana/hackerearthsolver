import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Adit on 3/31/2017.
 */
public class MagicalWord {

    private static ArrayList<Integer> primeList;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());

        primeList = getPrimeList();

        List<String> outputs = new ArrayList<String>() ;

        for (int i=0;i<T;i++) {
            scan.nextLine(); // we actually don't need to save the length of the first input, so just ignore it
            char[]input =  scan.nextLine().toCharArray();

            char[] output = new char[input.length];
            for (int j=0;j<input.length;j++) {
                int inputASCII = (int)input[j];
                output[j]=(char) getNearestPrimeASCII(inputASCII);
            }

            outputs.add(String.valueOf(output));
        }

        for (int i=0;i<T;i++) {
            System.out.println(outputs.get(i));
        }
    }

    public static int getNearestPrimeASCII(int input) {
        if (input<65)
            return primeList.get(0);
        else if (input>122)
            return primeList.get(primeList.size()-1);
        else if (isPrime(input))
            return input;

        int topValue = -1;
        for (int i=0;i<primeList.size();i++) {
            if (primeList.get(i)>input) {
                topValue = i;
                break;
            }
        }

        if (topValue==-1) {
            return primeList.get(primeList.size()-1);
        }
        else if (topValue==0)
            return primeList.get(topValue);

        int bottomValue = primeList.get(topValue-1);
        topValue = primeList.get(topValue);

        int topDiff = topValue - input;
        int botDiff = input - bottomValue;

        if (topDiff==botDiff) {
            return bottomValue;
        }
        else if (topDiff<botDiff) {
            return topValue;
        }
        return bottomValue;
    }

    public static ArrayList<Integer> getPrimeList() {
        ArrayList<Integer> retVal = new ArrayList<Integer>();

        //get magical number from 65 - 90
        for (int i=65;i<90;i++) {
            if (isPrime(i)) {
                retVal.add(i);
            }
        }

        //get magical number from 97 - 122
        for (int i=97;i<122;i++) {
            if (isPrime(i)) {
                retVal.add(i);
            }
        }

        return retVal;
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
