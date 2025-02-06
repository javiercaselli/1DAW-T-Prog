package examen20250106.clases;

import java.util.Random;

public class Loro extends Mascota {
    // Atributos de clase
    public static int totalLoros = 0;

    // Atributos
    private String plumaje;

    /**
     * Constructor 1
     *
     * @param chip
     */
    public Loro(String chip) {
        super();
        this.setChip(chip);
    }

    /**
     * Constructor 2
     * @param chip
     * @param nombre
     */
    public Loro(String chip, String nombre) {
        super();
        this.setChip(chip);
        this.setNombre(nombre);
    }

    // Métodos

    /**
     * El loro emite su sonido natural, el garrido.
     */
    public void garrar() {
        System.out.println("¡Craaaaaaaa…..!");
    }

    /**
     * El loro mimetiza el lenguaje humano y "habla".
     */
    public void hablar() {
        System.out.println("¡Hola, soy " + this.getNombre() + " ¿cómo estas?");
    }

    // Redefinción o implementación de métodos de la superclase
    /**
     *  El loro pasea
     */
    @Override
    public void pasear() {
        if (estado()) {
            this.garrar();
            this.jugar();
        } else {
            System.out.println(this.getNombre() + " no puede pasear hasta no ser vacunado/a.");
        }
    }

    /**
     *  El loro juega y acampaña la diversión con garridos o palabras.
     */
    @Override
    public void jugar() {
        // Juega
        System.out.println(this.getNombre() + " resuelve un puzzle para loros, pero no mide su fuerza y lo rompe con el pico.");

        // Decide al azar si habla o garra
        Random rand = new Random();
        if (rand.nextInt(2) == 0) {
            this.hablar();
        } else {
            this.garrar();
        }

    }

    /**
     *  El loro es vacunado si es que no lo estaba ya.
     */
    @Override
    public void vacunar() {
        if (estado()) {
            System.out.println(this.getNombre() + " ya ha sido vacunado/a.");
        } else {
            super.vacunar();
            this.garrar();
        }
    }

    // Getters y Setters
    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }
}
