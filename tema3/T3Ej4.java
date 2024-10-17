package tema3;

import java.util.Locale;
import java.util.Scanner;

public class T3Ej4 {
    public static void main(String[] args) {
        // Definimos Locale
        Locale.setDefault(Locale.ENGLISH);
        // Bienvenida
        System.out.println("Este programa realiza las 4 operaciones básicas de dos números decimales.");

        // Abrimos Scanner
        Scanner sc = new Scanner(System.in);

        // Lee el primer número
        System.out.print("Por favor, introduzca el primer número: ");
        // Lee el número
        double num1 = sc.nextDouble();

        // Lee el segundo número
        System.out.print("Introduzca el segundo número: ");
        // Lee el número
        double num2 = sc.nextDouble();

        // Almacenamos cada resultado en una variable
        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;
        double cociente = num1 / num2;

        // Generamos salida por pantalla
        System.out.println("x = " + num1);
        System.out.println("y = " + num2);
        System.out.println("x + y = " + suma);
        System.out.println("x - y = " + resta);
        System.out.println("x / y = " + cociente);
        System.out.println("x * y = " + producto);

        // Ceramos Scanner
        sc.close();

    }
}
