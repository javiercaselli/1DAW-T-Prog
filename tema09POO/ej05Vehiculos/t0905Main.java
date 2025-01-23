package tema09POO.ej05Vehiculos;

import java.util.Scanner;

public class t0905Main {
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int opcion;
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
            System.out.println("8. Salir");

            // Lee opción de teclado
            System.out.print("Elige una opción (1-8): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuantos kilómetros quiere recorrer?: ");
                    int kilometros = sc.nextInt();
                    bicicleta.kilometrosRecorridos = bicicleta.kilometrosRecorridos + kilometros;
                    break;
                case 2:
                    bicicleta.hacerCaballito();
                    break;
                case 3:
                    System.out.print("¿Cuantos kilómetros quiere recorrer?: ");
                    kilometros = sc.nextInt();
                    coche.kilometrosRecorridos = coche.kilometrosRecorridos + kilometros;
                    break;
                case 4:
                    coche.quemarRueda();
                    break;
                case 5:
                    System.out.println("La bici lleva + " + bicicleta.kilometrosRecorridos + " kilometros");
                    break;
                case 6:
                    System.out.println("El coche lleva + " + coche.kilometrosRecorridos + " kilometros");
                    break;
                case 7:
                    System.out.println("ambos vehículos llevan " + Vehiculo.kilometrosTotales + " kilometros");
                    break;
                default:
                    System.out.println("Opción errónea");
                    break;
            }

        } while (opcion != 8);

        // Cerrar scanner
        sc.close();
    }
}
