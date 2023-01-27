import java.util.Random;
import java.util.Scanner;

public class BoletinArraysMultidimensionales2 {

    Scanner scan = new Scanner(System.in);
    private int num;

    public void menuArray() {
        String opc = " ";

        do {
            System.out.print("----- Menú Principal -----"
                    + "\nIngrese una opción (1-7): ");

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
                default:
                    System.out.println("Gracias por usar la aplicación. Vuelva Pronto");
                    break;
            }

        } while (!opc.equals("0"));
    }

    public void ejercicio1() {
        /*
        Ejercicio 1:
        Leer por pantalla un número entero n, y crear una matriz de String de dimensiones nxn como la que se
        muestra a continuación. Imprimir la matriz por pantalla después de haberla rellenado completamente.

        Ejemplo para n = 4:
        1.0    2.0   3.0   4.0
        5.0    6.0   7.0   8.0
        9.0    10.0  11.0  12.0
        13.0   14.0  15.0  16.0
        */

        System.out.print("Introducir un número: ");
        int n = scan.nextInt();

        float[][] arrayString = new float[n][n];

        // Rellenando array
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString[0].length; j++){
                if (i % 2 == 1) {
                    arrayString[i][j] += 1;
                } else if (i % 2 == 0) {
                    arrayString[0][j] += 4;
                }
            }
        }
        // Imprimiendo array
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayString[i].length; j++) {
                if (j == arrayString[i].length-1) {
                    System.out.print(arrayString[i][j] + "");
                } else {
                    System.out.print(arrayString[i][j] + ", ");
                }
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void ejercicio2() {
        /*
        Ejercicio 2:
        Crear una matriz de String de dimensiones 2x4 y rellenarla con nombres de compañeros o familiares.
        El programa a continuación debe leer por pantalla una posición de la matriz válida, leer un nuevo
        nombre por pantalla y sustituir el nombre que exista en esa posición. Debe repetirse la operación
        hasta que el usuario introduzca una posición inválida. Antes de finalizar, imprima la matriz.
        */
        int fila = 0, columna = 0;
        String nuevoNombre;
        String[][] arrayString = {
                {"Alberto", "Joaquín", "Jorge", "Edu"},
                {"Chema", "Luis", "Ángel", "Jose"},
        };

        // Pedir al usuario un número de la posición de la matriz

        do {
            System.out.print("Introducir el número de fila: ");
            fila = scan.nextInt();
        } while (fila < 0 || fila > 1);

        do {
            System.out.print("Introducir el número de columna: ");
            columna = scan.nextInt();
        } while (columna < 0 || columna > 3);

        System.out.print("Introducir un nombre a sustituir: ");
        nuevoNombre = scan.next();

        arrayString[fila][columna] = nuevoNombre;

        // Imprimiendo array
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayString[i].length; j++) {
                if (j == arrayString[i].length-1) {
                    System.out.print(arrayString[i][j] + "");
                } else {
                    System.out.print(arrayString[i][j] + ", ");
                }
            }
            System.out.println("}");
        }
        System.out.println("FIN");

    }

    public void ejercicio3() {
        /*
        Ejercicio 3:
        Repetir el ejercicio anterior para que durante el último paso (imprimir la matriz), se lea por pantalla
        un String. En caso de ser “MAYUSCULAS”, pasar a mayúsculas el contenido de la matriz. En caso de ser
        “minúsculas”, pasar a minúsculas el contenido de la matriz. En cualquier otro caso, no hacer nada.
        A continuación, imprimir la matriz.
        */

        int fila = 0, columna = 0;
        String nuevoNombre;
        String[][] arrayString = {
                {"Alberto", "Joaquín", "Jorge", "Edu"},
                {"Chema", "Luis", "Ángel", "Jose"},
        };

        // Pedir al usuario un número de la posición de la matriz

        do {
            System.out.print("Introducir el número de fila: ");
            fila = scan.nextInt();
        } while (fila < 0 || fila > 1);

        do {
            System.out.print("Introducir el número de columna: ");
            columna = scan.nextInt();
        } while (columna < 0 || columna > 3);

        System.out.print("Introducir un nombre a sustituir: ");
        nuevoNombre = scan.next();

        arrayString[fila][columna] = nuevoNombre;

        if (nuevoNombre.equals(nuevoNombre.toUpperCase())) {
            // Imprimiendo array
            for (int i = 0; i < arrayString.length; i++) {
                System.out.print("{");
                for (int j = 0; j < arrayString[i].length; j++) {
                    if (j == arrayString[i].length-1) {
                        System.out.print(arrayString[i][j].toUpperCase() + "");
                    } else {
                        System.out.print(arrayString[i][j].toUpperCase() + ", ");
                    }
                }
                System.out.println("}");
            }
        } else if (nuevoNombre.equals(nuevoNombre.toLowerCase())) {
            // Imprimiendo array
            for (int i = 0; i < arrayString.length; i++) {
                System.out.print("{");
                for (int j = 0; j < arrayString[i].length; j++) {
                    if (j == arrayString[i].length-1) {
                        System.out.print(arrayString[i][j].toLowerCase() + "");
                    } else {
                        System.out.print(arrayString[i][j].toLowerCase() + ", ");
                    }
                }
                System.out.println("}");
            }
        }
        System.out.println("FIN");
    }

    public void ejercicio4() {
        /*
        Ejercicio 4:
        Crear las siguientes matrices de 3x3 y crear una nueva con el resultado de sumarlas. Para sumar dos matrices,
        debe sumar las posiciones correspondientes y almacenar el resultado en la nueva matriz. Imprima primero M1,
        a continuación, M2 y luego la matriz resultante.

        M1= 6 8 9 	    M2= 2 4 1
            4 2 0        	8 7 7
            3 1 1        	6 6 2
        */

        int[][] arrayInt = {
                {6,8,9},
                {4,2,0},
                {3,1,1}
        };

        int[][] arrayInt2 = {
                {2,4,1},
                {8,7,7},
                {6,6,2}
        };

        int[][] arraySuma = new int[3][3];

        for (int i = 0; i < arraySuma.length; i++) {
            for (int j = 0; j < arraySuma[0].length; j++){
                arraySuma[i][j] = arrayInt[i][j] + arrayInt2[i][j];
            }
        }
        // Imprimir arrayInt1
        System.out.println("Contenido de arrayInt1: ");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayInt[i].length; j++) {
                if (j == arrayInt[i].length - 1) {
                    System.out.print(arrayInt[i][j] + "");
                } else {
                    System.out.print(arrayInt[i][j] + ", ");
                }
            }
            System.out.println("}");
        }

        // Imprimir arrayInt2
        System.out.println("Contenido de arrayInt2: ");
        for (int i = 0; i < arrayInt2.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayInt2[i].length; j++) {
                if (j == arrayInt2[i].length - 1) {
                    System.out.print(arrayInt2[i][j] + "");
                } else {
                    System.out.print(arrayInt2[i][j] + ", ");
                }
            }
            System.out.println("}");
        }

        // Imprimir arraySuma
        System.out.println("Contenido de arraySuma: ");
        for (int i = 0; i < arraySuma.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arraySuma[i].length; j++) {
                if (j == arraySuma[i].length-1) {
                    System.out.print(arraySuma[i][j] + "");
                } else {
                    System.out.print(arraySuma[i][j] + ", ");
                }
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public void ejercicio5() {
        /*
        Ejercicio 4:
        Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        modificarla completamente imprímela por pantalla sin utilizar bucles:
        0 0 1
        0 0 1
        0 0 1
        */

    }

    public void ejercicio6() {
        /*
        Ejercicio 5:
        Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        modificarla completamente imprímela por pantalla sin utilizar bucles:
        1 0 0
        0 1 0
        0 0 1
        */


        System.out.println("FIN");
    }

    public void ejercicio7() {
        /*
        Ejercicio 6:
        Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        modificarla completamente imprímela por pantalla sin utilizar bucles:
        0 0 1
        0 1 0
        1 0 0
        */

        System.out.println("FIN");
    }

    public static void main(String[] args) {
        BoletinArraysMultidimensionales2 fc = new BoletinArraysMultidimensionales2();
        fc.menuArray();
    }
}