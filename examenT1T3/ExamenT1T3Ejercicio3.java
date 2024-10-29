package examenT1T3;

import java.util.Scanner;

/**
 * Ejercicio 3 del examen. Cálculo del volumen de un toroide
 */
public class ExamenT1T3Ejercicio3 {

    public static void main(String[] args) {
       // Título del programa
       System.out.println("\033[1mVOLUMEN DE UN TOROIDE\033[0m");
       System.out.println("=====================");

        // Entrada por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el radio mayor (cms): ");
        double rMayor = sc.nextDouble();
        System.out.print("Introduzca el radio menor (cms): ");
        double rMenor = sc.nextDouble();

        // Calcula el volumen del toroide
        double volumen = 2 * Math.pow(Math.PI, 2) * rMayor * Math.pow(rMenor, 2);
        System.out.printf("El volumen del toroide es " + 
                "de \033[1m\033[38;5;1m%f\033[0m cm\u00B3.", volumen);

        // Cierra el Scanner
        sc.close();
    }

}
