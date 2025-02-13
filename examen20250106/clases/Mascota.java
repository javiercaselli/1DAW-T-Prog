package examen20250106.clases;

public abstract class Mascota implements Comparable<Mascota> {
    // Atributos de clase
    public static int totalMascotas = 0;

    // Atributos
    private String chip;
    private String nombre;
    private int edad;
    private boolean vacunada;

    /**
     * Constructor
     */
    public Mascota() {
        this.vacunada = false;
    }

    // Métodos abstractos
    public abstract void pasear();

    public abstract void jugar();

    // Métodos

    /**
     * Vacuna a la mascota
     */
    public void vacunar() {
        this.vacunada = true;
    }

    /**
     * Devuelve el estado de vacunación de la mascota
     * @return true si está vacunado, false en otro caso
     */
    public boolean estado() {
        return this.vacunada;
    }


    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVacunada() {
        return vacunada;
    }

    public void setVacunada(boolean vacunada) {
        this.vacunada = vacunada;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    @Override
    public String toString() {
        return "[" + chip + "]: " + nombre + ", " + edad + " años";
    }

    @Override
    public int compareTo(Mascota o) {
        return this.nombre.compareTo(o.getNombre());
    }

}
