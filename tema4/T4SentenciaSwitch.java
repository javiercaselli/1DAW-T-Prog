package tema4;

import java.util.Scanner;

/**
 * Clase para demostrar la sentencia switch-case
 * 
 * Recoge una nota numérica por teclado y la transforma a texto
 */
public class T4SentenciaSwitch {
    public static void main(String[] args) {
        // Lee la nota numérica del teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la nota numérica: ");
        int nota = sc.nextInt();
        String notaTexto = "";

        switch (nota) {
            case 0,1,2,3,4:
                notaTexto = "Suspenso";
                break;
            case 5:
                notaTexto = "Aprobado";
                break;
            case 6:
                notaTexto = "Bien";
                break;
            case 7,8:
                notaTexto = "Notable";
                break;
            case 9,10:
                notaTexto = "Sobresaliente";
                break;
            default:
                notaTexto = "ERROR: Nota inválida";
        }

        // Imprimimos la nota por pantalla
        System.out.println("La nota introducidad esquivale a un: " + notaTexto);


        // Cierra el scanner
        sc.close();;
    }
}
