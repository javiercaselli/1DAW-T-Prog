package tema04;

import java.util.Scanner;

public class T4OperadorTernario {
    public static void main(String[] args) {
        String edadIf = "";
        String edadTernario = "";

        // Lee la edad numérica del teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la nota numérica: ");
        int edadNumerica = sc.nextInt();

        // Con if-else
        if (edadNumerica >= 18) {
            edadIf = "El usuario es mayor de edad";
        }
        else {
            edadIf = "El usuario es menor de edad";
        }
        System.out.println(edadIf);

        // Con operador ternario
        edadTernario = (edadNumerica >= 18) ? "El usuario es mayor de edad" : 
                                                "El usuario es menor de edad";
        System.out.println(edadTernario);

        // Cerramos scanner
        sc.close();
    }
}
