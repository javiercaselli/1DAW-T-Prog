package tema07Arrays;

import java.util.Scanner;

public class T07E03ImprimirInverso {
    public static void main(String[] args) {
        // Declaraciones
        int[] lista = new int[10];
        Scanner sc = new Scanner(System.in);

        // Ecribimos en sentido natural (izquerda a derecha)
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Intruzca valor numérico entero: ");
            lista[i] = sc.nextInt();
        }

        // Leemos en sentido inverso (derecha a izquierda)
        for(int i = (lista.length - 1); i >= 0; i--) {
            System.out.println(lista[i]);
        }


        /*
        // Leo de teclado en sentido inverso
        for(int i = (lista.length - 1); i >= 0; i--) {
            System.out.print("Intruzca valor numérico entero: ");
            lista[i] = sc.nextInt();
        }

        // Imprime
        for(int valor : lista) {
            System.out.println(valor);
        }

        */
    }
}
