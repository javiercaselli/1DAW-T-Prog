package examenT1T3;

import java.util.Scanner;

public class ExamenT1T3Ejercicio5Alternativa {
    public static void main(String[] args) {
        // Constantes
        final int MINUTOS_POR_HORA = 60;
        final int SEGUNDOS_POR_MINUTO = 60;

        // Título del programa
        System.out.println("\033[1mCALCULADORA DE TIEMPO\033[0m");
        System.out.println("=====================");

        // Entrada por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cantidad de segundos: ");
        int sInput = sc.nextInt();

        // Fase 1 - horas
        int horas = sInput / 3600; // 3600 segundos cada hora

        // minutos
        int minutos = (sInput - horas * 3600) / 60;

        // segundos
        int segundos = sInput - (horas*3600 + minutos*60);


        // Salida por pantalla
        System.out.printf("%d segundos son \033[1m\033[48;5;11m%d horas\033[0m, " + 
                            "\033[1m\033[48;5;1m%d minutos\033[0m y \033[1m\033[48;5;2m%d segundos.\033[0m\n",
                        sInput, horas, minutos, segundos);
        // Cerramos Scanner
        sc.close();

    }
}
