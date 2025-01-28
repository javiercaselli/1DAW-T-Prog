package tema09POO.ej14y15Domino;

import java.util.Random;

public class MainEj15 {
    public static void main(String[] args) throws Exception {
        FichaDomino[] fichas = new FichaDomino[8];
        Random rand = new Random();

        FichaDomino ficha;
        for (int i = 0; i < fichas.length; i++) {
            int lado1 = rand.nextInt(7);
            int lado2 = rand.nextInt(7);
            FichaDomino fichaActual = new FichaDomino(lado1, lado2);
            if (i == 0) {
                fichas[i] =fichaActual;
            } else {
                while (!fichaActual.encaja(fichas[i-1])) {
                    lado1 = rand.nextInt(7);
                    lado2 = rand.nextInt(7);
                    fichaActual = new FichaDomino(lado1, lado2);
                }
                fichas[i] =fichaActual;;
            }
            System.out.print(fichaActual);
        }
    }
}
