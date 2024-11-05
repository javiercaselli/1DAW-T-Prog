package tema5;

import java.util.Scanner;

public class T4Ejemplo3 {
    public static void main(String[] args) {
        // Introduce la edad del usuario por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        for (int cumples = 1; cumples <= edad; cumples++) {
            System.out.printf("%d ", cumples);
        }

        sc.close();
    }
}
