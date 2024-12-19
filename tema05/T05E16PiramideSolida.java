package tema05;

import java.util.Scanner;

public class T05E16PiramideSolida {
    public static void main(String[] args) {
        // Declaraciones
        String relleno = "";
        int altura = 0;
        Scanner sc = new Scanner(System.in);

        // Entrada po teclado de la altura
        while (altura <= 0) {
            try {
                System.out.print("Introduzca altura de la pirámide: ");
                altura = sc.nextInt();
                if (altura <= 0) {
                    System.out.println("ERROR: La altura debe ser un entero positivo");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La altura debe ser un entero positivo");
            } finally {
                sc.nextLine();
            }
        }

        // Entrada por teclado del carácter de relleno
        while (relleno.length() != 1) {
            System.out.print("Introduzca el carácter de relleno: ");
            relleno = sc.nextLine();
            if (relleno.length() != 1) {
                System.out.println("ERROR: El carácter de relleno debe ser de longitud 1");
            }
        }

        // Cerrar Scanner
        sc.close();

        // Pintar la pirámide
        int base = 2 * altura - 1;
        int espaciosBlanco = base / 2;
        String fila = relleno;
        for (int i = 1; i <= altura; i++) {
            for (int blancos = 1; blancos <= espaciosBlanco; blancos++) {
                System.out.print(" ");
            }
            System.out.println(fila);           // Imprime la fila actual
            espaciosBlanco -= 1;                // Resta un espacio en blanco a la izquierda
            fila = fila + relleno + relleno;    // Añade dos caracteres de relleno.
        }

    }
}
