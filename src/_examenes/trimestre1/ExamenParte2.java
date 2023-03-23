package _examenes.trimestre1;

import java.util.Scanner;

public class ExamenParte2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("╔═════════════════════════╗");
        System.out.println("║        CALENDARIO       ║");
        System.out.println("╚═════════════════════════╝");

        int mes, repetir, año;

        do {

            do {
                System.out.println("Introducir un número (1-12): ");
                mes = sc.nextInt();
            } while (mes < 1 || mes > 12);
            switch (mes) {
                case 1:
                    System.out.println("\t\t\"Enero\"\n");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30 31\n");
                    break;
                case 2:
                    System.out.println("\t\t\"Febrero\"");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28\n");
                    break;
                case 3:
                    System.out.println("\t\t\"Marzo\"");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30 31\n");
                    break;
                case 4:
                    System.out.println("\t\t\"Abril\"");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30\n");
                    break;
                case 5:
                    System.out.println("\t\t\"Mayo\"");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30 31\n");
                    break;
                case 6:
                    System.out.println("\t\t\"Junio\"");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30\n");
                    break;
                case 7:
                    System.out.println("\t\t\"Julio\"");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30 31\n");
                    break;
                case 8:
                    System.out.println("\t\t\"Agosto\"");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30 31\n");
                    break;
                case 9:
                    System.out.println("\t\t\"Septiembre\"");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30\n");
                    break;
                case 10:
                    System.out.println("\t\t\"Octubre\"");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30 31\n");
                    break;
                case 11:
                    System.out.println("\t\t\"Noviembre\"");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30\n");
                    break;
                case 12:
                    System.out.println("\t\t\"Diciembre\"");
                    System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
                    System.out.println("01 02 03 04 05 06 07");
                    System.out.println("08 09 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30 31\n");
                    break;
                default:
                    System.out.println("Mes incorrecto. Vuelve a introducir un número del 1 al 12: ");
                    break;
            }
            System.out.println("¿Quieres volver a realizar una consulta? (1 = repetir, 0 = finalizar programa):  ");
            repetir = sc.nextInt();
        } while (repetir != 0);
        System.out.println("FIN DEL PROGRAMA");
    }
}