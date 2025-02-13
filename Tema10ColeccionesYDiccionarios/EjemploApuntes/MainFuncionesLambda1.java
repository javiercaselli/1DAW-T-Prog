package Tema10ColeccionesYDiccionarios.EjemploApuntes;

import java.util.ArrayList;

public class MainFuncionesLambda1 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>() ;

        // añadimos elementos
        colores.add("Rojo") ;
        colores.add("Verde") ;
        colores.add("Azul") ;


        // eliminamos aquellos colores que contengan una A
        colores.removeIf((palabra) -> palabra.contains("A")) ;

        System.out.println("El elemento que está en la posición 0 es " + colores.get(0)) ;
        System.out.println("El elemento que está en la posición 1 es " + colores.get(1)) ;
        // System.out.println("El elemento que está en la posición 2 es " + colores.get(2)) ; //Index out of bounds si borra.

    }
}
