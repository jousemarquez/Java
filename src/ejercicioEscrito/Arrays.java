package ejercicioEscrito;

public class Arrays {
    // Método que devuelve un array booleano
    public static boolean[][] getMatrizBooleana(int[][] arrayInt, String[][] arrayStrings) {
        // Comprobar que ambas matrices tienen las mismas dimensiones
        if (arrayInt.length != arrayStrings.length || arrayInt[0].length != arrayStrings[0].length) {
            return null;
        }

        // Instanciar el array booleana con las mismas dimensiones que los arrays de enteros y de Strings
        boolean[][] arrayBooleana = new boolean[arrayInt.length][arrayInt[0].length];

        // Recorrer el array booleana
        for (int i = 0; i < arrayBooleana.length; i++) {
            for (int j = 0; j < arrayBooleana[0].length; j++) {
                // Almacenar en el array booleana el resultado de la comprobación en cada posición (i,j)
                arrayBooleana[i][j] = arrayStrings[i][j].charAt(0) == (char) arrayInt[i][j];
            }
        }
        // Devolver el array booleana
        return arrayBooleana;
    }

    // Método que imprime una array booleana
    public static void imprimirMatrizBooleana(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Ejemplos de matrices de enteros y de Strings
        int[][] arrayInt = {{97, 98, 99}, {100, 101, 102}};
        String[][] arrayStrings = {{"a", "b", "c"}, {"d", "e", "f"}};

        // Llamar al método que devuelve una array booleana
        boolean[][] arrayBoolean = getMatrizBooleana(arrayInt, arrayStrings);

        // Comprobar si el array booleano no es null
        if (arrayBoolean != null) {
            // Imprimir el array booleana
            imprimirMatrizBooleana(arrayBoolean);
        } else {
            System.out.println("Los arrays no tienen las mismas dimensiones.");
        }
    }
}
