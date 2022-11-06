import java.util.Scanner;

public class BoletinBucles2{
    public static void main(String[]arg) {

        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("1. Leer un nombre por pantalla, y escribir un saludo por pantalla que utilice ese nombre," +
                "repitiendo dicho saludo hasta que se muestre un total de diez veces.");

        String nombre = sc.next();
        int contador = 0;
        while (contador < 10) {
            System.out.println("Hola" + nombre);
            contador++;
        }

        // CON DO WHILE

        do {
            System.out.println("Hola" + nombre);
            contador++;
        } while (contador < 10);
        System.out.println(contador);


        System.out.println("2. Leer un número entero, y escribir un mensaje de error tantas veces como diga ese número.");
        System.out.println("Introduce un entero: ");
        // Con FOR
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Error!!");
        }

        // Con DO While
        int i = 0;
        while (i < num) {
            System.out.println("Error!");
            i++;
        }

        System.out.println("3. Crear una contraseña numérica en una variable. Pedir por pantalla la contraseña de inicio" +
                "hasta que el usuario la acierte.");

        // Con DO While
        System.out.println("Introduce su contraseña: ");
        int pass = 1973;
        int leida = pass;
        do {
            System.out.println("Introduce su contraseña de nuevo: ");
            leida = sc.nextInt();
        } while (leida != pass);

        // Con FOR

        System.out.println("Introduce su contraseña: ");
        for (int j = 0; j != pass; j++) {
            System.out.println("Introduce su contraseña.");
            int pass2 = sc.nextInt();
            if (pass2 == pass) {
                System.out.println("La contraseña es correcta.");
                break;
            }
        }

        System.out.println("4. Leer por pantalla un entero y comprobar si es negativo o positivo, imprimiendo por pantalla" +
                "una frase al respecto. Si se mete un cero, volver a pedir un número.");

        // Con DO While
        int eje4;
        do {
            System.out.println("Introducir un número: ");
            eje4 = sc.nextInt();
            if (eje4 > 0) {
                System.out.println(eje4 + " es un número positivo.");
            } else if (eje4 < 0){
                System.out.println(eje4 + " es un número negativo.");
            }
        } while (eje4 == 0);

        System.out.println("5. Leer por pantalla un entero y comprobar si es par o impar. Si se mete un número negativo o cero," +
                "volver a pedir un número.");

        int eje5;
        do {
            System.out.println("Introducir un número: ");
            eje5 = sc.nextInt();
            if (eje5 % 2 == 0 && eje5 != 0) {
                System.out.println(eje5 + " es un número par.");
            } else if (eje5 % 2 == 1){
                System.out.println(eje5 + " es un número impar.");
            }
        } while (eje5 == 0 || eje5 < 0);*/

        System.out.println("6. Introducir una variable contadora en los dos ejercicios anteriores que almacene la cantidad" +
                "total de números incorrectos que ha introducido el usuario, y la muestre por pantalla antes de finalizar.");

        int eje6a;
        do {
            System.out.println("Introducir un número: ");
            eje6a = sc.nextInt();
            if (eje6a > 0) {
                System.out.println(eje6a + " es un número positivo.");
            } else if (eje6a < 0){
                System.out.println(eje6a + " es un número negativo.");
            }
        } while (eje6a == 0);

        int eje6b;
        do {
            System.out.println("Introducir un número: ");
            eje6b = sc.nextInt();
            if (eje6b % 2 == 0 && eje6b != 0) {
                System.out.println(eje6b + " es un número par.");
            } else if (eje6b % 2 == 1){
                System.out.println(eje6b + " es un número impar.");
            }
        } while (eje6b == 0 || eje6b < 0);

        /*System.out.println("7. Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes correspondiente." +
                "En caso de leer un número fuera de rango, volver a pedir un número entre 1 y 12.");

        System.out.println("8. Leer por pantalla un entero e imprimirlo elevado a la quinta potencia." +
                "Utilizar un bucle para realizar el cálculo.");

        System.out.println("9. Repetir el ejercicio anterior para leer también por pantalla la potencia a la que debe elevarse el número.");

        System.out.println("10. Leer por pantalla un número n, e imprimir por pantalla una fila de asteriscos con tantas columnas como diga n.");

        System.out.println("11. Leer por pantalla un número n, e imprimir por pantalla un cuadrado cuya altura viene dada por n.");

        System.out.println("12. Leer por pantalla un número n, e imprimir por pantalla un cuadrado cuya altura viene dada por n.");

        System.out.println("13. Leer por pantalla un número n, e imprimir por pantalla un triángulo cuya altura viene dada por n.");

        System.out.println("14. (MUY DIFÍCIL) Leer por pantalla un número n, e imprimir por pantalla un triángulo cuyo número" +
                "de niveles viene dado por n.");

        System.out.println("15. (DIFÍCIL) Leer por pantalla un número n, e imprimir por pantalla un triángulo cuyo número" +
                "de niveles viene dado por n.");

        System.out.println("16. (Difícil) Escriba un programa que compruebe si un número es cúbico, es decir," +
                "si puede expresarse como un producto de tres factores iguales.");

        System.out.println("17. (DIFÍCIL) Leer por pantalla un número entero e indicar si es primo.");

        System.out.println("18. (NO HACER) Imprimir por pantalla todos los números primos entre 0 y 100.");

        System.out.println("19. (MUY DIFÍCIL) Escribe un programa que lea por pantalla un número entero y determine si es un palíndromo.");

        System.out.println("20. (NO HACER) Leer por pantalla dos números, a y b, y calcular su máximo común divisor.");

        System.out.println("21. (NO HACER) Leer por pantalla dos números, a y b, y calcular su mínimo común múltiplo.");

        System.out.println("22. (NO HACER) Leer por pantalla dos números, a y b, y comprobar si son coprimos" +
                "(los números coprimos son aquellos que no tienen ningún factor primo en común).");

        System.out.println("23. Leer por pantalla un número n, e imprimir por pantalla los n primeros términos de la sucesión de Fibonacci.");

        System.out.println("24. Leer por pantalla un número n, e imprimir por pantalla los n primeros términos de la sucesión de Pell.");

        System.out.println("25. Escriba un programa que lea por pantalla un número y determine si es un número de Mersenne.");

        System.out.println("26. Escriba un programa que imprima los 10 primeros números de Fermat.");

        */
    }
}