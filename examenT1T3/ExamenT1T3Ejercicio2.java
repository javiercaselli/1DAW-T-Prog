package examenT1T3;

import java.util.Scanner;

public class ExamenT1T3Ejercicio2 {
    public static void main(String[] args) {
        // Duración del año terreste
        final int ANIO_TERRESTRE = 365;

        // Título del programa
        System.out.println("\033[1mVUELTAS DE LA TIERRA\033[0m");
        System.out.println("====================");

        // Entrada por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número de años: ");
        int years = sc.nextInt();

        // Calculamos vueltas a la Tierra
        int vueltas = years * ANIO_TERRESTRE;
        System.out.printf("La tierra habrá dado un total de %d vueltas en %d años.\n", 
                vueltas, years);


        // Cerramos Scanner
        sc.close();

    }
}
