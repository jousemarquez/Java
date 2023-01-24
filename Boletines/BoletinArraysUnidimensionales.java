import java.util.Scanner;
import java.util.Random;


public class BoletinArraysUnidimensionales {

    Scanner scan = new Scanner(System.in);
    private int num;

    public void menuArray() {
        String opc = " ";

        do {
            System.out.print("----- Menú Principal -----"
                    + "\nIngrese una opción (1-19). 0 para salir: ");
            opc = scan.nextLine();

            switch (opc) {
                case "1":
                    ejercicio1();
                    break;
                case "2":
                    ejercicio2();
                    break;
                case "3":
                    ejercicio3();
                    break;
                case "4":
                    ejercicio4();
                    break;
                case "5":
                    ejercicio5();
                    break;
                case "6":
                    ejercicio6();
                    break;
                case "7":
                    ejercicio7();
                    break;
                case "8":
                    ejercicio8();
                    break;
                case "9":
                    ejercicio9();
                    break;
                case "10":
                    ejercicio10();
                    break;
                case "11":
                    ejercicio11();
                    break;
                case "12":
                    ejercicio12();
                    break;
                case "13":
                    ejercicio13();
                    break;
                case "14":
                    ejercicio14();
                    break;
                case "15":
                    ejercicio15();
                    break;
                case "16":
                    ejercicio16();
                    break;
                case "17":
                    ejercicio17();
                    break;
                case "18":
                    ejercicio18();
                    break;
                case "19":
                    ejercicio19();
                    break;
                default:
                    System.out.println("Gracias por usar la aplicación. Vuelva Pronto");
                    break;
            }

        } while (!opc.equals("0"));
    }

