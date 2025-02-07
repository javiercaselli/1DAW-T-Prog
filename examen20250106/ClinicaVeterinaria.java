package examen20250106;

/**
 * Clínica Veterinaria AniVet
 * Programación Orientada a Objetos
 * curso 2024|25
 * 
 * @author Antonio J. Sánchez
 * 
 * IMPORTANTE!!
 * ESTÁ TERMINANTEMENTE PROHIBIDO TOCAR EL CÓDIGO DE ESTE ARCHIVO.
 * CUALQUIER MODIFICACIÓN NO AUTORIZADA POR EL PROFESOR, INCURRIRÁ 
 * EN LA PÉRDIDA DE PUNTOS EN LA NOTA DEL EXAMEN.
 */

import examen20250106.clases.Loro ;
import examen20250106.clases.Perro ;
import examen20250106.clases.Mascota ;
import examen20250106.clases.Clinica ;

public class ClinicaVeterinaria {
    
    // Constantes del menú
    private static final int SALIR              = 0 ;
    private static final int AGREGAR_MASCOTA    = 1 ;
    private static final int LISTAR_MASCOTAS    = 2 ;
    private static final int BUSCAR_MASCOTA     = 3 ;
    private static final int PASEAR_MASCOTA     = 4 ;
    private static final int VACUNAR_MASCOTA    = 5 ;
    private static final int ESTADISTICAS       = 6 ;

    // Constantes de mascotas
    private static final int ES_PERRO   = 0 ;
    private static final int ES_LORO    = 1 ;

    private static Clinica clinica ;

