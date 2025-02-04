package tema09POO.CrudAlumnos;

import java.util.Scanner;

public class MainCrudAlumnos {

    public static void main(String[] args) {
        // Agenda
        Agenda agenda = new Agenda();

        // Propiedades
        Scanner sc = new Scanner(System.in);
        Alumno alumno;
        int opcion = -1;

        //Menú
        do {
            System.out.println("1. Añadir alumno");
            System.out.println("2. Listar alumnos");
            System.out.println("3. Editar alumno");
            System.out.println("4. Borrar alumno");
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
                    case 1 -> addAlumno(agenda, sc);
                    case 2 -> listarAlumnos(agenda);
                    case 3 -> editarAlumno(agenda, sc);
                    case 4 -> borrarAlumno(agenda, sc);
                }
            } catch (Exception e) {
                System.out.println("Se ha producido un error: " + e.toString());
            }
        } while (opcion != 5);

        sc.close();
    }

    private static void borrarAlumno(Agenda agenda, Scanner sc) throws Exception {
        // Variables
        String dni;


        // Obtenemos de teclado los datos
        System.out.print("Introduzca DNI: ");
        dni = sc.nextLine();

        // Borra el alumno
        Alumno alumno = new Alumno();
        alumno.setDni(dni);

        agenda.borrar(alumno);

        System.out.println();
        System.out.println("Alumno con DNI " + alumno.getDni() + " eliminado correctamente");
        System.out.println();

    }

    private static void editarAlumno(Agenda agenda, Scanner sc) throws Exception {
        // Variables
        String dni;
        Alumno alumno = new Alumno();

        // Obtenemos de teclado los datos
        System.out.print("Introduzca DNI: ");
        alumno.setDni(sc.nextLine());
        System.out.print("Introduzca nombre: ");
        alumno.setNombre(sc.nextLine());
        System.out.print("Introduzca edad: ");
        alumno.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.print("Introduzca ciclo: ");
        alumno.setCiclo(sc.nextLine());
        System.out.print("Introduzca curso: ");
        alumno.setCurso(sc.nextLine());
        System.out.print("Introduzca unidad: ");
        alumno.setUnidad(sc.nextLine());

        // Guardamos la clase alumno en nuestra agenda
        agenda.editar(alumno);

        System.out.println();
        System.out.println("Alumno con DNI " + alumno.getDni() + " editado correctamente");
        System.out.println();

    }

    private static void listarAlumnos(Agenda agenda) {
        int i = 1;
        for (Alumno alumno : agenda.listar()) {
            if (alumno != null) System.out.println(i + ". " + alumno);
            i++; // Para numerar la lista
        }

        System.out.println();
    }

    private static void addAlumno(Agenda agenda, Scanner sc) throws Exception {
        // Alumno
        Alumno alumno = new Alumno();

        // Obtenemos de teclado los datos
        System.out.print("Introduzca DNI: ");
        alumno.setDni(sc.nextLine());
        System.out.print("Introduzca nombre: ");
        alumno.setNombre(sc.nextLine());
        System.out.print("Introduzca edad: ");
        alumno.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.print("Introduzca ciclo: ");
        alumno.setCiclo(sc.nextLine());
        System.out.print("Introduzca curso: ");
        alumno.setCurso(sc.nextLine());
        System.out.print("Introduzca unidad: ");
        alumno.setUnidad(sc.nextLine());

        // Guardamos la clase alumno en nuestra agenda
        agenda.añadir(alumno);

        System.out.println();
        System.out.println("Alumno con DNI " + alumno.getDni() + " insertado correctamente");
        System.out.println();

    }
}
