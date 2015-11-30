package excepciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 09/05/14
 * @author jonathan
 *
 * Java2.pdf p79
 */
public class Excepciones {

    static String pass, repass;

    public static void main(String[] args) {

        try {
            inputs();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            //e.printStackTrace();
        }
    }
    
    // 'throws' indica que puede retornar excepciones
    public static void inputs() throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        
        pass = br.readLine();
        repass = br.readLine();
        
        // condiciones para las excepciones
        if(!pass.equals(repass)) {
            throw new Exception("No es la misma");
        }
        
        if(pass.length() < 5) {
            throw new Exception("Es muy corto");
        }
    }

}
