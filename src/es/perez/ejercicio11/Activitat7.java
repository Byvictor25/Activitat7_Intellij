package es.perez.ejercicio11;

import java.util.Scanner;

public class Activitat7 {

    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        String cadena1 = obtenerPrimeraCadena();
        String cadena2 = obtenerSegunaCadena();
        System.out.print("Resultado: " + cadenaPalabraMayuscula(cadena1, cadena2));

    }

    public static String cadenaPalabraMayuscula (String cadena1, String cadena2){
        int numero = cadena1.lastIndexOf(cadena2);
        String mayus = " ";
        if (numero > 0){
            int longitudCadena = cadena2.length();
            String cadenaRepetida = cadena1.substring(numero, numero + longitudCadena);
            mayus = cadenaRepetida.toUpperCase();
        }
        return cadena1.replaceAll(cadena2, mayus);
    }



    public static String obtenerPrimeraCadena(){
        String cadena1;
        do {
            System.out.print("Introduce cadena1: ");
            cadena1 = teclado.nextLine();
            if (cadena1.length() <= 6){
                teclado.next();
            }
        }while (cadena1.length() <= 6);
        return cadena1;
    }

    public static String obtenerSegunaCadena(){
        String cadena2;
        do {
            System.out.print("Introduce cadena2: ");
            cadena2 = teclado.next();
            if (cadena2.length() <= 2){
                teclado.next();
            }
        }while (cadena2.length() <= 2);
        return cadena2;
    }
}