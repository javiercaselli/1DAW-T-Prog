package tema04;
import java.util.Scanner;

public class T4NumeroEnRango {
    public static void main(String[] args) {
        // Establecemos el rango
        final int LIM_INF = 0;      // Límite inferior
        final int LIM_SUP = 100;    // Límite superior

        // Recogemos un número entero por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int num = sc.nextInt();

        // Comprueba que esté dentro del rango
        if ((num > LIM_INF) && (num < LIM_SUP)) {
            System.out.println("El número está dentro del rango entre " + LIM_INF + " y " + LIM_SUP);
        } else {
            System.out.println("El número está fuera del rango entre " + LIM_INF + " y " + LIM_SUP);

        }

        // Comprueba que esté dentro del rango
        if (!(!(num > LIM_INF) || !(num < LIM_SUP))) {
            System.out.println("El número está dentro del rango entre " + LIM_INF + " y " + LIM_SUP);
        } else {
            System.out.println("El número está fuera del rango entre " + LIM_INF + " y " + LIM_SUP);

        }

        // Cierra el Scanner
        sc.close();
    }
}
