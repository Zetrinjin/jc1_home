package part2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Task18 {
    public static void main(String[] args) {

        int num = 20023143;
        String accountNum = "";
        int count = 0;

        while (num > 0) {
            int digit = num % 10;
            accountNum = digit + accountNum;
            num = num / 10;
            count++;
            if (count % 3 == 0 && num != 0) {
                accountNum = " " + accountNum;
            }
        }
        System.out.println(accountNum);


    }
}
