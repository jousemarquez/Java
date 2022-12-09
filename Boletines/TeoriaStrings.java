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
        String nombre = "José Antonio";
        // Método alternativo y MÁS correcto para declarar un tipo String.
        String nombre2 = new String("José Antonio");
        // Tipo primitivo que en este caso devuelve el primer caracter.
        char primeraInicial = "Robert".charAt(0);
        // Devuelve la primera inicial del string Name = J.
        char primeraInicial2 = nombre.charAt(0);
        // Tipo compuesto matemático.
        Math.pow(23.8, 2);
        String apellido = "Márquez"; // Objeto inmutable, si queremos cambiar debemos crear uno nuevo.
        apellido = "Flores";
        System.out.println(apellido);

        /* Una cadena vacía no tiene caracteres.*/
        String vacia1 = ""; // Esta cadena no tiene caracteres. Longitud 0.
        String vacia2 = new String(); // Al igual que el ejemplo anterior, con el constructor
        // genera una cadena vacía.
        String vacia3 = new String("");
        String vacia4 = null; // En este caso es un valor NULL, no está almacenando un objeto.
        System.out.println(vacia1);
        System.out.println(vacia2);
        System.out.println(vacia3);
        System.out.println(vacia4); // Al inicializar como NULL
        System.out.println("null"); // Aquí se imprimi una cadena de caracteres.

        /* Métodos. Empezamos a ver el método lenght en caracteres. Con este método devuelve
        * el número de caracteres del valor de la variable (solo en objetos, no en primitivas).*/
        System.out.println(nombre.length()); // Cuenta todos los caracteres espacios y caracteres de escape incluidos.
        System.out.println("José".length()); // Como literal de cadena es TAMBIÉN UN OBJETO podría usarse sobre un método.
        System.out.println(nombre.length()+apellido.length()); // Se pueden concatenar métodos con el operador +

        /*Número de objetos en...memoria*/
        System.out.println(nombre.length()); // Aquí hay 2 objetos
        System.out.println("José".length()); // Aquí hay 2 objetos
        System.out.println("José" + "Márquez"); // Aquí hay 3 objetos
        System.out.println("José " + "Márquez"); // Aquí hay 2 objetos porque Márquez se Java lo toma de la primigenia anterior.
        System.out.println("José" + " " + "Márquez"); // Aquí hay 4 objetos y es la forma ineficiente de ingresar un espacio en la cadena.

        /*Método charAt(int)*/
        System.out.println(nombre.charAt(1)); // .charAt(int) devuelve el caracter de la posición entero.
        // Recordar que en Java se comienza por 0.
        // System.out.println(nombre.charAt(100000)); //Si indicamos un int por encima del la longitud de caracteres del
        // recibiremos una excepción OutofBound (Fuera de límite) y por seguridad, no se reproducirá.
        // Podemos obtener un charAt de un objeto, de la siguiente forma:

        // Extracción de última letra en dos pasos.
        int longitud = nombre.length();
        System.out.println(nombre.charAt(longitud-1));
        // Recordar que el último caracter de una cadena es es siempre n-1.
        System.out.println(nombre.charAt(nombre.length()-1)); // Esta es la forma NORMAL de construirlo.
        System.out.println(nombre.charAt((nombre.length()-1)/2)); // Así se extrae el caracter central de esta cadena.
        System.out.println(nombre.charAt((nombre.length()-1)/2)); // Así se extrae el caracter central de esta cadena.
        // Crear una cadena con un constructor y darle el valor que se quiera.
        String ciudad = new String("Sevilla"); // Un constructor es todo lo que está a la derecha del new.
        //Mediante un bucle for y mediante los métodos length y charAt, imprimir cada carácter de la cadena en una línea.
        System.out.println("Inicio programa");
        String pais = new String("España"); // Se asigna el valor a la cadena pais
        for (int i = 0; i < pais.length(); i++){ // Se establece como límite la longitud de la cadena
            System.out.println(pais.charAt(i)); // Se imprime en pantalla el caracter en la posición i.
        }

    }
}