package es.perez;

import java.util.Arrays;
import java.util.Random;

public class Activitat20 {
    public static void main(String[] args) {
        Random generarAleatorios = new Random();

        int[] arrayPrimera = new int[10];

        for (int i = 0; i < arrayPrimera.length; i++) {
            arrayPrimera[i] = generarAleatorios.nextInt(50 - 1 );
        }

        for (int item: arrayPrimera) {
            System.out.print(item + ",");
        }

        ordenarPerIntercanvi(arrayPrimera);
        System.out.print("\n" + Arrays.toString(arrayPrimera));
    }

    public static void ordenarPerIntercanvi(int[] vector){
        for (int i = 0; i < vector.length -1; i++) {
            for (int j = i +1; j <vector.length ; j++) {
                if (vector[j] < vector[i]){
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }
}