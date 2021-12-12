package es.perez;

import java.util.Arrays;

public class Activitat21 {
    public static void main(String[] args) {
        String[] partners = {"Iker" , "Pafloca" , "Koke" , "Victor" , "Alexis"};

        System.out.println(Arrays.toString(partners));

        ordenarPerSeleccio(partners);
        System.out.println(Arrays.toString(partners));

    }

    public static void ordenarPerSeleccio(String[] cadena){
        for (int i = 0; i < cadena.length - 1; i++) {
            int indiceElementoMenor = i;
            for (int j = i + 1; j < cadena.length ; j++) {
                int comparacion = cadena[j].compareTo(cadena[i]);
                if (comparacion < 0){
                    indiceElementoMenor = j;
                }
            }
            if (indiceElementoMenor != i){
                String aux = cadena[indiceElementoMenor];
                cadena[indiceElementoMenor] = cadena[i];
                cadena[i] = aux;
            }
        }
    }
}
