package examen20250116;

import java.util.Random;
import java.util.Scanner;

public class Examen250116 {
    public static void main(String[] args) {
        // Declaraciones

        // Bordes verticales y horizontales de la tabla
        final String BORDE_H = "\u2550\u2550\u2550";
        final String BORDE_V = "\u2551";

        // Uniones superiores
        final String SUP_IZQ = "\u2554";
        final String SUP_MED = "\u2566";
        final String SUP_DER = "\u2557";

        // Uniones medias
        final String MED_IZQ = "\u2560";
        final String MED_MED = "\u256C";
        final String MED_DER = "\u2563";

        // Uniones inferiores
        final String INF_IZQ = "\u255A";
        final String INF_MED = "\u2569";
        final String INF_DER = "\u255D";

        // Colores
        final String RESET = "\033[0m";
        final String RED_BACKGROUND = "\033[41m";
        final String GREEN_BACKGROUND = "\033[42m";
        final String BLUE_BACKGROUND = "\033[44m";
        final String PURPLE_BACKGROUND = "\033[45m";

        // Bordes B/N
        final String MODO_COLOR = "C";
        final String BORDE_H_BN = " ---";
        final String BORDE_V_BN = "|";

        int min = -1;
        int max = -1;
        int numero;
        String modo = "";
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Pinta tablero
        int ancho = 4;
        int alto = 4;
        System.out.println("");
        System.out.println("JUEGO DEL CUATRO EN RAYA");
        System.out.println("========================");
        System.out.println();
        for (int fila = 0; fila <= alto; fila++) {
            String bordesHorizontales = "  ";
            String bordesVerticales = "";
            switch (fila) {
                case 0:
                    bordesVerticales += "a ";
                    break;
                case 1:
                    bordesVerticales += "b ";
                    break;
                case 2:
                    bordesVerticales += "c ";
                    break;
                case 3:
                    bordesVerticales += "d ";
                    break;
                default:
                bordesVerticales += "  ";
            }
            // Columnas
            for (int columna = 0; columna <= ancho; columna++) {
                // Borde horizontal
                if (fila == 0) {
                    if (columna == 0) {
                        bordesHorizontales += SUP_IZQ + BORDE_H;
                    } else if (columna == ancho) {
                        bordesHorizontales += SUP_DER;
                    } else {
                        bordesHorizontales += SUP_MED + BORDE_H;
                    }
                } else if (fila == alto) {
                    if (columna == 0) {
                        bordesHorizontales += INF_IZQ + BORDE_H;
                    } else if (columna == ancho) {
                        bordesHorizontales += INF_DER;
                    } else {
                        bordesHorizontales += INF_MED + BORDE_H;
                    }
                } else {
                    if (columna == 0) {
                        bordesHorizontales += MED_IZQ + BORDE_H;
                    } else if (columna == ancho) {
                        bordesHorizontales += MED_DER;
                    } else {
                        bordesHorizontales += MED_MED + BORDE_H;
                    }
                }

                // Borde vertical y datos
                if (fila != alto) {
                    /*
                    if ((fila == 0 && columna == 1) || (fila == 3 && columna == 0)) {
                        bordesVerticales += BORDE_V + " X ";
                    } else if ((fila == 1 && columna == 1)) {
                        bordesVerticales += BORDE_V + " O ";

                    } else {
                        bordesVerticales += BORDE_V + "   ";
                    }
                    */
                    String jugada = " ";
                    if (columna < ancho) jugada = (rand.nextInt(2) == 0) ? "X" : "O";
                    bordesVerticales += BORDE_V + " " + jugada + " ";
                } else {
                    if (columna < ancho) bordesVerticales += "  " + columna + " ";
                }
            }

            // borde superior
            System.out.println(bordesHorizontales);
            // bordes izquierdo y derecho
            System.out.println(bordesVerticales);

        }

        System.out.println();
        System.out.println("Introduzca la fila (a-d): ");
        // System.out.println("Introduzca la columna (0-3): 1");
        System.out.println();

        

        // Cierre del Scanner
        sc.close();
    }

}
