package string_builder;

import java.util.Scanner;

/**
 *
 * @author jonathan
 *
 * http://puntocomnoesunlenguaje.blogspot.mx/2013/03/java-stringbuilder-stringbuffer.html
 */
public class String_Builder {

    // recomendado cuando la cadena pude cambiar constantemente
    public static void main(String[] args) {
        
        // su capacidad es de 5 caracteres?
        StringBuilder strInt = new StringBuilder(5);
        
        StringBuilder str = new StringBuilder();
        str.append("Hola");
        str.append("mundo");
        str.insert(4, ' ');
        // inserta una 'M' antes de 'm'
        str.insert(str.indexOf("m"), 'M');
        // borra 'm'
        str.deleteCharAt(str.indexOf("m"));
        
        System.out.println(str);
        
    }

}
