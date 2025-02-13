package Tema10ColeccionesYDiccionarios.EjemploApuntes;

import java.util.ArrayList;

public class MainArrayList1 {
    public static void main(String[] args) {
        // definimos e instanciamos un ArrayList de cadenas
        ArrayList<String> colores = new ArrayList<String>() ;

        // mostramos el total de elementos
        System.out.println("Número de elementos: " + colores.size()) ;

        // añadimos elementos
        colores.add("Rojo") ;
        colores.add("Verde") ;
        colores.add("Azul") ;

        System.out.println("Número de elementos: " + colores.size()) ;

        // mostramos elementos por posición
        System.out.println("El elemento que está en la posición 0 es " + colores.get(0)) ;
        System.out.println("El elemento que está en la posición 1 es " + colores.get(1)) ;
        System.out.println("El elemento que está en la posición 2 es " + colores.get(2)) ;

        colores.remove("rojo");

        // mostramos elementos por posición
        System.out.println("El elemento que está en la posición 0 es " + colores.get(0)) ;
        System.out.println("El elemento que está en la posición 1 es " + colores.get(1)) ;
        // System.out.println("El elemento que está en la posición 2 es " + colores.get(2)) ;

    }
}
