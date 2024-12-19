package tema08Funciones.libreriaEj01;

import java.util.Scanner;

public class Matematicas {

    /**
     * Método que devuelve el inverso del número que se le pasa como parámetro
     * 
     * @param numero
     * @return
     */
    public static void voltea(int numero) {
        // Declaraciones
        int numeroInvertido = 0;
        int longitud = 0;

        /*
         * Vamos calculando el resto de dividir por diez para obtener el último dígito a
         * la derecha
         * y vamos formando el número invertido añadiéndolos por la izquierda
         * 
         * Se va multiplicando por 10 en cada paso parar "correr" los números a la
         * izquierda conforme
         * añadimos nuevos.
         */
        while (numero != 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;

            // Añadir el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;

            // Eliminar el último número del número original
            numero /= 10;

            longitud++;
        }

        /*
         * Si el número original tenía ceros al final, en el número invertido se
         * convierten
         * en ceros a la izquierda que desparecen, hay que agregarlos, para ello nos
         * valemos
         * de la longitud del número original.
         */
        int ceros = 0;
        while (numeroInvertido / (int) Math.pow(10, longitud - 1) == 0) {
            longitud--;
            ceros++;
        }

        /* Añado los ceros que faltan a la izquierda */
        while (ceros > 0) {
            System.out.print("0");
            ceros--;
        }
        System.out.println(numeroInvertido);
    }

    /**
     * Método que devuelve el inverso del número que se le pasa como parámetro
     * 
     * @param numero
     * @return
     */
    public static int invertirEntero(int numero) {
        // Declaraciones
        int numeroInvertido = 0;

        while (numero != 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;

            // Añadir el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;

            // Eliminar el último número del número original
            numero /= 10;
        }

        // Devuelve el número invertido
        return numeroInvertido;
    }

    /**
     * Función que devuelve si el número entero que se le pasa como parámetro es
     * capicúa.
     * 
     * @param numero
     * @return
     */
    public static boolean esCapicua(int numero) {
        return (numero == invertirEntero(numero));
    }

    /**
     * Función que comprueba si el número entero que se le pasa como parámetro es
     * primo
     * 
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero) {
        // Declaraciones
        boolean esPrimo = true;
        int i = 2;

        // Valor absoluto
        while (esPrimo && i <= (numero / 2)) {
            esPrimo = (numero % i != 0);
            i++;
        }

        return esPrimo;
    }

    /**
     * Devuelve el siguiente número primo al que se le pasa como parámetro.
     * 
     * @param numero
     * @return
     */
    public static int siguientePrimo(int numero) {
        // Declaraciones
        int siguientePrimo = numero + 1;

        while (!esPrimo(siguientePrimo)) {
            siguientePrimo++;
        }

        return siguientePrimo;
    }

    /**
     * Función que calcula potencias usando bucles.
     * 
     * @param base
     * @param exponente
     * @return
     */
    public static int potencia(int base, int exponente) {
        // Declaraciones
        int potencia = 1;

        for (int i = 0; i < exponente; i++) {
            potencia *= base;
        }

        return potencia;
    }

    /**
     * Función que cuenta el número de dígitos que tiene un número
     * 
     * @param numero
     * @return
     */
    public static int cuentaDigitos(int numero) {
        int resultado = 0;

        /*
         * Va dividiendo entre 10 hasta que se queda sin número, o sea
         * que tanto la división como el resto sean 0
         */
        do {
            numero /= 10;
            resultado++;
        } while ((numero / 10) != 0 || (numero % 10) != 0);

        return resultado;
    }

    /**
     * Función de devuelve el dígito que se encuentra en una determinada posición en
     * un número
     * 
     * @param numero
     * @param posicion
     * @return la posición empezando a contar desde 0, o -1 si la posición dada no
     *         existe
     */
    public static int digitoN(int numero, int posicion) {
        // Declaraciones
        int digito = -1;

        int longitud = cuentaDigitos(numero);
        numero = invertirEntero(numero);

        if (posicion < longitud) {
            for (int i = 0; i < posicion; i++) {
                digito = numero % 10;
                numero = numero / 10;
            }
        }

        return digito;
    }

    
    public static int posicionDeDigito(int numero, int digito) {
        return 0;
    }
}
