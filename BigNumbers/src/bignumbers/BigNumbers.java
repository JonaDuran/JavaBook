package bignumbers;

import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * 31/03/14
 *
 * @author jonathan
 */
public class BigNumbers {

    public static void main(String[] args) {
        long l = 2147483647;    // maximo long

        BigInteger bi1 = new BigInteger("2000000000000");   // 2*10^12
        BigInteger bi2 = new BigInteger("4000000000000");

        System.out.println(""
                + "Suma: " + bi1.add(bi2) + "\n"
                + "Resta: " + bi1.add(bi2.negate()) + "\n"
                + "Divición: " + bi2.divide(bi1) + "\n"
                + "Multi: " + bi1.multiply(bi2) + "\n"
                + "Expo: " + bi1.pow(3)
        );

        BigDecimal bd1 = new BigDecimal("2000000000000.0");
        BigDecimal bd2 = new BigDecimal("300000.34");

        System.out.println("div: " + bd2.divide(bd1));
    }

}
