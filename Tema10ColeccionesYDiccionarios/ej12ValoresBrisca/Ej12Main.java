package Tema10ColeccionesYDiccionarios.ej12ValoresBrisca;

import java.util.*;

public class Ej12Main {
    public static void main(String[] args) {
        int codigo = 0;
        List<Carta> baraja = new ArrayList<>(); // Baraja
        Map<Carta, Integer> diccionarioValores = new HashMap<>();   // Diccionario valores juego de la Brisca
        String palo = "";
        String nombreCarta = "";
        Random rand = new Random();

        // Genera baraja y la introduce en el ArrayList
        // Genera diccionario y lo intruduce en el Hashmap
        for (int i = 0; i < 40; i++) {
            // Generamos la carta
            if (i % 10 == 0) {
                nombreCarta = "As";
            } else if (i % 10  == 7) {
                nombreCarta = "Sota";
            } else if (i % 10  == 8) {
                nombreCarta = "Caballo";
            } else if (i % 10  == 9) {
                nombreCarta = "Rey";
            } else {
                nombreCarta = "" + ((i % 10) + 1);
            }
            codigo = i;

            // Generamos el palo
            switch (i) {
                case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> palo = "Oros";
                case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 -> palo = "Copas";
                case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 -> palo = "Espadas";
                case 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 -> palo = "Bastos";
            }

            // Construimos la carta y la incluimos en la baraja
            Carta carta = new Carta(codigo, palo, nombreCarta);
            baraja.add(carta);

            // En el diccionario solo metemos la carta si tiene valor (as, tres y figuras)
            switch (carta.getNombreCarta()) {
                case "As" -> diccionarioValores.put(carta, 11);
                case "3" -> diccionarioValores.put(carta, 10);
                case "Sota" -> diccionarioValores.put(carta, 2);
                case "Caballo" -> diccionarioValores.put(carta, 3);
                case "Rey" -> diccionarioValores.put(carta, 4);
            }

        }

        // Saca 5 cartas de la baraja y suma sus valores
        Integer suma = 0;
        for (int i = 0; i < 5; i++) {
            Carta carta = baraja.remove(rand.nextInt(0, baraja.size()));
            int valor = (diccionarioValores.containsKey(carta)) ? diccionarioValores.get(carta) : 0;
            suma += valor;
            System.out.println(carta);
        }
        System.out.println("\nTienes " + suma + " puntos.");

    }
}
