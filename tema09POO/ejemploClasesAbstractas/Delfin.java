package tema09POO.ejemploClasesAbstractas;

public class Delfin extends Mamifero {

    @Override
    public String desplazarse(int distancia, int direccion) {
        return "He nadado " + distancia + " metros en dirección " + direccion;
    }

    @Override
    public String emitirSonido() {
        return "Sonido símpático de delfín";
    }
}
