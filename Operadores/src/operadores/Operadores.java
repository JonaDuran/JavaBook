package operadores;

/**
 * 17/04/14
 *
 * @author jonathan
 *
 * Java2.pdf p27
 */
public class Operadores {

    public static void main(String[] args) {

//
        byte x, y, z;
        x = y = 5;

        boolean a, b, c;
        a = !(b = false);

        System.out.println(""
                // z vale 5
                + (z = x++) + "\n"
                // z vale 6
                + (z = ++y) + "\n"
                // true OR true = true
                + (a |= b) + "\n"
                // true AND false = false
                + (a &= b) + "\n"
                // false XOR false = false
                + (a ^= b) + "\n"
        );

//
        // XOR: da true cuando ambos son diferentes
        c = a ^ b;
        c = !a ^ !b;        // (false ^ false) = (true ^ true) = false

//
        // << >>
        x = 40;
        System.out.println(""
                + (x >> 2) + "\n" // entre 2^2
                + (x >> 1) + "\n" // entre 2^1
                + (x) + "\n" // (x << 0) = (x >>0)
                + (x << 1) + "\n" // por 2^1
                + (x << 2) + "\n" // por 2^1
        );

//
        // Operador ?
        int i = (c) ? 400 : 200;    // (condición)? true : false
        i = (x <= 300) ? 1 : 2;

//
        // Clase Math
        float d = (float) 2.5;
        System.out.println(""
                + Math.ceil(d) + "\n" // redondea hacia el siguiente
                + Math.floor(d) + "\n" // redondea hacia el anterior
                + Math.round(d) + "\n" // redondeo clásico
                + Math.PI + "\n"
                + Math.E + "\n"
                + Math.random() + "\n"
        );
    }

}
