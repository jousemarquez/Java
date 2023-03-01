package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Character.isLetter;

public class Excepciones {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Ejercicio 1
        dividir();
        //Ejercicio 2
        imprimirArray();
        //Ejercicio 3
        leerEntero();
        //Ejercicio 4
        leerString();
        //Ejercicio 5
        imprimirString();
        //Ejercicio 6
        imprimirMayusculas("Si lo sé, no vengo");
        //Ejercicio 7
        realizarEjercicios();
        //Ejercicio 8
        leerUsuarios("Jouse", "Jouse");
    }

    /*
    1. Realice un programa que lea por pantalla dos números enteros, e imprima el resultado de dividirlos.
    Observe la excepción que se lanza al dividir por cero, y tras ello modifique su código para que capture
    dicha excepción.
    */
    public static void dividir() {
        System.out.println("1. DIVIDIR");
        System.out.print("Dividendo: ");
        int num1 = scan.nextInt();
        System.out.print("Divisor: ");
        int num2 = scan.nextInt();
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("\nExcepción Aritmética");
        }
    }

    /*
    2. Realice un programa que cree un array de 10 posiciones inicializado con números crecientes a partir de 1.
    Escriba un bucle que vaya desde i=0 hasta i<=longitud y los imprima por pantalla. Observe la excepción que se lanza,
    y tras ello modifique su código para que capture dicha excepción.
    */
    public static void imprimirArray() {
        System.out.println("2. IMPRIMIR ARRAY");
        int[] array = new int[10];
        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("\nExcepción: \"Index Out Of Bounds\"");
        }
    }

    /*
    3. Realice un programa que lea por pantalla un número entero mediante la clase Scanner y nextInt.
    Observe la excepción que se lanza al introducir una palabra, y tras ello modifique su código para que capture
    dicha excepción.
    */
    public static void leerEntero() {
        System.out.println("3. LEER ENTERO");
        System.out.print("Introduzca un entero: ");
        try {
            int num = scan.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("\nExcepción: \"Input Mismatch\"");
        }
    }

    /*
    4. Realice un programa que lea por pantalla un número entero mediante la clase Scanner y nextLine.
    Convierta el String a un número entero con la clase Integer y parseInt. Observe la excepción que se
    lanza al introducir un número con decimales, y tras ello modifique su código para que capture dicha excepción.
    */
    public static void leerString() {
        System.out.println("4. LEER STRING");
        System.out.print("Introduzca un numero: ");
        try {
            int num = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("\nExcepción: \"Number Format\"");
        }
    }

    /*
    5. Realice un programa que lea por pantalla una cadena mediante la clase Scanner y nextLine. Imprima
    mediante charAt y un bucle que vaya desde i=0 hasta i<=longitud todas las posiciones de la cadena.
    Observe la excepción que se lanza y tras ello modifique su código para que capture dicha excepción.
    */
    public static void imprimirString() {
        System.out.println("5. IMPRIMIR STRING");
        System.out.print("Introduzca un String: ");
        String cadena = scan.nextLine();
        try {
            for (int i = 0; i <= cadena.length(); i++) {
                System.out.println(cadena.charAt(i));
            }
        } catch (StringIndexOutOfBoundsException e) {
            throw new StringIndexOutOfBoundsException("\nExcepción: \"String Index Out Of Bounds\"");
        }
    }

    /*
    6. Escriba un método que reciba un String y lo imprima por pantalla en mayúsculas.
    Pruebe a llamar al método pasando como argumento el valor null, observe la excepción que se lanza y
    modifique el código para capturarla.
    */
    public static void imprimirMayusculas(String cadena) {
        System.out.println("6. IMPRIMIR MAYÚSCULAS");
        try {
            System.out.println(cadena.toUpperCase());
        } catch (NullPointerException e) {
            throw new NullPointerException("Excepción \"Null Pointer\"");
        }
    }

    // 7. Realice un único programa que implemente todo lo anterior, y capture todas las excepciones que se puedan lanzar.
    public static void realizarEjercicios() {
        System.out.println("7. TODAS LAS EXCEPCIONES");
        dividir();
        imprimirArray();
        leerEntero();
        leerString();
        imprimirString();
        imprimirMayusculas("Me gustan las papas fritas");
        leerUsuarios("Jouse","Jose Manuel");
    }

    /*
    8. Realice un programa que lea dos nombres de usuario (dos cadenas que empiecen por una letra y tengan longitud
    superior a 1).
    En caso de que alguno de los nombres de usuario no sea válido, lance usted una excepción del tipo
    IllegalArgumentException proporcionando un mensaje de error.
    */
    public static void leerUsuarios(String usuario1, String usuario2) {
        System.out.println("8. LEER NOMBRES DE USUARIO");
        if (usuario1.length() > 1 && usuario2.length() > 1) {
            if (isLetter(usuario1.charAt(0)) && isLetter(usuario2.charAt(0))) {
                System.out.println("Ambos usuarios han sido creados correctamente.");
            } else {
                throw new IllegalArgumentException("El primer caracter del usuario debe ser una letra.");
            }
        } else {
            throw new IllegalArgumentException("El nombre es igual o interior a un caracter.");
        }
    }
}