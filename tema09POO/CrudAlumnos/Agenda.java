package tema09POO.CrudAlumnos;

public class Agenda implements Tareas {

    // Propiedades de clase

    // Propiedades
    private Alumno[] listaAlumnos = new Alumno[100];

    @Override
    public void añadir(Alumno alumno) throws Exception {
        int i = 0;
        while (listaAlumnos[i] != null && i < listaAlumnos.length) {
            i++;
        }

        if (i == listaAlumnos.length) {
            throw new Exception("Error: La agenda está llena");
        } else {
            listaAlumnos[i] = alumno;
        }
    }

    @Override
    public Alumno[] listar() {
        return listaAlumnos;
    }

    @Override
    public void editar(Alumno alumno) throws Exception {
        int i = 0;
        while (!listaAlumnos[i].getDni().equals(alumno.getDni()) && i < listaAlumnos.length) {
            i++;
        }

        if (i != listaAlumnos.length) {
            listaAlumnos[i] = alumno;
        } else {
            throw new Exception("Error: El alumno no se encuentra en la agenda");
        }

    }

    @Override
    public void borrar(Alumno alumno) throws Exception {
        int i = 0;
        while (!listaAlumnos[i].getDni().equals(alumno.getDni()) && i < listaAlumnos.length) {
            i++;
        }

        if (i != listaAlumnos.length) {
            listaAlumnos[i] = null;
        } else {
            throw new Exception("Error: El alumno no se encuentra en la agenda");
        }

    }


}
