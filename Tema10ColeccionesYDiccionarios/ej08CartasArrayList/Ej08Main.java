package Tema10ColeccionesYDiccionarios.ej08CartasArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ej08Main {
    public static void main(String[] args) {
        int codigo = 0;
        List<Carta> baraja = new ArrayList<>();
        String palo = "";
        String nombreCarta = "";
        Random rand = new Random();

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
            baraja.add(new Carta(codigo, palo, nombreCarta));
        }

        // Imprime baraja recién generada
        System.out.println("Baraja recién estrenada:");
        for (Carta carta : baraja) {
            System.out.println(carta);
        }

        // Imprime baraja barajada
        System.out.println("\n\nBaraja barajada:");
        Collections.shuffle(baraja);
        for (Carta carta : baraja) {
            System.out.println(carta);
        }

        // Imprime baraja reordenada
        System.out.println("\n\nBaraja reordenada:");
        Collections.sort(baraja);
        for (Carta carta : baraja) {
            System.out.println(carta);
        }

        // Saca 10 cartas al azar
        System.out.println("\n\n10 cartas al azar:");
        for (int i = 0; i < 10; i++) {
            System.out.println(baraja.remove(rand.nextInt(0, baraja.size())));
        }


    }
}
