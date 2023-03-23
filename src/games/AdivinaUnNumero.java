package games;

import java.util.Random;
import java.util.Scanner;

public class AdivinaUnNumero {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String d = "\uD83E\uDDDE";
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║   ADIVINA UN NÚMERO       ║");
        System.out.println("║   JUEGO EN FAMILIA     ╔══╩═╗");
        System.out.println("║     by Jouse Márquez   ║ "+d+" ║");
        System.out.println("╚════════════════════════╩════╝");
        System.out.print("Me llamo Akinator de Triana y quiero que adivines un número del 1 al 100," +
                "¿cuál crees que es?: ");

        int numero, turnos = 1;
        int numRandom = rand.nextInt(0,101);
        do{
            numero = sc.nextInt();
                if (numero > numRandom) {
                    System.out.printf("Turno%2d: Mmmm... Casi te aproximas con %2d, pero el número debe ser más pequeño," +
                            "¡inténtalo de nuevo!: ", turnos, numero);
                } else if (numero < numRandom) {
                    System.out.printf("Turno%2d: Mmm... %2d no es, pero andas cerca, ¡inténtalo con un número más" +
                            "grande!: ", turnos, numero);
                }
                turnos++;
            }while (numero!=numRandom);
        System.out.printf("¡CORRECTO! %2d era el número que pensaba! Turnos necesarios: %2d", numRandom, turnos-1);
    }
}



