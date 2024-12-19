package tema05;

import java.util.Scanner;

public class T05E11Potencias {
    public static void main(String[] args) {
        // Declaraciones
        int base = 0;
        int exponente = 0;
        int potencia = 1;
        Scanner sc = new Scanner(System.in);

        // Leemos base y exponente de teclado:
        System.out.print("Introduzca base: ");
        base = sc.nextInt();
        System.out.print("Introduzca exponente: ");
        exponente = sc.nextInt();

        // calculamos la potencia
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }

        System.out.println("La potencia base " + base + " y exponente " + exponente + " es " + potencia);

        // Cerramos scanner
        sc.close();;
        
    }
}
