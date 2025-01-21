package tema09POO;

public class Gato {
    String color;
    String raza;
    String sexo;
    int edad;
    double peso;

    /**
     * Constructor elemental.
     */
    public Gato() {

    }

    /**
     * Constructor simple.
     * 
     * @param sexo sexo del gato
     */
    public Gato(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Constructor completo.
     * 
     * @param color color del pelaje del gato
     * @param raza raza del gato
     * @param sexo sexo del gato
     * @param edad edad del gato
     * @param peso peso del gato
     */
    public Gato(String color, String raza, String sexo, int edad, double peso) {
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }
  
}
