package examen20250106.clases;

import examen20250106.interfaces.ClinicaInterfaz;

public class Clinica implements ClinicaInterfaz {
    // Atributos
    private Mascota[] listaMascotas = new Mascota[100];
    private int contador;

    public Clinica() {
        contador = 0;
    }

    /**
     * @return
     */
    @Override
    public boolean esVacia() {
        return (this.contador == 0);
    }

    /**
     * @return
     */
    @Override
    public boolean esLlena() {
        return (this.contador == listaMascotas.length);
    }

    /**
     * @return
     */
    @Override
    public int totalPerros() {
        return Perro.totalPerros;
    }

    /**
     * @return
     */
    @Override
    public int totalLoros() {
        return Loro.totalLoros;
    }

    /**
     * @return
     */
    @Override
    public int totalMascotas() {
        return Mascota.totalMascotas;
    }

    /**
     * @param chip
     * @return
     */
    @Override
    public Mascota buscarChip(String chip) {
        // Atributo de retoro
        Mascota mascota = null;
        boolean encontrado = false;
        for (int i = 0; !encontrado && i < listaMascotas.length; i++) {
            if (listaMascotas[i] != null) encontrado = (chip.equals(listaMascotas[i].getChip()));

            if (encontrado) {
                mascota = listaMascotas[i];
            }
        }

        return mascota;
    }

    /**
     * @param mascota
     */
    @Override
    public void agregar(Mascota mascota) {
        if (buscarChip(mascota.getChip()) != null) {
            System.out.println("ERROR: El chip de esta mascota ya está registrado en la clínica");
        } else {
            // Busca el primer hueco disponible e inserta la mascota
            int i = 0;
            while (listaMascotas[i] != null) {
                i++;
            }

            // Inserta la mascota
            listaMascotas[i] = mascota;

            // Actualiza estadísticas
            contador++;
            Mascota.totalMascotas++;
            if (mascota instanceof Perro) Perro.totalPerros++;
            else Loro.totalLoros++;
        }
    }

    /**
     *
     */
    @Override
    public void listar() {
        for (Mascota mascota : listaMascotas) {
            if (mascota != null) System.out.println(mascota);
        }
    }
}
