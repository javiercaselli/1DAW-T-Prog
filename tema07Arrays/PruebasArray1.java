package tema07Arrays;

import java.util.Scanner;

public class PruebasArray1 {
    public static void main(String[] args) {
        // Array de enteros de 4 posiciones
        int[] numeros = {6, 345, -67, 0, 7678, 2354, -7, 4235};
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        Scanner sc = new Scanner(System.in);
        int indice;

        /*

        // Inicializo
        numeros = new int[4];

        numeros[0] = 6;
        numeros[1] = 345;
        numeros[2] = -67;
        numeros[3] = 0;
        */

        System.out.println(numeros[2] + "\n");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println(numeros[0] + numeros[2]);

        System.out.print("Introduzca índice entre el 0 y el " + (numeros.length - 1) + ": ");
        indice = sc.nextInt();

        System.out.println(numeros[indice]);
    }



}