package tema07Arrays;

import java.util.Random;
import java.util.Scanner;

public class T07E32TresEnRaya {
    public static final int SIZE = 3; // Tamaño del tablero
    public static final char[] FICHAS = { ' ', 'X', 'O' };

    public static void main(String[] args) {
        // Declaraciones
        int[][] tablero = new int[SIZE][SIZE]; // tablero de tamaño "SIZE"
        int turno = 0; // turno = 0 (Ordenador) y turno = 1 (usuario)
        boolean terminado = false; // Tablero lleno sin ganador
        boolean victoria = false; // Alguien ha ganado
        int fila;
        int columna;
        int jugadas = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // Inicializa el tablero
        inicializaTablero(tablero);

        // Desarrollo del juego
        while (!victoria && !terminado) {
            if (turno == 0) { // Juega el ordenador
                do {
                    fila = rand.nextInt(3);
                    columna = rand.nextInt(3);
                } while (!posicionValida(tablero, fila, columna));
                tablero[fila][columna] = 1;
                turno = 1; // Devuelve el turno al jugador
            } else { // Juega el usuario
                do {
                    System.out.print("Introduzca coordenada vertical (a-c): ");
                    String sFila = sc.nextLine();
                    switch (sFila) {
                        case "a":
                            fila = 0;
                            break;
                        case "b":
                            fila = 1;
                            break;
                        case "c":
                            fila = 2;
                            break;
                        default:
                            fila = -1;
                    }
                    System.out.print("Introduzca coordenada horizontal (0-2): ");
                    columna = sc.nextInt();
                    sc.nextLine();
                } while (!posicionValida(tablero, fila, columna));
                tablero[fila][columna] = 2;
                turno = 0; // Devuelve el turno al ordenador
            }

            // Incremento el contador de jugadas
            jugadas++;

            // Pintar el tablero
            pintaTablero(tablero);

            // Comprueba si alguien ha ganado
            victoria = compruebaVictoria(tablero, fila, columna);

            // comprueba si el talero está lleno
            terminado = (jugadas == (SIZE*SIZE));
            if (terminado) {
                System.out.println("El juego ha terminado en tablas");
            }

        }

    }

    /**
     * Método para inicializar el tablero antes del juego
     * 
     * @param tablero
     */
    public static void inicializaTablero(int[][] tablero) {
        for (int fila = 0; fila < SIZE; fila++) {
            for (int col = 0; col < SIZE; col++) {
                tablero[fila][col] = 0;
            }
        }
    }

    /**
     * Pinta por pantalla el tablero
     * 
     * @param tablero
     */
    public static void pintaTablero(int[][] tablero) {
        for (int fila = 0; fila < SIZE; fila++) {
            for (int col = 0; col < SIZE; col++) {
                // línea horizontal superior
                if (col == 0)
                    // contenido celda
                    if (col == 0) {
                        char[] sFila = { 'a', 'b', 'c' };
                        System.out.print(sFila[fila] + " |"); // coordenadas verticales
                    }
                System.out.print(" " + FICHAS[tablero[fila][col]] + " ");
            }
            System.out.println("");
        }

        // Borde inferior
        System.out.print("   ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("---");
        }

        // Coordenadas horizontales
        System.out.println();
        System.out.print("   ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + i + " ");
        }

        // Deja dos líneas en blanco
        System.out.println("");
        System.out.println("");


    }

    /**
     * Comprueba que la posición del tablero es válida (está libre)
     * 
     * @param tablero
     * @param fila
     * @param columna
     * @return
     */
    private static boolean posicionValida(int[][] tablero, int fila, int columna) {
        return (tablero[fila][columna] == 0 && (columna >= 0) && (columna < SIZE));
    }

    private static boolean compruebaVictoria(int[][] tablero, int fila, int col) {
        // Declaraciones
        boolean victoria = false;

        // Comprueba filas
        for (int fila = 0; fila < SIZE; fila++) {
            for (int col = 0; col < SIZE; col++) {
                int primerValor = 0;
                if (col == 0) {
                    primerValor = tablero[fila][col];
                } else {
                    if (tablero[fila][col] != 
                }
            }
        }
        
        return false;
    }



}
