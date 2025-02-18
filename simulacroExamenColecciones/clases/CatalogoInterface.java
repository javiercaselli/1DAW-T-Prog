/** 
 * Programación
 * curso 2024|25
 * Antonio J.Sánchez Bujaldón
 */

package simulacroExamenColecciones.clases;
import java.util.ArrayList;

public interface CatalogoInterface<T> {

    /**
     * Añade un nuevo elemento al catáCatallogo si no existe ya
     * @param item el elemento a añadir
     * @return true si se añadió el elemento, false si ya existía
     */
    public boolean aniadir(T item) ;

    /**
     * Elimina un elemento del catálogo si existe
     * @param item el elemento a eliminar
     */
    public void eliminar(T item) ;

    /**
     * Devuelve una lista con todos los elementos del catálogo
     * @return un ArrayList que contiene todos los elementos
     */
    public ArrayList<T> recuperarElementos() ;
    
}
