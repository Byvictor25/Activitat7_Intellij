package es.perez;

public class Activitat1 {

    public static void main(String[] args) {
        System.out.println(esUnSaludo("Mipolla"));

    }

    public static boolean esUnSaludo(String cadena){
        if (cadena.equalsIgnoreCase("Hola")){
            return true;
        } else if (cadena.equalsIgnoreCase("Hello")){
            return true;
        }else {
            return cadena.equalsIgnoreCase("Què tal");
        }

    }
}