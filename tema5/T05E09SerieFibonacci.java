package tema5;

import java.util.Scanner;

/**
 * Algoritmo que calcula nos N primeros números de la
 * Serie de Fibonacci.
 * 
 * La serie de Fibonacci parte de los número 0 y 1, y
 * a partir de ahí los siguientes número de la serie son
 * la suma de los dos anteiores, por ejemplo:
 * 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
 * 
 */
public class T05E09SerieFibonacci {
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        final int PRIMERO = 0;
        final int SEGUNDO = 1;
        int ultimo = SEGUNDO;
        int penultimo = PRIMERO;
        int aux = 0;

        try {
            // Lee número de teclado
            System.out.println("\033[1mN PRIMEROS NÚMEROS DE LA SERIE DE FIBONACCI\033[0m");
            System.out.print("Introduzca un número: ");
            numero = sc.nextInt();

            /*
             * Calcula la serie de Fibonacci
             */
            if (numero == 0)
                System.out.println(PRIMERO);
            else if (numero == 1)
                System.out.println(PRIMERO + " " + SEGUNDO);
            else {
                System.out.print(PRIMERO + " " + SEGUNDO);
                while (numero > 2) {
                    aux = ultimo + penultimo;
                    penultimo = ultimo;
                    ultimo = aux;
                    System.out.print(" " + ultimo);

                    // numero
                    numero--;
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: Se debe introducir un valor numérico");
        } finally {
            sc.close();
        }

    }
}
