package ejercicioEscrito;

public class Arrays {
    // Método que devuelve una matriz booleana
    public static boolean[][] getMatrizBooleana(int[][] matrizEnteros, String[][] matrizStrings) {
        // Comprobar que ambas matrices tienen las mismas dimensiones
        if (matrizEnteros.length != matrizStrings.length || matrizEnteros[0].length != matrizStrings[0].length) {
            return null;
        }

        // Instanciar la matriz booleana con las mismas dimensiones que las matrices de enteros y de Strings
        boolean[][] matrizBooleana = new boolean[matrizEnteros.length][matrizEnteros[0].length];

        // Recorrer la matriz booleana
        for (int i = 0; i < matrizBooleana.length; i++) {
            for (int j = 0; j < matrizBooleana[0].length; j++) {
                // Almacenar en la matriz booleana el resultado de la comprobación en cada posición (i,j)
                matrizBooleana[i][j] = matrizStrings[i][j].charAt(0) == (char) matrizEnteros[i][j];
            }
        }

        // Devolver la matriz booleana
        return matrizBooleana;
    }

    // Método que imprime una matriz booleana
    public static void imprimirMatrizBooleana(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Ejemplos de matrices de enteros y de Strings
        int[][] matrizEnteros = {{97, 98, 99}, {100, 101, 102}};
        String[][] matrizStrings = {{"a", "b", "c"}, {"d", "e", "f"}};

        // Llamar al método que devuelve una matriz booleana
        boolean[][] matrizBooleana = getMatrizBooleana(matrizEnteros, matrizStrings);

        // Comprobar si la matriz booleana no es null
        if (matrizBooleana != null) {
            // Imprimir la matriz booleana
            imprimirMatrizBooleana(matrizBooleana);
        } else {
            System.out.println("Las matrices no tienen las mismas dimensiones.");
        }
    }
}
