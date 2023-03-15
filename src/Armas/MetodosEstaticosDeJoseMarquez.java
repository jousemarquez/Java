package Armas;

public class MetodosEstaticosDeJoseMarquez {
    /*
     * Un método imprimirStrings que reciba un array de String y no devuelva nada.
     * El método imprimirá cada String en una línea distinta.
     */
    public static void imprimirStrings(String[] arrayString){
        if (arrayString == null){
            throw new NullPointerException("No puede ser null");
        }
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
    }
    /*
     * Un método ampliar que reciba un string y un entero y devuelva la concatenación del string recibido con
     * tantos espacios “ ” como la diferencia entre el entero recibido y la longitud del string recibido.
     * (Por ejemplo, si ejecuto ampliar(“Hola”, 7) devolverá “Hola ”). Pista: usar método repeat.
     */
    public static String ampliar(String cadena, int numero){
        if (cadena == null){
            throw new NullPointerException("No puede ser null");
        }

        if (numero < 0){
            throw new IllegalArgumentException("El úmero no puede ser negativo.");
        }
        int numEspacios = numero - cadena.length();
        if (numEspacios <= 0) {
            return cadena;
        }
        String espacios = " ".repeat(numEspacios);
        return cadena + espacios;
    }
    /*
     * Un método desplazar que reciba un array de string y un numero entero y devuelva un array de string.
     * Éste array de string que devuelve debe ser un array con el tamaño del numero entero recibido y debe
     * almacenar el array de string recibido en sus últimas posiciones, rellenando las primeras con cadenas vacías.
     * (Por ejemplo, si ejecuto desplazar({“Hola”,“Mundo”}, 5) devolverá {“”,“”,“”,“Hola”,“Mundo”}).
     */
    public static String[] desplazar(String[] arrayString, int numero){
        if (arrayString == null){
            throw new IllegalArgumentException("No puede ser null.");
        }

        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        String[] arrayGenerado = new String[numero];
        for (int i = arrayString.length; i > 0;i--) {
            arrayGenerado[i] = arrayString[i];
        }
        for (int i = arrayGenerado.length - arrayString.length; i > 0; i--) {
            arrayGenerado[i] = "";
        }
        return arrayGenerado;
    }
    /*
     * Un método imprimirInventario que reciba un InventarioNombreApellido1, no devuelva nada e imprima las armas en
     * la misma línea. En caso de conseguirlo, adaptar el ejercicio para usar dicho String como retorno del método
     * toString del inventario. Éste método sería más correcto desarrollarlo en la clase InventarioNombreApellido1.
     * Pista: usar métodos anteriores.*/

    public static void imprimirArmas(InventarioJoseMarquez inv) {

        String[][] lineas = new String[inv.getArmeria().length][];
        int maxRows = 0;
        int maxColumns = 0;
        for (int i = 0; i < inv.getArmeria().length; i++) {
            lineas[i] = inv.getArmeria()[i].toString().split("\n");
            if (lineas[i].length > maxRows) {
                maxRows = lineas[i].length;
            }
            for (int j = 0; j < lineas[i].length; j++) {
                if (lineas[i][j].length() > maxColumns) {
                    maxColumns = lineas[i][j].length();
                }
            }
        }
        for (int i = 0; i < lineas.length; i++) {
            lineas[i] = MetodosEstaticosDeJoseMarquez.desplazar(lineas[i], maxRows);
            for (int j = 0; j < lineas[i].length; j++) {
                lineas[i][j] = MetodosEstaticosDeJoseMarquez.ampliar(lineas[i][j], maxColumns);
            }
        }
        String[] sol = new String[maxRows];
        for (int i = 0; i < maxRows; i++) {
            sol[i] = "";
            for (int j = 0; j < lineas.length; j++) {
                sol[i] += lineas[j][i];
            }
        }
        imprimirStrings(sol);
    }
}