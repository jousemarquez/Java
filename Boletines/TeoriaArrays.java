import java.util.Scanner;

public class TeoriaArrays {
    public static void main(String[] Arg) {

        /* ¿Qué es un Array?

        - Es una secuencia de elementos del mismo tipo.
        - El tipo puede ser primitivo o compuesto (clases/objetos).
        - Los elementos se encuentran posicionados 'uno detrás de otro', formando una fila.
        - Podemos establecer el tamaño de la fila de antemano o hacerlo posteriormente.
        - Una vez establecido, el tamaño no se puede cambiar.*/

        // Creando un array indicando su tamaño y dando por defecto el valor de entero (0 por default)

        int[] arrayDeEnteros = new int[3]; // Se declara el tipo de array, se abren y cierran corchetes

        System.out.println(arrayDeEnteros); // Al no indicar la lectura de posición, se imprime la "Referencia"
        System.out.println(arrayDeEnteros[0]); // Muestra el valor por defecto de la posición 0 del array.
        System.out.println(arrayDeEnteros[1]); // Muestra el valor por defecto de la posición 1 del array.
        System.out.println(arrayDeEnteros[2]); // Muestra el valor por defecto de la posición 2 del array.
        System.out.println(arrayDeEnteros.length); // Ojo, no es un método sino un atributo (no lleva paréntesis).
        System.out.println("*******************************");

        // Creando un array con una serie de valores.

        int[] arrayDeEnteros2 = {4, 5, 2, 3, 1, 0, 5, 6, 8, -900};

        System.out.println(arrayDeEnteros2); // La Referencia es única, no se repite.
        System.out.println(arrayDeEnteros2[0]); // Muestra el valor por defecto de la posición 0 del array.
        System.out.println(arrayDeEnteros2[1]); // Muestra el valor por defecto de la posición 1 del array.
        System.out.println(arrayDeEnteros2[2]); // Muestra el valor por defecto de la posición 2 del array.
        System.out.println(arrayDeEnteros2.length); // Muestra la longitud del array.
        System.out.println("*******************************");

        // Cómo leer un array con un bucle for() e imprimirlos.

        for(int i = 0; i < arrayDeEnteros2.length; i++) {
            System.out.print(arrayDeEnteros2[i] + " ");
        }
        System.out.println();
        System.out.println("*******************************");

        // Cambiando el contenido de las celdas de un array.
        arrayDeEnteros[arrayDeEnteros.length-1] = 33;
        for(int i = 0; i < arrayDeEnteros.length; i++) {
            System.out.print(arrayDeEnteros[i] + " ");

        }
        System.out.println();
        System.out.println("*******************************");

        // Ejercicio 1

        // Leer por pantalla un número y crear un array de String de ese tamaño.

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");

        String[] ejercicio1 = new String[sc.nextInt()]; //En los corchetes se puede añadir cualquier expresión que se evalúe
        // como un entero por lo que puede añadirse el scanner.

        System.out.println(ejercicio1.length); // Además, esta variable no es necesaria declarala porque ya tenemos
        // el atributo que nos define la longitud del array.
        System.out.println("*******************************");

        // Ahora vamos a leer y almacenar en el array nombres como diga el número anterior

        for (int i = 0; i < ejercicio1.length; i++) {
            System.out.print("Intoduce un nombre (que no sea compuesto): ");
            String nombreLeido = sc.next();
            ejercicio1[i] = nombreLeido;
        }

        for(int i = 0; i < ejercicio1.length; i++) {
            System.out.print(ejercicio1[i] + ", ");
        }
        System.out.println();
        System.out.println("Fin del ejercicio");
        System.out.println("*******************************");
    }
}