import java.util.Scanner;

public class AlgoritmoDeLuhn {
    public static void main (String[]arg){
        // Visa: primer número 4
        // Mastercard: primer número 5
        // American Express: primer número 3
        String marca;
        int invertido = 0;
        long tarjeta, resto;
        do {
            System.out.println("Introduce el número de tu tarjeta: ");
            Scanner sc = new Scanner(System.in);
            tarjeta = sc.nextLong();
        } while (tarjeta > 0 && tarjeta < 9999999999999999L);


        while (tarjeta > 0){ // Primero se invierte el número de la tarjeta
            resto = tarjeta % 10;
            invertido = invertido * 10 + resto;
            tarjeta /= 10;
        }

        System.out.println("Número invertido es: "+invertido);

        // System.out.println("Su tarjeta %c de número %d",marca,tarjeta);

    }
}
