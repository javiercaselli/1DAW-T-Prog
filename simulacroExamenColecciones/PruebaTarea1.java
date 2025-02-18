package simulacroExamenColecciones; /**
 * Programación
 * curso 2024|25
 * Antonio J.Sánchez Bujaldón
 * 
 * Clase de prueba para la TAREA 1: 
 * Implementación de la clase Película
 */


import simulacroExamenColecciones.clases.Pelicula;


public class PruebaTarea1 {

    public static void main(String[] args) {
        
        System.out.println("=== PRUEBAS TAREA 1 ===\n");
        boolean allTestsPassed = true;
        
        // PRUEBA 1: GETTERS #############################################################################
        System.out.println("PRUEBA 1: verificación de getters");
        boolean gettersOk = true;

        Pelicula pelicula1 = new Pelicula("MOV2721", "Puñales por la espalda", 2022) ;
        gettersOk &= pelicula1.getCodigo().equals("MOV2721");
        gettersOk &= pelicula1.getTitulo().equals("Puñales por la espalda");
        gettersOk &= pelicula1.getEstreno().equals(2022);
        gettersOk &= !pelicula1.getVista() ;

        System.out.println("✓ Getters implementados correctamente: " + (gettersOk ? "SÍ" : "NO"));
        allTestsPassed &= gettersOk;

        // PRUEBA 2: EQUALS Y HASHCODE ####################################################################
        System.out.println("\nPRUEBA 2: verificación de equals y hashCode");
        boolean equalsOk = true;

        Pelicula pelicula2 = new Pelicula("MOV2721", "Glass Onion", 2022);
        Pelicula pelicula3 = new Pelicula("MOV5953", "Aladdin",  2011);
        
        equalsOk &= pelicula1.equals(pelicula2);  // Mismo código
        equalsOk &= !pelicula1.equals(pelicula3); // Distinto código
        equalsOk &= pelicula1.hashCode() == pelicula2.hashCode(); // Mismo hash para mismo código
        System.out.println("✓ equals() basado en código: " + (equalsOk ? "SÍ" : "NO"));
        allTestsPassed &= equalsOk;

        // Prueba 3: TOSTRING #############################################################################
        System.out.println("\nPRUEBA 3: verificación de toString");
        String str = pelicula1.toString();
        boolean toStringOk = str.contains("MOV2721") && 
                           str.contains("Puñales por la espalda") && 
                           str.contains("2022") ;

        System.out.println("✓ toString incluye todos los campos: " + (toStringOk ? "SÍ" : "NO"));
        allTestsPassed &= toStringOk;

        // RESULTADO FINAL #############################################################################
        System.out.println("\n=== RESULTADO PRUEBA 1 ===");
        System.out.println(allTestsPassed ? 
                                    "✅ Todos los requisitos implementados correctamente" : 
                                    "❌ Hay requisitos no implementados correctamente");

        

    }

}


