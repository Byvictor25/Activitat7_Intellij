package es.perez;

public class Activitat19 {
    public static void main(String[] args) {
        int[] arrayA = {10,20,30,40,50,0,0};
        int[] arrayB = {60,70,80,90,100};

        int suma = arrayA[3] + arrayB[4];

        int[] arrayC = new int[5];

        arrayC[1] = suma + arrayA[0];

        arrayC[0] = arrayA[0] * arrayA[1] * arrayA[2] * arrayA[3] * arrayA[4];

        arrayC[2] = arrayA[0] + arrayA[1] + arrayA[2] + arrayA[3] + arrayA[4];

        arrayC[3] = arrayC[0] / arrayB[0];

        arrayC[4] = Math.max(arrayB[0], arrayA[4]);

        arrayA[6] = arrayC[0];

        System.out.print("Array A: ");
        visualizarArrayForEach(arrayA);
        System.out.print("\nArray B: ");
        visualizarArrayForEach(arrayB);
        System.out.print("\nArray C: ");
        visualizarArrayForEach(arrayC);
        visualizarExtremos(arrayA);

        int[] arrayCopia = obtenerCopia(arrayC);
        visualizarArrayForEach(arrayCopia);
        visualizarMultiplos(arrayA, 2);

    }

    public static void visualizarArrayFor(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento" + i + " :" + vector[i]);
        }
    }

    public static void visualizarArrayForEach(int[] vector){
        for (int item: vector) {
            System.out.print("\n" + item + ",");
        }
    }

    public static void visualizarExtremos(int[] vector){
        System.out.println("\nPrimer elemento: " + vector[0]);
        int ultimoElemento = vector.length - 1;
        System.out.println("Ultimo elemento: " + vector[ultimoElemento]);
    }

    public static int[] obtenerCopia(int[] vector){
        int[] arrayCopia = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            arrayCopia[i] = vector[i];
        }
        return arrayCopia;
    }

    public static void visualizarMultiplos(int[] vector, int entero){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % entero == 0){
                System.out.print("\n" + vector[i] + " es multiplo de : " + entero);
            }
        }
    }
}
