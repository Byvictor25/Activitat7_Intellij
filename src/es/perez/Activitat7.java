package es.perez;

import java.util.Locale;
import java.util.Scanner;

public class Activitat7 {

    private static Scanner teclat;


    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        String cadena = obtindreCadena();
        obtindreCapICua(cadena);

    }

    public static void obtindreCapICua (String cadena) {
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == cadena.charAt(cadena.length() - i - 1)) {
                System.out.println("True");
                return;
            } else {
                System.out.println("False");
                return;
            }
        }
    }

    public static String obtindreCadena (){
        System.out.println("Introduce una palabra: ");
        return teclat.next();
    }

    public static boolean obtindreCapICua2 (String cadena) {
        int rightIndex = cadena.length() - 1;
        int leftIndex = 0;
        while (leftIndex < rightIndex) {
            if (cadena.charAt(leftIndex) != cadena.charAt(rightIndex)){
                return false;
            }
            leftIndex ++;
            rightIndex --;
        }
        return true;
    }
}
