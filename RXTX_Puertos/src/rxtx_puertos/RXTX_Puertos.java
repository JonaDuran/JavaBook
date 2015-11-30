package rxtx_puertos;

import java.util.Enumeration;
import gnu.io.*;

/**
 *
 * @author Jonathan
 */
public class RXTX_Puertos {

    static CommPortIdentifier ports;

    public static void main(String[] args) {
        RXTX_Puertos ini = new RXTX_Puertos();
        ini.ver();
    }

    public void ver() {
        Enumeration<?> puertos = CommPortIdentifier.getPortIdentifiers();
        while (puertos.hasMoreElements()) {
            ports = (CommPortIdentifier) puertos.nextElement();
            System.out.println("===\n" + ports.getName());
        }
    }
}
