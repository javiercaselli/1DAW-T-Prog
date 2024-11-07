package tema14;

import java.util.Scanner;

public class T14Ejemplo1 {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        while (!correcto) {
            try {
                System.out.print("Introduzca el primer número: ");
                numero1 = Double.parseDouble(sc.nextLine());
                System.out.print("Introduzca el segundo número: ");
                numero2 = Double.parseDouble(sc.nextLine());
                System.out.println("La media es " + (numero1 + numero2) / 2);
                correcto = true;
    
            } catch (Exception e) {
                System.out.println("No se puede calcular la media.");
                System.out.println("Los datos introducidos no son correctos.");
            } finally {
                System.out.println("Gracias por utilizar este programa.") ;
            }
        }
        // Cerramos el scanner  
        sc.close();
    }
}
