package tema09POO.ej12ElCorteIslandes;

import java.util.Random;

public class TarjetaRegalo {
    // Variables de instancia
    private double saldo;
    private int codigo;

    // Random
    Random rand = new Random();

    // Constructor
    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.codigo = rand.nextInt(10000, 100000);  // Número entero aleatorio de 5 dígitos
    }

    /**
     * Descuenta del saldo de la tarjeta la cantidad indicada.
     *
     * Imprimirá mensaje de error si la cantidad es superior al saldo disponible.
     *
     * @param cantidad cantidad a descontar en euros
     */
    public void gasta(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("No tiene saldo suficiente para gastar " + cantidad + "€");
        }
    }

    /**
     * Fusiona con la tarjeta regalo que se pasa como parámetro.
     * <p>
     * Las dos tarjetas fusionadas pasarán a tener 0 euros de saldo.
     *
     * @param t2 tarjeta a fusionar
     * @return la nueva tarjeta con la suma de los saldos.
     */
    public TarjetaRegalo fusionaCon(TarjetaRegalo t2) {
        // Instancia a devolver
        TarjetaRegalo tNueva = new TarjetaRegalo(this.saldo + t2.saldo);
        this.saldo = 0;
        t2.saldo = 0;

        // Devuelve la nueva tarjeta regalo
        return tNueva;
    }

    @Override
    public String toString() {

        return "Tarjeta No " + codigo + " - Saldo " + String.format("%.2f", saldo) + "€";
    }
}
