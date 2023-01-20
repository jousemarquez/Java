import java.util.Scanner;

public class TeoriaArraysBidimensionales {
    public static void main(String[] Arg) {
        Scanner scan = new Scanner(System.in);
        // ARRAYS BIDIMENSIONALES

        // Formas clásicas de declarar arrays de 1 dimensión.
        char[] arr1D = {'a','b','c'};
        char[] arr1Dbis = new char[3];

        // Formas para declarar arrays de 2 dimensiones.
        char[][] arr2Dbis = new char[5][3]; // El primero indica la altura y el segundo la anchura.
        char[][] arr2D = {
                {'a','b','c'},
                {'d','e','f'},
                {'g','h','i'},
                {'g','h','i','f','r'},
                {'g','h'},
        };

        System.out.println("Tamaño del arr2D: " +arr1D.length);
        System.out.println("Número de filas de arr2D: " +arr2D.length);
        System.out.println("Número de filas de arr2Dbis: " +arr2Dbis.length);
        System.out.println("Número de columnas de arr2Dbis: " +arr2Dbis[0].length);
        System.out.println("Número de columnas de arr2Dbis: " +arr2Dbis[1].length);
        System.out.println("Número de columnas de arr2Dbis: " +arr2Dbis[2].length);
        System.out.println("Número de columnas de arr2Dbis: " +arr2Dbis[3].length);
        System.out.println("Número de columnas de arr2Dbis: " +arr2Dbis[4].length);
        System.out.println("Tamaño de arr2D: [" + arr2D.length + "," +arr2D[0].length + "]");
        System.out.println("********* ACCESO DATOS *********");
        System.out.println("Mostrar [0,1] de arr2D: " +arr2D[0][1]); // Imprimir coordenadas
        System.out.println("Mostrar [2,2] de arr2D: " +arr2D[2][2]);
        System.out.println("Mostrar [1,0] de arr2D: " +arr2D[1][0]);
        System.out.println("********* MODIFICAR DATOS *********");
        arr2D[0][0] = 'J';
        arr2D[0][2] = 'J';
        arr2D[2][1] = 'J';
        System.out.println("********* IMPRIMIR LA MATRIZ ENTERA *********");

        int[][] arr = {
                {1,3},
                {3,6},
        };

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(" | " + arr2D[i][j]+ " | ");
            }
            System.out.println();
        }
    }
}
