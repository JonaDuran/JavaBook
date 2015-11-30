package clasesinternas;

/**
 * 20/04/14
 *
 * @author jonathan
 *
 * Java2.pdf p71
 */
public class ClasesInternas {

    public static void main(String[] args) {

        // llamando clase interna instanciada
        Clase2 clase2 = new Clase2();
        System.out.println(""
                + (clase2.x = 5)
                + " + "
                + (clase2.y = 6)
                + " = "
                + clase2.suma()
        );

        // llamando clase interna estática
        System.out.println(""
                + (Clase3.x = "Hola")
                + " + "
                + (Clase3.y = "Mundo")
                + " = "
                + Clase3.suma()
        );

        // accediendo a clases anidadas
        Clase3.clase4.nota();
    }

//
    // clase dentro de otra clase
    public static class Clase2 {

        int x;
        int y;

        public int suma() {
            return x + y;
        }
    }

//
    // clase con datos estáticos dentro de otra clase
    public static class Clase3 {

        static Clase4 clase4 = new Clase4();
        static String x;
        static String y;

        public static String suma() {
            return x + y;
        }

//
        // clase dentro de una clase, dentro de otra clase
        public static class Clase4 {

            public void nota() {
                System.out.println("\n"
                        + "Clase dentro de una Clase,\n"
                        + "dentro de la Clase Principal.\n");
            }
        }
    }
}
