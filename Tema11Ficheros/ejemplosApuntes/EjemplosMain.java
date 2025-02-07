package Tema11Ficheros.ejemplosApuntes;

import java.io.*;

public class EjemplosMain {
    public static void main(String[] args) {
        // se indica la ruta entre comillas (el . representa el directorio actual)
        File f = new File(".");

        // recuperamos el contenido del directorio
        String[] listaArchivos = f.list();

        // mostramos el listado
        for(String nombreArchivo : listaArchivos) {
            System.out.println(nombreArchivo);
        }

        // Leamos el fichero de configuración del proyecto de IntelliJ
        try {
            FileReader archivo = new FileReader("fruta.txt") ;
            BufferedReader br = new BufferedReader(archivo);

            String linea = "";

            do {
                System.out.println(linea);
                linea = br.readLine();
            } while (linea != null) ;

            br.close();
        } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero 1DAW-T-Prog.iml");
        } catch (IOException ioe) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero esdla.txt");
        }


        // Escritura
        try {
            FileWriter archivo = new FileWriter("fruta.txt", true) ;
            BufferedWriter bw = new BufferedWriter(archivo);
            bw.write("naranja\n");
            bw.write("mango\n");
            bw.write("chirimoya\n");
            bw.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }


        // Paso de argumentos al programa
        System.out.println("\n\nLos argumentos introducidos son: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
}
