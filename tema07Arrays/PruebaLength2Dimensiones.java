package tema07Arrays;

public class PruebaLength2Dimensiones {
    public static void main(String[] args) {
        // Declara Array con inicialización en línea
        int[][] tabla = {
                            {8, -12, 33, 45},
                            {14, 1, -24},
                            {100, 51, 69}
                        };

        int[][] tabla2 = new int[3][4];

        System.out.println(tabla.length);
        System.out.println(tabla[0].length);
        System.out.println(tabla[1].length);

        System.out.println("");
        System.out.println(tabla2.length);
        System.out.println(tabla2[0].length);
        System.out.println(tabla2[1].length);

        int[] unaDimension = {3, 45, 67, 758, 68, 45, 7, 87, 23, 678, 89, 0, 9};

        for (int i = 0; i < unaDimension.length; i++) {
            System.err.println(unaDimension[i]);
        }
        System.out.println("\n\n");
        for (int valor : unaDimension) {
            System.out.println(valor);
        }

        System.out.println("\n\n");

        for (int[] columnas : tabla) {
            for (int valor : columnas) {
                System.out.print(valor + "\t");
            }
            System.out.println("");
        }

    }

}
