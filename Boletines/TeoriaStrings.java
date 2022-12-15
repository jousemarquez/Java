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

        Ej. String nombre = "José Antonio";

        Una declaración int numero = 4; NO es un tipo objeto.

        - Son objetos de la clase String.
        - Se definen por agrupar el texto entre comillas dobles. "Esta es una cadena literal".
        - No tiene que ser construido con new. Es obligatorio utilizarlo cuando se crea un nuevo objeto.

        Es más correcto usar:
        String nombre = new String ("José Antonio");

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

        // Substrings

        String subcadena = "Jorge".substring(1,5); //Método formal de declarar un Substring.
            System.out.println(subcadena);
            System.out.println("Jorge".substring(1)); // Otro método para usar Substring dentro del print.
            System.out.println("Jorge".substring(1, "Jorge".length())); // Otro método interesante porque devuelve como
            // máximo la longitud de la cadena.
        }

        // Crear una cadena mediante un literal de cadena
        // Dividir la cadena en dos mitades e imprimir cada mitad en una línea. Debe usar el método substring y lenght.
        String ejercicio = "Hola-mundo";
        String sub1 = ejercicio.substring(0,ejercicio.length()/2);
        System.out.println(sub1);
        String sub2 = ejercicio.substring(ejercicio.length()/2);
        System.out.println(sub2);

        // Concatenación
        System.out.println(sub1 + sub2);
        System.out.println("Hola" + "Mundo" + 44); // Concatenación de strings con entero.
        System.out.println("44" + 1); // Aquí está concatenando un string con un entero
        System.out.println((char) ('a' + 1));

        // Método concat()
        String calle = "Avenida de la Concordia";
        String calle2 = calle.concat(" De Dios nº5");
        System.out.println(calle);
        System.out.println(calle2);
        calle += calle2; // Concatena y almacena, crea un nuevo objeto llamado calle. El anterior String se ha borrado de memoria
        System.out.println(calle);
        calle += (calle2 + 44); // Esta opción es posible y se recomienda poner paréntesis.

        // Método indexOf()
        String producto = "Coca cola, stock 2 stock";
        System.out.println(producto.indexOf("stock")); // Se indica la cadena que se quiere buscar.
        System.out.println(producto.indexOf("Stock")); // Ojo porque Java discrimina mayus y minus. Devuelve -1
        System.out.println(producto.indexOf("stockage")); // No está incluida en la cadena, devuelve -1.
        System.out.println(producto.indexOf(',')); // Puede buscar chars (recordar que se declaran con ' '
        System.out.println(producto.indexOf('\t')); // También se puede buscar caracateres especiales.
        System.out.println(producto.indexOf("stock", 16)); // Busca desde una posición.

        // Ejercicio
        // A partir de una cadena que contiene un espacio en blanco (y solo uno), usar indexOf o lastIndexOf para
        // obtener el índice donde está el espacio. A partir de ese índice, dividir la cadena en dos partes distintas
        // que no tengan espacio.

        String galaxia = "Vía Láctea"; // Se define la cadena a estudiar
        int posicion = galaxia.indexOf(' '); // Se declara un entero para definir dónde está el espacio
        System.out.println("El espacio está en la posición: " +posicion); // Se imprime la posición
        String substring1 = galaxia.substring(0,posicion); // Se realiza un substring desde el caracter 1 hasta el espacio.
        System.out.println(substring1); // Se imprime
        System.out.println("Longitud de la primera parte: " +substring1.length()); // Se imprime la longitud de la primera cadena
        String substring2 = galaxia.substring(posicion + 1);
        System.out.println(substring2);
        System.out.println("Longitud de la segund parte: " +substring2.length());

        // Método equals()
        // Método con booleanos para igualar cadenas.
        System.out.println("Jouse".equals("jouse")); // Imprimiría false
        System.out.println("Jouse".equals("Jouse")); // Imprimiría true
        System.out.println("Jouse".equalsIgnoreCase("jouse")); // Condición que ignora todos los casos.
        // ADVERTENCIA: NO SE USA ESTA FORMA PARA IGUALAR CADENAS
        System.out.println("Hola" == "Mundo"); // MAL. == solo vale para los tipos primitivos.

        // Método compareTo()
        // Compara dos strings, si la primera o la segunda son iguales. Si A < B = -1, A = B = 0, A > B = 1
        System.out.println("jouse".compareTo("jouse")); // Devuelve 0
        System.out.println("aaaaaa".compareTo("bbbbbb")); // Devuelve -1. La primera va antes por orden alfabético.
        System.out.println("zzzzzz".compareTo("bbbbbb")); // Devuelve 1. La primera va antes por orden alfabético.

        int diff;
        //negative differences
        diff = "apple".compareTo("berry");//a before b
        diff = "Zebra".compareTo("apple");//Z before a
        diff = "dig".compareTo("dug");//i before u
        diff = "dig".compareTo("digs");//dig is shorter

        //zero differences
        diff = "apple".compareTo("apple");//equal
        diff = "dig".compareToIgnoreCase("DIG");//equal

        //positive differences
        diff = "berry".compareTo("apple");//b after a
        diff = "apple".compareTo("Apple");//a after A
        diff = "BIT".compareTo("BIG");//T after G
        diff = "huge".compareTo("hug");//huge is longer

        //Método trim() - Elimina los espacios que existan en la cadena.
        String ejemploTrim = "     Hola Mundo     ";
        ejemploTrim.trim();
        System.out.println(ejemploTrim);

        // Método replace() - Intercambia caracteres en la cadena.
        String ejemploReplace = "Hola Mundo";
        ejemploReplace.replace('a','o'); // Cambia la 'a' por 'o' -> Holo Mundo
        System.out.println(ejemploReplace);

        // Métodos toUpperCase() y toLowerCase() - Transforma la cadena en mayúsculas o minúsculas.
        String ejemploMayus = new String("hola mundo");
        System.out.println(ejemploMayus.toLowerCase());
        String ejemploMinus = new String("HOLA MUNDO");
        System.out.println(ejemploMinus.toUpperCase());

        // Método toString() - Intercambia enteros por cadena.
        int n = 1;
        String ejemploToString = Integer.toString(n);
        System.out.println(numero+1);

        // Convertir String a Intero o Double
        String numeroInt = new String("123"); // Convierte este tipo String
        int numeroIntConvertida = Integer.parseInt(numeroInt); // Usando de la librería de Int .parseInt()
        System.out.println(numeroIntConvertida);
        String numeroDouble = new String("123.45"); // Lo mismo con Double
        double numeroDoubleConvertido = Double.parseDouble(numeroDouble);
        System.out.println(numeroDoubleConvertido);
        String numeroFloat = new String("123.45f"); // Y con Float.
        float numeroFloatConvertido = Float.parseFloat(numeroFloat);
        System.out.println(numeroFloatConvertido);

    }
}