package tema4;

import java.util.Scanner;

/**
 * Calculadora de horas ordinarias y horas extra de trabajo
 */
public class T4E3HorasExtra {
    public static void main(String[] args) {
        // Declaraciones
        final int HORAS_LABORABLES = 40;
        final float PRECIO_HORA = 12.0f;
        final float PRECIO_EXTRA = 16.0f;
        int horas;
        float sueldo;
        
        // Lee las horas trabajadas 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        horas = sc.nextInt();

        // Calcula el sueldo semanal
        if (horas <= HORAS_LABORABLES) {
            sueldo = horas * PRECIO_HORA;
        } else {
            // Primeras 40 horas
            sueldo = HORAS_LABORABLES * PRECIO_HORA;
            int horasExtra = horas - HORAS_LABORABLES;
            sueldo += horasExtra * PRECIO_EXTRA;
        }

        // Muestra el resultado por pantalla
        System.out.printf("El sueldo semanal que le corresponde es de %.2f euros.\n", sueldo);

        //Cierra scanner
        sc.close();

    }
}
