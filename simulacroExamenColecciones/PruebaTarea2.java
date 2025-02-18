package simulacroExamenColecciones; /**
 * Programación
 * curso 2024|25
 * Antonio J.Sánchez Bujaldón
 * 
 * Clase de prueba para la TAREA 2:
 * Implementación del Catálogo genérico
 */

import java.util.ArrayList;
import simulacroExamenColecciones.clases.Catalogo;
import simulacroExamenColecciones.clases.Pelicula;

public class PruebaTarea2 {
    
    public static void main(String[] args) {
     
        System.out.println("=== PRUEBAS TAREA 2 ===\n");
        boolean allTestsPassed = true;
        
        // PRUEBA 1: CATÁLOGO DE STRINGS #####################################################################
        System.out.println("PRUEBA 1: catálogo de Strings");
        boolean stringTest = true;

        Catalogo<String> stringCatalog = new Catalogo<String>() ;
        stringCatalog.aniadir("Uno") ;
        stringCatalog.aniadir("Dos") ;
        stringCatalog.aniadir("Uno") ; // Duplicado
        
        ArrayList<String> stringItems = stringCatalog.recuperarElementos();
        stringTest &= stringItems.size() == 2;
        stringTest &= stringItems.contains("Uno") ;
        stringTest &= stringItems.contains("Dos") ;

        System.out.println("✓ Manejo básico de elementos: " + (stringTest ? "SÍ" : "NO"));
        allTestsPassed &= stringTest;

        // PRUEBA 2: ELIMINACIÓN DE ELEMENTOS #################################################################
        System.out.println("\nPRUEBA 2: eliminación de elementos");

        stringCatalog.eliminar("Uno");
        ArrayList<String> afterRemoval = stringCatalog.recuperarElementos();

        boolean removeTest = afterRemoval.size() == 1 && 
                            !afterRemoval.contains("Uno");

        System.out.println("✓ Eliminación correcta: " + (removeTest ? "SÍ" : "NO"));
        allTestsPassed &= removeTest;

        // PRUEBA 3: CATÁLOGO DE PELÍCULAS #####################################################################
        System.out.println("\nPRUEBA 3: catálogo de películas");
        boolean filmTest = true;

        Catalogo<Pelicula> filmCatalog = new Catalogo<Pelicula>();

        Pelicula pelicula1 = new Pelicula("MOV2721", "Puñales por la espalda", 2022) ;
        Pelicula pelicula2 = new Pelicula("MOV9811", "Glass Onion", 2022);
        Pelicula pelicula3 = new Pelicula("MOV5953", "Aladdin",  2011);

        filmCatalog.aniadir(pelicula1);
        filmCatalog.aniadir(pelicula2);
        filmCatalog.aniadir(pelicula3);
        
        ArrayList<Pelicula> filmItems = filmCatalog.recuperarElementos();
        filmTest &= filmItems.size() == 3;
        filmTest &= filmItems.contains(pelicula1);
        filmTest &= filmItems.contains(pelicula2);
        filmTest &= filmItems.contains(pelicula3);

        System.out.println("✓ Manejo de películas: " + (filmTest ? "SÍ" : "NO"));
        allTestsPassed &= filmTest;

        // RESULTADO FINAL ##################################################################################
        System.out.println("\n=== RESULTADO TAREA 2 ===");
        System.out.println(allTestsPassed ? 
                                "✅ Todos los requisitos implementados correctamente" : 
                                "❌ Hay requisitos no implementados correctamente");

    }

}
