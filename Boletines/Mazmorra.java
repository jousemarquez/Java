import java.util.Scanner;

import static javafx.application.Platform.exit;

public class Mazmorra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean jugar = false; // Boolean para preguntar si se quiere jugar
        boolean fin = false; //Boolean para indicar que acaba el juego
        boolean vivo = true; // Boolean para indicar que Timmy está vivo

        int posicionX = 1; //Posición X donde está Timmy
        int posicionY = 1; //Posición Y donde está Timmy
        do {
            //Impresión del perímetro
            for (int i = 0; i < 20; i++) { // i controla las filas de la matriz
                for (int j = 0; j < 20; j++) { // j controla las columnas de la matriz
                    if (i == 0 || j == 0 || i == 19 || j == 19) {
                        System.out.print("* ");
                    } else if (i == posicionY && j == posicionX) {
                        System.out.print("T ");
                    } else if (i == 18 && j == 18) {
                        System.out.print("H ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println("Siguiente movimiento (N = Norte, E = Este, S = Sur, O = Oeste. STOP si desea " +
                    "finalizar el juego): ");
            String posicion = sc.nextLine();
            switch (posicion) {
                case "N":
                    posicionY--;
                    break;
                case "S":
                    posicionY++;
                    break;
                case "E":
                    posicionX++;
                    break;
                case "STOP": // Ya que no podemos usar equals, lo meto así a lo bruto.
                case "stop":
                case "Stop":
                    fin = true;
                    vivo = true;
                    break;
                default:
                    posicionX--;
                    break;
            }
            if (posicionX == 0 || posicionY == 0 || posicionX == 19 || posicionY == 19){
                fin = true;
            } else if (posicionX == 18 && posicionY == 18) {
                System.out.println("¡Has ganado!");
            }
        }while (!fin);
        if (vivo){
            System.out.println("Se ha parado el juego. Timmy YA no es tu amigo.");
        } else {
            System.out.println("¡Has perdido a Timmy! ¡Pobre Timmy!");
        }
    }
}
