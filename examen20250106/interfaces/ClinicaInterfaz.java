/**
 * Clínica Veterinaria AniVet
 * Programación Orientada a Objetos
 * curso 2024|25
 * 
 * @author Antonio J. Sánchez
 * <p>
 * IMPORTANTE!!
 * CUALQUIER MODIFICACIÓN NO AUTORIZADA POR EL PROFESOR, INCURRIRÁ 
 * EN LA PÉRDIDA DE PUNTOS EN LA NOTA DEL EXAMEN.
 */

package examen20250106.interfaces;

import examen20250106.clases.Mascota ;

public interface ClinicaInterfaz {

    /**
     * Comprueba si el listado de mascotas está o no vacío devolviendo 
     * true o false en cada caso.
     * @return resultado del chequeo
     */
    public boolean esVacia() ;

    /**
     * Comprobará si el listado de mascotas está completo o no. En el 
     * primer caso devolverá true y en el segundo false.
     * @return resultado del chequeo
     */
    public boolean esLlena() ;

    /**
     * Devuelve el número total de perros que se han dado de alta en 
     * la aplicación.
     * @return número entero con el total de perror
     */
    public int totalPerros() ;

    /**
     * Devuelve el número total de loros que se han dado de alta en
     * la aplicación.
     * @return número entero con el total de loros
     */
    public int totalLoros() ;

    /**
     * Devuelve el número total de mascotas que se han dado de alta en 
     * la aplicación.
     * @return número entero con el total de mascotas
     */
    public int totalMascotas() ;

    /**
     * Busca una mascota por el valor de la propiedad chip y la devuelve 
     * si se encuentra en el listado; en otro caso, devuelve null.
     * @return instancia de mascota que corresponda al chip, o null si no existe.
     */
    public Mascota buscarChip(String chip) ;

    /**
     * Agrega una mascota, bien sea perro o gato, al listado de la clínica.
     * @param mascota
     * @return
     */
    public void agregar(Mascota mascota) ;

    /**
     * Muestra un listado de mascotas 
     */
    public void listar() ;
}
