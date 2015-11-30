package number_format;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 * 01/04/14
 *
 * @author jonathan
 */
public class Number_Format {

    public static void main(String[] args) {
        // formato de modena
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(1201000.555));

        // define el número de decimales
        nf.setMinimumFractionDigits(10);
        System.out.println(nf.format(Math.PI));

        //                                   <---formato--->
        DecimalFormat df = new DecimalFormat("#,###.#### b/s");
        // cancela en redondeo
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println(df.format(20000000000.789));
    }

}
