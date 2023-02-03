package arrays;

import java.util.Random;
import java.util.Scanner;

public class BoletinArraysMultidimensionales {

    Scanner scan = new Scanner(System.in);
    private int num;

    public void menuArray() {
        String opc = " ";

        do {
            System.out.print("----- Menú Principal -----"
                    + "\nIngrese una opción (1-16)"
                    + "\nParte A (1-8) Parte B (9-16): ");

            opc = scan.nextLine();

            switch (opc) {
                case "1":
                    parteA0();
                    break;
                case "2":
                    parteA1();
                    break;
                case "3":
                    parteA2();
                    break;
                case "4":
                    parteA3();
                    break;
                case "5":
                    parteA4();
                    break;
                case "6":
                    parteA5();
                    break;
                case "7":
                    parteA6();
                    break;
                case "8":
                    parteA7();
                    break;
                case "9":
                    parteB1();
                    break;
                case "10":
                    parteB2();
                    break;
                case "11":
                    parteB3();
                    break;
                case "12":
                    parteB4();
                    break;
                case "13":
                    parteB5();
                    break;
                case "14":
                    parteB6();
                    break;
                case "15":
                    parteB7();
                    break;
                case "16":
                    parteB8();
                    break;
                default:
                    System.out.println("Gracias por usar la aplicación. Vuelva Pronto");
                    break;
            }

        } while (!opc.equals("0"));
    }

    public void parteA0() {
        /*
        Ejercicio 0:
        Partiendo de la siguiente matriz haga los siguientes ejercicios:
        0 0 0
        0 0 0
        0 0 0
        */

        int[][] arrayInt = new int[3][3]; // Como el valor por defecto de una matriz de int es 0, se declara así.
        System.out.println("FIN");
    }

    public void parteA1() {
        /*
        Ejercicio 1:
        Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        modificarla completamente imprímela por pantalla sin utilizar bucles:
        1 1 1
        0 0 0
        0 0 0
        */

        int[][] arrayInt = new int[3][3];

        arrayInt[0][0] = 1;
        arrayInt[0][1] = 1;
        arrayInt[0][2] = 1;

        System.out.println(arrayInt[0][0] + " " + arrayInt[0][1] + " " + arrayInt[0][2]);
        System.out.println(arrayInt[1][0] + " " + arrayInt[1][1] + " " + arrayInt[1][2]);
        System.out.println(arrayInt[2][0] + " " + arrayInt[2][1] + " " + arrayInt[2][2]);
        System.out.println("FIN");
    }

    public void parteA2() {
        /*
        Ejercicio 2:
        Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        modificarla completamente imprímela por pantalla sin utilizar bucles:
        1 0 0
        1 0 0
        1 0 0*/

        int[][] arrayInt = new int[3][3];

        arrayInt[0][0] = 1;
        arrayInt[1][0] = 1;
        arrayInt[2][0] = 1;

        System.out.println(arrayInt[0][0] + " " + arrayInt[0][1] + " " + arrayInt[0][2]);
        System.out.println(arrayInt[1][0] + " " + arrayInt[1][1] + " " + arrayInt[1][2]);
        System.out.println(arrayInt[2][0] + " " + arrayInt[2][1] + " " + arrayInt[2][2]);
        System.out.println("FIN");
    }

    public void parteA3() {
        /*
        Ejercicio 3:
        Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        modificarla completamente imprímela por pantalla sin utilizar bucles:
        0 0 0
        0 0 0
        1 1 1
        */

        int[][] arrayInt = new int[3][3];

        arrayInt[0][2] = 1;
        arrayInt[1][2] = 1;
        arrayInt[2][2] = 1;

        System.out.println(arrayInt[0][0] + " " + arrayInt[0][1] + " " + arrayInt[0][2]);
        System.out.println(arrayInt[1][0] + " " + arrayInt[1][1] + " " + arrayInt[1][2]);
        System.out.println(arrayInt[2][0] + " " + arrayInt[2][1] + " " + arrayInt[2][2]);
        System.out.println("FIN");
    }

    public void parteA4() {
        /*
        Ejercicio 4:
        Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        modificarla completamente imprímela por pantalla sin utilizar bucles:
        0 0 1
        0 0 1
        0 0 1
        */

        int[][] arrayInt = new int[3][3];

        arrayInt[0][2] = 1;
        arrayInt[1][2] = 1;
        arrayInt[2][2] = 1;

        System.out.println(arrayInt[0][0] + " " + arrayInt[0][1] + " " + arrayInt[0][2]);
        System.out.println(arrayInt[1][0] + " " + arrayInt[1][1] + " " + arrayInt[1][2]);
        System.out.println(arrayInt[2][0] + " " + arrayInt[2][1] + " " + arrayInt[2][2]);
        System.out.println("FIN");
    }

