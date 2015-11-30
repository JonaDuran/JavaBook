package stringtokenizer;

import java.util.StringTokenizer;

/**
 * 27/03/14
 * 
 * @author jonathan
 *
 * Java2.pdf pag100
 */
public class String_Tokenizer {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("123-234-345-765-867", "-");

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + " ");
        }
    }

}
