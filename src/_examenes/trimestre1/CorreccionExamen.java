package _examenes.trimestre1;

import java.util.Scanner;

public class CorreccionExamen {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio Calendario");

        int mes = 0, maxDias = 0, repetir = 0, ano = 0;
        do { // Contruido por un Do while se pide repetir el ejercicio.

            do {  // Con esta condición obtenemos el dato para alimentar el Switch case siguiente.
                System.out.print("Introduce un mes (número entre 1 y 12): ");
                mes = sc.nextInt();
            } while (mes < 1 || mes > 12);

            do {
                System.out.println("Introduce el año (por encima de 0): ");
                ano = sc.nextInt();
            } while (ano < 0);

            switch (mes) {
                case 1:
                    System.out.println("\t\t\"Enero\"\n");
                    maxDias = 31;
                    break;
                case 2:
                    System.out.println("\t\t\"Febrero\"");
                    maxDias = 28;
                    if ((ano%4 == 0 && ano%100 != 0) || (ano%400 == 0)){
                        maxDias = 29;
                    }
                    break;
                case 3:
                    System.out.println("\t\t\"Marzo\"");
                    maxDias = 31;
                    break;
                case 4:
                    System.out.println("\t\t\"Abril\"");
                    maxDias = 30;
                    break;
                case 5:
                    System.out.println("\t\t\"Mayo\"");
                    maxDias = 31;
                    break;
                case 6:
                    System.out.println("\t\t\"Junio\"");
                    maxDias = 30;
                    break;
                case 7:
                    System.out.println("\t\t\"Julio\"");
                    maxDias = 31;
                    break;
                case 8:
                    System.out.println("\t\t\"Agosto\"");
                    maxDias = 31;
                    break;
                case 9:
                    System.out.println("\t\t\"Septiembre\"");
                    maxDias = 30;
                    break;
                case 10:
                    System.out.println("\t\t\"Octubre\"");
                    maxDias = 31;
                    break;
                case 11:
                    System.out.println("\t\t\"Noviembre\"");
                    maxDias = 30;
                    break;
                case 12:
                    System.out.println("\t\t\"Diciembre\"");
                    maxDias = 31;
                    break;
            }
            System.out.println("Lu Ma Mi Ju Vi Sa Do\n");
            for (int i = 1; i <= maxDias; i++) { // Se recoge la variable maxDias que viene por el switch case correspondiente.
                System.out.printf("%02d ", i); // Se van imprimiendo los números indistintamente.
                if (i % 7 == 0) { // Se mete una comprobación para hacer los saltos de semana.
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println("Desea repetir? (1 para si): ");
            repetir = sc.nextInt();
        } while (repetir == 1); // Bucle para volver a repertir el ejercicio.
    }
}
