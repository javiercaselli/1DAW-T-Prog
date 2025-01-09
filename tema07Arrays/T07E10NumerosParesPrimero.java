package tema07Arrays;

import java.util.Random;

public class T07E10NumerosParesPrimero {
    public static void main(String[] args) {
        // Declaraciones
        int[] numeros = new int[20];
        Random rand = new Random();

        // Rellena con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(101);
        }

        // Imprime lista original
        System.out.println("Array original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        // Recorre el array buscando los pares para ponerlos primero
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                // Si es impar tengo que cambiarlo de sitio con el siguiente número par
                int j = i;
                boolean encontrado = false;
                while (!encontrado && (j < numeros.length)) {
                    if (numeros[j] % 2 == 0) {
                        // Intercambio numeros[i] por numeros[j]
                        int aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;
                        encontrado = true;
                    }
                    j++;
                }
            }
        }

        // Imprime lista ordenada
        System.out.println("\nArray con los pares al principio:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

    }
}
