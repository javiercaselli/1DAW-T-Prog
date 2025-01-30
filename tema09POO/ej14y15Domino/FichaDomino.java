package tema09POO.ej14y15Domino;

public class FichaDomino {
    // propiedades
    private int lado1;
    private int lado2;

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public FichaDomino(int lado1, int lado2) throws Exception {
        if (lado1 >= 0 && lado1 <= 6 && lado2 >= 0 && lado2 <= 6 ) {
            this.lado1 = lado1;
            this.lado2 = lado2;
        } else {
            throw new Exception("Valores de la ficha fuera de rango");
        }
    }

    public FichaDomino voltea() throws Exception {
        int aux = this.lado1;
        this.lado1 = lado2;
        this.lado2 = aux;
        return this;
    }

    public boolean encaja(FichaDomino f2) {
        return (this.lado1 == f2.lado1) || (this.lado1 == f2.lado2)
                || (this.lado2 == f2.lado1) || (this.lado2 == f2.lado2);
    }

    @Override
    public String toString() {
        return "[" + ((lado1 != 0) ? lado1 : " ") + "|" + ((lado2 != 0) ? lado2 : " ") + "]";
    }
}
