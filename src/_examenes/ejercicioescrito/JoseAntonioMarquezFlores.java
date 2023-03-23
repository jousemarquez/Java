package _examenes.ejercicioescrito;

import java.util.Scanner;

public class JoseAntonioMarquezFlores {
    public static void main(String[] args) {
        // Creación de un objeto Scanner para leer la entrada por teclado
        Scanner input = new Scanner(System.in);

        // Pidiendo el número de filas
        System.out.print("Introduce el número de filas: ");
        int n = input.nextInt();

        // Pidiendo el número de columnas
        System.out.print("Introduce el número de columnas: ");
        int m = input.nextInt();

        // Pidiendo el carácter
        System.out.print("Introduce un carácter: ");
        char c = input.next().charAt(0);

        // Creación de la matriz inicial de tipo String
        String[][] arrayString = new String[n][m];

        // Recorriendo la matriz inicial y pidiendo una cadena para cada posición (i, j)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Introduce una cadena que contenga el carácter '" + c + "' para la posición (" + i + "," + j + "): ");
                String cadena = input.next();

                // Verificando que la cadena introducida contenga al carácter c
                while (!cadena.contains(String.valueOf(c))) {
                    System.out.print("La cadena no contiene el carácter '" + c + "', introduce otra: ");
                    cadena = input.next();
                }

                // Almacenando la cadena en la matriz inicial
                arrayString[i][j] = cadena;
            }
        }

        // Creación de la matriz de enteros
        int[][] arrayInt = new int[n][m];

        // Recorriendo la matriz inicial y almacenando el valor unicode del último carácter de cada cadena en la matriz de enteros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrayInt[i][j] = arrayString[i][j].charAt(arrayString[i][j].length() - 1);
            }
        }

        // Imprimiendo la matriz de enteros
        System.out.println("Matriz de enteros:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println();
        }
    }
}
