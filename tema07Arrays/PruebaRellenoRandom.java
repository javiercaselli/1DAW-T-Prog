package tema07Arrays;

import java.util.Random;

public class PruebaRellenoRandom {
    public static void main(String[] args) {
        int[] lista = new int[500];
        Random rand = new Random();

        int[] array9 = new int[9];
        String[][] tresEnRaya = new String[3][3];

        tresEnRaya[0][0] = "O";
        tresEnRaya[2][2] = "X";
        
        for(int i=0; i<lista.length; i++) {
            lista[i] = rand.nextInt();
        }

        for(int i=0; i<lista.length; i++) {
            System.out.println(lista[i]);
        }

    }
}
