package tema3;

public class T3Ejemplo1 {
    public static void main(String[] args) {
        String nombre;
        System.out.print("Dime cómo te llamas: ");
        nombre = System.console().readLine();

        System.out.print("Dime tu edad: ");
        String edadString = System.console().readLine();
        int edad = Integer.parseInt(edadString);
        System.out.println(edad);

        System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");
    }
}
