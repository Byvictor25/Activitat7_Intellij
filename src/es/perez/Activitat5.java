package es.perez;

import java.util.Scanner;

public class Activitat5 {
    private static Scanner teclat;
    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        String num1 = demanarDoubleComText();
        String num2 = demanarDoubleComText();

        System.out.println("Suma: " + num1 + " + " + num2 + " = " + obtidreSuma(num1, num2));
        System.out.println("Multiplicacio: " + num1 + " * " + num2 + " = " + obtindreMultiplicacio(num1, num2));

    }

    public static double obtidreSuma (String num1, String num2){
        Double numero1 = Double.valueOf(num1);
        Double numero2 = Double.valueOf(num2);
        return numero1 + numero2;

    }
    public static double obtindreMultiplicacio (String num1, String num2){
        Double numero1 = Double.valueOf(num1);
        Double numero2 = Double.valueOf(num2);
        return numero1 * numero2;
    }

    public static String demanarDoubleComText (){
        System.out.print("Introdueix un numero: ");
        return teclat.next();
    }

}
