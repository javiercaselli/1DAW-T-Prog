package tema4;

import java.util.Scanner;

public class T4E1ConIf {
    public static void main(String[] args) {
        // Lee de teclado el día de la semana
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día de la semana: ");
        String dia = sc.nextLine();

        if (dia.equals("lunes")) {
            System.out.println("Entornos de Desarrollo");
        } else if (dia.equals("martes")) {
            System.out.println("Programación");
        } else if (dia.equals("miércoles")) {
            System.out.println("Lenguajes de Marcas");
        } else if (dia.equals("jueves")) {
            System.out.println("Programación");
        } else if (dia.equals("viernes")) {
            System.out.println("Programación");
        } else {
            System.out.println("Día de la semana incorrecto");
        }

        // Cerrar scanner
        sc.close();

    }
}
