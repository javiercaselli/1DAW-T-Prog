package Tema10ColeccionesYDiccionarios.EjemploApuntes;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet1 {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<Integer>();

        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);

        conjunto2.add(2);
        conjunto2.add(3);
        conjunto2.add(4);

        // Realizar la intersección de conjuntos
        conjunto1.retainAll(conjunto2);

        // Imprimir el resultado
        System.out.println("Intersección de conjuntos:");
        for (Integer elemento : conjunto1) { System.out.println(elemento); }
    }
}
