package colecciones;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Comparator;

/**
 * 30/03/14
 *
 * @author jonathan
 */
public class Colecciones {

    public static void main(String[] args) {
        Random ran = new Random();

        // necesario para ordenar y búscar objetos con la clase Collections
        Comparator<Objeto> comparador = new Comparator<Objeto>() {
            @Override   // indica que el método fue redefinido
            public int compare(Objeto o1, Objeto o2) {
                Integer com1 = o1.getNum();
                Integer com2 = o2.getNum();
                return com1.compareTo(com2);
            }
        };

        /*
         ----- EJEMPLO CON DATO PRIMARIO -----
         */
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // añade enteros aleatorios a la lista
        for (int x = 0; x < 7; x++) {
            nums.add(ran.nextInt(100));
        }

        int buscaNum = nums.get(0);
        System.out.println(nums.toString());

        Collections.sort(nums);                     // ordena
        System.out.println(nums.toString());        // imprime

        // busca y retorna el indice
        System.out.println("Busca " + buscaNum + " : índice "
                + Collections.binarySearch(nums, buscaNum));

        /*
         ----- EJEMPLO CON OBJETOS -----
         */
        ArrayList<Objeto> objs = new ArrayList<Objeto>();

        // añade objetos con datos aleatorios a la lista
        for (int x = 0; x < 5; x++) {
            objs.add(new Objeto("st" + x, ran.nextInt(100)));
        }

        for (Objeto obj : objs) {                   // imprime
            System.out.print(obj.num + "-" + obj.str + " ");
        }

        Objeto buscaObj = objs.get(0);
        System.out.println("");

        // ordena los objetos en base a un atributo
        Collections.sort(objs, comparador);

        for (Objeto obj : objs) {
            System.out.print(obj.num + "-" + obj.str + " ");
        }

        int indice = Collections.binarySearch(objs, buscaObj, comparador);

        System.out.println("");
        System.out.println("Busca "
                + buscaObj.num + "-" + buscaObj.str + ": índice " + indice);
    }

}
