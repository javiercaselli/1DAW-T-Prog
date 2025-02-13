package Tema10ColeccionesYDiccionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class T10E02ArrayListAleatorio {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();

        // Entre 10 y 20 números de forma aleatoria
        int cantidad = rand.nextInt(10, 21);
        System.out.println("Se va a generar una lista de " + cantidad + " números\n");
        for (int i = 0; i < cantidad; i++) {
            // Introducimos números del 0 al 100
            lista.add(rand.nextInt(0,101));
        }

        int suma = 0;
        double media = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        System.out.println("IMPRIME LISTA GENERADA:\n");
        for (Integer numero : lista) {
            System.out.println(numero);
            suma += numero;
            media += numero;
            max = (max < numero) ? numero : max;
            min = (min > numero) ? numero : min;
        }

        // Terminamos de calcular la media
        media /= lista.size();

        System.out.println();
        System.out.println("Suma = " + suma);
        System.out.println("Media = " + media);
        System.out.println("Máximo = " + max);
        System.out.println("Mínimo = " + min);
    }
}
