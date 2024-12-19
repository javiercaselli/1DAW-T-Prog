package tema05;

import java.util.Scanner;

public class T05E07MediaAritmetica {
    public static void main(String[] args) {
        // Declaraciones
        int numero = 0;
        int valor = 0;
        float contador = 0;
        Scanner sc = new Scanner(System.in);

        // Menu
        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números:");
        while (numero >= 0) {
            try {
                numero = sc.nextInt();
                if (numero >= 0) {
                    valor += numero;
                    contador++;    
                }
            } catch (Exception e) {
                System.out.println("ERROR: Sólo se permiten valores numéricos. Inténtelo de nuevo.");
                sc.nextLine();
            }
        }
        
        // Calculo la media
        float media = valor / contador;
        System.out.println("La media de los números introducidos es " + media);

        // Cerramos Scanner
        sc.close();
    }
}
