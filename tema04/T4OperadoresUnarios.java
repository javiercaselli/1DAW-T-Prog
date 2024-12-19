package tema04;

/**
 * Clase para demostrar el uso de los operadores unarios
 */
public class T4OperadoresUnarios {
    public static void main(String[] args) {
        // Comentario de una sola línea
        /*
         * Este comentario se puede extender
         * a lo largo de varias líneas
         * 
         * Se utiliza para aclaraciones del código más extensas
         */

        // Prueba de operadores unarios
        int numero = 100;

        /*
         * Operador incremento sufijo (numero++)
         */
        int incrementoSufijo = numero--;
        System.out.println(incrementoSufijo);

        /*
         * Operador incremento prefijo (++numero)
         */
        int incrementoPrefijo = --numero;
        System.out.println(incrementoPrefijo);
    }
}
