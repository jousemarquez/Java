import java.util.Scanner;

public class AlgoritmoDeLuhn2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int tarjeta;
        System.out.println("Introduzca los 4 primeros digitos de su tarjeta: ");
        tarjeta = sc.nextInt();
        if (tarjeta >= 510 && tarjeta <= 559) {
            System.out.println("La tarjeta es Mastercard");
        } else if (tarjeta >= 3000 && tarjeta <= 3059) {
            System.out.println("La tarjeta es Diners Club");
        } else if (tarjeta >= 3400 && tarjeta <= 3799) {
            System.out.println("La tarjeta es American Express");
        } else if (tarjeta >= 4000 && tarjeta <= 4999) {
            System.out.println("La tarjeta es VISA");
        } else if (tarjeta == 6011) {
            System.out.println("La tarjeta es Discover");
        }

        String numero = sc.nextLine();
        System.out.println("Ahora introduzca su tarjeta hasta el penultimo numero sin espacios ni guiones");
        numero = sc.nextLine();

        int s1 = 0, s2 = 0;
        String reversa = new StringBuffer(numero).reverse().toString();
        for (int i = 0; i < reversa.length(); i++) {
            int digito = Character.digit(reversa.charAt(i), 10);
            if (i % 2 == 0) {
                s1 += digito;
            } else {
                s2 += 2 * digito;
                if (digito >= 5) {
                    s2 -= 9;
                }
            }
        }

        if ((s1 + s2) % 10 == 0) {
            System.out.println("La tarjeta es válida");
        } else {
            System.out.println("La tarjeta no es válida");
        }
    }
}
