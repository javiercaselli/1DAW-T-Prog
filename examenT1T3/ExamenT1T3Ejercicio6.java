package examenT1T3;

import java.util.Locale;
import java.util.Scanner;

/**
 * Factora formateada
 */
public class ExamenT1T3Ejercicio6 {

    public static final int TIPO_IVA = 21;
    public static void main(String[] args) {
        // Título del programa
        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("=========================");

        // Entrada por teclado
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        System.out.print("Introduce código de artículo: ");
        int codigo = sc.nextInt();
        System.out.print("Introduce precio: ");
        double precioUnitario = sc.nextDouble();
        System.out.print("Introduce unidades vendidas: ");
        int unidades = sc.nextInt();
        System.out.print("Introduce descuento (%): ");
        double tipoDescuento = sc.nextDouble();

        // Generar ticket
        System.out.println("\nSu Ticket:\n");

        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("=========================");

        // Calculos
        double precio = precioUnitario * unidades;
        double descuento = precio * (tipoDescuento/100);
        double precioDescuento = precio - descuento;
        double IVA = precioDescuento * (TIPO_IVA/100f);
        double precioIVA = precioDescuento + IVA;

        // Formatea factura
        System.out.printf("%d\t\t%.2f€\n", codigo, precioUnitario);
        System.out.printf("%d unidades\t%.2f€\n", unidades, precio);
        System.out.printf("-%.0f%%\t\t%.2f€\n", tipoDescuento, descuento);
        System.out.printf("%d%% IVA\t\t%.2f€\n", TIPO_IVA, IVA);
        System.out.printf("\033[1m\033[48;5;210mTOTAL           %.2f€\033[0m\n", 
            precio - descuento + IVA);



    }

}
