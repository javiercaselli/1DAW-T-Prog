package Tema10ColeccionesYDiccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T10E06HashMapAreaRestringida {
    public static void main(String[] args) {
        final int INTENTOS = 3;

        Map<String, String> directorioActivo = new HashMap<>();
        directorioActivo.put("admin", "password123");
        directorioActivo.put("andared", "latarara");

        Scanner sc = new Scanner(System.in);

        boolean validado = false;
        int i = 0;

        // Pedimos credenciales por teclado
        while (!validado && i < INTENTOS) {
            System.out.print("Introduzca usuario para el área restringida: ");
            String user = sc.nextLine();
            System.out.print("Introduzca contraseña para el área restringida: ");
            String pass = sc.nextLine();

            validado = pass.equals(directorioActivo.get(user));

            i++;
        }

        // Mensaje de salida en función del resultadode la validación
        System.out.println();
        System.out.println((validado) ? "Ha accedido al área restringida" : "Lo siento, no tiene acceso al área restringida");
    }
}
