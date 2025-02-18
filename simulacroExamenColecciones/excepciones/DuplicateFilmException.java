/** 
 * Programación
 * curso 2024|25
 * Antonio J.Sánchez Bujaldón
 */

package simulacroExamenColecciones.excepciones;
public class DuplicateFilmException extends Exception {
    public DuplicateFilmException(String codigo) {
        super("La película con código " + codigo + " ya existe en el catálogo.") ;
    }
    
}
