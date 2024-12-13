/**
 * Examen de Programación
 * curso 2024|25
 * @author Antonio José Sánchez Bujaldon
 */

import libreria.MatLib;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("   PRUEBAS UNITARIAS   ");
        System.out.println("=======================");

        System.out.printf("Función suma       : %s\n", MatLib.suma(5,3)==8 && MatLib.suma(-5,-3)==-8?"correcto":"fallo");
        System.out.printf("Función inc        : %s\n", MatLib.inc(5)==6 && MatLib.inc(-5)==-4?"correcto":"fallo");
        System.out.printf("Función resta      : %s\n", MatLib.resta(5,3)==2 && MatLib.resta(-5, -3)==-2?"correcto":"fallo");
        System.out.printf("Función dec        : %s\n", MatLib.dec(5)==4 && MatLib.dec(-5)==-6?"correcto":"fallo");
        System.out.printf("Función esMayor    : %s\n", MatLib.esMayor(5,4) && !MatLib.esMayor(4, 5) && !MatLib.esMayor(5,5)?"correcto":"falso");
        System.out.printf("Función esMenor    : %s\n", MatLib.esMenor(4,5) && !MatLib.esMenor(5, 4) && !MatLib.esMenor(5,5)?"correcto":"falso");
        System.out.printf("Función esIgual    : %s\n", MatLib.esIgual(5,5)?"correcto":"falso");
        System.out.printf("Función multiplica : %s\n", MatLib.multiplica(5,2)==10?"correcto":"falso");
        System.out.printf("Función divide     : %s\n", MatLib.divide(10,2)==5?"correcto":"falso");
        System.out.printf("Función resto      : %s\n", MatLib.resto(10,3)==1 && MatLib.resto(10, 2)==0?"correcto":"falso");
        System.out.printf("Función potencia   : %s\n", MatLib.potencia(2,3)==8?"correcto":"falso");
        System.out.printf("Función cuadrado   : %s\n", MatLib.cuadrado(3)==9?"correcto":"falso");
        System.out.printf("Función cubo       : %s\n", MatLib.cubo(3)==27?"correcto":"falso");
        System.out.printf("Función esMultiplo : %s\n", MatLib.esMultiplo(25, 5) && !MatLib.esMultiplo(25, 3)?"correcto":"falso");
        System.out.printf("Función esDivisor  : %s\n", MatLib.esDivisor(5, 25) && !MatLib.esDivisor(3, 25)?"correcto":"falso");
        System.out.printf("Función esPrimo    : %s\n", MatLib.esPrimo(13) && !MatLib.esPrimo(4) && !MatLib.esPrimo(-5) && !MatLib.esPrimo(1) && !MatLib.esPrimo(0)?"correcto":"falso");
        System.out.printf("Función esCuadradoPerfecto: %s\n", MatLib.esCuadradoPerfecto(25) && !MatLib.esCuadradoPerfecto(8)?"correcto":"falso");

        // pirámide ===
        System.out.println("\n\nPirámide de altura 0:") ;
        MatLib.piramide(0) ; 

        System.out.println("\nPirámide de altura 1:") ;
        MatLib.piramide(1) ; 

        System.out.println("\nPirámide de altura 5:") ;
        MatLib.piramide(5) ; 

        System.out.println("\nPirámide de altura 14:") ;
        MatLib.piramide(14) ; 

    }
}
