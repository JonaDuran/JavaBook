package archivos;

import java.io.*;

/**
 * 24/04/14
 *
 * @author jonathan
 *
 * Java2.pdf p107 (lectura y escritura de archivos) INCOMPLETO!!
 */
public class Archivos {

    public static void main(String[] args) throws IOException {

//
        // File("ruta/del/archivo.extención")
        File f = new File("files/file.txt");
        File f1 = new File("files/file1.txt");
        
        // también puede recibir la ruta de una carpeta
        File folder = new File("files");
        
        // File.separator =  separador de rutas segun el S.O.
        File f2 = new File(folder + File.separator + "file2.txt");
        
        // dos parámetros(carpeta, archivo)
        File fx = new File(folder, "file2");
        
        // ruta absoluta, las anteriores son relativas
        String ruta = "/media/x/Dropbox/"
                + "Programming/JavaBook/Archivos/files/file3.txt";
        
        // para asegurar que funcione en cualquier S.O.
        File f3 = new File(ruta.replace("/", File.separator));
        
        String ruta2 = "files" + File.separator + "file4.txt";
        File f4 = new File(ruta2);

        System.out.println(""
                + f.getName() + "\t" + f.exists() + "\n"
                + f1.getName() + "\t" + f1.exists() + "\n"
                + f2.getName() + "\t" + f2.exists() + "\n"
                + fx.getName() + "\t\t" + fx.exists() + "\n"
                + f3.getName() + "\t" + f3.exists() + "\n"
                + f4.getName() + "\t" + f4.exists() + "\n"
        );

//
        // lectura y escritura mediante caracteres
        BufferedReader in1 = new BufferedReader(new FileReader(f1));

        BufferedWriter out1 = new BufferedWriter(new FileWriter(f3));

        String line;
        
        // lee y escribe línea por línea, 
        while ((line = in1.readLine()) != null) {
            out1.write(line);
            out1.newLine();
        }
        // el método read() lee caracter por caracter

        // es necesario cerrar los archivos para que se escriba
        in1.close();
        out1.close();

//
        // lectura y escritura byte a byte
        DataInputStream in2 = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(f2)));

        DataOutputStream out2 = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(f4)));

        /* puede manipular datos primarios
         in2.readFully();
         in2.readInt();
        
         out2.writeBytes();
         out2.writeDouble();*/
        
        in2.close();
        out2.close();

//
        // RandomAccessFile
        /* permite leer cualquier posición del
         archivo en cualquier momento, los anteriores
         son de acceso secuencial*/
        
        File f5 = new File(folder, "file5.txt");
        
        RandomAccessFile raf = new RandomAccessFile(f5, "rw");
        
        raf.write("hola".getBytes());   // escribe símbolos
        raf.close();
    }

}
