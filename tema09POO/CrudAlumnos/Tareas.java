package tema09POO.CrudAlumnos;

public interface Tareas {
    /**
     * Añade una persona a la agenda.
     *
     * @param persona
     */
    public void añadir(Persona persona) throws Exception;

    /**
     * Devuelve la lista de personas
     *
     * @return
     */
    public Persona[] listar();

    /**
     *
     * @param persona
     */
    public void editar(Persona persona) throws Exception;

    /**
     *
     * @param persona
     */
    public void borrar(Persona persona) throws Exception;
}
