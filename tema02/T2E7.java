package tema02;

public class T2E7 {
    public static void main(String[] args) {
        char caracter1 = 'a';
        char caracter2 = 'z';
        String cadena = "abecedario";

        System.out.println("" + caracter1 + caracter2 + cadena);
        
        StringBuilder sb = new StringBuilder();

        sb.append(caracter1);
        sb.append(caracter2);
        sb.append(cadena);

        System.out.println(sb.toString());
    }
}
