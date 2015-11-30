package arreglos;

import java.util.Arrays;

/**
 * 18/04/14
 *
 * @author jonathan
 *
 * Java2.pdf p39
 */
public class Arreglos {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
//
        // tamaños máximos de los arrays según el tipo de dato
        // boolean:+ de 350 millones -> 3.5(10^8)
        // byte:   + de 350 millones -> 3.5(10^8)
        // short:  + de 170 millones -> 1.7(10^8)
        // int:    + de  87 millones -> 8.7(10^7)
        // long:   + de  43 millones -> 4.3(10^7)
        // Objets: + de  87 millones -> 8.7(10^7)
        //max();
//
        
        /* - - - UNIDIMENCIONALES - - - */
        
        // new tipoDeDato[númeroDeElementos]
        byte ar0[] = new byte[10];
        
        // {elemento1, elemento2, ..., elementoN}
        byte ar1[] = {1, 2, 3};
        
        // hace referencia
        byte ar2[] = ar1;
        
        // clona el array
        byte ar3[] = ar2.clone();

        // esto también afaecta a ar1, pero a ar3 no
        ar2[0] = 4;

        System.out.println(""
                + Arrays.toString(ar1) + "\n"
                + Arrays.toString(ar2) + "\n"
                + Arrays.toString(ar3) + "\n"
        );

//
        /* - - - MULTIDIMENCIONALES - - - */
        int ar4[][] = new int[3][];
        int ar5[][] = new int[2][];
        ar5[0] = new int[2];
        ar5[1] = ar4[2];
        
        // se pueden poner las dimenciones que sea
        int ar6[][][];

//
        
        /* - - - ARRAYS CLASS - - - */
        
        String strs[] = {"C", "I", "B", "L", "S", "J",};
        String strs2[] = new String[5];
        System.out.println(Arrays.toString(strs));

        // ordena los elementos del Array
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        // busca la posición de un elemento    
        System.out.println("Posición de J: "
                + Arrays.binarySearch(strs, "J"));

        // asigna el mismo valor a todos los elementos
        Arrays.fill(strs2, "A");
        System.out.println(Arrays.toString(strs2));

        // copia del arreglo 1 al arreglo 2
        System.arraycopy(strs, 0, strs2, 0, 3);
        System.out.println(Arrays.toString(strs2));

        System.out.println(Arrays.equals(strs, strs2));
    }

    // metodo para conocer la longitud maxima de un array
    static void max() {
        int max = 170000000;
        boolean error = false;

        while (!error) {
            try {
                short nada[] = new short[max];
                System.out.println(max);
                max += 10000000;
            } catch (Exception e) {
                error = true;
            }
        }
    }

}
