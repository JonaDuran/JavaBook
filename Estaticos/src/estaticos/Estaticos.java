package estaticos;

/**
 * 20/04/14
 *
 * @author jonathan
 * 
 *  Java.pdf p61 (métodos y propiedades genéricos)
 */
public class Estaticos {

    static String str2;
    String str;

    public static void main(String[] args) {
        
//
        // no se pude por que no son static
        //noEstatico();
        //str2 = str;
        
        siEstatico();
        System.out.println("");

//
        // llamando de la ClaseX
        ClaseX cx = new ClaseX();
        cx.noEstaticoX();
        str2 = cx.str;

        ClaseX.siEstaticoX();
        str2 = ClaseX.str2;
        System.out.println("");

//
        // llamado metodos de la clase principal desde la ClaseX
        new ClaseX().metodo();
        str2 = new ClaseX().str;
        System.out.println("");
    }

    public void noEstatico() {
        System.out.println("noEstatico(Principal)");
    }

    public static void siEstatico() {
        System.out.println("siEstatico(Principal)");
    }
}
