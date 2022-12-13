import java.util.Scanner;

public class AlgoritmoDeLuhn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║        ALGORITMO DE LUHN        ║");
        System.out.println("╚═════════════════════════════════╝");
        System.out.println("El objetivo de esta práctica es estudiar un algoritmo para validar los números de\n" +
                "algunas tarjetas de crédito que consiste en aplicar los siguientes pasos a los dígitos del número\n" +
                "de la tarjeta");

        /*- Se invierten los dígitos del número.
        - Se duplican los dígitos que se encuentran en la posición par (CUIDADO).
        - Se suman los dígitos de cada número.
        - Una vez tengamos la suma total, si el resto de dividir dicho número entre 10 es 0, el
        número es válido. Es inválido en caso contrario.

        Visa: primer número 4
        Mastercard: primer número 5
        American Express: primer número 3*/

        // Declaración de variables
        int contador = 0;
        long tarjeta, temporal, suma = 0, inverso = 0;

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║ Introduce el número de tu tarjeta: ║");
        System.out.println("╚════════════════════════════════════╝");

        tarjeta = sc.nextLong();

        // Algoritmo para contar los dígitos del número

        // Si tarjeta fuera 0 le sumo uno para que diese una cifra si fuese el caso.
        if (tarjeta == 0)
            contador++;
        // Se descarta el número negativo con el método absoluto, se aplica logaritmo de 10 y se redondea para entero.
        // Además se suma 1 porque los números menores de 10 su potencia es 0.
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║ El número tiene: " +(Math.floor(Math.log10(Math.abs(tarjeta)) + 1))+" cifras. ║");
        System.out.println("╚═══════════════════════════════╝");

        // Algoritmo para invertir los dígitos de la tarjeta

        for (int i = 0; tarjeta > 0; i--) {
            temporal = tarjeta % 10;
            inverso *= 10;
            inverso += temporal;
            tarjeta /= 10;
        }

        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ El número invertido es:" +inverso+" ║");
        System.out.println("╚═════════════════════════════════════════╝");

        // Algoritmo para sumar los dígitos

        for (int j = 1; inverso > 9; j++) {

            temporal = (inverso % 10);

            if ((j % 2) == 0) {
                suma += temporal;
            } else {
                temporal *= 2;

                if(temporal > 9){
                    suma+=(temporal % 10);
                    temporal /= 10;
                    suma += temporal;
                }else{
                    suma += temporal;
                }
            }
            inverso /= 10;
        }

        suma += inverso;

        // Comprobación final que revisa si la suma es divisible entre 10 es Luhn, en caso contrario no lo es.

        if ((suma % 10) == 0) {
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