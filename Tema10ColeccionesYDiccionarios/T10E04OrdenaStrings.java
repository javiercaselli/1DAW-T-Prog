package Tema10ColeccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class T10E04OrdenaStrings {
    public static void main(String[] args) {
        // Lista a ordenar
        List<String> lista = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = 10;
            Random random = new Random();
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int j = 0; j < targetStringLength; j++) {
                int randomLimitedInt = leftLimit + (int)
                        (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            String generatedString = buffer.toString();

            System.out.println(generatedString);
            lista.add(generatedString);
        }

        System.out.print("Lista desordenada: ");
        for (String cadena : lista) {
            System.out.print(cadena + " ");
        }

        System.out.println();

        // Ordenamos
        Collections.sort(lista);

        System.out.print("Lista ordenada: ");
        for (String cadena : lista) {
            System.out.print(cadena + " ");
        }

    }
}
