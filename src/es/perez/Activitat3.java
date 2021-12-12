package es.perez;

public class Activitat3 {
    public static void main(String[] args) {
        System.out.println(obtindreMeitatCadena("Iker la chupa"));

    }
    public static String obtindreMeitatCadena (String cadena) {

        return cadena.substring(0, (cadena.length()) / 2);
    }
}
