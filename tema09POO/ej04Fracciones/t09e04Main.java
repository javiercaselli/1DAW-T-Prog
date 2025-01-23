package tema09POO.ej04Fracciones;

public class t09e04Main {
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(560,18);
        Fraccion fraccion2 = new Fraccion(462,6);

        System.out.println("Fracción 1: " + fraccion1);
        System.out.println("Fracción 2: " + fraccion2);
        System.out.println("Fracción 1 simplificada: " + fraccion1.simplificar());
        System.out.println("Fracción 2 simplificada: " + fraccion2.simplificar());
        System.out.println("Fracción 1 * fracción 2: " + fraccion1.multiplicar(fraccion2));
        System.out.println("Fracción 1 / fracción 2: " + fraccion1.dividir(fraccion2));


    }
}
