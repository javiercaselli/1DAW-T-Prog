package tema07Arrays;

import java.util.Scanner;

public class PruebaApuntes3 {
    public static void main(String[] args) {
        // Declara Array con inicialización en línea
        int[][] tabla = {
                            {8, -12, 33, 45},
                            {14, 1, -24},
                            {100, 51, 69}
                        };

        // Scanner
        Scanner sc = new Scanner(System.in);
        
        // ordinal del número a mostrar
        int ordinal;

        // Pregunta al usuario por el número a mostrar
        System.out.print("Introduza el ordinal del elemento: ");
        ordinal = sc.nextInt();

        // Buscamos el elemento
        int fila = 1;
        int columna;
        for (columna = ordinal; columna >= tabla.length; columna -= tabla.length) {
            fila++;
        }

        System.out.println("El número correspondiente al ordinal " + ordinal + 
            "es el " + tabla[fila-1][columna-1]);
    }
}
