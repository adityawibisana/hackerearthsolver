import java.util.Scanner;

/**
 * Created by Adit on 4/1/2017.
 */
public class SeatingArrangement {

    public static void  main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());
        for (int i=0;i<T;i++) {
            int input = Integer.parseInt(scan.nextLine());

            if (input<=12) {
                System.out.println(String.valueOf(getSeatFaced(input))+" "+getSeatCode(input));
            }
            else {
                int factor = input / 12;
                int tempInput = input - (factor * 12);
                if (tempInput==0) {
                    tempInput = 12;
                    factor--;
                }

                int faced = factor * 12 + getSeatFaced(tempInput);
                System.out.println(String.valueOf(faced)+" "+getSeatCode(tempInput));
            }

        }
    }

    public static int getSeatFaced(int input) {
        if (input==1) {
            return 12;
        }
        else if (input==2) {
            return 11;
        }
        else if (input==3) {
            return 10;
        }
        else if (input==4) {
            return 9;
        }
        else if (input==5) {
            return 8;
        }
        else if (input==6) {
            return 7;
        }
        else if (input==7){
            return 6;
        }
        else if (input==8) {
            return 5;
        }
        else if (input==9) {
            return 4;
        }
        else if (input==10) {
            return 3;
        }
        else if (input==11) {
            return 2;
        }
        else if (input==12) {
            return 1;
        }
        return -1;
    }

    public static String getSeatCode(int input) {
        if (input==1 || input==12 || input==6 || input==7)
            return "WS";
        else if (input==3 || input==10 || input==4 || input==9)
            return "AS";
        else if (input==2 || input==11 || input==5 || input==8)
            return "MS";
        return "";
    }
}
