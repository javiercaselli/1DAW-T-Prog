package libreria;

public class MatLib {

    /**
     * Realiza la adición de los dos números que se le pasan como 
     * parámetros.
     * 
     * @param sumando1
     * @param sumando2
     * @return
     */
    public static int suma(int sumando1, int sumando2) {
        return (sumando1 + sumando2);
    }

    /**
     * Incrementa el número que se le pasa como parámetro.
     * 
     * @param numero
     * @return
     */
    public static int inc(int numero) {
        return suma(numero, 1);
    }

    /**
     * Realiza la sustracción entre los dos números que se le pasan
     * como parámetros.
     * 
     * @param minuendo
     * @param sustraendo
     * @return
     */
    public static int resta(int minuendo, int sustraendo) {
        return suma(minuendo, -sustraendo);
    }

    /**
     * Decrementa el número que se le pasa como parámetro.
     * 
     * @param numero
     * @return
     */
    public static int dec(int numero) {
        return resta(numero, 1);
    }

    /**
     * Devuelve true si el primer número que se le pasa como parámetro es mayor
     * que el segundo.
     * 
     * @param num1
     * @param num2
     * @return
     */
    public static boolean esMayor(int num1, int num2) {
        return (resta(num1, num2) > 0);
    }

    /**
     * Devuelve true si el primer número que se le pasa como parámetro es menor
     * que el segundo.
     * 
     * @param num1
     * @param num2
     * @return
     */
    public static boolean esMenor(int num1, int num2) {
        return esMayor(num2, num1);
    }

    /**
     * Devuelve si los dos números que se le pasan como parámetro son iguales.
     * 
     * @param num1
     * @param num2
     * @return
     */
    public static boolean esIgual(int num1, int num2) {
        return (!esMayor(num1, num2) && !esMenor(num1, num2));
    }

    /**
     * Devuelve el producto de los dos números que se le pasan
     * como parámetros.
     * 
     * @param multiplicando
     * @param multiplicador
     * @return
     */
    public static int multiplica(int multiplicando, int multiplicador) {
        int producto = 0;
        while (multiplicador > 0) {
            producto = suma(producto, multiplicando);
            multiplicador = resta(multiplicador, 1);
        }

        return producto;
    }

    /**
     * Devuelve el cociente de la división entera de los dos números que
     * se le pasan como parámetros.
     * 
     * @param dividendo
     * @param divisor
     * @return
     */
    public static int divide(int dividendo, int divisor) {
        int cociente = 0;
        while (esMayor(dividendo, divisor) || esIgual(dividendo, divisor)) {
            cociente = inc(cociente);
            dividendo = resta(dividendo, divisor);
        }

        return cociente;
    }

    /**
     * Devuelve el resto de la división entera entre los dos números 
     * que se le pasan como parámetro.
     * 
     * @param dividendo
     * @param divisor
     * @return
     */
    public static int resto(int dividendo, int divisor) {
        int cociente = divide(dividendo, divisor);

        return (dividendo - multiplica(divisor, cociente));
    }

    /**
     * Devuelve la potencia de la base y el exponente que se les pasa
     * como parámetro.
     * 
     * @param base
     * @param exponente
     * @return
     */
    public static int potencia(int base, int exponente) {
        int potencia = 1;
        while (exponente > 0) {
            potencia = multiplica(potencia, base);
            exponente = resta(exponente, 1);
        }

        return potencia;
    }

    /**
     * Devuelve la potencia al cuadrado del número que se le pasa como parámetro.
     * @param i
     * @return
     */
    public static int cuadrado(int i) {
        return potencia(i, 2);
    }

    /**
     * Devuelve la potencia al cubo del número que se le pasa como parámetro.
     * 
     * @param i
     * @return
     */
    public static int cubo(int i) {
        return potencia(i, 3);
    }

    /**
     * Devuelve true si el primer parámetro es múltiplo del segundo.
     * 
     * Es decir, si j divide exactamente a i.
     * 
     * @param i
     * @param j
     * @return true si i es múltiplo de j.
     */
    public static boolean esMultiplo(int i, int j) {
        return (esIgual(resto(i, j), 0));
    }

    /**
     * Devuelve true si el primer parámetro es divisor del segundo.
     * 
     * Es decir, si i divide exactamente a j.
     * 
     * @param i
     * @param j
     * @return devuelve true si i es divisor de j
     */
    public static boolean esDivisor(int i, int j) {
        return (esIgual(resto(j, i), 0));
    }

    /**
     * Devuelve true si el número que se le pasa como parámetro es primo.
     * 
     * Esta función no tiene en cuenta números negativos, el 0 y el 1, todos
     * ellos serán considerados no primos.
     * 
     * @param num
     * @return true si num es primo
     */
    public static boolean esPrimo(int num) {
        boolean esPrimo = true;

        if (num < 2) {
            esPrimo = false;
        } else {
            int i = 2;
            while (esMenor(i, num) && esPrimo) {
                esPrimo = !(esDivisor(i, num));
                i = inc(i);
            }
        }

        return esPrimo;
    }

    /**
     * Devuelve verdadero si el número pasado como parámetro es un
     * cuadrado perfecto.
     * 
     * Un número es cuadrado perfecto cuando es el resultado de elevar
     * al cuadrado otro número.
     * 
     * Por ejemplo, 25 es cuadrado perfecto ya que es el resultado de
     * elevar 5 al cuadrado. En cambio, 8 no es un cuadrado perfecto ya 
     * que no existe ningún número entero cuya potencia al cuadrado sea 8.
     * 
     * @param num
     * @return true si num es cuadrado perfecto.
     */
    public static boolean esCuadradoPerfecto(int num) {
        int i = 1;

        while (esMenor(cuadrado(i), num)) {
            i = inc(i);
        }

        return (esIgual(cuadrado(i), num));
    }

    /**
     * Dibuja una pirámide de texto de la altura indicada.
     * 
     * Cada nivel de la pirámide será un número capicúa tal que así:
     * 
     *    1
     *   121
     *  12321
     * 1234321
     * 
     * Y así sucesivamente para pirámides de mayor altura.
     * 
     * @param altura
     */
    public static void piramide(int altura) {
        for (int i = 0; esMenor(i, altura); i = inc(i)) {
            // espacios
            for (int j = altura; esMayor(j, i+1); j = dec(j)) {
                System.out.print(" ");
            }

            /*
             * Números de la pirámide
             * 
             * Se pinta primero incrementándose hasta la mitad, y luego
             * decrementándose la otra mitad, para conseguir el capicúa.
             * 
             * Para controlar el tamaño de las pirámides de altura mayor que 10,
             * se hace el print del resto del valor de la variable divivida
             * entre diez, para garantizar número de un solo dígito en todo momento
             */
            for (int k = 0; esMenor(k, i + 1); k = inc(k)) {
                System.out.print(resto(k+1, 10));
            }
            for (int l = i; esMayor(l, 0); l = dec(l)) {
                System.out.print(resto(l, 10));
            }
            System.out.println("");
        }
    }
}
