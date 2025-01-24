package tema09POO.ej05Vehiculos;

import java.util.Scanner;

public class t0905Main {
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int opcion;
        int kilometros;
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();


        // Menú
        do {
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Ver cantidad de vehículos creados");
            System.out.println("9. Salir");

            // Lee opción de teclado
            System.out.print("Elige una opción (1-8): ");
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1 -> {
                    System.out.print("¿Cuantos kilómetros quiere recorrer?: ");
                    kilometros = sc.nextInt();
                    bicicleta.andar(kilometros);
                }
                case 2 -> bicicleta.hacerCaballito();
                case 3 -> {
                    System.out.print("¿Cuantos kilómetros quiere recorrer?: ");
                    kilometros = sc.nextInt();
                    coche.andar(kilometros);
                }
                case 4 -> coche.quemarRueda();
                case 5 -> System.out.println("La bici lleva " + bicicleta.kilometrosRecorridos + " kilometros");
                case 6 -> System.out.println("El coche lleva " + coche.kilometrosRecorridos + " kilometros");
                case 7 -> System.out.println("ambos vehículos llevan " + Vehiculo.kilometrosTotales + " kilometros");
                case 8 -> System.out.println("Se han creado hasta el momento " + Vehiculo.vehiculosCreados + " vehículos");
                case 9 -> System.out.println("Hasta la próxima!!");
                default -> System.out.println("Opción errónea");
            }
            System.out.println();
            System.out.println();

        } while (opcion != 9);

        // Cerrar scanner
        sc.close();
    }
}
