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

        /* NOTA SOBRE MÉTODOS Y ATRIBUTOS:
        La idea es que un atributo representa una propiedad determinada de un objeto.
        Rutinas o métodos: es una componente de un objeto que lleva a cabo una determinada acción o
        tarea con los atributos. En principio, todas las variables y rutinas de un programa de Java
        deben pertenecer a una clase.
        */

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
            System.out.print(arrayDeEnteros2[i] + ", ");
        }
        System.out.println();
        System.out.println("*******************************");

        // Cambiando el contenido de las celdas de un array.
        arrayDeEnteros[arrayDeEnteros.length-1] = 33;
        for(int i = 0; i < arrayDeEnteros.length; i++) {
            System.out.print(arrayDeEnteros[i] + ", ");

        }
        System.out.println();
        System.out.println("*******************************");

        // Ejercicio 1

        // Leer por pantalla un número y crear un array de String de ese tamaño.

        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número: ");

        String[] ejercicio1 = new String[scan.nextInt()]; //En los corchetes se puede añadir cualquier expresión
        // que se evalúe como un entero por lo que puede añadirse el scanner.

        System.out.println(ejercicio1.length); // Además, esta variable no es necesaria declarala porque ya tenemos
        // el atributo que nos define la longitud del array.
        System.out.println("*******************************");

        // Ahora vamos a leer y almacenar en el array nombres como diga el número anterior

        for (int i = 0; i < ejercicio1.length; i++) {
            System.out.print("Intoduce un nombre (que no sea compuesto): ");
            String nombreLeido = scan.next();
            ejercicio1[i] = nombreLeido;
        }

        for(int i = 0; i < ejercicio1.length; i++) {
            System.out.print(ejercicio1[i] + ", ");
        }
        System.out.println();
        System.out.println("Fin del ejercicio");
        System.out.println("*******************************");

        // Ejercicio 2:
        /*
        * Crear un array de float de tamaño 10 mediante un inicializador (dando valores iniciales a su gusto).
        * Imprimir el contenido del array por consola.
        * Modificar el array para que en cada posición se almacene el índice que le corresponde.
        * Una vez que el array esté completamente modificado, volver a imprimir el array y comprobar que
        * ha hecho el ejercicio de forma correcta.
        * Siga las instrucciones al pie de la letra (siempre).
        */

        // Crear un array de float de tamaño 10 mediante un inicializador (dando valores iniciales a su gusto).
        float[] arrayFloat = {0.0f, 1.4f, 2.3f, 3.2f, 4.4f, 56.76f, 69.0f, 77.3f, 899.0f, 999.99f};
        // Imprimir el contenido del array por consola
        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[i] + ", ");
        }
        // Modificar el array para que en cada posición se almacene el índice que le corresponde.
        for (int i = 0; i < arrayFloat.length; i++) {
            arrayFloat[i] = i;
        }
        System.out.println();
        // Una vez que el array esté completamente modificado, volver a imprimir el array y comprobar que ha hecho
        // el ejercicio de forma correcta.
        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[i] + ", ");
        }

        // Ejercicio 3
        // Modificar el ejercicio anterior para que en vez de ser float el array sea de strings.

        // Crear un array de Strings de tamaño 10 mediante un inicializador (dando valores iniciales a su gusto).
        String[] arrayString = {"Huelva", "Sevilla", "Cádiz", "Málaga", "Granada", "Córdoba", "Jaén", "Almería",
        "Murcia", "Albacete"};
        // Imprimir el contenido del array por consola
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print(arrayString[i] + ", ");
        }
        // Modificar el array para que en cada posición se almacene el índice que le corresponde.
        for (int i = 0; i < arrayString.length; i++) {
            // Varios métodos para convertir Int a String
            // Método concatenación: (i + " "). Método menos recomendado.
            // Método String.valueOf(i). Método más eficiente.
            // Método Integer.toString(i). Método que se necesita conocer el tipo primitivo.
            arrayString[i] = Integer.toString(i);
        }
        System.out.println();
        // Una vez que el array esté completamente modificado, volver a imprimir el array y comprobar que ha hecho
        // el ejercicio de forma correcta.
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print(arrayString[i] + ", ");
        }

        System.out.println("Ejercicio 4:");
        System.out.println("Parte a) Dada el siguiente array imprimir su posición y contenido.");

        int[] arrayNumeros = {40,20,5,7,8}; // Se hardcodean los valores en el array.
        for (int i = 0; i < arrayNumeros.length; i++) { // Se lanza el bucle para recorrer el array.
            System.out.println(i + ", " + arrayNumeros[i]); // Se imprime en cada línea la posición y el contenido.
        }
        System.out.println("Parte b) Imprimir la posición central y su contenido.");

        System.out.println(arrayNumeros.length/2 + ", " + arrayNumeros[arrayNumeros.length/2]);

        System.out.println("Parte c) Duplicar el contenido del array.");
        for (int i = 0; i < arrayNumeros.length; i++) { // Se lanza el bucle para recorrer el array.
            arrayNumeros[i] = arrayNumeros[i] * 2; // Se multiplica el contenido por 2.
        }
        for (int i = 0; i < arrayNumeros.length; i++) { // Se lanza el bucle para recorrer el array.
            System.out.println(i + ", " + arrayNumeros[i]); // Se imprime en cada línea la posición y el contenido.
        }

        System.out.println("Parte d) Con un bucle de incremento positivo realizar el ejercicio anterior del final al" +
                "principio.");
        for (int i = 0; i < arrayNumeros.length; i++) { // Se lanza el bucle para recorrer el array.
            System.out.println(arrayNumeros[arrayNumeros.length-1-i]);

            // Explicación de este cambio:
            // Sin modificar las condiciones del for() nos piden imprimir
        }
        for (int i = 0; i < arrayNumeros.length; i++) { // Se lanza el bucle para recorrer el array.
            System.out.println(i + ", " + arrayNumeros[i]); // Se imprime en cada línea la posición y el contenido.
        }
    }
}