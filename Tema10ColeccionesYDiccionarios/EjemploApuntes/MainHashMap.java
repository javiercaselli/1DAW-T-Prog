package Tema10ColeccionesYDiccionarios.EjemploApuntes;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        // Definimos y creamos el mapa
        HashMap<Integer, String> mapa = new HashMap<>();


        // Añadimos elementos al mapa
        mapa.put(924, "Amalia Núñez");
        mapa.put(921, "Cindy Nero");
        mapa.put(700, "César Vázquez");
        mapa.put(219, "Víctor Tilla");
        mapa.put(537, "Alan Brito");
        mapa.put(605, "Esteban Quito ");

        // Mostramos los elementos en pantalla
        System.out.println("Los elementos de m son: \n" + mapa);

        // Mostramos algunos elementos en pantalla
        System.out.println(mapa.get(921));
        System.out.println(mapa.get(605));
        System.out.println(mapa.get(888));


        // Utilizamos entrySet para extraer las entradas
        System.out.println("Todas las entradas del diccionario:");
        System.out.println(mapa.entrySet());

        // Extraemos las entradas una a una
        System.out.println("\nEntradas del diccionario:");
        for (Map.Entry pareja : mapa.entrySet()) {
            System.out.println(pareja);
        }


        System.out.println("Código\tNombre\n------");
        System.out.println("\t-------------");

        for (Map.Entry pareja : mapa.entrySet()) {
            System.out.print(pareja.getKey() + "\t");
            System.out.println(pareja.getValue());
        }

        System.out.print("Por favor, introduzca un código: ");
        int codigo = Integer.parseInt(System.console().readLine());
        if (mapa.containsKey(codigo)) {
            System.out.print("El código " + codigo + " corresponde a ");
            System.out.println(mapa.get(codigo));
        } else {
            System.out.print("El código introducido no existe.");
        }

    }
}
