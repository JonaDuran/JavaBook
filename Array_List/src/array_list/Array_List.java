package array_list;

import java.util.ArrayList;

/**
 * 29/03/14
 *
 * @author jonathan
 */
public class Array_List {

    public static void main(String[] args) {
        int x;
        
        // ArrayList<TypoDeDato>
        ArrayList<String> list = new ArrayList();
        
        for (x = 0; x < 5; x++) {
            // agrega un elemento
            list.add("elm" + x);
        }
        
        System.out.println(list.toString().replace("elm", "rem"));
        
        // remueve el elemento en la posición 1 (la segunda)
        list.remove(1);
        
        // reemplaza el valor del primer elemento
        list.set(0, "elm5");
        
        // agrega otro elemento
        list.add("elem6");
        
        System.out.println(
                list.toString().replace("[", "").replace("]", ""));
    }

}
