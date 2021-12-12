package es.perez;

import java.util.Locale;
import java.util.Scanner;

public class Activitat6 {
    private static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        String nomComplet = nomComplet();
        System.out.println("Nombre en minuscula: " + obtindreCaractersMinuscula(nomComplet));
        System.out.println("Nombre en majuscula: " + obtindreCaractersMajuscula(nomComplet));
        System.out.println("Longitud: " + obtindreLongitud(nomComplet));
        System.out.println("Dos primers caracters de la cadena: " + obtindreDosPrimersCaracters(nomComplet));
        obtindreTresAsterics(nomComplet);
        System.out.println("Numero de veces del ultimo caracter: " + obtindreUltimCaracter(nomComplet));
        System.out.println("Cadena invertida: " + obtindreCadenaInvertida(nomComplet));
        System.out.println("Ocurrencias del primer caracter en mayuscula: " + ocurrenciasPrimerCaracter(nomComplet));


    }
    public static String nomComplet (){
        System.out.print("Introdueix nom: ");
        String nom = teclat.next();
        System.out.print("Introdueix primer cognom: ");
        String cognom = teclat.next();
        System.out.print("Introdueix segon Cognom: ");
        String segonCognom = teclat.next();

        return String.format("%s %s %s",nom , cognom , segonCognom);

    }

    public static String obtindreCaractersMinuscula (String nomComplet){
        return nomComplet.toLowerCase();
    }

    public static String obtindreCaractersMajuscula (String nomComplet){
        return nomComplet.toUpperCase();
    }

    public static int obtindreLongitud (String nomComplet){
        return nomComplet.length();
    }

    public static String obtindreDosPrimersCaracters (String nomComplet){
        if (nomComplet.length()>2){
            return nomComplet.substring(0,1);
        }
        return nomComplet;
    }

    public static int obtindreUltimCaracter (String nomComplet){
        char ultimCaracter = nomComplet.charAt(nomComplet.length() -1);
        int numUltimCaracter = 0;
        for (int i = 0; i < nomComplet.length(); i++) {
            if (nomComplet.charAt(i) == ultimCaracter){
                numUltimCaracter++;
            }
        }
        return numUltimCaracter;
    }

    public static void obtindreTresAsterics (String nomComplet){
        String nomAsterics = nomComplet.concat("***");
        System.out.println(nomAsterics);
    }

    public static String ocurrenciasPrimerCaracter (String nomComplet){
        String caracter = nomComplet.substring(0,1);
        return nomComplet.replaceAll(caracter.toLowerCase(), caracter.toUpperCase());
    }


    public static String obtindreCadenaInvertida (String nomComplet){
        StringBuilder cadenaInvertida = new StringBuilder(nomComplet);
        nomComplet = cadenaInvertida.reverse().toString();
        return nomComplet;
    }
    public static void CadenaInvertida2 (String nomComplet){
        for (int i = nomComplet.length() - 1 ; i > 0 ; i--) {
            System.out.print(nomComplet.charAt(i));
        }
    }
}
