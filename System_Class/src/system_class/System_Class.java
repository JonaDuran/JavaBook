package system_class;

import java.lang.System;

/**
 * 13/05/14
 *
 * @author Jonathan
 */
public class System_Class {

    public static void main(String[] args) {
// obtiene fecha actual en milisegundos desde '00:00:00 01/01/1970'
        long inicio = System.currentTimeMillis();
        //ejem();

        long fin = System.currentTimeMillis();
        long tiempoEjecucion = fin - inicio;
        
        // imprime el tiempo de ejecución
        System.out.println(tiempoEjecucion);

// finaliza el programa
        System.exit(0);
    }

    public static void ejem() {
        for (int j = 0; j < 200; j++) {

            for (int i = 0; i < 20; i++) {
                System.out.print("...........\b\b\b\b\b\b\b\b\b\b");
            }
            System.out.println("");
        }
    }

}
