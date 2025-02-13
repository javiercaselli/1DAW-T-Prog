package Tema10ColeccionesYDiccionarios;

import java.util.*;

public class T10E03OrdenaArrayList {
    public static void main(String[] args) {
        // Lista a ordenar
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            lista.add(rand.nextInt());
        }

        System.out.print("Lista desordenada: ");
        for (Integer numero : lista) {
            System.out.print(numero + " ");
        }

        System.out.println();

        // Ordenamos
        Collections.sort(lista);

        System.out.print("Lista ordenada: ");
        for (Integer numero : lista) {
            System.out.print(numero + " ");
        }

    }
}
