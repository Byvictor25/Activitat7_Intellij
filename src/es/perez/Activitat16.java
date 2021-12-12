package es.perez;

import java.util.Random;

public class Activitat16 {
    public static void main(String[] args) {

        Random generarAleatorios = new Random();

        int [] elementos = new int[200];

        for (int i = 0; i < elementos.length; i++) {
            int numeroAleatorio = generarAleatorios.nextInt(200);
            elementos[i] = numeroAleatorio;
        }

        int suma = 0;

        for (int item: elementos) {
            if (item % 3 == 0){
                suma += item;
            }
        }
        System.out.print("La suma dels numeros senars es = " + suma);
    }
}