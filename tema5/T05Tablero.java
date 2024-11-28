package tema5;

import java.util.Scanner;

public class T05Tablero {
    public static void main(String[] args) {
        // Declaraciones
        final String BORDE_H = " ---";
        final String BORDE_V = "|";
        int alto = 0;
        int ancho = 0;
        Scanner sc = new Scanner(System.in);

        // Lee altura de teclado
        while (alto <= 0) {
            try {
                System.out.print("Introduzca altura del tablero: ");
                alto = sc.nextInt();
                if (alto <= 0) {
                    System.out.println("ERROR: La altura debe ser un número positivo.");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La altura debe ser un número positivo.");
                sc.nextLine();
            }
        }

        // Lee anchura de teclado
        while (ancho <= 0) {
            try {
                System.out.print("Introduzca anchura del tablero: ");
                ancho = sc.nextInt();
                if (ancho <= 0) {
                    System.out.println("ERROR: La anchura debe ser un número positivo.");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La anchura debe ser un número positivo.");
                sc.nextLine();
            }
        }

        // Filas
        for (int fila = 0; fila < alto; fila++) {
            String bordesHorizontales = "";
            String bordesVerticales = "";
            // Columnas
            for (int columna = 0; columna < ancho; columna++) {
                // Bordes horizontales
                bordesHorizontales += BORDE_H;
                if (columna == 0) bordesVerticales += BORDE_V;
                bordesVerticales += "   " + BORDE_V;
            }

            // borde superior
            if (fila == 0) System.out.println(bordesHorizontales);
            // bordes izquierdo y derecho
            System.out.println(bordesVerticales);
            // borde inferior
            System.out.println(bordesHorizontales);

        }

        // Cierre del Scanner
        sc.close();
    }
}
