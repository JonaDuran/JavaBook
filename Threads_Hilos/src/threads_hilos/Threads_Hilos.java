package threads_hilos;

/**
 *
 * @author Jonathan
 */
public class Threads_Hilos {

    public static void main(String[] args) {
        Proceso hilo1 = new Proceso("Hilo 1");
        Proceso hilo2 = new Proceso("Hilo 2");
        hilo1.setMensaje("Mensaje hilo 1");
        hilo2.setMensaje("Mensaje hilo 2");
        
        hilo1.start();
        hilo2.start();
    }

    static public class Proceso extends Thread {
        
        String mensaje;
        public Proceso(String mag) {
            super(mag);
        }

        @Override
        public void run() {
            for (int i = 0; i < 15; i++) {
                System.out.println(mensaje);
            }
            System.out.println("Proceso " + mensaje + " terminado");
        }
        
        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }
    }

}
