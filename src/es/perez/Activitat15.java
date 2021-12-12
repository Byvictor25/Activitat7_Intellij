package es.perez;

import java.util.Random;

public class Activitat15 {
    public static void main(String[] args) {

        Random generadorAleatori = new Random();

        int [] elementos = new int[20];

        for (int i = 0; i < elementos.length; i++) {
            int numeroAleatori2 = generadorAleatori.nextInt(10);
            elementos[i] = numeroAleatori2;
        }

        int contador = 0;
        for ( int item: elementos) {
            if (contador == 4){
                System.out.print(" ");
                contador = 0;
            }
            System.out.print(item);
            contador ++;
        }
    }
}