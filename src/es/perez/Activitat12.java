package es.perez;

import java.util.Scanner;

public class Activitat12 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int [] listado = new int[10];

        for (int i = 0; i < listado.length; i++) {
            System.out.print("Introduce un numero: ");
            listado[i] = teclat.nextInt();
        }

        for (int i = 0; i < listado.length; i++) {
            System.out.println("Elemento " + i + ": " + listado[i]);
        }
    }
}
