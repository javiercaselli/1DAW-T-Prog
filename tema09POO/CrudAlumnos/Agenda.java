package tema09POO.CrudAlumnos;

public class Agenda implements Tareas {

    // Propiedades de clase

    // Propiedades
    private Persona[] listaAlumnos = new Persona[100];

    @Override
    public void añadir(Persona persona) throws Exception {
        int i = 0;
        while (listaAlumnos[i] != null && i < listaAlumnos.length) {
            i++;
        }

        if (i == listaAlumnos.length) {
            throw new Exception("Error: La agenda está llena");
        } else {
            listaAlumnos[i] = persona;
        }
    }

    @Override
    public Persona[] listar() {
        return listaAlumnos;
    }

    @Override
    public void editar(Persona persona) throws Exception {
        int i = 0;
        while (!listaAlumnos[i].getDni().equals(persona.getDni()) && i < listaAlumnos.length) {
            i++;
        }

        if (i != listaAlumnos.length) {
            listaAlumnos[i] = persona;
        } else {
            throw new Exception("Error: El alumno no se encuentra en la agenda");
        }

    }

    @Override
    public void borrar(Persona persona) throws Exception {
        int i = 0;
        while (!listaAlumnos[i].getDni().equals(persona.getDni()) && i < listaAlumnos.length) {
            i++;
        }

        if (i != listaAlumnos.length) {
            listaAlumnos[i] = null;
        } else {
            throw new Exception("Error: El alumno no se encuentra en la agenda");
        }

    }


}
