package es.perez;

public class Activitat2 {
    public static void main(String[] args) {
        mostrarCaracters("Mi polla en tu boca tt");

    }
    public static void mostrarCaracters(String cadena){
        for (int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);
            if (actual != ' '){
                System.out.print(actual);
                if (i < cadena.length() -1 ) {
                    System.out.print('-');
                }
            }
        }
    }
}