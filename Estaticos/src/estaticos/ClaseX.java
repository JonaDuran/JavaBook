package estaticos;

/**
 *
 * @author jonathan
 */
public class ClaseX {

    String str;
    static String str2;

    public void metodo() {

//
        Estaticos est = new Estaticos();
        // accediendo a datos no static de la clase principal
        est.noEstatico();
        str = est.str;

//
        // accediendo a datos static de la clase principal
        Estaticos.siEstatico();
        str = Estaticos.str2;
    }

    public void noEstaticoX() {
        System.out.println("noEstaticoX(Clase)");
    }

    public static void siEstaticoX() {
        System.out.println("siEstaticoX(Clase)");
    }
}
