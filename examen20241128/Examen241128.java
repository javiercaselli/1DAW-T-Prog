package examen241128;

import java.util.Scanner;

public class Examen241128 {
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

        // Leemos de teclado
        // valor mínimo
        while (min < 0) {
            try {
                System.out.print("Introduce el valor mínimo del rango: ");
                min = sc.nextInt();
                if (min < 0) {
                    System.out.println("ERROR: Debe introducir un número entero positivo");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número entero positivo");
            } finally {
                sc.nextLine();
            }
        }

        // valor máximo
        while (max <= min) {
            try {
                System.out.print("Introduce el valor máximo del rango: ");
                max = sc.nextInt();
                if (max <= min) {
                    System.out.println("ERROR: Debe introducir un número entero positivo mayor que el mínimo");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número entero positivo mayor que el mínimo");
            } finally {
                sc.nextLine();
            }
        }

        // Modo
        while (modo.length() != 1) {
            try {
                System.out.print("Dibujar la gráfica en blanco y negro, o en color (B|C): ");
                modo = sc.nextLine();
                if (modo.length() != 1) {
                    System.out.println("ERROR: Debe ser una cadena de longitud 1");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Debe ser una cadena de longitud 1");
            }
        }

        // Numero aleatorio
        numero = min + (int) (Math.random() * (max - min + 1));
        System.out.println("El número aleatorio generado es: " + numero);

        // Convertimos a String
        String sNumero = String.valueOf(numero);

        // Averguo ancho de la tabla
        int ancho = 0;
        while (numero != 0) {
            ancho = Math.max(numero % 10, ancho);
            numero = numero / 10;
        }
        ancho++;

        // Averguo el alto de la tabla
        int alto = sNumero.length();

        // Dibujo de la tabla
        if (modo.toUpperCase().equals(MODO_COLOR)) {
            // Tabla a color
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
                        int numeroActual = Integer.parseInt(String.valueOf(sNumero.charAt(fila)));
                        if (columna == 0) {
                            bordesVerticales += BORDE_V + " " + numeroActual + " ";
                        } else if (columna > 0 && columna <= numeroActual) {
                            String cursorColor = " ";
                            switch (numeroActual) {
                                case 0, 1, 2, 3, 4:
                                    cursorColor += BLUE_BACKGROUND;
                                    break;
                                case 5, 6:
                                    cursorColor += RED_BACKGROUND;
                                    break;
                                case 7, 8:
                                    cursorColor += GREEN_BACKGROUND;
                                    break;
                                case 9:
                                    cursorColor += PURPLE_BACKGROUND;
                                    break;
                            }
                            cursorColor += " " + RESET + " ";
                            bordesVerticales += BORDE_V + cursorColor;;
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

        } else {
            // Tabla en blanco y negro
            for (int fila = 0; fila < alto; fila++) {
                String bordesHorizontales = "";
                String bordesVerticales = "";
                // Columnas
                for (int columna = 0; columna < ancho; columna++) {
                    // Bordes horizontales
                    bordesHorizontales += BORDE_H_BN;
                    if (columna == 0)
                        bordesVerticales += BORDE_V_BN;

                    // Bordes verticales y datos
                    int numeroActual = Integer.parseInt(String.valueOf(sNumero.charAt(fila)));
                    if (columna == 0) {
                        bordesVerticales += " " + numeroActual + " " + BORDE_V_BN;
                    } else if (columna > 0 && columna <= numeroActual) {
                        bordesVerticales += " * " + BORDE_V_BN;
                    } else {
                        bordesVerticales += "   " + BORDE_V_BN;
                    }
                }

                // borde superior
                if (fila == 0)
                    System.out.println(bordesHorizontales);
                // bordes izquierdo y derecho
                System.out.println(bordesVerticales);
                // borde inferior
                System.out.println(bordesHorizontales);

            }

        }

        // Cierre del Scanner
        sc.close();
    }

}
