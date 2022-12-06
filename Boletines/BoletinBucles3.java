import java.util.Scanner;

public class BoletinBucles3 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("╔═════════════════════════╗");
        System.out.println("║     Boletín Bucles 3    ║");
        System.out.println("╚═════════════════════════╝");
        System.out.println("Menú: Indique qué ejercicio quiere resolver: ");

        int n = sc.nextInt();
        do {
            switch (n) {
                case 1:
                    System.out.println("1. Escriba un programa que lea por pantalla un número entero n,e imprima" +
                            "los n primeros números positivos. Por ejemplo, para n=5 debe imprimir 1 2 3 4 5\n");

                    System.out.println("Ingrese un número: ");
                    int numCase1 = sc.nextInt();

                    for (int i = 1; i < numCase1 + 1; i++) {
                        System.out.printf("%d ", i);
                    }
                    System.out.println();
                    System.out.println("Fin del programa.");
                    break;

                case 2:
                    System.out.println("2. Escriba un programa que lea por pantalla un número entero n, e imprima" +
                            "los n primeros números pares. Por ejemplo, para n=5 debe imprimir 2 4 6 8 10");
                    System.out.println("Ingrese un número: ");
                    int numCase2 = sc.nextInt();
                    for (int i = 0; i < numCase2; i+=2) {
                        System.out.printf("%d ", i);
                    }
                    System.out.println();
                    System.out.println("Fin del programa.");
                    break;
                case 3:
                    System.out.println("3. Escriba un programa que lea por pantalla un número entero n, e imprima" +
                            "los n primeros números impares. Por ejemplo, para n=5 debe imprimir 1 3 5 7 9.");
                    break;
                case 4:
                    System.out.println("4. Escriba un programa que lea por pantalla un número entero n, e imprima" +
                            "los n primeros números cuadrados. Por ejemplo, para n=5 debe imprimir 1 4 9 16 25");
                    break;
                case 5:
                    System.out.println("5. Escriba un programa que lea por pantalla un número entero n, e imprima" +
                            "la suma de los n primeros números positivos. Por ejemplo, para n=5" +
                            "debe imprimir 1+2+3+4+5=15.");
                    break;
                case 6:
                    System.out.println("6. Escriba un programa que lea por pantalla dos números entero m y n," +
                            "e imprima el número m repetido n veces. Por ejemplo, para m=8 y n=5" +
                            "debe imprimir 8 8 8 8 8");
                    break;
                case 7:
                    System.out.println("7. Escriba un programa que lea por pantalla un número n, e imprima" +
                            "una cuenta atrás. Por ejemplo, para n=5 debe imprimir\n" +
                            "5\n" +
                            "4\n" +
                            "3\n" +
                            "2\n" +
                            "1\n" +
                            "0\n");
                    break;
                case 8:
                    System.out.println("8. Escriba un programa que lea por pantalla dos números entero m y n," +
                            "e imprima la letra ‘M’ repetida m veces y la letra ‘N’ repetida n veces." +
                            "Por ejemplo, para m=8 y n=5 debe imprimir:\n" +
                            "M M M M M M M M N N N N N\n");
                    break;
                case 9:
                    System.out.println("9. Escriba un programa que lea por pantalla un número n," +
                            "e imprima los n primeros términos (con n >= 0) de la sucesión 4n+3." +
                            "Por ejemplo, para n=4 debe imprimir:\n" +
                            "3 7 11 15.");
                    break;
                default:
                    System.out.println("Número incorrecto. Vuelve a introducirlo.");
                    break;
            }
        } while (n < 0 || n <= 9);
    }
}