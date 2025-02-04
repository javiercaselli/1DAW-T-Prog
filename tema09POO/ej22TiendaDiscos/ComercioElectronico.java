package tema09POO.ej22TiendaDiscos;

public interface ComercioElectronico {
    /**
     * Añade un disco a la agenda.
     *
     * @param disco
     */
    public void añadir(Disco disco) throws Exception;

    /**
     * Devuelve la lista de discos
     *
     * @return
     */
    public Disco[] listar();

    /**
     *  Edita un disco
     * @param disco
     */
    public void editar(Disco disco) throws Exception;

    /**
     * Borra un disco
     * @param disco
     */
    public void borrar(Disco disco) throws Exception;
}
