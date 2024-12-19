package tema02;
/**
 * Conversor de euros a pesetas y de pesetas a euros
 */
public class T2E3E4E5 {
    public static void main(String[] args) {
        final double TIPO_DE_CAMBIO = 166.386;
        // De pesetas a euros
        int pesetas = 1000;
        double conversion = pesetas / TIPO_DE_CAMBIO;
        System.out.printf("%d pesetas son %.2f euros\n", pesetas, conversion);

        // De euros a pesetas
        double euros = 1000;
        conversion = euros * TIPO_DE_CAMBIO;
        System.out.printf("%.2f euros son %.2f pesetas\n", euros, conversion);

    }
}
