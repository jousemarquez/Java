import java.util.Scanner;
import java.util.Random;

public class LanzarDados {
    public static void main (String [] arg){

        String d = "\uD83C\uDFB2";
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║   LANZAMIENTO DE DADOS    ║");
        System.out.println("║   MULTIJUGADOR OFFLINE ╔══╩═╗");
        System.out.println("║     by Jouse Márquez   ║ "+d+" ║");
        System.out.println("╚════════════════════════╩════╝");

        Scanner sc = new Scanner(System.in);
        boolean jugar;
        int score = 0;
        System.out.println("Jugador 1, ¿quieres lanzar un dado [Yes/No]? ");
        jugar = sc.next().equalsIgnoreCase("yes");
        if (!jugar){
            System.out.println("¡Juego finalizado. Tu puntuación es: "+score);
        } else {
            int primerDado = (int) (Math.random() * 6 + 1);
            System.out.println("El primer dado ha sacado un:" + primerDado);
        }
    }
}
