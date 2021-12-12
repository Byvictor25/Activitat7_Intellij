package es.perez;

import java.util.Scanner;

public class Activitat13 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String [] elementos = new String[10];

        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Introduce un elemento: ");
            elementos[i] = teclat.next();
        }

        for (int i = 0; i < elementos.length; i++) {
            if (i % 2 == 0){
                System.out.println("Elemento " + i + ": " + elementos[i]);
            }
        }
    }
}
