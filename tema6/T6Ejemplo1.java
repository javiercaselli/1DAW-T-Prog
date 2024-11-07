package tema6;

import java.util.Random;

public class T6Ejemplo1 {
    public static void main(String[] args) {
        // Números entre [0, 1) con decimales
        for (int i = 1; i < 11; i++) { System.out.println(Math.random()); }

        // Números entre [0, 10) con decimales
        for (int i = 1; i < 11; i++) { System.out.println(Math.random() * 10); }

        // Números entre [0, 10) enteros
        for (int i = 1; i < 11; i++) { System.out.println((int) (Math.random() * 10)); }

        // Números entre [1, 10] enteros
        for (int i = 1; i < 11; i++) { System.out.println((int) (Math.random() * 10) + 1); }

        /*
         * Supongamos que necesitamos el intervalo [3, 7)
         * 
         * Lo haremos paso a paso, partiendo del intervalo [0,1) hasta
         * alcanzar nuestro objetivo
         */
        // Paso 1: [0,1)
        System.out.println(Math.random());

        // Paso 2: [0, 4)
        System.out.println(Math.random() * 4);

        // Paso 3: [3, 7)
        System.out.println((Math.random() * 4) + 3);

        // Paso adicional 1: [3, 6] números enteros
        System.out.println((int) ((Math.random() * 4) + 3));

        // Paso adicional 2: [3, 7] números enteros
        System.out.println((int) ((Math.random() * 5) + 3));

        /*
         * Caso práctico: dado
         * 
         * Para simular el lanzamiento de un dado, necesitamos obtener
         * un número aleatorio en el intervalo [1, 6]
         */
        final int CARAS_DADO = 6;
        final int CARAS_DADO_ROL = 12;
        System.out.println("Lanzamiento de dado: " + (int) (Math.random() * CARAS_DADO + 1));
        System.out.println("Lanzamiento de dado 12 caras: " + (int) (Math.random() * CARAS_DADO_ROL + 1));

        /*
         * ALTERNATIVA: Clase Random
         */
        Random rand = new Random();
        // Dado de 12 caras
        System.out.println("Lanzamiento de dado con clase Random: " + (rand.nextInt(CARAS_DADO_ROL) + 1));

        // Intervalo entero [3, 7]
        System.out.println("Intervalo [3, 7] con clase Random: " + (rand.nextInt(5) + 3));

    }
}
