package tema05;

import java.util.Scanner;

public class T05E23DigitosPresentesEnNumeroLibString {
    public static void main(String[] args) {
        // Declaraciones
        int numero = 0;
        int digito = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        // Lee de teclado el número:
        while (numero == 0) {
            try {
                System.out.print("Introduzca un número entero: ");
                numero = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR: Se debe introducir un número entero");
                sc.nextLine();
            }
        }

        // Lee de teclado el dígito
        while (digito/10 != 0) {
            try {
                System.out.print("Introduzca un dígito: ");
                digito = sc.nextInt();
                if (digito/10 != 0) {
                    System.out.println("ERROR: Se debe introducir un dígito (una sola cifra)");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Se debe introducir un número entero");
                sc.nextLine();
            }
        }

        // Convertimos la entrada numérica a cadenas de texto
        String sNumero = Integer.toString(Math.abs(numero));
        String sDigito = Integer.toString(digito);

        // Comprobamos coincidencia a través de la cadena sNumero
        String posicionesCoincidentes = "";
        for (int i = 0; i < sNumero.length(); i++) {
            if (sDigito.charAt(0) == sNumero.charAt(i)) {
                posicionesCoincidentes += (i+1) + " ";
            }
        }

        System.out.println("Contando de izquierda a derecha, el " + sDigito + " aparece dentro " +
                "de " + sNumero + " en las siguientes posiciones: " + posicionesCoincidentes);

        sc.close();
    }

}
