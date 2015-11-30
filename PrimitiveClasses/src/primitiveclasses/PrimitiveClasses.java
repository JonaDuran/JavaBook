package primitiveclasses;
//import java.lang.*;       // no se necesita importar

/**
 * 25/03/14
 *
 * @author jonathan
 *
 * Java 2.pdf pag92 Se manejan igual que los tipos básicos nesecitan ser
 * inicialisados y puede ser con String
 */
public class PrimitiveClasses {

    static Integer entero = new Integer("100");
    static Double doble = new Double(77);
    static int in = 0;
    static double dou = 0;

    public static void main(String[] args) {
        int num = entero / 2;
        System.out.println(" - - Integer - - ");
        System.out.println(entero + " + " + num + " = "
                + suma(entero, num));

        Double num2 = doble / 4 + 25;
        Double div = doble / num2;
        System.out.println(" - - Double - - ");
        System.out.println(doble + " / " + num2 + " = " + div);
    }

    static public Integer suma(int n1, Integer n2) {
        return n1 + n2;
    }
}
