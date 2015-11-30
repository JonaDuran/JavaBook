package get_property;

/**
 * 01/04/14
 *
 * @author jonathan
 */
public class Get_Property {

    public static void main(String[] args) {
        System.out.println(""
                + "Arquitectura: " + System.getProperty("os.arch")
                + "\nVersión: " + System.getProperty("os.version")
                + "\nNombre S.O.: " + System.getProperty("os.name")
                + "\nUsuario: " + System.getProperty("user.name")
                + "\nLenguaje: " + System.getProperty("user.language")
        );
    }

}
