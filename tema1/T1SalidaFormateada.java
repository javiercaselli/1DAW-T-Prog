package tema1;
public class T1SalidaFormateada {
  public static void main(String[] args) {
    System.out.printf("El número %d no tiene decimales.\n", 21);
    System.out.printf("El número %f sale con decimales.\n", 21.0);
    System.out.printf("El %.2f sale exactamente con %d decimales.\n", 21.0, 2);
    System.out.printf("El caracter ASCII número 73 es %c.\n", 73);
    System.out.printf("El número %d sin signo es %ddu.\n", -73, -73);
    System.out.printf("Mostramos el segundo: %2$d; y después el primero: %1$d.\n", 23, 56);

    System.out.printf("%8d\n", 100); // rellena con espacios a la izquierda
    System.out.printf("%08d\n", 100); // rellena con ceros a la izquierda
    System.out.printf("%+d\n", 100); // muestra el signo del número
    System.out.printf("%-8d\n", 100); // rellena con espacios a la derecha

    System.out.printf("%.4f\n", 25.876532);
    System.out.printf("%.5s\n", "¡Hola mundo!");

  }
}