    public void parteA5() {
        /*
        Ejercicio 5:
        Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        modificarla completamente imprímela por pantalla sin utilizar bucles:
        1 0 0
        0 1 0
        0 0 1
        */

        int[][] arrayInt = new int[3][3];

        arrayInt[0][0] = 1;
        arrayInt[1][1] = 1;
        arrayInt[2][2] = 1;

        System.out.println(arrayInt[0][0] + " " + arrayInt[0][1] + " " + arrayInt[0][2]);
        System.out.println(arrayInt[1][0] + " " + arrayInt[1][1] + " " + arrayInt[1][2]);
        System.out.println(arrayInt[2][0] + " " + arrayInt[2][1] + " " + arrayInt[2][2]);
        System.out.println("FIN");
    }

    public void parteA6() {
        /*
        Ejercicio 6:
        Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        modificarla completamente imprímela por pantalla sin utilizar bucles:
        0 0 1
        0 1 0
        1 0 0
        */

        int[][] arrayInt = new int[3][3];

        arrayInt[0][2] = 1;
        arrayInt[1][1] = 1;
        arrayInt[2][0] = 1;

        System.out.println(arrayInt[0][0] + " " + arrayInt[0][1] + " " + arrayInt[0][2]);
        System.out.println(arrayInt[1][0] + " " + arrayInt[1][1] + " " + arrayInt[1][2]);
        System.out.println(arrayInt[2][0] + " " + arrayInt[2][1] + " " + arrayInt[2][2]);
        System.out.println("FIN");
    }

