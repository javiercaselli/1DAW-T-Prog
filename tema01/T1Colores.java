package tema01;
public class T1Colores {
  public static void main(String[] args) {
    System.out.print  ("\033[33m mandarina") ;
    System.out.print  ("\033[32m hierba");
    System.out.print  ("\033[31m tomate");
    System.out.print  ("\033[37m sábanas");
    System.out.print  ("\033[36m cielo");
    System.out.print  ("\033[35m nazareno");
    System.out.println("\033[34m mar");

    System.out.println("\033[1m\033[48;5;3mHola \033[38;5;220m\tMundo\u263A\033[0m\n");

    double radio = 56;
    double radioAlCubo = Math.pow(radio, 3);
    double volumen = 4/3 * Math.PI * Math.pow(radio, 3);

    double pi = Math.PI;
    System.out.println(pi);
    System.out.printf("%f\n", pi);
    System.out.printf("%.0f\n", pi);

    
  

  }
}