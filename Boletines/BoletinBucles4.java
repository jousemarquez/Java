import java.util.Scanner;

public class BoletinBucles4 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("╔═════════════════════════╗");
        System.out.println("║     Boletín Bucles 4    ║");
        System.out.println("╚═════════════════════════╝");
        System.out.println("Menú: Indique qué ejercicio quiere resolver: ");

        int n = sc.nextInt();
        do {
            switch (n) {
                case 1:
                    System.out.println("1. Leer un número entero (suponemos que es mayor que cero) e imprimir" +
                            "por pantalla los primeros números positivos empezando desde 1 y terminando en el" +
                            "número solicitado.");
                    break;
                case 2:
                    System.out.println("2. Leer un número entero (suponemos que es mayor que cero) e imprimir" +
                            "por pantalla los primeros números PARES positivos.\n");
                    break;
                case 3:
                    System.out.println("3. Leer un número entero (suponemos que es mayor que cero) e imprimir" +
                            "por pantalla los primeros números IMPARES positivos.\n");
                    break;
                case 4:
                    System.out.println("4. Leer un número positivo y generar los n primeros números de" +
                            "la sucesión 3n + 2.\n");
                    break;
                case 5:
                    System.out.println("5. Crear un programa que genere la sucesión 2, 4, 8, 16, 32, 64, …");
                    break;
                case 6:
                    System.out.println("6. Crear un programa que genere la sucesión 8, 15, 22, 29, 36, …");
                    break;
                case 7:
                    System.out.println("7. Modificar los ejercicios anteriores para que en lugar de imprimir" +
                            "la sucesión de los n primeros términos, imprima la suma de la sucesión de los" +
                            "n primeros términos.\n");
                default:
                    System.out.println("Número incorrecto. Vuelve a introducirlo.");
                    break;
            }
        } while (n < 0 || n <= 7);
    }
}