package games;

import java.util.Scanner;

public class    MazmorraDeTimmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fin = false; // Boolean para indicar que acaba el juego
        int posicionX = 1; //Posición X donde está Timmy
        int posicionY = 1; //Posición Y donde está Timmy
        String d = "\uD83C\uDFC3";
        String f = "\uD83D\uDD25";
        String t = "\uD83C\uDFC3";
        String m = "\uD83C\uDFC1";
        String e = "\uD83E\uDDF1";
        String c = "\uD83D\uDC80";
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║   ¡CORRE TIMMY, CORRE!    ║");
        System.out.println("║     UN SOLO JUGADOR    ╔══╩═╗");
        System.out.println("║     by Jouse Márquez   ║ "+d+" ║");
        System.out.println("╚════════════════════════╩════╝");
        System.out.println("Me llamo Timmy y quiero llegar a la meta, ¿me ayudas?\n");
        do {
            //Impresión del perímetro
            for (int i = 0; i < 20; i++) { // i controla las filas de la matriz
                for (int j = 0; j < 20; j++) { // j controla las columnas de la matriz
                    if (i == 0 || j == 0 || i == 19 || j == 19) {
                        System.out.print(f+ " ");
                    } else if (i == posicionY && j == posicionX) {
                        System.out.print(t+ " ");
                    } else if (i == 18 && j == 18) {
                        System.out.print(m+ " ");
                    } else {
                        System.out.print(e+ " ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            if (!fin) {
                System.out.println("Siguiente movimiento (N = Norte, E = Este, S = Sur, O = Oeste. STOP si desea " +
                        "finalizar el juego): ");
                String posicion = sc.nextLine();
                switch (posicion) {
                    case "N":
                    case "n":
                        posicionY--;
                        break;
                    case "S":
                    case "s":
                        posicionY++;
                        break;
                    case "E":
                    case "e":
                        posicionX++;
                        break;
                    case "STOP": // Ya que no podemos usar equals, lo meto así a lo bruto.
                    case "stop":
                    case "Stop":
                        fin = true;
                        break;
                    default:
                        posicionX--;
                        break;
                }
            }
            if (posicionX == 0 || posicionY == 0 || posicionX == 19 || posicionY == 19){
                System.out.println("╔════════════════════════╗");
                System.out.println("║  ¡Has perdido a Timmy! ║");
                System.out.println("║    ¡Pobre Timmy!  "+c+"   ║");
                System.out.println("╚════════════════════════╝");
                fin = true;
            } else if (posicionX == 18 && posicionY == 18) {
                System.out.println("╔════════════════════════╗");
                System.out.println("║      ¡Has GANADO!      ║");
                System.out.println("╚════════════════════════╝");
                fin = true;
            }
        } while (!fin);
        System.out.println("╔════════════════════════╗");
        System.out.println("║    Juego finalizado    ║");
        System.out.println("╚════════════════════════╝");
    }
}