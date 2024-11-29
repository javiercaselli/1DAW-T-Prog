package miscelanea;
public class NumeroAString {
    public static void main(String[] args) {
        int numero = 1000 + (int) (Math.random() * (10000));
        System.out.println(numero);

        // convierto a String 
        String sNumero = String.valueOf(numero);
        
        for (int i = 0; i < sNumero.length(); i++) {
            int digito = Integer.parseInt(String.valueOf(sNumero.charAt(i)));
            System.out.println(digito);
        }
    }
}
