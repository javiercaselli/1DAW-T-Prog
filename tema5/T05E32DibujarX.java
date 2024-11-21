package tema5;

import java.util.Scanner;

public class T05E32DibujarX {
    public static void main(String[] args) {
        // Declaraciones
        int altura = 0;
        int espacios = 0;
        Scanner sc = new Scanner(System.in);

        // Lee altura de teclado
        System.out.print("Introduzca altura de la X: ");
        altura = sc.nextInt();

        /*
         * Los espacios en blanco a dejar serán la altura
         */
        String parteSuperior = "";
        String parteInferior = "";

        // dividimos altura
        int alturaMitad = altura / 2;
        
        // Construimos las dos mitades
        for (int i = alturaMitad; i != 0; i--){
            String fila = "*";
            for (int j = 0; j < i; j++) {
                fila += " ";
            }
            fila += "*";

            // Añadimos la fila a las dos mitades
            parteSuperior = parteSuperior + fila + "\n";
            parteInferior = fila + "\n" + parteInferior;
        }

        String equis = parteSuperior + "*\n" + parteInferior;
        System.out.println(equis);

        sc.close();

    }
}
