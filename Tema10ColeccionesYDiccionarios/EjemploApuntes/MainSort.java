package Tema10ColeccionesYDiccionarios.EjemploApuntes;

import java.util.ArrayList;
import java.util.Collections;

public class MainSort {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(67);
        a.add(78);
        a.add(10);
        a.add(4);


        // mostrará por pantalla 67 78 10 4
        System.out.println("\nNúmeros en el orden original:");
        for (int numero: a) { System.out.printf("%d ", numero); }

        Collections.sort(a);

        // mostrará por pantalla 4 10 67 78
        System.out.println("\nNúmeros ordenados:");
        for (int numero: a) { System.out.printf("%d ", numero); }
    }
}
