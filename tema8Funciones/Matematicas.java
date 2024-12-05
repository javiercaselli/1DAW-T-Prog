package tema8Funciones;

import java.util.Scanner;

public class Matematicas {
    /**
     * Método que devuelve el inverso del número que se le pasa como parámetro
     * 
     * @param numero
     * @return
     */
    public static void invertirEnteroConCerosIzquirda (int numero) {
        // Declaraciones
        int numeroInvertido = 0;
        int longitud = 0;

        while (numero != 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;

            // Añadir el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;

            // Eliminar el último número del número original
            numero /= 10;

            longitud++;
        }

        int ceros = 0;
        while (numeroInvertido / (int) Math.pow(10, longitud - 1) == 0) {
            longitud--;
            ceros++;
        }

        while (ceros > 0) {
            System.out.print("0");
            ceros--;
        }
        System.out.println(numeroInvertido);
    }

    /**
     * Método que devuelve el inverso del número que se le pasa como parámetro
     * 
     * @param numero
     * @return
     */
    public static int invertirEntero (int numero) {
        // Declaraciones
        int numeroInvertido = 0;

        while (numero != 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;

            // Añadir el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;

            // Eliminar el último número del número original
            numero /= 10;
        }

        // Devuelve el número invertido
        return numeroInvertido;
    }

    /**
     * Función que devuelve si el número entero que se le pasa como parámetro es capicúa.
     * 
     * @param numero
     * @return
     */
    public static boolean esCapicua (int numero) {
        return (numero == invertirEntero(numero)); 
    }

    /**
     * Función que comprueba si el número entero que se le pasa como parámetro es primo
     * @param numero
     * @return
     */
    public static boolean esPrimo (int numero) {


        return false;
    }









    /**********************************************************************************************************/

    /**
     * Programa principal para probar la librería
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 15) {
            System.out.println("1. Capicúa");
            System.out.println("15. Salir");
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca número: ");
                    int numero = sc.nextInt();
                    if (esCapicua(numero)) {
                        System.out.println("El numero " + numero + " es capicúa");
                    } else {
                        System.out.println("El numero " + numero +  " NO es capicúa");
                    }
                    break;
            
                default:
                    break;
            }
            System.err.println("");

        }

        sc.close();
    }


}
