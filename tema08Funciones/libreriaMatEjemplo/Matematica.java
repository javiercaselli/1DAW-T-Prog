package tema08Funciones.libreriaMatEjemplo;

public class Matematica {

	public static int multiplicacion(int i, int j) {
        int producto = 0;
        while (j > 0) {
            producto += i;
            j--;
        }

        return producto;
	}

    public static int division(int dividendo, int divisor) {
        int cociente = 0;
        while (dividendo > 0) {
            cociente++;
            dividendo = dividendo - divisor;
        }

        return cociente;
    }

    public static boolean esPrimo(int numero) {
        boolean esPrimo = true;
        if (numero < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                esPrimo = (numero % i != 0);
            }
        }

        return esPrimo;
    }

    public static int potencia (int base, int exponente) {
        int potencia = 1;

        while (exponente > 0) {
            potencia = multiplicacion(potencia, base);
            exponente--;
        }


        return potencia;
    }

    public static int cuadrado (int numero) {
        return multiplicacion(numero, numero);
    }

    public static int cubo (int numero) {
        return (potencia(numero, 3));
        }

    /**
     * Devuelve true si "candidatoMult" es múltiplo de "numero"
     * es decir, "numero" divide exactametne a "candidatoMult"
     * 
     * @param candidato
     * @param numero
     * @return
     */
    public static boolean esMultiplo(int candidatoMult, int numero) {
        return (candidatoMult % numero == 0);
    }

    /**
     * Devuelve true si "candidatoDiv" es divisor de "numero".
     * Es decir "candidatoDiv" divide exactamente (resto 0) a "número"
     * 
     * @param candidato
     * @param numero
     * @return
     */
    public static boolean esDivisor(int candidatoDiv, int numero) {
        return (numero % candidatoDiv == 0);
    }

}
