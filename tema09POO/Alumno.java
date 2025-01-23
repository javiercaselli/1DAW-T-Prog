package tema09POO;

public class Alumno extends Persona {

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    private String nivelAcademico;

    public Alumno() {
        super() ;
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido) ;
    }

    public Alumno(String nombre, String apellido, String nivelAcademico) {
        super(nombre, apellido) ;
        this.nivelAcademico = nivelAcademico;
    }

    @Override
    public void andar() {
        super.andar();
        System.out.println("Y además, como es un estudiante, va a clases...");
    }

    public void estudiar() {
        System.out.println("Estoy en la biblioteca sin levantar cabeza");
    }
}