    public void ejercicio1() {
        // Ejercicio 1:
        /*
         * Crear un array de float de tamaño 10 mediante un inicializador (dando valores iniciales a su gusto).
         * Imprimir el contenido del array por consola.
         * Modificar el array para que en cada posición se almacene el índice que le corresponde.
         * Una vez que el array esté completamente modificado, volver a imprimir el array y comprobar que
         * ha hecho el ejercicio de forma correcta.
         * Siga las instrucciones al pie de la letra (siempre).
         */

        // Crear un array de float de tamaño 10 mediante un inicializador (dando valores iniciales a su gusto).
        float[] arrayFloat = {0.0f, 1.4f, 2.3f, 3.2f, 4.4f, 56.76f, 69.0f, 77.3f, 899.0f, 999.99f};
        // Imprimir el contenido del array por consola
        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[i] + ", ");
        }
        // Modificar el array para que en cada posición se almacene el índice que le corresponde.
        for (int i = 0; i < arrayFloat.length; i++) {
            arrayFloat[i] = i;
        }
        System.out.println();
        // Una vez que el array esté completamente modificado, volver a imprimir el array y comprobar que ha hecho
        // el ejercicio de forma correcta.
        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[i] + ", ");
        }
        System.out.println();
    }

    public void ejercicio2() {
        // Ejercicio 2:
        // Modificar el ejercicio anterior para que en vez de ser float el array sea de strings.

        // Crear un array de Strings de tamaño 10 mediante un inicializador (dando valores iniciales a su gusto).
        String[] arrayString = {"Huelva", "Sevilla", "Cádiz", "Málaga", "Granada", "Córdoba", "Jaén", "Almería",
                "Murcia", "Albacete"};
        // Imprimir el contenido del array por consola
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print(arrayString[i] + ", ");
        }
        // Modificar el array para que en cada posición se almacene el índice que le corresponde.
        for (int i = 0; i < arrayString.length; i++) {
            // Varios métodos para convertir Int a String
            // Método concatenación: (i + " "). Método menos recomendado.
            // Método String.valueOf(i). Método más eficiente.
            // Método Integer.toString(i). Método que se necesita conocer el tipo primitivo.
            arrayString[i] = Integer.toString(i);
        }
        System.out.println();
        // Una vez que el array esté completamente modificado, volver a imprimir el array y comprobar que ha hecho
        // el ejercicio de forma correcta.
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print(arrayString[i] + ", ");
        }
        System.out.println();
    }

    public void ejercicio3() {
        // Ejercicio 3:
        // Modificar el ejercicio anterior de forma que el array sea de char (utilice únicamente
        // números de una cifra en el inicializador).
        // Crear un array de Char de tamaño 10 mediante un inicializador (dando valores de una cifra).
        char[] arrayChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        // Imprimir el contenido del array por consola
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i] + ", ");
        }
        // Modificar el array para que en cada posición se almacene el índice que le corresponde.
        for (int i = 0; i < arrayChar.length; i++) {
            // Varios métodos para convertir Int a Char
            arrayChar[i] = (char) (i + 48); // El caracter ASCII del número 0 es 48.
        }
        System.out.println();
        // Una vez que el array esté completamente modificado, volver a imprimir el array y comprobar que ha hecho
        // el ejercicio de forma correcta.
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i] + ", ");
        }
        System.out.println();
    }

    public void ejercicio4() {
        // Ejercicio 4:
        // Escribe un programa que cree un array de 5 posiciones e imprima el valor de cada posición.
        // Elija el tipo que desee y los valores iniciales que desee.
        int[] arrayInt = {5, 4, 3, 2, 1};
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + ", ");
        }
        System.out.println();
    }

    public void ejercicio5() {
        // Ejercicio 5:
        // Modifica el ejercicio anterior para que, a continuación, pida por pantalla 5 nuevos
        // valores y rellene el array con ellos, volviéndolo a imprimir.
        int[] arrayInt = {5, 4, 3, 2, 1};
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(i + ", ");
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Intoduce un valor entero: ");
            arrayInt[i] = scan.nextInt(); // Se introduce por teclado el nuevo valor de la posición de i.
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + ", ");
        }
    }

    public void ejercicio6() {
        // Ejercicio 6:
        // Modifica el programa anterior para que el número de posiciones del array se lea por pantalla.
        System.out.println("¿Qué tamaño quieres para el array?: ");
        int[] arrayInt = new int[scan.nextInt()]; // Se pide por teclado el tamaño del array.

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + ", ");
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Intoduce un valor entero: ");
            arrayInt[i] = scan.nextInt();
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + ", ");
        }
    }

    public void ejercicio7() {
        // Ejercicio 7:
        // Si eligió un tipo numérico para el ejercicio anterior,
        // repítalo usando un tipo no numérico (boolean, char o String).
        // Si eligió un tipo no numérico, repítalo usando float.
        boolean[] arrayBoolean = {true, false, true, false, false};
        for (int i = 0; i < arrayBoolean.length; i++) {
            System.out.print(i + ", ");
        }
        for (int i = 0; i < arrayBoolean.length; i++) {
            System.out.print("Intoduce un valor booleano (true or false): ");
            boolean bool = scan.nextBoolean();
            arrayBoolean[i] = bool;
        }
        for (int i = 0; i < arrayBoolean.length; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("Ahora se imprime la posición del array por pantalla.");
        for (int i = 0; i < arrayBoolean.length; i++) {
            System.out.print(arrayBoolean.length + ", ");
        }
    }

    public void ejercicio8() {
        // Ejercicio 8:
        // Crear un array de enteros donde indicamos por teclado el tamaño del array,
        // rellenamos el array con números aleatorios entre 0 y 9, y mostramos por pantalla
        // el valor de cada posición y la suma de todos los valores.
        System.out.print("¿Qué tamaño quieres de array?: ");
        int[] arrInt = new int[scan.nextInt()]; // Se pide por teclado la dimensión del array.

        for (int i = 0; i < arrInt.length; i++) { // Se imprime
            System.out.print(i + ", ");
        }
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) (Math.random()*10);// Se hace un casting a Int porque por defecto Math.Random() es double.
        }
        int sum = 0;
        for (int i = 0; i < arrInt.length; i++) {

        }
        System.out.println("\n"+sum);
    }

    public void ejercicio9() {
        // Ejercicio 9:
        // Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
        // Partiendo del array ya creado y completamente relleno, obtener la suma de todos ellos y la media.
        int[] arrayCenturia = new int[100]; // Se declara un array de enteros vacío de 100 posiciones.
        for (int i = 0; i < arrayCenturia.length; i++) {
            arrayCenturia[i] = i+1; // Se lanza un bucle que añade a cada posición la posición +1.
        }
        for (int i = 0; i < arrayCenturia.length; i++) { // Se imprime el array.
            System.out.print(i + ", ");
        }
        System.out.println();

        int sumatorio = 0; // Se declara un entero acumulador para añadir la suma.
        for (int j = 0; j < arrayCenturia.length; j++) {
            sumatorio += arrayCenturia[j];
        }
        System.out.println("La suma de todos los elementos es: " + sumatorio);
        System.out.println("La media de todos los elementos es: " + sumatorio/arrayCenturia.length);
    }

    public void ejercicio10() {
        // Ejercicio 10:
        // Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas).
        // Después, ve pidiendo posiciones del array por teclado y si la posición es correcta,
        // se añadirá a una cadena inicialmente vacía que se mostrará al final del ejercicio.
        // Se dejará de pedir numeros cuando se introduzca un número negativo.

        char[] arrayAbecedario = new char[26]; // Se declara el array con la longitud.
        for (int i = 0; i < arrayAbecedario.length; i++) {
            arrayAbecedario[i] = (char)('A' + i); // Se introduce todos los caracteres sumándoles la posición de i
        }
        String resultado = ""; // Inicializar el String donde se va a alojar los caracteres.
        int posicion = 0;
        while (posicion >= 0) {
            System.out.print("Introducir una posición entre 0 y 25: ");
            posicion = scan.nextInt();
            if (posicion >= 0 && posicion < 26) {
                resultado += arrayAbecedario[posicion];
            } else if (posicion > 25) {
                System.out.println("Error, inserte otro número.");
            }
        }
        System.out.println("Fin");
        System.out.println("La cadena es: " + resultado);
    }

    public void ejercicio11() {
        // Ejercicio 11:
        // Crear un array de String de tamaño 3, con los nombres de tres compañeros de clase.
        // A continuación, pedir por teclado un nombre, y comprobar si está en el array,
        // escribiendo un mensaje al respecto de tipo: Juan esta en el array.

        String[] arrayCompaneros = {"Ricardo","Alberto","Chema"};
        System.out.print("Introduce un nombre: ");
        String nombreTeclado = scan.nextLine();
        boolean estaEnArray = false;
        for (int i = 0; i < arrayCompaneros.length; i++) {
            if (arrayCompaneros[i].equalsIgnoreCase(nombreTeclado)){
                estaEnArray = true;
                break;
            }
        }
        if (estaEnArray) {
            System.out.println(nombreTeclado + " está en el array.");
        } else {
            System.out.println(nombreTeclado + " no está en el array.");
        }
    }

    public void ejercicio12() {
        // Ejercicio 12:
        // Repetir el ejercicio anterior pero escribiendo un mensaje de tipo: Juan esta en el array en la posición 2.

        String[] arrayCompaneros = {"Ricardo","Alberto","Chema"};
        System.out.print("Introduce un nombre: ");
        String nombreTeclado = scan.nextLine();
        boolean estaEnArray = false;
        int posicionArray = 0;
        for (int i = 0; i < arrayCompaneros.length; i++) {
            if (arrayCompaneros[i].equalsIgnoreCase(nombreTeclado)){
                estaEnArray = true;
                posicionArray = i;
                break;
            }
        }
        if (estaEnArray) {
            System.out.println(nombreTeclado + " está en el array en la posición " + posicionArray);
        } else {
            System.out.println(nombreTeclado + " no está en el array.");
        }
    }

    public void ejercicio13() {
        // Ejercicio 13:
        // Leer por pantalla un numero entero y crear un array de ese tamaño, con valores aleatorios entre 1 y 300.
        // A continuación, pedir un número entero entre 0 y 9, e imprimir todas las posiciones del array que tengan
        // un número acabado en ese dígito. Esos números, además de imprimirlos, almacenarlos en un array de salida
        // con el tamaño adecuado.
        System.out.print("Introducir la longitud del array: ");
        int[] arrayAleatorios = new int[scan.nextInt()];
        int limiteInferior = 1;
        int limiteSuperior = 300;
        // Número aleatorio entre limiteInferior y limiteSuperior

        for (int i = 0; i < arrayAleatorios.length; i++) {
            arrayAleatorios[i] = (int) (Math.random()) * (limiteSuperior - limiteInferior + 1) + limiteInferior;
            System.out.print(arrayAleatorios[i] + ", ");
        }
        System.out.println();

        System.out.print("Introducir un número entre 0 y 9");
        int n = scan.nextInt();
        int contador = 0; // Contador para dimensionar el array salida
        for (int i = 0; i < arrayAleatorios.length; i++) {
            if(arrayAleatorios[i] % 10 == n) {
                System.out.print(n + ", ");
                contador++;
            }
        }
        System.out.println();

        int[] arraySalida = new int[contador];
        int posicion = 0;

        for (int i = 0; i < arrayAleatorios.length; i++) {
            if(arrayAleatorios[i] % 10 == n) {
                arraySalida[posicion] = arrayAleatorios[i];
                System.out.print(arraySalida[i] + ", ");
            }
        }
        System.out.println("FIN");

        // Ejemplo de Joaquin:

        System.out.println("introduce tamaño array");
        int[] aleatorios = new int[scan.nextInt()];

        int limiteInterior2 = 1;
        int limiteSuperior2 = 300;
        //Numero aleatorio entre limiteInferior y limiteSuperior

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random() * (limiteSuperior2-limiteInterior2+1)+limiteInterior2);
        }

        System.out.print("Array aleatorio: ");
        for (int i = 0; i < aleatorios.length; i++) {
            System.out.print(aleatorios[i] + " ");
        }

        System.out.println("\nEntre 0 y 9");
        int num = scan.nextInt();

        System.out.print("Posiciones: ");
        int cont = 0;
        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i]%10 == num) {
                System.out.print(i + " ");
                cont++;
            }
        }

        System.out.print("\nLos numeros en esas posiciones:");
        cont = 0;
        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i]%10 == num) {
                System.out.print(aleatorios[i] + " ");
                cont++;
            }
        }

        int[] salida = new int[cont];
        int pos = 0;

        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i]%10 == num) {
                salida[pos] = aleatorios[i];
                pos++;
            }
        }

        System.out.print("\nArray de salida:");
        for (int i = 0; i < salida.length; i++) {
            System.out.print(salida[i] + " ");
        }

    }

    public void ejercicio14() {
        // Ejercicio 14:
        // Crear dos arrays de enteros del mismo tamaño (4). Inicializarlos con números aleatorios de una cifra.
        // Comparar si el contenido de ambos es exactamente el mismo, imprimiendo un mensaje al respecto.

        int size = 4;
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        Random rand = new Random();

        // Inicializar los arrays con números aleatorios de una cifra
        for (int i = 0; i < size; i++) {
            array1[i] = rand.nextInt(10);
            array2[i] = rand.nextInt(10);
        }

        // Comparar si el contenido de ambos arrays es exactamente el mismo
        boolean isEqual = true;
        for (int i = 0; i < size; i++) {
            if (array1[i] != array2[i]) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            System.out.println("Los contenidos de los dos arrays son exactamente iguales.");
        } else {
            System.out.println("Los contenidos de los dos arrays son diferentes.");
        }
    }

    public void ejercicio15() {
        // Ejercicio 15:
        // Repetir el ejercicio anterior, sumando ambos arrays y guardando el resultado en un
        // tercer array que deberá imprimirse por pantalla.

        int size = 4;
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        Random rand = new Random();

        // Inicializar los arrays con números aleatorios de una cifra.
        for (int i = 0; i < size; i++) {
            array1[i] = rand.nextInt(10);
            array2[i] = rand.nextInt(10);
        }

        int[] arrayPlus = new int[size];
        // Sumar los valores de cada array en su posición.
        for (int i = 0; i < size; i++) {
            arrayPlus[i] = array1[i] + array2[i];
        }

        for (int i = 0; i < size; i++) {
            if(arrayPlus[i] == size - 1) {
                System.out.print(arrayPlus[i] + ".");
            } else {
                System.out.print(arrayPlus[i] + ", ");
            }
        }
        System.out.println();
    }

    public void ejercicio16() {
        // Ejercicio 16:
        // Crear un array de enteros de 5 posiciones. Leer por pantalla una cadena y
        // almacenar en cada posición del array el número de ocurrencias de cada vocal: en la
        // posición 0 la cantidad de a, en la 1 la de e, y así sucesivamente, mostrando al final
        // el contenido del array.

        System.out.println("Ingrese una cadena:");
        String inputVocales = scan.nextLine();

        int[] vocales = {0, 0, 0, 0, 0};
        for (int i = 0; i < inputVocales.length(); i++) {
            char c = inputVocales.charAt(i);
            if (c == 'a' || c == 'A') {
                vocales[0]++;
            } else if (c == 'e' || c == 'E') {
                vocales[1]++;
            } else if (c == 'i' || c == 'I') {
                vocales[2]++;
            } else if (c == 'o' || c == 'O') {
                vocales[3]++;
            } else if (c == 'u' || c == 'U') {
                vocales[4]++;
            }
        }

        System.out.println("Cantidad de aes: " + vocales[0]);
        System.out.println("Cantidad de es: " + vocales[1]);
        System.out.println("Cantidad de ius: " + vocales[2]);
        System.out.println("Cantidad de os: " + vocales[3]);
        System.out.println("Cantidad de ues: " + vocales[4]);
    }

    public void ejercicio17() {
        // Crear un array de enteros de 5 posiciones. Leer por pantalla una cadena y
        // almacenar en cada posicióndel array el número de ocurrencias de cada vocal: en la
        // posición 0 la cantidad de a, en la 1 la de e, y así sucesivamente, mostrando al final
        // el contenido del array. Repetir, pero contando todas las letras del abecedario.

        System.out.print("Ingrese una cadena: ");
        String inputAbecedario = scan.nextLine();

        int[] lettersCount = new int[26];
        for (int i = 0; i < inputAbecedario.length(); i++) {
            char c = inputAbecedario.charAt(i);
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                lettersCount[index]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println("Cantidad de " + (char)(i + 'a') + ": " + lettersCount[i]);
        }
    }

    public void ejercicio18() {
        // Ejercicio 18:
        // Leer una cadena que contenga varias palabras separadas por espacios.
        // Buscar información del método split de la clase String, y utilizarlo para
        // dividir la cadena en las distintas palabras.

        System.out.print("Ingrese una cadena con varias palabras separadas por espacios: ");
        String input = scan.nextLine();

        String[] words = input.split(" ");
        System.out.println("Palabras divididas: ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public void ejercicio19() {
        // Introduce por pantalla el número de tu DNI, y vuelve a imprimirlo seguido de la letra.
        // Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, el resultado
        // debe estar entre 0 y 22. Tendrás que crear un array que contenga:

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        System.out.print("Ingrese el número de su DNI: ");
        int dniNumber = scan.nextInt();

        int remainder = dniNumber % 23;
        String dniLetter = letras[remainder];
        System.out.println("Su DNI es: " + dniNumber + dniLetter);
    }

    public static void main(String[] args) {
        BoletinArraysUnidimensionales fc = new BoletinArraysUnidimensionales();
        fc.menuArray();
    }
}