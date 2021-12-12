package es.perez;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activitat18 {
    public static void main(String[] args) {

        String[] diesDeLaSetmana = {"dilluns", "dimarts", "dimecres", "dijous", "divendres", "dissabte", "diumenge"};
        String[] diesDeLaSetmana2 = diesDeLaSetmana;

        diesDeLaSetmana2[0] = "Monday";
        System.out.println(Arrays.toString(diesDeLaSetmana) + ",");
        System.out.println(Arrays.toString(diesDeLaSetmana2) + ",");

        String[] diesDeLaSetmana3 = copiaArray(diesDeLaSetmana2);

        diesDeLaSetmana3[0] = "Lunes";


    }
    public static String[] copiaArray(String[] myArray) {

        String[] arrayCopia = new String[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            arrayCopia[i] = myArray[i];
        }
        return arrayCopia;
    }
}