    public void parteA7() {
        /*
        Ejercicio 7:
        Modifica todos los ejercicios anteriores para que la modificación y la impresión se
        realicen mediante bucles.
        */

        // RELLENAR JOAQUÍN

        int[][] arrayInt = new int[3][3];

        arrayInt[0][0] = 1;
        arrayInt[0][1] = 1;
        arrayInt[0][2] = 1;

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                if (i == 0) {
                    arrayInt[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j] + "");
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void parteB1() {
        /*
        Ejercicio 1:
        Leer por pantalla un número entero n, y generar una matriz de dimensiones nxn
        como la que se muestra a continuación. Imprimir la matriz por pantalla tras haberla
        generado completamente.
        Ejemplo para n = 3:
        1 1 1
        1 1 1
        1 1 1
        */
        int n = 0;
        System.out.print("Introducir la dimensión de la matriz: ");
        n = scan.nextInt();
        int[][] arrayInt = new int[n][n];

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = 1;
            }
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void parteB2() {
        /*
        Ejercicio 2:
        Modificar el ejercicio anterior para que cada posición tenga un número aleatorio
        entre 0 y 9.
        */

        int n = 0, random = 0;
        Random rand = new Random();

        System.out.print("Introducir la dimensión de la matriz: ");
        n = scan.nextInt();
        int[][] arrayInt = new int[n][n];
        // Rellenar array
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = rand.nextInt(10);
            }
        }
        // Imprimir array
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j] + "");
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void parteB3() {
        /*
        Ejercicio 3:
        Modificar el ejercicio anterior para que las dimensiones sean nxm.
        */

        int rowSize = 0, columnSize = 0, random = 0;
        Random rand = new Random();

        System.out.print("Introducir la cantidad de filas de la matriz: ");
        rowSize = scan.nextInt();
        System.out.print("Introducir la cantidad de columnas de la matriz: ");
        columnSize = scan.nextInt();
        int[][] arrayInt = new int[rowSize][columnSize];

        // Rellenar array
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = rand.nextInt(10);
            }
        }

        // Imprimir array
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = rand.nextInt(10);
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void parteB4() {
        /*
        Ejercicio 4:
        Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz
        cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        a  a  a  a
        a  0  0  0
        a  0  0  0
        a  0  0  0
        */

        int dimension;
        char caracter;
        System.out.print("Introducir un caracter: ");
        caracter = scan.next().charAt(0);
        System.out.print("Introducir la dimensión: ");
        dimension = scan.nextInt();
        char[][] arrayChar = new char[dimension][dimension];

        // Rellenar array
        for (int i = 0; i < arrayChar.length; i++) {
            for (int j = 0; j < arrayChar[i].length; j++) {
                if (i == 0 || j == 0) {
                    arrayChar[i][j] = caracter;
                } else {
                    arrayChar[i][j] = '0';
                }
            }
        }
        // Imprimir array
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayChar[i].length; j++) {
                System.out.print(arrayChar[i][j] + " ");
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void parteB5() {
        /*
        Ejercicio 5:
        Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz
        cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        0  0  0  a
        0  0  0  a
        0  0  0  a
        a  a  a  a
        */

        int dimension;
        char caracter;
        System.out.print("Introducir un caracter: ");
        caracter = scan.next().charAt(0);
        System.out.print("Introducir la dimensión: ");
        dimension = scan.nextInt();
        char[][] arrayChar = new char[dimension][dimension];

        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayChar[i].length; j++) {
                if (i == arrayChar[i].length - 1 || j == arrayChar[j].length - 1) {
                    arrayChar[i][j] = caracter;
                } else {
                    arrayChar[i][j] = '0';
                }
                System.out.print(arrayChar[i][j] + " ");
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void parteB6() {
        /*
        Ejercicio 6:
        Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz
        cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        a  a  a  a
        a  0  0  a
        a  0  0  a
        a  a  a  a
        */

        int dimension;
        char caracter;
        System.out.print("Introducir un caracter: ");
        caracter = scan.next().charAt(0);
        System.out.print("Introducir la dimensión: ");
        dimension = scan.nextInt();
        char[][] arrayChar = new char[dimension][dimension];

        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayChar[i].length; j++) {
                if (i == 0 || j == 0 || i == arrayChar[i].length - 1 || j == arrayChar[j].length - 1) {
                    arrayChar[i][j] = caracter;
                } else {
                    arrayChar[i][j] = '0';
                }
                System.out.print(arrayChar[i][j] + " ");
            }
            System.out.println("}");
        }
        System.out.println("FIN");

    }

    public void parteB7() {
        /*
        Ejercicio 7:
        Leer por pantalla un número entero n, y crear una matriz de dimensiones nxn como
        la que se muestra a continuación. Imprimir la matriz por pantalla.
        Ejemplo para n = 4:
        0 1 0 1
        1 0 1 0
        0 1 0 1
        1 0 1 0
        */

        int dimension;
        System.out.print("Introducir la dimensión: ");
        dimension = scan.nextInt();
        int[][] arrayInt = new int[dimension][dimension];

        // Rellenar array

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    arrayInt[i][j] = 1;
                } else if (i % 2 == 1 && j % 2 == 0) {
                    arrayInt[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void parteB8() {
        // Ejercicio 8:
        /*(MUY DIFICIL) Modificar el ejercicio 2 para que una vez generada la matriz, se cree
        otra nueva que contenga en cada posición la media aritmética de los elementos que
        la rodean. Por ejemplo, para la siguiente matriz aleatoria:
        3 4 0
        1 0 2
        7 6 2
        Se debe generar la siguiente nueva:
        1.67 1.2 2.0
        4.0 3.125 2.4
        2.33 2.4 2.67
        */

        /* Se declaran dos matrices a y b, donde a es una matriz de tres filas y tres columnas con todos sus elementos
        igual a 1 y b es una matriz vacía con la misma dimensión que a.*/

        int[][] a = {{1,1,1}, {1,1,1}, {1,1,1}};
        int[][] b = new int[a.length][a.length];
        int c;

        for (int i = 0; i < a.length; i++) { //Inicia un bucle anidado para recorrer cada elemento de la matriz a.
            for (int j = 0; j < a[i].length; j++) { // Dentro del bucle, inicia otro bucle anidado para recorrer cada
                // elemento en los elementos adyacentes a cada elemento en a
                c = 0;
                for (int k = i-1; k <= i+1 ; k++) {
                    for (int l = j-1; l <= j+1; l++) {
                        if (!(i==k && j==l) && k>= 0 && k< a.length && l>=0 && l<a[i].length) {
                            // Si el elemento actual no es el mismo que el elemento original, se verifica si se
                            // encuentra dentro de los límites de la matriz y, si es así, se suma a la matriz b en
                            // la misma posición.
                            b[i][j] += a[k][l];
                            c++;
                        }
                    }
                }
                b[i][j]/=c; // Finalmente, se divide el valor de b en la posición actual por el número de
                // elementos adyacentes que se han sumado para obtener la media.
            }
        }
        // Se imprimen ambas matrices, a y b, en la salida estándar.
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%02d ",a[i][j]);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");
        //  El formato de impresión utiliza una anchura de dos caracteres y un espacio adicional para asegurar que
        //  se muestren dos dígitos para cada elemento de la matriz.
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("%02d ",b[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BoletinArraysMultidimensionales fc = new BoletinArraysMultidimensionales();
        fc.menuArray();
    }
}