    public static void main(String[] args) {

        // Creamos e inicializamos por defecto la opción
        int opcion = 0;

        // Inicializamos la agenda
        clinica = new Clinica() ;

        do {

            try {
                // Mostramos el menú de la aplicación
                menu() ;

                // Leemos la opción
                opcion = Integer.parseInt(System.console().readLine()) ;


                // Comprobamos la opción introducida
                switch(opcion) {
                    case SALIR: 
                        break ;
                    case AGREGAR_MASCOTA:
                        agregarMascota() ; 
                        break ;
                    case LISTAR_MASCOTAS:
                        listarMascotas() ;
                        break ;
                    case BUSCAR_MASCOTA:
                        buscarMascotaChip() ;
                        break ;
                    case PASEAR_MASCOTA:
                        pasearMascota() ;
                        break ;
                    case VACUNAR_MASCOTA:
                        vacunarMascota() ;
                        break ;
                    case ESTADISTICAS:
                        estadisticas();
                        break ;
                    default:
                        System.out.println("La opción elegida no existe.\n") ;
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe introducir un valor numérico.\n");
            }
        } while (opcion != SALIR) ; 
        
        // Fin de la aplicación
        System.out.println("\n¡Hasta pronto!");
    }
    
    /**
     * Menú de la aplicación
     */
    private static void menu() {

        System.out.println("\nCLÍNICA VETERINARIA ANIVET\n==========================") ;
        System.out.println("0. Salir.") ;
        System.out.println("1. Agregar mascota.") ;
        System.out.println("2. Listar mascotas.") ;
        System.out.println("3. Buscar mascota por chip.") ;
        System.out.println("4. Pasear mascota.") ;
        System.out.println("5. Vacunar mascota.") ;
        System.out.println("6. Estadística de mascotas.") ;

        System.out.print("Opción? ");
    }

    /**
     * Añade una mascota nueva a la clínica.
     */
    private static void agregarMascota() {

        int tipo ;
        int edad ;

        String chip ;
        String nombre ;
        String raza ;
        String plumaje ;

        Perro perro ;
        Loro loro ;

        System.out.printf("\n======================\n");
        System.out.printf("AÑADIR MASCOTAS\n");
        System.out.printf("======================\n");

        if (clinica.esLlena()) {
            System.out.println("Imposible agregar una nueva mascota. No quedan plazas libres.") ;
        } else {
        
            // Preguntamos qué tipo de mascota se va a añadir
            System.out.print("¿Qué tipo de mascota vas a añadir? (0 - perro, 1 - loro): ") ;
            tipo = Integer.parseInt(System.console().readLine()) ;

            if ((tipo != ES_PERRO) && (tipo != ES_LORO)) {
                System.out.println("No es un tipo de mascota válido.\n") ; 
            } else {

                // solicitamos datos comunes
                System.out.print("Nº de chip: ") ;
                chip = System.console().readLine() ;

                System.out.print("Nombre: ") ;
                nombre = System.console().readLine() ;

                System.out.print("Edad: ") ;
                edad = Integer.parseInt(System.console().readLine()) ;

                // Solicitamos datos específicos para cada mascota
                switch(tipo) {

                    case ES_PERRO: 
                        System.out.print("Raza: ") ;
                        raza = System.console().readLine() ;

                        // Creamos la mascota
                        perro = new Perro(chip, nombre) ;
                        perro.setEdad(edad) ;
                        perro.setRaza(raza) ;

                        // Guardamos la mascota
                        clinica.agregar(perro) ;

                        break ;

                    case ES_LORO:

                        System.out.print("Plumaje: ") ;
                        plumaje = System.console().readLine() ;

                        // Creamos la mascota
                        loro = new Loro(chip, nombre) ;
                        loro.setEdad(edad) ;
                        loro.setPlumaje(plumaje) ;

                        // Guardamos la mascota
                        clinica.agregar(loro) ;

                        break ;
                }
            }
        }
    }

    /**
     * Solicita el número de chip, busca y devuelve la mascota.
     * @return
     */
    private static Mascota buscar() {

        String chip ;

        System.out.print("Nº de chip a buscar: ") ;
        chip = System.console().readLine() ;

        return clinica.buscarChip(chip) ;
    }

    /**
     * Busca la mascota por número de chip.
     */
    private static void buscarMascotaChip() {

        Mascota mascota ;

        System.out.printf("\n======================\n");
        System.out.printf("BUSCAR MASCOTAS\n");
        System.out.printf("======================\n");

        // Solicitamos chip y buscamos mascota
        mascota = buscar() ;

        // Mostramos información sobre la mascota
        if (mascota == null) {
            System.out.println("La mascota no pertenece a la clínica.");
        } else {
            
            System.out.printf("Nº de chip: %s\n", mascota.getChip());
            System.out.printf("Nombre: %s\n", mascota.getNombre());
            System.out.printf("Edad: %d\n", mascota.getEdad());
            
            if(mascota instanceof Loro) {
                System.out.printf("Plumaje: %s\n", ((Loro) mascota).getPlumaje()) ;
            } else {
                System.out.printf("Raza: %s\n", ((Perro) mascota).getRaza()) ;
            }
        }
    }

    /**
     * Busca la mascota por número de chip y, si se encuentra en el listado 
     * de la clínica, se pasea. Cuando una mascota se pasea ladra o maulla.
     */
    private static void pasearMascota() {

        Mascota mascota ;

        System.out.printf("\n======================\n");
        System.out.printf("PASEAR MASCOTAS\n");
        System.out.printf("======================\n");

        // Solicitamos chip y buscamos mascota
        mascota = buscar() ;

        // Mostramos información sobre la mascota
        if (mascota == null) {
            System.out.println("La mascota no pertenece a la clínica.");
        } else {
            mascota.pasear() ;
        }
    }

    /**
     * Busca la mascota por número de chip y, si se encuentra en el 
     * listado de la clínica, se pasea. Cuando una mascota se pasea 
     * gruñe o bufa.
     */
    private static void vacunarMascota() {

        Mascota mascota ;
        
        System.out.printf("\n======================\n");
        System.out.printf("VACUNAR MASCOTAS\n");
        System.out.printf("======================\n");

        // Solicitamos chip y buscamos mascota
        mascota = buscar() ;

        // Vacunamos a la mascota
        if (mascota == null) {
            System.out.println("La mascota no pertenece a la clínica.");
        } else {
            mascota.vacunar() ;
        }
    }

    /**
     * Muestra un listado de mascotas.
     */
    private static void listarMascotas() {

        System.out.printf("\n======================\n");
        System.out.printf("LISTADO DE MASCOTAS\n");
        System.out.printf("======================\n");

        if (clinica.esVacia()) { 
            System.out.println("Aún no se ha registrado ninguna mascota en la clínica.") ; 
        } else { 
            clinica.listar() ;
        }
    }

    /**
      * Muestra las estadísticas de las mascotas.
      */
    private static void estadisticas() {
        System.out.printf("\n======================\n");
        System.out.printf("ESTADÍSTICA DE MASCOTAS\n");
        System.out.printf("======================\n");
        System.out.printf("Total de perros: %6d\n", clinica.totalPerros());
        System.out.printf("Total de loros : %6d\n", clinica.totalLoros());
        System.out.printf("Total mascotas : %6d\n", clinica.totalMascotas());
        System.out.printf("=======================\n\n");
    }

    
}
