package tema04;

import java.util.Scanner;

/**
 * UD 04 - Ejercicio 13.
 * 
 * Pinta una pirámide de base 5 y altura 3, usando el carácter
 * que se le pasa por teclado. El programa permite al usuario
 * elegir la orientación de la pirámide (arriba, abajo, izquierda
 * y derecha) a través de un menú.
 * 
 * Como variante sobre el enunciado, vamos a controlar los errores y
 * vamos a hacer que el menú se repita tantas veces sea necesario, 
 * hasta que el usuario escoja la opción de salir del programa.
 */
public class T4E13PiramidesConMenu {
    public static void main(String[] args) {
        // Declaraciones
        int orientacion = 0;
        String caracter = "";
        Scanner sc = new Scanner(System.in);

        // Pintar el menú
        do {
            try {
                System.out.println("Este programa pinta una pirámide.");
                
                // Carácter de relleno (Controlamos que sea de longitud 1)
                while (caracter.length() != 1) {
                    System.out.print("Introduzca el carácter de relleno: ");
                    caracter = sc.nextLine();
                    if (caracter.length() != 1) System.out.println("ERROR: El carácter tiene que ser de longitud 1\n");
                }

                // Orientación
                System.out.println("Elija el tipo de pirámide:6");
                System.out.println("1. Con el vértice hacia arriba");
                System.out.println("2. Con el vértice hacia abajo");
                System.out.println("3. Con el vértice hacia derecha");
                System.out.println("4. Con el vértice hacia izquierda");
                System.out.println("5. Salir");
                System.out.print("Introduzca opción: ");
                orientacion = sc.nextInt();

                switch (orientacion) {
                    case 1:
                        System.out.println("  " + caracter);
                        System.out.println(" " + caracter + caracter + caracter);
                        System.out.println(caracter + caracter + caracter + caracter + caracter);
                        break;
                    case 2:
                        System.out.println(caracter + caracter + caracter + caracter + caracter);
                        System.out.println(" " + caracter + caracter + caracter);
                        System.out.println("  " + caracter);
                        break;
                    case 3:
                        System.out.println(caracter);
                        System.out.println(caracter + caracter);
                        System.out.println(caracter + caracter + caracter);
                        System.out.println(caracter + caracter);
                        System.out.println(caracter);
                        break;
                    case 4:
                        System.out.println("  " + caracter);
                        System.out.println(" " + caracter + caracter);
                        System.out.println(caracter + caracter + caracter);
                        System.out.println(" " + caracter + caracter);
                        System.out.println("  " + caracter);
                        break;
                case 5:
                        System.out.println("Gracias por usar el programa, hasta pronto.");
                        break;
                    default:
                        System.out.println("ERROR: La opción debe ser un número del 1 al 5\n");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La opción debe ser un número del 1 al 5\n");
            } finally {
                // Purga el Scanner para la siguiente lectura
                sc.nextLine();
            }
        } while (orientacion != 5);
        sc.close();
    }
}
