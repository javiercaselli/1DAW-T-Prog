package tema05;

import java.util.Scanner;

public class T05E12PotenciasConsecutivas {
    public static void main(String[] args) {
        // Declaraciones
        int base = 0;
        int exponenteMax = 0;
        int potencia = 1;
        Scanner sc = new Scanner(System.in);

        // Leemos base y exponente de teclado:
        System.out.print("Introduzca base: ");
        base = sc.nextInt();
        System.out.print("Introduzca exponente: ");
        exponenteMax = sc.nextInt();

        for (int exponente = 0; exponente <= exponenteMax; exponente++) {
            // calculamos la potencia
            for (int i = 1; i <= exponente; i++) {
                potencia *= base;
            }
            System.out.println(base + "^" + exponente + "=" + potencia);
            potencia = 1;
        }

        // Cerramos scanner
        sc.close();;
        
    }

}
