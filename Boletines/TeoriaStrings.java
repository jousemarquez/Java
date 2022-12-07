public class TeoriaStrings {
    public static void main(String[] Arg) {

        /*La clase String:

        Hasta ahora solo hemos utilizado los tipos PRIMITIVOS pero los STRING (secuencias de caracteres,
        CHARTS) son tipo COMPUESTO.

        - Un objeto de la clase String representa una cadena de caracteres.
        - La clase String pertenece al paquete java.lang (como por ejemplo, el import java.util.Scanner).
        Java.lang viene por defecto importada.
        - Al igual que otras clases, String tiene métodos, atributos y constructores.
        - A diferencia de otras clases, tiene dos operadores,  + y += (utilizado para la concatenación).

        LITERALES DE CADENA (valor hardcodeado)

        Ej. String nombre = “José Antonio”;

        Una declaración int numero = 4; NO es un tipo objeto.

        - Son objetos de la clase String.
        - Se definen por agrupar el texto entre comillas dobles. “Esta es una cadena literal”.
        - No tiene que ser construido con new. Es obligatorio utilizarlo cuando se crea un nuevo objeto.

        Es más correcto usar:
        String nombre = new String (“José Antonio”);

        - Pueden ser asignados a variables de cadena.
        - Se pueden pasar a métodos y constructores como parámetros.
        - La primera letra de los tipos compuestos va siempre en mayúsculas.*/

        // Tipo primitivo numérico. El 4 es un literal == hardcodeado.
        int numero = 4;
        // Tipo primitivo numérico de tipo Double.
        double temp = 4.33243;
        // Método que hemos usado hasta ahora para declarar un tipo String.
        String name = "Jose Antonio";
        // Método alternativo y MÁS correcto para declarar un tipo String.
        String name2 = new String("Jose Antonio");
        // Tipo primitivo que en este caso devuelve el primer caracter.
        char primeraInicial = "Robert".charAt(0);
        // Devuelve la primera inicial del string Name = J.
        char primeraInicial2 = name.charAt(0);
        // Tipo compuesto matemático.
        Math.pow(23.8, 2);
    }
}