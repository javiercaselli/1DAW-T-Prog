package tema09POO;

public class Gato {
    private String nombre;
    private String color;
    private String raza;
    private String sexo;
    private int edad;
    private double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() >= 5) {
            this.nombre = nombre;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

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
    public Gato(String nombre, String color, String raza, String sexo, int edad, double peso) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    void ronronea() {
        System.out.println("Brrrrrr!") ;
    }
    void come(String comida)     {
        System.out.println("Me gusta comer " + comida + "!!") ;
        System.out.println("Ñam!!") ;
    }

    void peleaCon (Gato contrincante) {
        System.out.println("Voy a pelearme con " +
                contrincante.nombre) ;
    }
  
}
