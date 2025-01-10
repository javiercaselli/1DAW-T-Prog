package tema07Arrays;

import java.util.Random;
import java.util.Scanner;

public class T07E25TablaSumaAleatorio {
    public static void main(String[] args) {
        // Declaraciones
        int[][] tabla = new int[4][5];
        Random rand = new Random();

        // Introducir números
        System.out.println("Relleno aleatorio de la tabla");
        for (int fila = 0; fila < tabla.length; fila++) {
            for (int col = 0; col < tabla[0].length; col++) {
                tabla[fila][col] = rand.nextInt(100, 1000);
            }
        }

        // Pinta la tabla
        System.out.println("");
        int[] sumaColumnas = new int[6];
        for (int fila = 0; fila < tabla.length; fila++) {
            int sumaFila = 0;
            for (int col = 0; col < tabla[0].length; col++) {
                System.out.printf("%10d", tabla[fila][col]);
                sumaFila += tabla[fila][col];
                sumaColumnas[col] += sumaColumnas[col];
                if (col == tabla[0].length -1) {
                    System.out.printf("   |%10d\n", sumaFila);
                }
            }
        }

    }
}
