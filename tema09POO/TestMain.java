package tema09POO;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);

        int[][] tablero = new int[4][4];

        Gato duquesa = new Gato("Duquesa","Blanco", "Persa", "hembra", 3, 4);

        Gato silvestre = new Gato("Silvestre","negro y blanco", "mestizo", "macho", 4, 5);

        System.out.println("Tenemos dos gatos, Silvestre que es " + silvestre.getSexo() + " y tiene " +
        silvestre.getEdad() + " años. Y Duquesa, que es " + duquesa.getSexo() + " y tiene " +
        duquesa.getEdad() + " años");

        duquesa.peleaCon(silvestre);

        duquesa.come("Latita de Whiskas");

        Persona persona = new Persona("Pepe", "López");

        Alumno alumno1 = new Alumno("María", "Pelaez");

        Persona alumno2 = new Alumno("Javier", "Caselli");

        persona.andar();

        alumno1.andar();

        alumno2.andar();

        alumno1.estudiar();

    }
}

