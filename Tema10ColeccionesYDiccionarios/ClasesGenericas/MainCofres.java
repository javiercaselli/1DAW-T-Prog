package Tema10ColeccionesYDiccionarios.ClasesGenericas;

import java.util.ArrayList;

public class MainCofres {
    public static void main(String[] args) {
        Cofre<String> cofreCadenas = new Cofre<>("cadena", 10000);

        Cofre<Integer> cofreEnteros = new Cofre(7, 500);

        Integer numeroEnContenedor = 4;
        int numeroNormal = 7;
        numeroEnContenedor += numeroNormal;
        Long longContenedor;
        Boolean booleanoConetedor;
        Double doubleCont;
        Float floatCont;

        ArrayList<Integer> listaAnimales = new ArrayList<>();

        listaAnimales.add(7);

        int prueba = listaAnimales.get(0);

        System.out.println(prueba);


    }
}
