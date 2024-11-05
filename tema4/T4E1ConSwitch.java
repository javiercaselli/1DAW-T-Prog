package tema4;

import java.util.Scanner;

public class T4E1ConSwitch {
    public static void main(String[] args) {
        // Lee de teclado el día de la semana
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día de la semana: ");
        String dia = sc.nextLine();
        String mensaje = "";
        switch (dia) {
            case "lunes":
                mensaje = "Entornos de Desarrollo";
                break;
            case "martes", "jueves", "viernes":
                mensaje = "Programación";
                break;
            case "miércoles":
                mensaje = "Lenguajes de Marcas";
                break;
            default:
                mensaje = "Día de la semana incorrecto";
        }
        System.out.println(mensaje);


        // Cerrar scanner
        sc.close();

    }
}
