package tema05;

import java.util.Scanner;

public class T05E04CajaFuerte {
    public static void main(String[] args) {
        // Declaraciones
        final int OPORTUNIDADES = 4;
        int contador = 1;
        String combinacion = "0000";
        boolean acierto = false;
        Scanner sc = new Scanner(System.in);

        /*
         * Este switch rellena de ceros a la izquierda la combinación si esta 
         * es un número menor que 1000 (menos de 4 dígitos)
         */
        switch (combinacion.length()) { // Hace el switch sobre la longitud del String
            case 1:
                combinacion = "000" + combinacion;
                break;
            case 2:
                combinacion = "00" + combinacion;
                break;
            case 3:
                combinacion = "0" + combinacion;
                break;
        }

        while (!acierto && contador <= OPORTUNIDADES) {
            System.out.print("Introduce la clave de la caja fuerte: ");
            String intento = sc.nextLine();

            // Comrprueba
            if (intento.equals(combinacion)) {
                acierto = true;
                System.out.println("\033[1mSe ha abierto la caja fuerte\033[0m");
            } else {
                System.out.println("Clave incorrecta");
            }
            // Incrementa contador
            contador++;
        }

        if (!acierto) {
            System.out.println("Lo siento, ha agotado las 4 oportunidades.\r\n" + //
                                "Se ha emitido un aviso a la policía.");
        }

        sc.close();
    }
}
