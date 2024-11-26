package tema5;

import java.util.Scanner;

public class T05TableroUTF {
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

        int alto = 0;
        int ancho = 0;
        int tresEnRaya = 0;
        String sTresEnRaya;
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
        for (int fila = 0; fila <= alto; fila++) {
            String bordesHorizontales = "";
            String bordesVerticales = "";
            // Columnas
            for (int columna = 0; columna <= ancho; columna++) {
                // Borde horizontal
                if (fila == 0) {
                    if (columna == 0) {
                        bordesHorizontales += SUP_IZQ + BORDE_H;
                    } else if (columna == ancho) {
                        bordesHorizontales += SUP_DER;
                    } else {
                        bordesHorizontales += SUP_MED +  BORDE_H;
                    }
                } else if (fila == alto) {
                    if (columna == 0) {
                        bordesHorizontales += INF_IZQ + BORDE_H;
                    } else if (columna == ancho) {
                        bordesHorizontales += INF_DER;
                    } else {
                        bordesHorizontales += INF_MED +  BORDE_H;
                    }
                } else {
                    if (columna == 0) {
                        bordesHorizontales += MED_IZQ + BORDE_H;
                    } else if (columna == ancho) {
                        bordesHorizontales += MED_DER;
                    } else {
                        bordesHorizontales += MED_MED +  BORDE_H;
                    }
                }
                
                // Borde vertical
                if (fila != alto) {
                    tresEnRaya =  0 + (int)(Math. random() * ((1 - 0) + 1));
                    sTresEnRaya = (tresEnRaya == 0) ? "O" : "X";
                    if (columna != ancho) {
                        bordesVerticales += BORDE_V + " " + sTresEnRaya + " ";
                    } else {
                        bordesVerticales += BORDE_V + "   ";
                    }
                }
            }

            // borde superior
            System.out.println(bordesHorizontales);
            // bordes izquierdo y derecho
            System.out.println(bordesVerticales);

        }

        // Cierra Scanner
        sc.close();;
    }

}
