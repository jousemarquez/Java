import java.util.Scanner;

public class AlgoritmoDeLuhn {
    public static void main(String[] args) {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║        ALGORITMO DE LUHN        ║");
        System.out.println("╚═════════════════════════════════╝");
        System.out.println("El objetivo de esta práctica es estudiar un algoritmo para validar" +
                "los números de algunas tarjetas de crédito que consiste en aplicar los siguientes" +
                "pasos a los dígitos del número de la tarjeta");/*:

        - Se invierten los dígitos del número.
        - Se duplican los dígitos que se encuentran en la posición par (CUIDADO).
        - Se suman los dígitos de cada número.
        - Una vez tengamos la suma total, si el resto de dividir dicho número entre 10 es 0, el
        número es válido. Es inválido en caso contrario.*/

        // Visa: primer número 4
        // Mastercard: primer número 5
        // American Express: primer número 3
        String marca;
        long tarjeta, invertido = 0, resto;

        // Prompt the user to enter a credit card number
        do {
            System.out.println("Introduce el número de tu tarjeta: ");
            Scanner sc = new Scanner(System.in);
            tarjeta = sc.nextLong();
        } while (tarjeta <= 0 || tarjeta > 9999999999999999L);

        // Invert the credit card number
        while (tarjeta > 0) {
            resto = tarjeta % 10;
            invertido = invertido * 10 + resto;
            tarjeta /= 10;
        }
        // Se duplican los dígitos que se encuentren en posición par

    }
}