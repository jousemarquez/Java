import java.util.Scanner;

public class ExamenParte1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("╔═════════════════════════╗");
        System.out.println("║  EJE 1. PINTAR PAREDES  ║");
        System.out.println("╚═════════════════════════╝");

        String p = "\uD83C\uDFA8";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        String ANSI_RESET = "\u001B[0m";

        System.out.println("╔════════════════════════════╗");
        System.out.println("║        PRIMER COLOR        ║");
        System.out.println("╚════════════════════════════╝");

        System.out.println(ANSI_RED_BACKGROUND + "¿Vas a usar TODO el bote rojo para el primer color?" +
                "(True/False)" + ANSI_RESET);
        boolean rojo1 = sc.nextBoolean();
        System.out.println(ANSI_GREEN_BACKGROUND + " ¿Vas a usar TODO el bote verde para el primer color?" +
                "(True/False)"+ ANSI_RESET);
        boolean verde1 = sc.nextBoolean();
        System.out.println(ANSI_BLUE_BACKGROUND + " ¿Vas a usar TODO el bote azul para el primer color?" +
                " (True/False)" + ANSI_RESET);
        boolean azul1= sc.nextBoolean();
        System.out.println(ANSI_RED_BACKGROUND + " ¿Vas a usar MEDIO bote rojo para el primer color?" +
                " (True/False)" + ANSI_RESET);
        boolean medioRojo1 = sc.nextBoolean();
        System.out.println(ANSI_GREEN_BACKGROUND + "¿Vas a usar MEDIO bote verde para el primer color?" +
                " (True/False)" + ANSI_RESET);
        boolean medioVerde1 = sc.nextBoolean();
        System.out.println(ANSI_BLUE_BACKGROUND + " ¿Vas a usar MEDIO bote azul para el primer color?" +
                " (True/False)" + ANSI_RESET);
        boolean medioAzul1 = sc.nextBoolean();

        System.out.println("╔════════════════════════════╗");
        System.out.println("║       SEGUNDO COLOR        ║");
        System.out.println("╚════════════════════════════╝");

        System.out.println(ANSI_RED_BACKGROUND + " ¿Vas a usar TODO el bote rojo para el segundo color?" +
                " (True/False)" + ANSI_RESET);
        boolean rojo2 = sc.nextBoolean();
        System.out.println(ANSI_GREEN_BACKGROUND + " ¿Vas a usar TODO el bote verde para el segundo color?" +
                " (True/False)" + ANSI_RESET);
        boolean verde2 = sc.nextBoolean();
        System.out.println(ANSI_BLUE_BACKGROUND + "¿Vas a usar TODO el bote azul para el segundo color?" +
                " (True/False)" + ANSI_RESET);
        boolean azul2= sc.nextBoolean();
        System.out.println(ANSI_RED_BACKGROUND + "¿Vas a usar MEDIO bote rojo para el segundo color?" +
                " (True/False)" + ANSI_RESET);
        boolean medioRojo2 = sc.nextBoolean();
        System.out.println(ANSI_GREEN_BACKGROUND + "¿Vas a usar MEDIO bote verde para el segundo color?" +
                " (True/False)" + ANSI_RESET);
        boolean medioVerde2 = sc.nextBoolean();
        System.out.println(ANSI_BLUE_BACKGROUND + "¿Vas a usar MEDIO bote azul para el segundo color?" +
                " (True/False)" + ANSI_RESET);
        boolean medioAzul2 = sc.nextBoolean();

        System.out.println("¿El PRIMER color se va a pintar VERDE LIMA o VERDE CLARITO y" +
                "el SEGUNDO color se va a pintar AZUL CLARO o CELESTE OSCURO?" + " " +
                ((medioRojo1 && verde1 && !azul1 || !rojo1 && verde1 && medioAzul1) &&
                        ((!rojo2 && medioVerde2 && azul2 || !rojo2 && medioVerde2 && medioAzul2))));

        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║         FIN DEL PROGRAMA        ║");
        System.out.println("╚═════════════════════════════════╝");

        System.out.println("╔═════════════════════╗");
        System.out.println("║ EJERCICIO 2 - X e Y ║");
        System.out.println("╚═════════════════════╝");
        int cont = 1;
        System.out.println("Introduce un número x: ");
        int x = sc.nextInt();
        System.out.println("Introduce un número y: ");
        int y = sc.nextInt();

        for (int i = 0; i <= x; i++){
            x--;
            for (int j = 0; j <= y; j++){
                y--;
                System.out.println("("+x+","+y+")");
            }
            cont++;
        }
        cont++;
        System.out.println("El contador de iteraciones vale: " +cont);
    }
}
