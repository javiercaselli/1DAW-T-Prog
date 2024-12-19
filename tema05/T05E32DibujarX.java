package tema05;

import java.util.Scanner;

public class T05E32DibujarX {
    public static void main(String[] args) {
        // Declaraciones
        int altura = 0;
        Scanner sc = new Scanner(System.in);

        // Lee altura de teclado
        while (altura <= 0 && (altura % 2 == 0)) {
            try {
                System.out.print("Introduzca altura de la X: ");
                altura = sc.nextInt();
                if (altura <= 0 || (altura % 2 == 0)) {
                    System.out.println("ERROR: La altura debe ser un número positivo e impar.");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La altura debe ser un número positivo e impar.");
                sc.nextLine();
            }
        }

        /*
         * Los espacios en blanco a dejar serán la altura
         */
        String parteSuperior = "";
        String parteInferior = "";

        // dividimos altura
        int alturaMitad = altura / 2;
        
        // Espacios a la izquierda iniciales
        int espaciosIzquierda = 0;

        // Construimos las dos mitades
        for (int i = alturaMitad; i != 0; i--){
            String fila = "";
            // Espacios en blanco a la izquierda
            for (int j = 0; j < espaciosIzquierda; j++) {
                fila += " ";
            }
            fila += "* ";   // Deja un espacio en blanco para que la distancia entre * sea impar (1 3 5 7...)
            // Espacios en blanco a la derecha
            for (int j = 0; j < i; j++) {
                if (j != 0) fila += "  ";   // En la primera fila no se añaden más espacios
            }
            fila += "*";

            // Añadimos la fila a las dos mitades (la fila superior de mayor a menor, y la inferior de menor a mayor)
            parteSuperior = parteSuperior + fila + "\n";
            parteInferior = fila + "\n" + parteInferior;

            // Icremento los huecos a la izquierda para la siguiente iteración
            espaciosIzquierda++;
        }

        // Espacios a la izquierda para el * central
        String centroX = "";
        for (int j = 0; j < espaciosIzquierda; j++) {
            centroX += " ";
        }
        centroX += "*\n";

        String equis = parteSuperior + centroX + parteInferior;
        System.out.println(equis);

        // Cierra el Scanner
        sc.close();

    }
}
