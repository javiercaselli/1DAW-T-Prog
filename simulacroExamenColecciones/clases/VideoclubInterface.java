/** 
 * Programación
 * curso 2024|25
 * Antonio J.Sánchez Bujaldón
 */

package simulacroExamenColecciones.clases;
import java.io.IOException;
import java.util.ArrayList;
import simulacroExamenColecciones.excepciones.DuplicateFilmException;

public interface VideoclubInterface {

    /**
     * Añade una nueva película a la colección. Si la película ya existe (el código
     * está asignado a otra película) se lanza una excepción.
     * @param pelicula
     * @throws DuplicateFilmException
     */
    public void nuevaPelicula(Pelicula pelicula) throws DuplicateFilmException ;

    /**
     * Elimina una película de la colección
     * @param pelicula
     */
    public void eliminarPelicula(Pelicula pelicula) ;

    /**
     * Busca películas que estrenasen en el año indicado. Si no se encuentra
     * ninguna, se devuelve un ArrayList vacío.
     * @param anio
     * @return
     */
    public ArrayList<Pelicula> buscarPorEstreno(int anio) ;

    /**
     * Devuelve un ArrayList con todas las películas ordenadas por titulo.
     * @return
     */
    public ArrayList<Pelicula> listarOrdenadoPorTitulo() ;

    /**
     * Devuelve un ArrayList con todas las películas marcadas como no vistas.
     * Si no hay ninguna, se devuelve un ArrayList vacío.
     * @return
     */
    public ArrayList<Pelicula> listarNoVistas() ;

    /**
     * Vuelca todo el contenido de la colección en el archivo indicado.
     * @param nombreArchivo
     * @throws IOException
     */
    public void guardar(String nombreArchivo) throws IOException ;

}
