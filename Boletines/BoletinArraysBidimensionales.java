import java.util.Random;
import java.util.Scanner;


public class BoletinArraysBidimensionales {

    Scanner scan = new Scanner(System.in);
    private int num;

    public void menuArray() {
        String opc = " ";

        do {
            System.out.print("----- Menú Principal -----"
                    + "\nIngrese una opción (1-19). 0 para salir: ");
            opc = scan.nextLine();

            switch (opc) {
                case "1":
                    ejercicio1();
                    break;
                case "2":
                    ejercicio2();
                    break;
                case "3":
                    ejercicio3();
                    break;
                case "4":
                    ejercicio4();
                    break;
                case "5":
                    ejercicio5();
                    break;
                case "6":
                    ejercicio6();
                    break;
                case "7":
                    ejercicio7();
                    break;
                case "8":
                    ejercicio8();
                    break;
                case "9":
                    ejercicio9();
                    break;
                case "10":
                    ejercicio10();
                    break;
                case "11":
                    ejercicio11();
                    break;
                case "12":
                    ejercicio12();
                    break;
                case "13":
                    ejercicio13();
                    break;
                case "14":
                    ejercicio14();
                    break;
                case "15":
                    ejercicio15();
                    break;
                case "16":
                    ejercicio16();
                    break;
                default:
                    System.out.println("Gracias por usar la aplicación. Vuelva Pronto");
                    break;
            }

        } while (!opc.equals("0"));
    }

    public void ejercicio1() {
        /*
        Ejercicio 1:
        Partiendo de la siguiente matriz haga los siguientes ejercicios:
        0 0 0
        0 0 0
        0 0 0
        */

        int[][] arrayInt = new int[3][3]; // Como el valor por defecto de una matriz de int es 0, se declara así.
        System.out.println("FIN");
    }

    public void ejercicio2() {
        /*
        Ejercicio 2:
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

    public void ejercicio3() {
        /*
        Ejercicio 3:
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

    public void ejercicio4() {
        /*
        Ejercicio 4:
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

    public void ejercicio5() {
        /*
        Ejercicio 5:
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

    public void ejercicio6() {
        /*
        Ejercicio 6:
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

    public void ejercicio7() {
        /*
        Ejercicio 7:
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

    public void ejercicio8() {
        /*
        Ejercicio 8:
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
            System.out.print("{");
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = 1;
                System.out.print(arrayInt[i][j] + "");
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void ejercicio9() {
        /*
        Ejercicio 9:
        Modificar el ejercicio anterior para que cada posición tenga un número aleatorio
        entre 0 y 9.
        */

        int n = 0, random = 0;
        Random rand = new Random();

        System.out.print("Introducir la dimensión de la matriz: ");
        n = scan.nextInt();
        int[][] arrayInt = new int[n][n];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = rand.nextInt(10);
                System.out.print(arrayInt[i][j] + "");
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void ejercicio10() {
        /*
        Ejercicio 10:
        Modificar el ejercicio anterior para que las dimensiones sean nxm.
        */
        int rowSize = 0, columnSize = 0, random = 0;
        Random rand = new Random();

        System.out.print("Introducir la dimensión de filas de la matriz: ");
        rowSize = scan.nextInt();
        System.out.print("Introducir la dimensión de columnas de la matriz: ");
        columnSize = scan.nextInt();
        int[][] arrayInt = new int[rowSize][columnSize];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = rand.nextInt(10);
                System.out.print(arrayInt[i][j] + "");
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void ejercicio11() {
        /*
        Ejercicio 11:
        Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz
        cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        a a a a
        a 0 0 0
        a 0 0 0
        a 0 0 0
        */

        int rowSize = 0, columnSize = 0, random = 0;
        Random rand = new Random();

        System.out.print("Introducir la dimensión de filas de la matriz: ");
        rowSize = scan.nextInt();
        System.out.print("Introducir la dimensión de columnas de la matriz: ");
        columnSize = scan.nextInt();
        int[][] arrayInt = new int[rowSize][columnSize];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = rand.nextInt(10);
                System.out.print(arrayInt[i][j] + "");
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void ejercicio12() {
        /*
        Ejercicio 12:
        Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz
        cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        0 0 0 a
        0 0 0 a
        0 0 0 a
        a a a a
        */
    }

    public void ejercicio13() {
        /*
        Ejercicio 13:
        Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz
        cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        a a a a
        a 0 0 a
        a 0 0 a
        a a a a
        */

    }

    public void ejercicio14() {
        /*
        Ejercicio 14:
        Leer por pantalla un número entero n, y crear una matriz de dimensiones nxn como
        la que se muestra a continuación. Imprimir la matriz por pantalla.
        Ejemplo para n = 4:
        0 1 0 1
        1 0 1 0
        0 1 0 1
        1 0 1 0
        */
    }

    public void ejercicio15() {
        // Ejercicio 15:
        // Repetir el ejercicio anterior, sumando ambos arrays y guardando el resultado en un
        // tercer array que deberá imprimirse por pantalla.

        int size = 4;
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        Random rand = new Random();

        // Inicializar los arrays con números aleatorios de una cifra.
        for (int i = 0; i < size; i++) {
            array1[i] = rand.nextInt(10);
            array2[i] = rand.nextInt(10);
        }

        int[] arrayPlus = new int[size];
        // Sumar los valores de cada array en su posición.
        for (int i = 0; i < size; i++) {
            arrayPlus[i] = array1[i] + array2[i];
        }

        for (int i = 0; i < size; i++) {
            if (arrayPlus[i] == size - 1) {
                System.out.print(arrayPlus[i] + ".");
            } else {
                System.out.print(arrayPlus[i] + ", ");
            }
        }
        System.out.println();
    }

    public void ejercicio16() {
        // Ejercicio 16:
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
    }

    public static void main(String[] args) {
        BoletinArraysBidimensionales fc = new BoletinArraysBidimensionales();
        fc.menuArray();
    }
}