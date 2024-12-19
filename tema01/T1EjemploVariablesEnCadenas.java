package tema01;
public class T1EjemploVariablesEnCadenas {
    public static void main(String args[]) {
        String nombre = "Javier";
        int edad = 54;
        int meses = 4;

        // Ejemplo usando printf sin necesidad de concatenar
        System.out.printf("\tMe llamo %s, \"Tengo\" %d años \\y %d meses.\b-\n\r", nombre, edad, meses);
        //System.out.println("");

        // Ejemplo usando printLn y concatenación de cadenas de caracteres
        System.out.println("Me llamo " + nombre + ", tengo " + edad + " años y " + meses + " meses.");

    }
}
