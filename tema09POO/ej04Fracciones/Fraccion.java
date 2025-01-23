package tema09POO.ej04Fracciones;

/**
 * Clase que implementa una fracción y sus métodos más típicos
 */
public class Fraccion {
    // Declaraciones
    private int numerador;
    private int denominador;

    /**
     * Constructor mínimo.
     */
    public Fraccion() {

    }

    /**
     * Constructor completo.
     * @param numerador numerador de la fracción
     * @param denominador denominador de la fracción
     */
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion invetir() {
        Fraccion inversa = new Fraccion();
        inversa.denominador = this.numerador;
        inversa.numerador = this.denominador;

        // Devolvemos la fracción invertida
        return inversa;
    }

    /**
     * Método que devuelve la presente fracción simplificada.
     *
     * @return la fracción simplificada
     */
    public Fraccion simplificar() {
        Fraccion simplificada = new Fraccion();

        int mcd = mcdAlgoritmmoEuclides(this.numerador, this.denominador);
        simplificada.numerador = this.numerador / mcd;
        simplificada.denominador = this.denominador / mcd;

        return simplificada;
    }

    /**
     * Devuelve el producto con otra fracción que se recibe como parámetro.
     *
     * @param fraccion parámetro con la otra fracción
     * @return producto.
     */
    public Fraccion multiplicar(Fraccion fraccion) {
        Fraccion producto = new Fraccion(this.numerador * fraccion.numerador, this.denominador * fraccion.denominador);
        producto = producto.simplificar();
        return producto;
    }


    /**
     * Devuelve el cociente con otra fracción que se recibe como parámetro.
     *
     * @param fraccion parámetro con la otra fracción
     * @return cociente.
     */
    public Fraccion dividir(Fraccion fraccion) {
        return new Fraccion(this.numerador * fraccion.denominador, this.denominador * fraccion.numerador).simplificar();
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    /**
     * Método privado que calcula el MCD mediante el algoritmo de Euclides.
     * @param valor1 número entero 1
     * @param valor2 número entero 2
     * @return el MCD de valor1 y valor2
     */
    private int mcdAlgoritmmoEuclides(int valor1, int valor2) {
        while (valor1 != valor2) {
            if (valor1 >= valor2) {
                valor1 = valor1 - valor2;
            } else {
                valor2 = valor2 - valor1;
            }
        }
        return valor1;
    }


}
