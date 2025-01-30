package tema09POO.ej20y21ArrayDeGatos;

import java.util.Scanner;

public class MainEj20 {
    public static void main(String[] args) {
        // Propiedades
        Gato[] gatos = new Gato[4];
        Scanner sc = new Scanner(System.in);
        String nombre, color, raza;

        System.out.println("Por favor introduzca los datos de los gatos:");
        int i = 0;
        do {
            System.out.println("Gato no " + (i + 1));
            System.out.print("Nombre:" );
            nombre = sc.nextLine();
            System.out.print("color:" );
            color = sc.nextLine();
            System.out.print("raza:" );
            raza = sc.nextLine();

            Gato gato = new Gato();
            gato.setNombre(nombre);
            gato.setRaza(raza);
            gato.setColor(color);

            gatos[i] = gato;
            System.out.println();
            i++;
        } while (i < 4);

        System.out.println("Estos son los gatos:");
        System.out.println("====================");
        for (Gato gato: gatos) {
            System.out.println(gato);
        }
    }
}
