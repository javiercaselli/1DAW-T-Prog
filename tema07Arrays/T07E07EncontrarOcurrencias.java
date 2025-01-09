package tema07Arrays;

import java.util.Random;
import java.util.Scanner;

public class T07E07EncontrarOcurrencias {
    public static void main(String[] args) {
        // Declaraciones
        int[] numeros = new int[100];
        String[] auxiliar = new String[100];
        int mostrado = -1;
        int sustituto = -1;

        // Generador de aleatorios
        Random rand = new Random();

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Rellena con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(21);
        }

        // Dibuja los números separados por espacios
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        while (mostrado < 0 || mostrado > 20) {
            // Lee de pantalla valor mostrado a sustituir
            try {
                System.out.print("\nIntroduzca un número de los que se han mostrado: ");
                mostrado = sc.nextInt();

                if (mostrado < 0 || mostrado > 20) {
                    System.out.println("ERROR: Debe ser un número entre 0 y 20");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Debe ser un número entre 0 y 20");
                sc.nextLine();
            }
        }

        // Lee valor sustituto
        while (sustituto < 0 || sustituto > 20) {
            // Lee de pantalla valor mostrado a sustituir
            try {
                System.out.print("\nIntroduzca el valor por el que quiere sustituirlo: ");
                sustituto = sc.nextInt();

                if (sustituto < 0 || sustituto > 20) {
                    System.out.println("ERROR: Debe ser un número entre 0 y 20");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Debe ser un número entre 0 y 20");
                sc.nextLine();
            }
        }

        // Buscamos el valor a sustituir
        for (int i = 0; i < numeros.length; i++) {
            String sNum = String.valueOf(numeros[i]);

            if (numeros[i] == mostrado) {
                sNum = "\"" + sustituto + "\"";
            }

            auxiliar[i] = sNum;
        }

        // Dibuja resultado
        System.out.println("");
        for (String num : auxiliar) {
            System.out.print(num + " ");
        }

    }
}
