package examen20250106.clases;

import java.util.Random;

public class Perro extends Mascota {
    // Atributos de clase
    public static int totalPerros = 0;

    // Atributos
    private String raza;

    /**
     * Constructor 1
     *
     * @param chip código del chip de la mascota
     */
    @SuppressWarnings("unused")
    public Perro(String chip) {
        super();
        this.setChip(chip);
    }

    /**
     * Constructor 2
     * @param chip código del chip de la mascota
     * @param nombre nombre de la mascota
     */
    public Perro(String chip, String nombre) {
        super();
        this.setChip(chip);
        this.setNombre(nombre);
    }

    // Getters y Setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Métodos

    /**
     * El perro ladra
     */
    public void ladrar() {
        System.out.println("¡Guau! ¡Guau!");
    }

    /**
     * El chucho gruñe
     */
    public void grunir() {
        System.out.println("Grrrrrr……");
    }

    /**
     *
     */
    @Override
    public void pasear() {
        if (estado()) {
            this.ladrar();
            this.jugar();
        } else {
            System.out.println(this.getNombre() + " no puede pasear hasta no ser vacunado/a.");
        }
    }

    /**
     *
     */
    @Override
    public void jugar() {
        // Juegos
        String[] juegos  = {this.getNombre() + " corre tras una pelota y la trae de vuelta",
                this.getNombre() + " juega con su mordedor",
                this.getNombre() + " muerde un juguete de goma y lo sacude con fuerza",
                this.getNombre() + " escarba en la tierra buscando algo interesante",
                this.getNombre() + " encuentra un palo y lo mastica felizmente",
                this.getNombre() + " salta sobre el sofá y espera que le lancen su juguete favorito",
                this.getNombre() + " juega con otros perros en el parque y mueve la cola emocionado",
                this.getNombre() + " rueda por el suelo pidiendo más juego",
        };

        // Selecciona juego al azar
        Random rand = new Random();
        int juego = rand.nextInt(8);

        System.out.println(juegos[juego]);
    }

    /**
     *
     */
    @Override
    public void vacunar() {
        if (estado()) {
            System.out.println(this.getNombre() + " ya ha sido vacunado/a.");
        } else {
            super.vacunar();
            this.grunir();
        }
    }
}
