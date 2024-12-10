package tema8Funciones;

import java.util.Scanner;

import tema8Funciones.libreriaEj01.Matematicas;

public class MainEj01 {
    /**
     * Programa principal para probar la librería
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 15) {
            System.err.println("Introduzca una opción:");
            System.out.println("    1. Capicúa");
            System.out.println("    2. Primos");
            System.out.println("    3. Siguiente primo");
            System.out.println("    4. Potencia");
            System.out.println("    5. Dígitos");
            System.out.println("    6. Voltea");
            System.out.println("    7. DigitoN");
            System.out.println("    15. Salir");
            System.out.print("    Introduzca opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca número: ");
                    int numero = sc.nextInt();
                    if (Matematicas.esCapicua(numero)) {
                        System.out.println("El numero " + numero + " es capicúa");
                    } else {
                        System.out.println("El numero " + numero + " NO es capicúa");
                    }
                    break;

                case 2:
                    System.out.print("Introduzca número: ");
                    numero = sc.nextInt();
                    if (Matematicas.esPrimo(numero)) {
                        System.out.println("El numero " + numero + " es primo");
                    } else {
                        System.out.println("El numero " + numero + " NO es primo");
                    }
                    break;

                case 3:
                    System.out.print("Introduzca número: ");
                    numero = sc.nextInt();
                    System.out.printf("El siguiente número primo a %d es %d\n", numero, Matematicas.siguientePrimo(numero));
                    break;

                case 4:
                    System.out.print("Introduzca base: ");
                    int base = sc.nextInt();
                    System.out.print("Introduzca exponente: ");
                    int exp = sc.nextInt();
                    System.out.printf("La potencia de base %d y exponente %d es %d\n", base, exp, Matematicas.potencia(base, exp));
                    break;

                case 5:
                    System.out.print("Introduzca número: ");
                    numero = sc.nextInt();
                    System.out.printf("El número %d tiene %d dígitos\n", numero, Matematicas.cuentaDigitos(numero));
                    break;

                case 6:
                    System.out.print("Introduzca número: ");
                    numero = sc.nextInt();
                    System.out.printf("El número %d invertido es %d\n", numero, Matematicas.invertirEntero(numero));
                    break;

                case 7:
                    System.out.print("Introduzca número: ");
                    numero = sc.nextInt();
                    System.out.print("Introduzca posición: ");
                    int posicion = sc.nextInt();
                    System.out.printf("El digito de la posición %d en el número %d es %d\n", posicion, numero, Matematicas.digitoN(numero, posicion));
                    break;

                default:
                    break;
            }
            System.out.println("");

        }

        sc.close();
    }

}
