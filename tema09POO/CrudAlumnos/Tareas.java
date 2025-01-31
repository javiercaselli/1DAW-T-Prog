package tema09POO.CrudAlumnos;

public interface Tareas {
    /**
     * Añade una alumno a la agenda.
     *
     * @param alumno
     */
    public void añadir(Alumno alumno) throws Exception;

    /**
     * Devuelve la lista de alumnos
     *
     * @return
     */
    public Alumno[] listar();

    /**
     *
     * @param alumno
     */
    public void editar(Alumno alumno) throws Exception;

    /**
     *
     * @param alumno
     */
    public void borrar(Alumno alumno) throws Exception;
}
