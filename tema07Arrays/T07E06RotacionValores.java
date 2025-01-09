package tema07Arrays;

import java.util.Random;

public class T07E06RotacionValores {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        

        Random rand = new Random();

        // Rellena con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(501);
        }

        System.out.println("original│");
        System.out.println("────────┼");

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%8d│\n", numeros[i]);
        }

        // Rotamos el array
        int anterior = 0;
        int aux2;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                anterior = numeros[i];
                numeros[i] = numeros[numeros.length-1];
            } else {
                aux2 = anterior;
                anterior = numeros[i];
                numeros[i] = aux2; 
            }
        }

        System.out.println("\n Rotado");
        System.out.println("────────┼");

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%8d│\n", numeros[i]);
        }





    }
}
