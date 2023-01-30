import java.util.Scanner;

public class TeoriaArraysBidimensionales {
    public static void main(String[] Arg) {
        // ARRAYS BIDIMENSIONALES

        // Formas clásicas de declarar arrays de 1 dimensión.
        char[] arr1D = {'a', 'b', 'c'};
        char[] arr1Dbis = new char[3];

        // Formas para declarar arrays de 2 dimensiones.
        char[][] arr2Dbis = new char[5][3]; // El primero indica la altura y el segundo la anchura.
        char[][] arr2D = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'g', 'h', 'i', 'f', 'r'},
                {'g', 'h'},
        };

        System.out.println("Tamaño del arr2D: " + arr1D.length);
        System.out.println("Número de filas de arr2D: " + arr2D.length);
        System.out.println("Número de filas de arr2Dbis: " + arr2Dbis.length);
        System.out.println("Número de columnas de arr2Dbis: " + arr2Dbis[0].length);
        System.out.println("Número de columnas de arr2Dbis: " + arr2Dbis[1].length);
        System.out.println("Número de columnas de arr2Dbis: " + arr2Dbis[2].length);
        System.out.println("Número de columnas de arr2Dbis: " + arr2Dbis[3].length);
        System.out.println("Número de columnas de arr2Dbis: " + arr2Dbis[4].length);
        System.out.println("Tamaño de arr2D: [" + arr2D.length + "," + arr2D[0].length + "]");
        System.out.println("********* ACCESO DATOS *********");
        System.out.println("Mostrar [0,1] de arr2D: " + arr2D[0][1]); // Imprimir coordenadas
        System.out.println("Mostrar [2,2] de arr2D: " + arr2D[2][2]);
        System.out.println("Mostrar [1,0] de arr2D: " + arr2D[1][0]);
        System.out.println("********* MODIFICAR DATOS *********");
        arr2D[0][0] = 'J';
        arr2D[0][2] = 'J';
        arr2D[2][1] = 'J';
        System.out.println("********* IMPRIMIR LA MATRIZ ENTERA *********");

        int[][] arr = {
                {1, 3},
                {3, 6},
        };

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(" | " + arr2D[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("FIN EJERCICIO");

        // Ejemplo de recorrido de arrays bidimensionales solo con un bucle

        int[][] arrayInt = {
                {0, 2},
                {3, 1},
                {4, 7},
        };

        for (int i = 0; i < arrayInt.length; i++) {
            // arrayInt[i] es la fila número i, o sub-array i
            System.out.print("{");
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j] + "");
            }
            System.out.println("}");
        }
        System.out.println("FIN EJERCICIO");

        int[][] arrayInt2 = {
                {0, 2},
                {3, 1, 8, 7},
                {4, 7},
        };

        for (int i = 0; i < arrayInt2.length; i++) {
            // arrayInt[i] es la fila número i, o sub-array i
            System.out.print("{");
            for (int j = 0; j < arrayInt2[i].length; j++) {
                System.out.print(arrayInt2[i][j] + ",");
            }
            System.out.println("}");
        }
        System.out.println("FIN EJERCICIO");

        // TIPOS PRIMITIVOS
        int a = 7;
        int b = 7; //Esto copia el valor de a en b
        a++; //a = 8 y b = 7
        System.out.println(b); //-> Imprime 7

        // ClASES/OBJETOS
        int[] c = {0, 0, 0};
        int[] d = c; //CUIDADO! ESTO COPIA LA REFERENCIA

        c[0] = 1; //Al tener c y d la misma referencia, cada cambio en c se hace en d también, ya que apuntan al mismo objeto

        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }

        //Para clonar sus valores habria que hacer lo siguiente:
        int[] original = {1, 2, 3};
        int[] copia = new int[original.length];

        for (int i = 0; i < copia.length; i++) {
            copia[i] = original[i];
        }

        //Imprimimos ambos a ver:

        System.out.print("\nOriginal: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.print("\nCopia: ");

        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + " ");
        }

        //Cambiamos un valor del original
        original[0] = 9;

        //Volvemos a imprimir
        System.out.print("\nOriginal tras cambio: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.print("\nCopia tras cambio en el original: ");

        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + " ");
        }
        System.out.println();

        System.out.println("--------------------------------------------------------");

        /*OTRA COSA IMPORTANTE:
            Si tenemos el array: {1, 2, 3, 4, 5} y tenemos que sustituir el valor de cada posición por la suma
            del valor de su izquierda mas el valor de su derecha, de tal manera que el resultado fuese: {2,4,6,8,4}
            Si hacemos un for paso a paso, al sustituir el valor de la primera posicion y empezar a calcular el de la
            segunda, el valor de la posicion anterior ESTA SUSTITUIDO, por tanto, ya aparecerá 2 en vez de uno, y
            haremos la suma mal. La forma de hacerlo es clonando el original. Solución:
         */
        int[] ejOriginal = {1, 2, 3, 4, 5};
        int[] ejCopia = new int[ejOriginal.length];

        for (int i = 0; i < ejCopia.length; i++) {
            for (int k = i - 1; k <= i + 1; k++) {
                if (k != i && k >= 0 && k < ejCopia.length) {
                    ejCopia[i] += ejOriginal[k];
                }
            }
        }

        System.out.print("\nArray Original: ");
        for (int i = 0; i < ejOriginal.length; i++) {
            System.out.print(ejOriginal[i] + " ");
        }
        System.out.print("\nArray Copia: ");

        for (int i = 0; i < ejCopia.length; i++) {
            System.out.print(ejCopia[i] + " ");
        }
        System.out.println();
        // 27 de Enero de 2023
        // Comprobar si dos arrays tienen el mismo contenido
        // (suponiendo que no podemos ver el contenido de cada uno visualmente)
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 0, 9};

        // Codigo de validacion
        // 1. Comprobar si alguno de los datos es null
        if (arr1 == null || arr2 == null) {
            System.out.println("Al menos uno de los arrays es null");
            return;
        }

        if (arr1 == arr2) {
            System.out.println("Ambos son el mismo array -> contenido identico");
            return;
        }

        if (arr1.length != arr2.length) {
            System.out.println("El contenido no es el mismo");
            return;
        }

        // En este punto los arrays tienen el mismo tamaño
        boolean iguales = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) { // son distintos, tengo que forzar la salida del bucle
                iguales = false;
                break;
            }
        }

        if (iguales) {
            System.out.println("Son identicos");
        } else {
            System.out.println("Son distintos");
        }

        System.out.println("Fin del programa");

        // Partiendo de dos arrays 2D validos y de las mismas dimensiones,
        // intercambiar la fila con indice 1 de ambos arrays
        int[][] arrA = {
                {0, 1},
                {2, 3},
                {4, 5},
                {6, 7}
        };

        int[][] arrB = {
                {0, 0},
                {1, 1},
                {2, 2},
                {3, 3}
        };
    }
}