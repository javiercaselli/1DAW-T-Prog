package examenT1T3;

/**
 * Clase para dibujar una piramide de "*" de colores
 * 
 */
public class ExamenT1T3Ejercicio4 {
    public static void main(String[] args) {
        // Dibuja cada fila de la pirámide con los "*" y sus códigos de color correspondientes
        System.out.println("    \033[38;5;1m*");
        System.out.println("   \033[38;5;1m*\033[38;5;214m*\033[38;5;220m*");
        System.out.println("  \033[38;5;1m*\033[38;5;214m*\033[38;5;220m*\033[38;5;10m*\033[38;5;14m*");
        System.out.println(" \033[38;5;1m*\033[38;5;214m*\033[38;5;220m*\033[38;5;10m*" + 
                            "\033[38;5;14m*\033[38;5;5m*\033[38;5;13m*");
        System.out.println("\033[38;5;1m*\033[38;5;214m*\033[38;5;220m*\033[38;5;10m*" + 
                            "\033[38;5;14m*\033[38;5;5m*\033[38;5;13m*\033[38;5;207m*\033[38;5;1m*\033[0m");
    }
}
