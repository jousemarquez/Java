package _examenes.trimestre2;

public class EjercicioTres {

    /*EJERCICIO 3:

    Crear un método estático que reciba tres argumentos:
    - dos arrays bidimensionales de enteros del mismo tamaño
    (NxN).
    - un carácter, que sólo podrá ser H o V.

    El método debe crear un nuevo array bidimensional resultante
    de ‘concatenar’ horizontal o verticalmente ambos arrays, y
    devolverlo. Por ejemplo, si se tienen los siguientes arrays 2x2:

    y la siguiente llamada:

    concatenar(arr1, arr2, ‘H’);
    horizontal
    el método debe devolver el siguiente array 2x4:

    concatenar(arr1, arr2, ‘V’);
    vertical
    */

    public static void concatenar(int[][] arrayPrimero, int[][] arraySegundo, char posicion) {

        if (posicion == 'H'){
            int[][] arrayFinal = new int[arrayPrimero.length][arrayPrimero.length+arraySegundo.length];

            for (int i = 0; i < arrayFinal.length; i++) {
                System.out.print("{");
                for (int j = 0; j < arrayFinal[i].length; j++) {
                    if (j == arrayFinal[i].length-1) {
                        System.out.print(arrayFinal[i][j] + "");
                    } else {
                        System.out.print(arrayFinal[i][j] + ", ");
                    }
                }
                System.out.println("}");
            }
        } else {
            int[][] arrayFinal = new int[arrayPrimero.length+arraySegundo.length][arrayPrimero.length];
            for (int i = 0; i < arrayFinal.length; i++) {
                System.out.print("{");
                for (int j = 0; j < arrayFinal[i].length; j++) {
                    if (j == arrayFinal[i].length-1) {
                        System.out.print(arrayFinal[i][j] + "");
                    } else {
                        System.out.print(arrayFinal[i][j] + ", ");
                    }
                }
                System.out.println("}");
            }
        }
    }

    public static void main(String[] args) {
        int[][] arrayPrimero = {
                {7, 9},
                {2, 1}
        };

        int[][] arraySegundo = {
                {3, 4},
                {2, 0}
        };

        System.out.println("Llamada concatenar(arr1, arr2, ‘H’)");
        concatenar(arrayPrimero,arraySegundo,'H');
        System.out.println("Llamada concatenar(arr1, arr2, ‘V’)");
        concatenar(arrayPrimero,arraySegundo,'V');

        /*NOTA PARA EL PROFESOR:
         * El ejercicio toma el tamaño de ambos arrays pero el método estático no está tomando los valores nativos
         * de cada array. Aún así interpreta dependiendo del caracter incluido el formato pedido por el ejercicio.*/

    }
}