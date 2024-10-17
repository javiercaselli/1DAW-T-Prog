package tema1;
public class T1E4 {
    String cadena = "hola";
    char prueba = 'C';
    int num = 7;
    int i;
    long i2;
    float f = 1.0f;
    String i3;


    public static void main(String[] args) {
        int i2 = 4;


        System.out.println("Hora\tLun\tMar\tMie\tJue\tVie");
        System.out.println("----\t---\t---\t---\t---\t---");
        System.out.println("1ªM |\tGuardia");
        System.out.println("2ªM |\tGuardia");
        System.out.println("3ªM |\tHE");
        System.out.println("4ªM |\tHE\tPROGM");
        System.out.println("5ªM |\tPROGM\tPROGM\tHE");
        System.out.println("6ªM |\tPROGM\tPROGM\tHE");
        System.out.println("1ªT |\t\tPROGT\t\tPROGT\tPROGT");
        System.out.println("2ªT |\t\tPROGT\t\tPROGT\tPROGT");
        System.out.println("3ªT |\t\t\t\tPROGT");
        System.out.println("4ªT |\t\t\t\tPROGT");
        System.out.println("5ªT |\t\t\t\tGuardia");
        System.out.println("6ªT |\t");


        int x = 2 ;
        int y = 9 ;
        
        double division ;
        
        System.out.println(y / x) ;			            // da como resultado 4.0 (división de dos enteros -> entero)
        System.out.println((double) y / (double) x) ;			            // da como resultado 4.0 (división de dos enteros -> entero)
        System.out.println((double) y / x) ;			            // da como resultado 4.0 (división de dos enteros -> entero)
        System.out.println(y / (double) x) ;			            // da como resultado 4.0 (división de dos enteros -> entero)
        
    }
}
