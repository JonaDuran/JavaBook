package mapas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jonathan
 */
public class Mapas {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("entrada.csv")));
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        Map<Integer, String> map = new HashMap<Integer, String>();
        String datos[];
        String line;
        int x;

        while ((line = input.readLine()) != null) {
            datos = line.split(",");
            map.put(Integer.parseInt(datos[0]), datos[1]);
        }
        int search;
        do {
            search = Integer.parseInt(br.readLine());
            System.out.println(map.get(search));
        } while (search != 0);

        /*System.out.println(map.toString()
         .replace("=", " ").replace(", ", "\n"));*/
    }

}
