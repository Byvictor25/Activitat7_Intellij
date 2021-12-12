package es.perez;

public class Activitat4 {
    public static void main(String[] args) {
        String exemple1 = new String("Hola que pasa");
        String exemple2 = new String("Toma chupete");
        System.out.println(canviarMinusculesA(exemple1));
        System.out.println(canviarMinusculesA(exemple2));
    }

    public static String canviarMinusculesA (String cadena){
        String minuscules = cadena.replaceAll("e", "a");
        minuscules = minuscules.replaceAll("i", "a");
        minuscules = minuscules.replaceAll("o", "a");
        minuscules = minuscules.replaceAll("u", "a");
        return minuscules;
    }
}
