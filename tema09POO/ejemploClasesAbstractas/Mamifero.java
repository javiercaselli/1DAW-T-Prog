package tema09POO.ejemploClasesAbstractas;

public abstract class Mamifero {
    int edad;
    String nombre;
    String sexo;

    public String dormir() {
        return "Zzzzzzzz...";
    }

    public String respirar() {
        return "Fiuuuuuu....";
    }

    public String desplazarse(int distancia, int direccion) {
        return "He andado a 4 patas " + distancia + " metros en dirección " + direccion;
    }

    public abstract String emitirSonido();
}
