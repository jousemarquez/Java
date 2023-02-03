package algoritmos;

import java.util.Scanner;

public class AlgoritmoDeLuhn {
    public static void main(String[] args) {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║        ALGORITMO DE LUHN        ║");
        System.out.println("╚═════════════════════════════════╝");
        System.out.println("El objetivo de esta práctica es estudiar un algoritmo para validar los números de\n" +
                "algunas tarjetas de crédito que consiste en aplicar los siguientes pasos a los dígitos del número\n" +
                "de la tarjeta");/*:

        - Se invierten los dígitos del número.
        - Se duplican los dígitos que se encuentran en la posición par (CUIDADO).
        - Se suman los dígitos de cada número.
        - Una vez tengamos la suma total, si el resto de dividir dicho número entre 10 es 0, el
        número es válido. Es inválido en caso contrario.*/

        // Visa: primer número 4
        // Mastercard: primer número 5
        // American Express: primer número 3
        int contador = 1;
        long tarjeta, invertido = 0, temp, sum = 0;


        // Introducir el número de tu tarjeta para saber si está en rango.
        do {
            System.out.println("╔════════════════════════════════════╗");
            System.out.println("║ Introduce el número de tu tarjeta: ║");
            System.out.println("╚════════════════════════════════════╝");
            Scanner sc = new Scanner(System.in);
            tarjeta = sc.nextLong();
        } while (tarjeta <= 0 || tarjeta > 9999999999999999L);

        // Invertir el número de la tarjeta
        while (tarjeta > 0) {
            temp = tarjeta % 10;
            invertido *= 10;
            tarjeta /= 10;
        }
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║ El número invertido es:" +invertido+" ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");

        // Se duplican los dígitos que se encuentren en posición par
        while (invertido > 9) {

            temp = (invertido % 10);

            if ((contador % 2) == 0) {
                sum += temp;
            } else {
                temp *= 2;

                if (temp > 9) {
                    sum += (temp % 10);
                    temp /= 10;
                    sum += temp;
                } else {
                    sum += temp;
                }
            }
            invertido /= 10;
            contador++;
        }

        sum += invertido;

        if ((sum % 10) == 0) {
            System.out.println("╔═══════════════════════╗");
            System.out.println("║ Es un número de Luhn  ║");
            System.out.println("╚═══════════════════════╝");
        } else {
            System.out.println("╔═════════════════════════╗");
            System.out.println("║ NO es un número de Luhn ║");
            System.out.println("╚═════════════════════════╝");
        }
    }
}