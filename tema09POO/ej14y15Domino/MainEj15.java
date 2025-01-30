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

    private static boolean validaFichas(FichaDomino ficha1, FichaDomino ficha2) throws Exception {
        // Valor de retorno
        boolean validas = false;

        if (ficha1.encaja(ficha2))  {
            if (ficha1.getLado2() == ficha2.getLado2()) {
                ficha2.voltea();
                validas = true;
            } else if (ficha1.getLado2() == ficha2.getLado1()) {
                validas = true;
            }
        }

        return validas;
    }
}
