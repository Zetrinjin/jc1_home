package part2;

import java.math.BigInteger;

public class Task14 {
    public static void main(String[] args) {

        var result = BigInteger.ONE;
        var i = 1;
        do {
            var x = BigInteger.valueOf(i);
            result = result.multiply(x);
            i++;
        } while (i <= 25);


        System.out.println("sum = " + result);
    }
}
