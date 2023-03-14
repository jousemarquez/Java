package Armas;

public class MetodosEstaticosDeJoseMarquez {
    /*
     * Un método imprimirStrings que reciba un array de String y no devuelva nada.
     * El método imprimirá cada String en una línea distinta.
     */
    public static void imprimirStrings(String[] arrayString){
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

    public static void imprimirInventario(InventarioJoseMarquez inventario){
        for (int i = 0; i < inventario.getArmeria().length; i++) {
            System.out.print(inventario.getArmeria()[i]);
        }
    }
}