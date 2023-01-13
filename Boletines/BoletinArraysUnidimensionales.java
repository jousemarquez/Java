import java.util.Scanner;

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

    public void ejercicio9() {
        // Ejercicio 9:
        // Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
        // Partiendo del array ya creado y completamente relleno, obtener la suma de todos ellos y la media.
        int[] arrayCenturia = new int[100]; // Se declara un array de enteros vacío de 100 posiciones.
        for (int i = 0; i < arrayCenturia.length; i++) {
            arrayCenturia[i] = i+1; // Se lanza un bucle que añade a cada posición la posición +1.
        }
        int sumatorio = 0; // Se declara un entero acumulador para añadir la suma.
        for (int j = 0; j < arrayCenturia.length; j++) {
            sumatorio =+ arrayCenturia[j];
        }
        System.out.println("La suma de todos los elementos es: " + sumatorio);
        System.out.println("La media de todos los elementos es: " + sumatorio/arrayCenturia.length);


        System.out.println("Ahora se imprime la posición del array por pantalla.");
        for (int i = 0; i < arrayCenturia.length; i++) {
            System.out.print(arrayCenturia.length + ", ");
        }
    }

    public void ejercicio10() {
        // Ejercicio 10:
        // Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas).
        // Después, ve pidiendo posiciones del array por teclado y si la posición es correcta,
        // se añadirá a una cadena inicialmente vacía que se mostrará al final del ejercicio.
        // Se dejará de pedir numeros cuando se introduzca un número negativo.
        char[] arrayAbecedario = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; // Array con valores hardcodeados.
        for (int i = 0; i < arrayAbecedario.length; i++) {
            /*arrayAbecedario2[i] = (char) (i + 17 + '0'); // Se hace un casteo de int a char y se rellena.*/
            arrayAbecedario[i]++;
        }

        for (int j = 0; j < arrayAbecedario.length; j++) { // Impresión de cada uno de los valores por pantalla.
            System.out.print(arrayAbecedario[j] + ", ");
        }
        System.out.println();
        num = 0;
        do {
            System.out.print("Indica una posición del array (0 - 26: ");
        } while (num > 0); // HASTA AQUÍ


    }

    public void ejercicio11() {
    }

    public void ejercicio12() {
    }

    public void ejercicio13() {
    }

    public void ejercicio14() {
    }

    public void ejercicio15() {
    }

    public void ejercicio16() {
        // Ejercicio 16:
        // Crear un array de enteros de 5 posiciones. Leer por pantalla una cadena y
        // almacenar en cada posición del array el número de ocurrencias de cada vocal: en la
        // posición 0 la cantidad de a, en la 1 la de e, y así sucesivamente, mostrando al final
        // el contenido del array.


    }

    public void ejercicio17() {
    }

    public void ejercicio18() {
    }

    public void ejercicio19() {
    }

    public static void main(String[] args) {
        BoletinArraysUnidimensionales fc = new BoletinArraysUnidimensionales();
        fc.menuArray();
    }
}