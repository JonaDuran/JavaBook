package Buffered_Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jonathan
 */
public class Buffered_Reader {

    public static void main(String[] args) throws IOException {
        /* toma el valor binario
         char x = (char) System.in.read();
         System.out.println(x);*/

        // mejor rendimiento
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        
        String y = br.readLine();
        System.out.println(y);
    }

}
