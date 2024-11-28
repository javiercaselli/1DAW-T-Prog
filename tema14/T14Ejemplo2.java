package tema14;

import java.util.Scanner;

public class T14Ejemplo2 {
    public static void main(String[] args) {
        int lineas;
        int asteriscos;
        int longitud;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta varias líneas de asteriscos");

        try {
            System.out.print("Introduce el número total de asteriscos: ");
            asteriscos = Integer.parseInt(sc.nextLine());
            System.out.print("Introduce el número total de líneas: ");
            lineas = Integer.parseInt(sc.nextLine());
            if ((asteriscos % lineas) == 0) {
                longitud = asteriscos / lineas;
            } else {
                longitud = (int) Math.ceil((double) asteriscos /
                        (double) lineas);

            }
        } catch (NumberFormatException nfe) {
            System.out.println("Se deben introducir valores de tipo entero.");
        } catch (ArithmeticException ae) {
            System.out.println("El número de líneas no puede ser cero.");
            ae.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error desconocido, contacte con el administrador.");
            e.printStackTrace();
        } finally {
            System.out.println("Adios");
        }

        // Cierra el Scanner
        sc.close();
    }
}
