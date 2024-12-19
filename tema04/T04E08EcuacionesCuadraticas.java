package tema04;

import java.util.Scanner;

public class T04E08EcuacionesCuadraticas {
    public static void main(String[] args) {
        // Parámetros de la ecuación
        double a = 0;
        double b = 0;
        double c = 0;

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Lee parámetros
        boolean parametrosOK = false;
        while (!parametrosOK) {
            try {
                System.out.print("Introduzca el parámetro a: ");
                a = sc.nextDouble();
                System.out.print("Introduzca el parámetro b: ");
                b = sc.nextDouble();
                System.out.print("Introduzca el parámetro c: ");
                c = sc.nextDouble();
                parametrosOK = true;
            } catch (Exception e) {
                System.out.println("ERROR: Parámetros erróneos, deben ser números reales");
                sc.nextLine();
            }    
        }

        // Calculamos discriminante
        double discriminante = Math.pow(b, 2) - (4 * a * c);

        /*
         * Calculamos en función del valor del discriminante:
         * 
         * Si discriminante >= 0 entonces tiene solución
         * Si no, no tiene solución Real.
         */
        double x1 = 0;
        double x2 = 0;
        if (a == 0) {
            System.out.println("La ecuación tiene infinitas soluciones");
        } else if (discriminante > 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2*a);
            x2 = (-b - Math.sqrt(discriminante)) / (2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            x1 = -b / (2*a);
            x2 = x1;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            System.out.println("La ecuación tiene solución real doble");
        } else {
            System.out.println("La ecuación no tiene solución real");
        }

        // Cierre del Scanner
        sc.close();
    }
}
