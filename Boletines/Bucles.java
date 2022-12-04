import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Bucles while () */
        System.out.println("Ingrese un número: ");
        int veces = sc.nextInt();
        int contador = 0;
        while (contador < veces) {
            System.out.println("a");
            contador++;

        }
        System.out.println("FIN");
        /* Bucles For() */

        for (int cont = 0; cont < veces; cont++) { // Inicialización de variable de for; condición de salida; incrementos/decrementos/actualización de la variable de control del bucle.
            System.out.println("a");
        }
        System.out.println("FIN");

        int x = 0;

        do {
            if (x > 5){
                break;
            }
            System.out.println(x);
            x++;
        } while (x < 10);
        System.out.println("--------------------");
    }
}