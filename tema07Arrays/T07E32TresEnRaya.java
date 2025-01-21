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
                victoria = compruebaVictoria(tablero, fila, columna); // Comprueba si ha ganado
                if (victoria) {
                    System.out.println("Lo siento, has perdido contra el ordenador.");
                }
            } else { // Juega el usuario
                do {
                    System.out.print("Introduzca coordenada vertical (a-c): ");
                    String sFila = sc.nextLine();
                    // Traducimos el valor en letra a numérico
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
                victoria = compruebaVictoria(tablero, fila, columna); // Comprueba si ha ganado
                if (victoria) {
                    System.out.println("¡Enhorabuena, has ganado!");
                }
            }

            // Incremento el contador de jugadas
            jugadas++;

            // Pintar el tablero
            pintaTablero(tablero);

            // comprueba si el talero está lleno
            terminado = (jugadas == (SIZE*SIZE));
            if (!victoria && terminado) {
                System.out.println("El juego ha terminado en tablas.");
            }

        }

    }

    /**
     * Método para inicializar el tablero antes del juego
     * 
     * @param tablero tablero de juego
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
     * @param tablero tablero de juego
     */
    public static void pintaTablero(int[][] tablero) {
        for (int fila = 0; fila < SIZE; fila++) {
            for (int col = 0; col < SIZE; col++) {
                // línea horizontal superior
                if (col == 0) {
                    // contenido celda
                    char[] sFila = { 'a', 'b', 'c' };
                    System.out.print(sFila[fila] + " |"); // coordenadas verticales
                }
                System.out.print(" " + FICHAS[tablero[fila][col]] + " ");
            }
            System.out.println();
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
        System.out.println();
        System.out.println();


    }

    /**
     * Comprueba que la posición del tablero es válida (está libre)
     * 
     * @param tablero tablero de juego
     * @param fila Eje y
     * @param columna eje x
     * @return verdadero si la posición es válida
     */
    private static boolean posicionValida(int[][] tablero, int fila, int columna) {
        return (tablero[fila][columna] == 0 && (columna >= 0) && (columna < SIZE));
    }

    /**
     * Comprueba si la partida ha acabado en victoria para algún oponente.
     * @param tablero tablero de juego
     * @param fila eje y
     * @param col eje x
     * @return verdadero si alguien ha ganado la partida.
     */
    private static boolean compruebaVictoria(int[][] tablero, int fila, int col) {
        int jugador = tablero[fila][col];
        //Comprueba si ha victoria en las fila, la columna o las diagonales
        return comprobarFila(tablero, fila, jugador) ||
                comprobarColumna(tablero, col, jugador) ||
                comprobarDiagonalPrincipal(tablero, jugador) ||
                comprobarDiagonalSecundaria(tablero, jugador);
    }

    /**
     * Comprueba si hay una victoria en la fila.
     *
     * @param tablero El tablero de juego.
     * @param fil     Fila a comprobar.
     * @param jugador Jugador actual.
     * @return true si hay 4 en raya en la fila, false en caso contrario.
     */
    public static boolean comprobarFila(int[][] tablero, int fil, int jugador) {
        int count = 0;
        for (int c = 0; c < SIZE; c++) {
            count = (tablero[fil][c] == jugador) ? count + 1 : 0;
        }
        return (count == SIZE);
    }

    /**
     * Comprueba si hay una victoria en la columna.
     *
     * @param tablero El tablero de juego.
     * @param col     Columna a comprobar.
     * @param jugador Jugador actual.
     * @return true si hay 4 en raya en la columna, false en caso contrario.
     */
    public static boolean comprobarColumna(int[][] tablero, int col, int jugador) {
        int count = 0;
        for (int f = 0; f < SIZE; f++) {
            count = (tablero[f][col] == jugador) ? count + 1 : 0;
        }
        return (count == SIZE);
    }

    /**
     * Comprueba si hay una victoria en la diagonal principal (\).
     *
     * @param tablero El tablero de juego.
     * @param jugador Jugador actual.
     * @return true si hay 4 en raya en la diagonal principal, false en caso contrario.
     */
    public static boolean comprobarDiagonalPrincipal(int[][] tablero, int jugador) {
        int count = 0;
        for (int d = 0; d < SIZE; d++) {
            if (tablero[d][d] == jugador) {
                count++;
            }
        }

        return (count == SIZE);
    }

    /**
     * Comprueba si hay una victoria en la diagonal secundaria (/).
     *
     * @param tablero El tablero de juego.
     * @param jugador Jugador actual.
     * @return true si hay 4 en raya en la diagonal secundaria, false en caso contrario.
     */
    public static boolean comprobarDiagonalSecundaria(int[][] tablero, int jugador) {
        int count = 0;
        for (int d = 0; d < SIZE; d++) {
            if (tablero[d][SIZE - 1 - d] == jugador) {
                count++;
            }
        }
        return (count == SIZE);
    }

}
