package Tema10ColeccionesYDiccionarios.ej12ValoresBrisca;

import java.util.Objects;

public class Carta implements Comparable<Carta> {
    // Propiedades
    private Integer codigo;
    private String palo;
    private String nombreCarta;

    public Carta() {

    }

    public Carta (int codigo, String palo, String carta) {
        this.codigo = codigo;
        this.palo = palo;
        this.nombreCarta = carta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getNombreCarta() {
        return nombreCarta;
    }

    public void setNombreCarta(String nombreCarta) {
        this.nombreCarta = nombreCarta;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return codigo == carta.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return codigo + ": " + nombreCarta + " de " + palo;
    }

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Carta o) {
        Integer valorCarta = this.codigo % 10;
        Integer valorOtraCarta = o.getCodigo() % 10;
        Integer valorPalo = this.codigo / 10;
        Integer valorPaloOtraCarta = o.getCodigo() / 10;

        Integer comparacion = (valorCarta == valorOtraCarta) ? valorPalo.compareTo(valorPaloOtraCarta) : valorCarta.compareTo(valorOtraCarta);

        return comparacion;
    }
}
