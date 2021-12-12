package es.perez;

import java.util.Random;

public class Activitat17 {
    public static void main(String[] args) {
        int[] elementos = crearArray();
        visualitzarArray(elementos);
        System.out.println("\nEl primer 0 esta en la posiscio " + cercarZero(elementos));
        intercanvia(elementos);
        visualitzarArray(elementos);
    }

    public static int[] crearArray(){
        Random generarAleatoris = new Random();

        int[] elements = new int[10];

        for (int i = 0; i < elements.length; i++) {
            int numeroAleatorio = generarAleatoris.nextInt(51);
            elements[i] = numeroAleatorio;
        }
        return elements;
    }

    public static void visualitzarArray(int[] vector){
        for (int item: vector) {
            System.out.print(item + ",");
        }
    }

    public static int cercarZero(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0){
                return i;
            }
        }
        return -1;
    }

    public static void intercanvia(int[] vector){

        if (vector.length >= 2){
            int primerElement = vector[0];
            int ultimElement = vector[vector.length -1];
            vector [0] = ultimElement;
            vector [vector.length -1] = primerElement;
        }
    }
}
