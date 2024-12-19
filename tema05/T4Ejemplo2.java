package tema05;

import java.util.Scanner;

public class T4Ejemplo2 {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Lee de teclado hasta que el número sea negativo
        int contador = 0;
        int suma = 0;
        int numero = 1;
        do {
            numero = sc.nextInt();
            if (numero !=0) contador++;
            suma = suma + numero;
        } while (numero != 0);

        System.out.println("Se han introducido " + contador + " números en total y " + 
        "la suma de todos ellos es " + suma + ".");

        // Cerrar scanner
        sc.close();
    }
}
