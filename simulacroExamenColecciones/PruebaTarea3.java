package simulacroExamenColecciones;

import simulacroExamenColecciones.clases.Pelicula;
import simulacroExamenColecciones.clases.Videoclub;

/**
 * Programación
 * curso 2024|25
 * Antonio J.Sánchez Bujaldón
 * 
 * Clase de prueba para la TAREA 3:
 * Implementación del Catálogo genérico
 */

public class PruebaTarea3 {

    private static final String ARCHIVO_NUEVO = "prueba.csv";

    public static void main(String[] args) {
        
        System.out.println("=== PRUEBAS TAREA 3 ===\n");
        boolean allTestsPassed = true;

        try {
        
            Videoclub videoclub = new Videoclub();

            // PRUEBA 1: AÑADIR PELÍCULAS ###################################################################
            System.out.println("\nPRUEBA 1: insertar 3 películas:");
            videoclub.nuevaPelicula(new Pelicula("MOV1000", "Inception", 2000));
            videoclub.nuevaPelicula(new Pelicula("MOV2000", "Forrest Gump", 1994));
            videoclub.nuevaPelicula(new Pelicula("MOV3000",  "Matrix", 1999));
            allTestsPassed = videoclub.listarOrdenadoPorTitulo().size() == 3 ;

            System.out.println("✓ Se insertan películas: " + (allTestsPassed ? "SÍ" : "NO"));

            // PRUEBA 2: ELIMINAR PELÍCULA ###################################################################
            System.out.println("\nPRUEBA 2: eliminar películas:");
            videoclub.eliminarPelicula(new Pelicula("MOV1000", "Inception", 2000));
            boolean removeTest = videoclub.listarOrdenadoPorTitulo().size() == 2 ;

            System.out.println("✓ Eliminar películas: " + (removeTest ? "SÍ" : "NO"));
            allTestsPassed &= removeTest ;

            // PRUEBA 3: BUSCAR POR ESTRENO ##################################################################
            System.out.println("\nPRUEBA 3: buscar por año 1994:");
            boolean yearTest = true ;

            for (Pelicula p : videoclub.buscarPorEstreno(1994)) {
                yearTest &= p.getEstreno() == 1994 ;
                System.out.println(p);
            }

            System.out.println("✓ Búsqueda por año 1994: " + (yearTest ? "SÍ" : "NO"));
            allTestsPassed &= yearTest ;
            
            // PRUEBA 4: PELÍCULAS ORDENADAS POR TITULO ###################################################
            // Sólo podrá comprobar que funciona si las películas aparecen en orden alfabético:
            // Forrest Gump, Inception y Matrix
            System.out.println("\nPRUEBA 4: todas las películas ordenadas por título:");
            for (Pelicula p : videoclub.listarOrdenadoPorTitulo()) {
                System.out.println(p);
            }

            // PRUEBA 5: NO VISTAS #######################################################################
            System.out.println("\nPRUEBA 5: películas no vistas");
            videoclub.listarOrdenadoPorTitulo().getFirst().setVista(true);
            boolean watchedTest = videoclub.listarNoVistas().size() == 1 ;

            System.out.println("✓ Películas no vistas: " + (watchedTest ? "SÍ" : "NO"));
            allTestsPassed &= watchedTest ;

            // PRUEBA 6: GUARDAR ARCHIVO ##################################################################            
            System.out.println("\nPRUEBA 6: guardar archivo:");
            videoclub.guardar(ARCHIVO_NUEVO);
            System.out.println("\nPelículas guardadas en '" + ARCHIVO_NUEVO + "'.");


        } catch(Exception excepcion) {
            System.out.println(excepcion.getMessage()) ;
            allTestsPassed = false ;
        }

        // RESULTADO FINAL ##################################################################################
        System.out.println("\n=== RESULTADO TAREA 3 ===");
        System.out.println(allTestsPassed ? 
                                "✅ Todos los requisitos implementados correctamente" : 
                                "❌ Hay requisitos no implementados correctamente");


    }
    
}
