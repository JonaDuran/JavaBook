package stringbuffer;

/**
 * 27/03/14
 *
 * @author jonathan
 *
 * Java2.pdf pag93
 */
public class String_Buffer {

    public static void main(String[] args) {
        //  
        String str = "Es";
        str += " poco";
        str += " eficiente.";

//
        StringBuffer strBr = new StringBuffer("Es ");
        strBr.append(" mas");
        strBr.append(" eficiente.");

        System.out.println("String " + str);
        System.out.println("StringBuffer " + strBr);

        str = " uno dos tres ";
        System.out.println(str.trim());     // quita espacios inicio y fin

        strBr = new StringBuffer("escrito alreves");
        strBr.insert(10, "-");
        System.out.println("Letrero voltiado: " + strBr.reverse());
    }

}
