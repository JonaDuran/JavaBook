package datosprimitivos;

import java.util.Arrays;

/**
 * 14/04/14
 *
 * @author jonathan
 *
 * java2.pdf p24 (tipos de datos y sus valores máximos)
 */
public class DatosPrimitivos {

    public static void main(String[] args) {

//
        /* - - - ENTEROS - - - */
//
        byte b = 127;               // 1 byte

        // poco + de 32 mil -> 3.2(10^4)
        short s = 32767;             // 2 bytes

        // poco + de 2 mil millones -> 2.14(10^9)
        int i = 2147483647;         // 4 bytes
        int oct = 07777777777;
        int hex = 0xFFFFFFFF;

        // maximo para inicializar
        long l = 2147483647;        // 8 bytes

        // haciendo 'casting' sus límites son como un int
        byte b2 = (byte) 2147483647;
        short s2 = (short) 2147483647;
        //
        int i2 = Integer.parseInt("2147483647");
        // poco + de 9.22(10^18)        maximo de un long
        long l2 = Long.parseLong("9223372036854775807");

//
        /* - - - DECIMALES - - - */
//
        // no soporta decimales
        float f = 2147483647;
        // asi si
        float f2 = (float) 2147483647.0;
        // mas los decimales que sea
        double d = 2147483647.0;

        // poco + de 3.4(10^38)
        float f3 = Float.parseFloat("3.4028235E38");
        // poco + de 1.79(10^308)
        double d2 = Double.parseDouble("1.7976931348623157E308");

        System.out.println(""
                + f / 2147483.647 + "\n"
                + d / 2147483.647 + "\n"
                + f2 / (f2 - 2) + "\n"
                + f3 + "\n"
                + d2 + "\n"
        );

//
        /* - - - CARÁCTERES - - - */
//
        // usa comillas simples
        char c = 'c';           // 2 bytes
        // se le asignar el código Unicode
        char c2 = 65535;
        char c3 = (char) b;

        // carácteres especiales
        System.out.println("si \r \"hola\" \t mundo \b \u00ff \n");

        simbolos(32, 126, 16);      // comunes
        //simbolos(160, 382, 20);     // otros, latín y con tildes
        System.out.println("");
        // la mayoria de los demas símbolos se ve asi: ƃ

//
        /* - - - BOLEANOS - - - */
//
        boolean bo1 = true;      // 1 byte
        boolean bo2 = Boolean.FALSE;
        byte e1 = 21, e2 = 13, e3 = 18;

        // se puede condicionar el valor
        boolean boo3 = e1 >= 18;        // true
        boo3 = !boo3;                   // false
        boo3 = e1 > e2 && e1 > e3;      //true

        System.out.println(""
                + Boolean.logicalAnd(bo1, bo2) + "\n"
                + Boolean.logicalOr(bo1, bo2) + "\n"
                // true si son iguales
                + Boolean.logicalXor(bo1, bo2) + "\n"
        );
    }

    // retorna una cadena de x ceros
    static String ceros(int x) {
        String str = "";

        for (int i = 0; i < x; i++) {
            str += "0";
        }
        return str;
    }

    // imprime todos los símbolos desde first hasta last
    static void simbolos(int first, int last, int columns) {

        for (int i = first; i <= last;) {
            for (int j = 0; j < columns; j++) {
                if (i <= last) {
                    System.out.print(""
                            + Arrays.toString(Character.toChars(i++))
                            .replace("[", "").replace("]", " "));
                }
            }
            System.out.println("");
        }
    }
}
