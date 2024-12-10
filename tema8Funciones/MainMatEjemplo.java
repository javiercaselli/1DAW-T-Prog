package tema8Funciones;
import tema8Funciones.libreriaMatEjemplo.Matematica;

public class MainMatEjemplo {
    public static void main(String[] args) {
        System.out.println("Multiplicacion: " + (Matematica.multiplicacion(5,4) == 20));
        System.out.println("División: " + (Matematica.division(32, 4) == 8));
        System.out.println("esPrimo: " + (Matematica.esPrimo(5)));
        System.out.println("Potencia: " + (Matematica.potencia(5, 3) == 125));
    }
}
