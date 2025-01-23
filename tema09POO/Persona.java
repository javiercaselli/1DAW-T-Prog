package tema09POO;

public class Persona {

    public String nombre ;
    public String apellido = "";

    public Persona() {

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre ;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido ;
    }

    public void andar () {
        System.out.println("La persona anda...");
    }
}
