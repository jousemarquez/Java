import java.util.Scanner;

public class Booleanos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Lea por pantalla dos números enteros y almacene en una variable el resultado\n" +
                "de comprobar si el primero es superior al segundo multiplicado por dos.\n");
        System.out.println("Introduzca el valor de a: ");
        int a = sc.nextInt();
        System.out.println("Introduzca el valor de b: ");
        int b = sc.nextInt();
        boolean res = a > (b*2);
        System.out.println(res);
            System.out.println("----------------");

        System.out.println("2. Lea por pantalla una edad y almacene en una variable el resultado de comprobar\n" +
                "si es mayor de edad.\n");
        int age;
        System.out.println("Introduzca su edad: ");
        age = sc.nextInt();
        boolean res2 = age >= 18;
        System.out.println(res2);
            System.out.println("----------------");

        System.out.println("3. Repita pero comprobando si es menor de edad.");
        boolean res3 = age < 18;
        System.out.println(res3);
            System.out.println("----------------");

        System.out.println("4. Lea por pantalla un número entero y almacene en una variable el resultado\n" +
                "de comprobar si es par.\n");
        int valor = sc.nextInt();
        boolean resPar = valor%2 == 0;
            System.out.println("es una cifra par: " +resPar);

        System.out.println("5. Repita pero comprobando si es impar.");
        boolean resImpar = valor%2 == 1;
        System.out.println("es una cifra impar: " +resImpar);
            System.out.println("-----------------");

        System.out.println("6. Lea por pantalla un número y compruebe si está comprendido entre 0 y 100, \n" +
                "ambos incluidos.\n");
        int valorEjercicio6;
        System.out.println("Introduzca un valor entero entre 0 y 100: ");
        valorEjercicio6 = sc.nextInt();
        if (0 <= valorEjercicio6 && valorEjercicio6 <= 100){
            System.out.println("El valor está dentro del rango");
        }
        else if (valorEjercicio6<0){
            System.out.println("El valor está por debajo del rango");
        }
        else {
            System.out.println("El valor está por encima del rango");
        }
        System.out.println("----------------------");

        System.out.println("7. Lea por pantalla un número y compruebe si es positivo y además impar.");

        System.out.print("Introduce un número (0 para acabar): ");
        int numero;
        numero = sc.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                System.out.print("Positivo");
            } else {
                System.out.print("Negativo");
            }
            if(numero % 2 == 0){
                System.out.println(" Par");
            }else{
                System.out.println(" Impar");
            }

            System.out.print("Introduce un número (0 para acabar): ");
            numero = sc.nextInt();
        }
        System.out.println("8. Lea por pantalla un numero entero y compruebe si es el 3, el 7 o el 9.");

        int entero = sc.nextInt();
        boolean es3 = entero == 3;
        boolean es7 = entero == 7;
        boolean es9 = entero == 9;
        boolean res9 = es3 || es7 || es9; // (es3 == 3) || (es7 == 7) || (es9 == 9)
        System.out.println("El resultado es: " +res9);

        System.out.println("o bien:");

        int h = sc.nextInt();
        if(h == 3){
            System.out.println("El número es igual a 3");
        } else if (h == 7) {
            System.out.println("El número es igual a 7");
        }
        else{
            System.out.println("El número es igual a 9 ");
        }
    }
}