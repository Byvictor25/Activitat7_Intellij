package es.perez;

import java.util.Arrays;
import java.util.Random;

public class Activitat22 {

    static Random generadorAleatorios = new Random();

    public static void main(String[] args) {

        int[] llistat1 = generarArray(10);
        int numBuscar = 50;
        System.out.println(Arrays.toString(llistat1));
        int indexElement = cercarEnVectorNoOrdenat(llistat1, numBuscar);
        System.out.printf("El element %d esta en el index %d\n" ,numBuscar ,indexElement);

        int[] llistat2 = generarArray(10);
        ordenarPerIntercanvi(llistat2);
        System.out.println(Arrays.toString(llistat2));
        indexElement = cercarEnVectorOrdenat(llistat2, numBuscar);
        System.out.printf("El element %d esta en el index %d" ,numBuscar ,indexElement);

    }

    public static int cercarEnVectorNoOrdenat(int[] numeros, int numbuscar){
        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i] == numbuscar){
                return i;
            }
        }
        return -1;
    }

    public static int cercarEnVectorOrdenat(int[] numeros, int numBuscar){
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numBuscar){
                return i;
            } else if (numeros[i] > numBuscar){
                break;
            }
        }
        return -1;
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

    public static int[] generarArray (int numeroElementos){
        int[] array1 = new int[numeroElementos];

        for (int i = 0; i <array1.length ; i++) {
            array1[i] = generadorAleatorios.nextInt(100);
        }
        return array1;
    }
}
