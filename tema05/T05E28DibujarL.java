package tema05;

import java.util.Scanner;

public class T05E28DibujarL {
    public static void main(String[] args) {
        // Declaraciones
        int altura = 0;
        Scanner sc = new Scanner(System.in);

        // Lee altura de teclado
        System.out.print("Introduzca altura de la L: ");
        altura = sc.nextInt();

        // Longitud palo horizontal
        int longPaloHorizontal = (altura / 2) + 1;

        // Creamos palo horizontal
        String sPaloHorizontal = "";
        for (int i = 0; i < longPaloHorizontal; i++) {
            sPaloHorizontal += "* ";
        }

        // Pintamos el palo vertical
        for (int i = 0; i < altura - 1; i++) {
            System.out.println("*");
        }

        // Pintamos el palo horizonal
        System.out.println(sPaloHorizontal);

        // Cerramos Scanner
        sc.close();

    }
}
