package tema3;

import java.util.Scanner;

public class T3Ej1 {
    public static void main(String[] args) {
        // Bienvenida
        System.out.println("Este programa multiplica dos números enteros.");

        // Abrimos Scanner
        Scanner sc = new Scanner(System.in);

        // Lee el primer número
        System.out.print("Por favor, introduzca el primer número: ");
        // Lee el número
        int num1 = sc.nextInt();

        // Lee el segundo número
        System.out.print("Introduzca el segundo número: ");
        // Lee el número
        int num2 = sc.nextInt();

        // Imprime resultado
        System.out.println(num1 + " * " + num2 + " = " + num1*num2);

        // Ceramos Scanner
        sc.close();
    }
}
