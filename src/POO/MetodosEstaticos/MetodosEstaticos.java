package POO.MetodosEstaticos;

import java.util.Random;
import java.util.Scanner;

public class MetodosEstaticos {

    /*
    * Cree primero el código del método. Puede crearlo en el mismo fichero de código fuente donde tenga el main,
    * o bien puede crearse una clase nueva donde desarrollar los métodos de este boletín.
    * Cuando acabe cada método, implemente en el main una llamada para probarlo.
    */

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
        int size = scan.nextInt();

        String[][] arrayString = new String[size][size];

        float cont = 1.0f; // Se añade un contador para pasar posteriormente a float.
        // Rellenando array
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString[0].length; j++){
                arrayString[i][j] = Float.toString(cont); // Se convierte float a string.
                cont++; // Se incrementa en uno el contador de float.
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


        String[][] arrayString = {
                {"Alberto", "Joaquín", "Jorge", "Edu"},
                {"Chema", "Luis", "Ángel", "Jose"},
        };

        // Pedir al usuario un número de la posición de la matriz

        System.out.print("Introduce los índices de filas y columnas: ");
        int fila = scan.nextInt(), columna = scan.nextInt();
        while ((fila >= 0 && fila < 2) && (columna >= 0 && columna < 4)) {
            System.out.print("Introduce un nombre: ");
            String nombre = scan.next();
            arrayString[fila][columna] = nombre;
            System.out.print("Introduce los índices de filas y columnas: ");
            fila = scan.nextInt();
            columna = scan.nextInt();
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

    public void ejercicio3() {
        /*
        Ejercicio 3:
        Repetir el ejercicio anterior para que durante el último paso (imprimir la matriz), se lea por pantalla
        un String. En caso de ser “MAYUSCULAS”, pasar a mayúsculas el contenido de la matriz. En caso de ser
        “minúsculas”, pasar a minúsculas el contenido de la matriz. En cualquier otro caso, no hacer nada.
        A continuación, imprimir la matriz.
        */

        String[][] arrayString = {
                {"Alberto", "Joaquín", "Jorge", "Edu"},
                {"Chema", "Luis", "Ángel", "Jose"},
        };

        // Pedir al usuario un número de la posición de la matriz
        System.out.print("Introduce los índices de filas y columnas: ");
        int fila = scan.nextInt(), columna = scan.nextInt();
        while ((fila >= 0 && fila < 2) && (columna >= 0 && columna < 4)) {
            System.out.print("Introduce un nombre: ");
            String nombre = scan.next();
            arrayString[fila][columna] = nombre;
            System.out.print("Introduce los índices de filas y columnas: ");
            fila = scan.nextInt();
            columna = scan.nextInt();
        }

        System.out.println("Imprimir todo en MAYUSCULAS o en minusculas?: ");
        String cadena = scan.next();

        // Imprimiendo array
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayString[i].length; j++) {
                if (cadena.equals("MAYUSCULAS")) {
                    arrayString[i][j] = arrayString[i][j].toUpperCase();
                } else if (cadena.equals("minuscula")) {
                    arrayString[i][j] = arrayString[i][j].toLowerCase();
                }
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
                arraySuma[i][j] = arrayInt[i][j] + arrayInt2[i][j]; // Suma de cada elemento
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
        Ejercicio 5:
        Repetir el ejercicio anterior para que el contenido de M1 y M2 se genere de forma aleatoria
        (números entre 0 y 9).
        */

        int[][] arrayInt = new int[3][3];

        // Se llena la matriz arrayInt de valores aleatorios de números entre 0 y 9.
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = (int)(Math.random()*10);
            }
        }

        int[][] arrayInt2 = new int[3][3];

        // Se llena la matriz arrayInt2 de valores aleatorios de números entre 0 y 9.
        for (int i = 0; i < arrayInt2.length; i++) {
            for (int j = 0; j < arrayInt2[i].length; j++) {
                arrayInt2[i][j] = (int)(Math.random()*10);
            }
        }

        // Se llena la matriz arraySuma con los valores de arrayInt y arrayInt2.
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

    public void ejercicio6() {
        /*
        Ejercicio 6:
        Repetir el ejercicio 4 para que, además, el tamaño n de ambas matrices se genere de forma aleatoria
        (ambas matrices serán de tamaño nxn).
        */

        Random rand = new Random();
        int random = 0;
        int size = (int)(Math.random()*9+1); // Así se fuerza que al menos sea 1 el tamaño.

        int[][] arrayInt = new int[size][size];

        // Se llena la matriz arrayInt de valores aleatorios de números entre 0 y 9.
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = (int)(Math.random()*10);
            }
        }

        int[][] arrayInt2 = new int[size][size];

        // Se llena la matriz arrayInt2 de valores aleatorios de números entre 0 y 9.
        for (int i = 0; i < arrayInt2.length; i++) {
            for (int j = 0; j < arrayInt2[i].length; j++) {
                arrayInt2[i][j] = (int)(Math.random()*10);
            }
        }

        // Se llena la matriz arraySuma con los valores de arrayInt y arrayInt2.
        int[][] arraySuma = new int[size][size];

        for (int i = 0; i < arraySuma.length; i++) {
            for (int j = 0; j < arraySuma[0].length; j++){
                arraySuma[i][j] = arrayInt[i][j] + arrayInt2[i][j];
            }
        }

        // Imprimir arrayInt1.
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

        // Imprimir arrayInt2.
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

        // Imprimir arraySuma.
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

    public void ejercicio7() {
        /*
        Ejercicio 7:
        Dadas las matrices del ejercicio 4, desarrollar un programa para multiplicarlas.
        Busque en internet como se multiplican dos matrices.
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

        int[][] arrayMultiplicacion = new int[arrayInt.length][arrayInt2[0].length];
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt2[0].length; j++) {
                for (int k = 0; k < arrayInt[0].length; k++) {
                    arrayMultiplicacion[i][j] += arrayInt[i][k] * arrayInt2[k][j];
                }
            }
        }

        // Imprimir arraySuma.
        System.out.println("Contenido de arraySuma: ");
        for (int i = 0; i < arrayMultiplicacion.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrayMultiplicacion[i].length; j++) {
                if (j == arrayMultiplicacion[i].length-1) {
                    System.out.print(arrayMultiplicacion[i][j] + "");
                } else {
                    System.out.print(arrayMultiplicacion[i][j] + ", ");
                }
            }
            System.out.println("}");
        }
        System.out.println("FIN");
    }

    public static void main(String[] args) {
        MetodosEstaticos fc = new MetodosEstaticos();
        fc.menuArray();
    }
}