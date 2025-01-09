package tema07Arrays;

import java.util.Scanner;

public class PruebaApuntes2 {
    public static void main(String[] args) {
        // Declara Array con inicialización en línea
        int[][] tabla = {
                            {8, -12, 33},
                            {14, 1, -24},
                            {100, 51, 69}
                        };

        // Scanner
        Scanner sc = new Scanner(System.in);
        
        // ordinal del número a mostrar
        int fila;
        int columna;
        
        // Pregunta al usuario por el número a mostrar
        System.out.print("Introduza la fila: ");
        fila = sc.nextInt();
        System.out.print("Introduza la columna: ");
        columna = sc.nextInt();
        

        // Buscamos el elemento
        System.out.println("El número en la fila " + fila + " y columna " +
            columna + " es el " + tabla[fila-1][columna-1]);
    }
}
