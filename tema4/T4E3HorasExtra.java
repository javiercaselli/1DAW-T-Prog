package tema4;

import java.util.Scanner;

/**
 * Calculadora de horas ordinarias y horas extra de trabajo
 */
public class T4E3HorasExtra {
    public static void main(String[] args) {
        // Declaraciones
        final float PRECIO_HORA = 12f;
        float horas;
        float sueldo;
        
        // Lee las horas trabajadas 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        horas = sc.nextFloat();

        // Calcula el sueldo semanal
        sueldo = horas * PRECIO_HORA;

        // Muestra el resultado por pantalla
        System.out.printf("El sueldo semanal que le corresponde es de %.2f euros.\n", sueldo);

        //Cierra scanner
        sc.close();

    }
}
