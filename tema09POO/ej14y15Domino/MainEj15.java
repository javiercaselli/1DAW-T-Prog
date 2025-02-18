package tema09POO.ej14y15Domino;

import java.util.Random;

public class MainEj15 {
    public static void main(String[] args) throws Exception {
        FichaDomino[] fichas = new FichaDomino[8];
        Random rand = new Random();

        FichaDomino ficha;
        for (int i = 0; i < fichas.length; i++) {
            FichaDomino fichaActual;
            do {
                // Genero ficha aleatoria (la primera siempre se pone del tirón)
                int lado1 = rand.nextInt(7);
                int lado2 = rand.nextInt(7);
                fichaActual = new FichaDomino(lado1, lado2);
            } while (i > 0 && !validaFichas(fichas[i-1], fichaActual));

            fichas[i] = fichaActual;;
            System.out.print(fichaActual);
        }
    }

    /**
     * Método privado para validación de fichas. La ficha1 nunca se toca (ya debería estar conectada a una anterior)
     * y la ficha dos se intentará voltear para que encaje del lado correcto, si no es así, se descartará (devolverá
     * falso).
     *
     * @param ficha1
     * @param ficha2
     * @return true si la ficha 2 encaja con la ficha 1, ya sea directamente o volteando sólo la ficha 2.
     * @throws Exception en caso de error.
     */
    private static boolean validaFichas(FichaDomino ficha1, FichaDomino ficha2) throws Exception {
        // Valor de retorno
        boolean validas = false;

        if (ficha1.encaja(ficha2))  {                               // Comprueba si encajan tal como se define en la clase FichaDomino
            if (ficha1.getLado2() == ficha2.getLado2()) {
                ficha2.voltea();                                    // Si el lado 2 de la ficha 1 encaja con el lado 2 de la ficha 2, se voltea la ficha 2
                validas = true;
            } else if (ficha1.getLado2() == ficha2.getLado1()) {
                validas = true;                                     // Si el lado 2 de la ficha 1 encaja con el lado 1 de la ficha 2, no hay que hacer nada.
            }
        }   // Falso en cualquier otro caso.

        return validas;
    }
}
