package es.perez;

import java.util.Scanner;

public class Activitat8 {
    private static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        StringBuilder cadenaMutable = new StringBuilder();
        cadenaMutable.append(obtindreCadena());
        cadenaMutable.append(" ");
        cadenaMutable.append(obtindreCadena());
        cadenaMutable.append(" ");
        cadenaMutable.append(obtindreCadena());
        cadenaMutable.reverse();
        System.out.println(cadenaMutable);

    }
    public static String obtindreCadena (){
        System.out.println("Introduce 1 cadena");
        return teclat.next();

    }
}
