package Tema10ColeccionesYDiccionarios.gestisimalConArrayList;

import Tema10ColeccionesYDiccionarios.ej05TiendaDiscos.Disco;
import Tema10ColeccionesYDiccionarios.ej05TiendaDiscos.TiendaDiscos;

import java.util.List;
import java.util.Scanner;

public class MainEj13Gestisimal {
    public static void main(String[] args) throws Exception {
        // Tienda de discos
        Gestisimal gestisimal = new Gestisimal();

        // Propiedades
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        // Artículos iniciales
        gestisimal.alta(new Articulo(1, "iPhone 27", 900.0, 1200.0, 20));


        //Menú
        do {
            System.out.println("COLECCIÓN DE DISCOS");
            System.out.println("===================\n");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("Introduzca la opción deseada: ");
            try {
                opcion = sc.nextInt();
                if (opcion < 1 || opcion > 5) {
                    System.out.println("Error: Debe ser un valor entre 1 y 5");
                }
            } catch (Exception e) {
                System.out.println("Error: opción introducida inválida, debe ser un número entero");
            } finally {
                sc.nextLine();
            }
            System.out.println();

            try {
                switch (opcion) {
                    case 1 -> listarDiscos(gestisimal, sc);
                    case 2 -> nuevoDisco(gestisimal, sc);
                    case 3 -> modificarDisco(gestisimal, sc);
                    case 4 -> borrarDisco(gestisimal, sc);
                }
            } catch (Exception e) {
                System.out.println("Se ha producido un error: " + e.toString());
            }
            System.out.println("\n");

        } while (opcion != 5);

        sc.close();
    }

    private static void borrarDisco(TiendaDiscos tiendaDiscos, Scanner sc) throws Exception {
        // Disco
        Disco disco = new Disco();

        System.out.println("Borrar disco:");
        System.out.println();

        System.out.print("Código: ");
        disco.setCodigo(sc.nextLine());

        tiendaDiscos.borrar(disco);
        System.out.println("Disco borrado correctamente");
    }

    private static void modificarDisco(TiendaDiscos tiendaDiscos, Scanner sc) throws Exception {
        // Disco
        Disco disco = new Disco();

        System.out.println("Modificar disco:");
        System.out.println();

        System.out.print("Código: ");
        disco.setCodigo(sc.nextLine());

        System.out.print("Autor: ");
        disco.setAutor(sc.nextLine());

        System.out.print("Título: ");
        disco.setTitulo(sc.nextLine());

        System.out.print("Género: ");
        disco.setGenero(sc.nextLine());

        System.out.print("Duración: ");
        disco.setDuracion(sc.nextInt());

        tiendaDiscos.editar(disco);
        System.out.println("Disco borrado correctamente");
    }

    private static void nuevoDisco(TiendaDiscos tiendaDiscos, Scanner sc) throws Exception {
        // Disco
        Disco disco = new Disco();

        System.out.println("Insertar disco nuevo:");
        System.out.println();

        System.out.print("Código: ");
        disco.setCodigo(sc.nextLine());

        System.out.print("Autor: ");
        disco.setAutor(sc.nextLine());

        System.out.print("Título: ");
        disco.setTitulo(sc.nextLine());

        System.out.print("Género: ");
        disco.setGenero(sc.nextLine());

        System.out.print("Duración: ");
        disco.setDuracion(sc.nextInt());

        // Insertar disco en la tienda
        tiendaDiscos.añadir(disco);

        System.out.println("Disco insertado correctamente");
    }

    private static void listarDiscos(TiendaDiscos tiendaDiscos, Scanner sc) {
        // lista de discos
        List<Disco> listaDiscos = tiendaDiscos.listar();
        int i = 1;       //Para numerar
        for (Disco disco : listaDiscos) {
            if (disco != null) System.out.println(i + ". " + disco);
            i++;
        }
    }
}
