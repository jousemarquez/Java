package com.calculadora;

public class Main {
    public static void main (String[] args){
        // Prueba desde main

        CalculadoraDeMano.menuCalculadora();

        int[] arrayInt = {1,2,3,4};

        int[][] arrayInt2D = {
                {5,9,3},
                {3,4},
                {1}
        };
    }

    public static void imprimirArray (int[] arrayInt){
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
    }

    public static void imprimirArray (int[][] arrayInt){
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("{");
            imprimirArray(arrayInt[i]);
            }
            System.out.println("}");
    }
}
