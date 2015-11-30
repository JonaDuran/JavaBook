package randomclass;

import java.util.Random;

/**
 * 27/03/14
 *
 * @author jonathan
 *
 * Java2 pag94
 */
public class RandomClass {

    public static void main(String[] args) {
        Random r1 = new Random();
        String txt1 = "Semilla default:\n";
        Random r2 = new Random(10);
        String txt2 = "Semilla definida:\n";

        for (int x = 0; x <= 10; x++) {
            // nextInt genera datos aleatorios de 0 al parámetro -1
            txt1 += " " + r1.nextInt(11);
            txt2 += " " + r2.nextInt(11);
        }

        System.out.println(txt1 + "\n" + txt2);
    }

}
