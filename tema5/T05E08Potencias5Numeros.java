package tema5;

import java.util.Scanner;

public class T05E08Potencias5Numeros {
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        try {
            // Lee número de teclado
            System.out.print("Introduzca un número: ");
            numero = sc.nextInt();

            // Pinta cabecera tabla
            System.out.println("   n   |   n2   |   n3");
            System.out.println("---------------------------");

            // Calcula y pinta las potencias de los 5 siguientes números al introducido
            for (int i = 1; i <= 5; i++) {
                System.out.printf("  %-5d|   %-5d|   %-5d\n", numero, numero*numero, (int) Math.pow(numero, 3));
                numero++;
            }

        } catch (Exception e) {
            System.out.println("ERROR: Se debe introducir un valor numérico");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
