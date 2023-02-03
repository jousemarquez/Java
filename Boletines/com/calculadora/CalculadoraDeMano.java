package com.calculadora;

import java.util.Scanner;

/*
     * Crear una clase que modele una calculadora de mano:
     * Suma, resta, multiplicación, división, tanto por ciento, cambio de signo, raíz cuadrada y potencia.
     * Todos los métodos reciben sus correspondientes argumentos y devuelven el resultado de la operaación.
     * Crear en el método main código que pruebe todos los métodos.
     */

public class CalculadoraDeMano {
    public static void menuCalculadora() {

        Scanner scan = new Scanner(System.in);
        String opc = "";
        double numero = 0, numero2 = 0;
        do {
            System.out.println("Elegir la operación deseada (1-8, 0 = SALIR):\n" +
                    "1 - SUMAR \n" +
                    "2 - RESTAR\n" +
                    "3 - MULTIPLICAR\n" +
                    "4 - DIVIDIR\n" +
                    "5 - CALCULAR PORCENTAJE\n" +
                    "6 - CAMBIAR SIGNO\n" +
                    "7 - RAIZ CUADRADA\n" +
                    "8 - ELEVAR\n");

            eleccion(opc);

            switch (opc) {
                case "1":
                    System.out.println(sumar(numero,numero2));
                    break;
                case "2":
                    System.out.println(restar(numero,numero2));
                    break;
                case "3":
                    System.out.println(multiplicar(numero,numero2));
                    break;
                case "4":
                    System.out.println(dividir(numero,numero2));
                    break;
                case "5":
                    System.out.println(calcularPorcentaje(numero,numero2));
                    break;
                case "6":
                    System.out.println(cambiarSigno(numero));
                    break;
                case "7":
                    System.out.println(raizCuadrada(numero));
                    break;
                case "8":
                    System.out.println(elevar(numero,numero2));
                    break;
                default:
                    System.out.println("Selección inválida.");
                    break;
            }
        } while (!opc.equals("0"));
    }

    public static String eleccion(String opc){
        Scanner scan = new Scanner(System.in);
        double numero, numero2;
        if(!opc.equals("0")) {
            System.out.print("Introducir el primer operando: ");
            numero = scan.nextFloat();
            System.out.print("Introducir el segundo operando: ");
            numero2 = scan.nextFloat();
        } else {
            System.out.println("Gracias por usar la aplicación. Vuelva Pronto");
        }
        return opc;
    }
    public static double sumar(double numero, double numero2) {
        return (numero + numero2);
    }

    public static double restar(double numero, double numero2) {
        return (numero - numero2);
    }

    public static double multiplicar(double numero, double numero2) {
        return (numero * numero2);
    }

    public static double dividir(double numero, double numero2) {
        return (numero / numero2);
    }

    public static double calcularPorcentaje(double numero, double numero2) {
        return numero2*(numero/100);
    }

    public static double porcentaje(double numero) {
        return dividir(numero,100); // Se aprovecha el método dividir() para complementar este método.
    }

    public static double cambiarSigno(double numero) {
        return -numero;
    }

    public static double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public static double elevar(double base, double exponente) {
        return Math.pow(base,exponente);
    }

    public static double elevarAlCuadrado(double numero) {
        return multiplicar(numero,numero);
    }
}