package tema8Funciones;

public class PruebasFunciones {
    
    /**
     * Función de determina si el número que se le pasa como parámetro
     * es par.
     * 
     * @param numero
     * @return true si el parámetro número es par.
     */
    public static boolean esPar(int numero) {
        return (numero % 2 == 0);
    }

    /**
     * 
     * @param numero
     * @return
     */
    public static boolean esImpar (int numero) {
        return (numero % 2 != 0);
    }

    public static float pow (int base, int exp) {
        float potencia = 1;

        for (int i = 0; i < exp; i++) {
            potencia *= base;
        }

        return potencia;
    }

    public static int digitoEnPosicion (int numero, int digito) {
        int num = numero;
        int posicion = 0;
        boolean encontrado = false;
        while ((num / 10 != 0) && !encontrado) {
            encontrado = (num % 10 == digito);
            num = num / 10;
            posicion++;
        }

        if (!encontrado) posicion = 0;

        return posicion;
    } 
    
    public static void main(String[] args) {
        int año = 7;
        int pepito = 2;

        if (esImpar(año)) {
            System.out.println("El numero " + año + " es impar");
        }

        if (esPar(pepito)) {
            System.out.println("El numero " + pepito + " es par");
        }

        float potencia = pow(año, pepito);

        int digito = 8;
        int numero = 7832;
        System.out.printf("El dígito %d aparece en la posición %d en el numero %d", 
        digito, digitoEnPosicion(numero, digito), numero);
        
    }
}
