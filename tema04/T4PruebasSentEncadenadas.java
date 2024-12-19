package tema04;

import java.util.Scanner;

public class T4PruebasSentEncadenadas {
    public static void main(String[] args) {
        // Lee la nota numérica del teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la nota numérica: ");
        int nota = sc.nextInt();

        // Sentencias de selección encadenas para sacar nota escrita
        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota == 5) {
            System.out.println("Aprobado");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota inválida");
        }

        // Cierra el scanner
        sc.close();;
    }
}
