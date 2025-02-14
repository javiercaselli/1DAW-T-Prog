package Tema10ColeccionesYDiccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T10E16Capitales {
    public static void main(String[] args) {
        final String SALIDA = "salir";

        Map<String, String> diccionarioCapitales = new HashMap<>();
        diccionarioCapitales.put("España", "Madrid");
        diccionarioCapitales.put("Portugal", "Lisboa");
        diccionarioCapitales.put("Francia", "París");

        Scanner sc = new Scanner(System.in);

        String nombrePais = "";

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            nombrePais = sc.nextLine();

            if (!SALIDA.equals(nombrePais.toLowerCase())) {
                if (diccionarioCapitales.containsKey(nombrePais)) {
                    // Muestra la capital
                    System.out.println("La capital de " + nombrePais + " es " + diccionarioCapitales.get(nombrePais) + "\n");
                } else {
                    // Aprende la capital
                    System.out.print("No conozco la respuesta ¿cuál es la capital de " + nombrePais + "?: ");
                    String nuevaCapital = sc.nextLine();
                    diccionarioCapitales.put(nombrePais, nuevaCapital);
                    System.out.println("Gracias por enseñarme nuevas capitales\n");
                }
            }
        } while (!SALIDA.equals(nombrePais.toLowerCase()));

        sc.close();
    }
}
