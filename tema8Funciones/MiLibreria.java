package tema8Funciones;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MiLibreria {
    /**
     * Lee un valor numérico entero mayor que 2 desde teclado
     * @return
     */
    public static int leerValorEnteroMayorQue2() {

        int numero;
        boolean ok = false;
        Scanner sc = new Scanner(System.in);

        do {
            numero = sc.nextInt();
            ok = (numero > 2);
            if (!ok) {
                System.out.println("Lo siento, el valor mínimo es 2");
                System.out.print("Introduzca un nuevo valor: ");
            }
        } while (!ok);

        sc.close();

        return numero;
    }

    /**
     * Lee un valor numérico entero mayor que 2 desde teclado
     * @return
     */
    public static int leerValorEnteroPositivo() {

        int numero=-1;
        Scanner sc;

        do {
            sc = new Scanner(System.in);
            try {
                numero = sc.nextInt();
                if (!(numero >= 0)) {
                    System.out.println("ERROR: Debe ser un valor numérico entero positivo");
                    System.out.print("Introduzca un nuevo valor: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debe ser un valor numérico entero positivo");
            } catch (NoSuchElementException nse) {
                nse.printStackTrace();
                break;
            }
        } while (!(numero >= 0));

        //sc.close();

        return numero;
    }

}
