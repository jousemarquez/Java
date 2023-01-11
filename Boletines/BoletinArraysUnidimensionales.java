import java.util.Scanner;

public class BoletinArraysUnidimensionales {

    Scanner scan = new Scanner(System.in);

    public void menu() {
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
                    ejercicio1();
                    break;
                case "4":
                    ejercicio1();
                    break;
                case "5":
                    ejercicio1();
                    break;
                case "6":
                    ejercicio1();
                    break;
                case "7":
                    ejercicio1();
                    break;
                case "8":
                    ejercicio1();
                    break;
                case "9":
                    ejercicio1();
                    break;
                case "10":
                    ejercicio1();
                    break;
                case "11":
                    ejercicio1();
                    break;
                case "12":
                    ejercicio1();
                    break;
                case "13":
                    ejercicio1();
                    break;
                case "14":
                    ejercicio1();
                    break;
                case "15":
                    ejercicio1();
                    break;
                case "16":
                    ejercicio1();
                    break;
                case "17":
                    ejercicio1();
                    break;
                case "18":
                    ejercicio1();
                    break;
                case "19":
                    ejercicio1();
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
            System.out.print(i + ", ");
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
            int num = scan.nextInt();
            arrayInt[i] = num;
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(i + ", ");
        }
    }

    public void ejercicio6() {
        // Ejercicio 6:
        // Modifica el programa anterior para que el número de posiciones del array se lea por pantalla.
        int[] arrayInt = {5, 4, 3, 2, 1};
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(i + ", ");
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Intoduce un valor entero: ");
            int num = scan.nextInt();
            arrayInt[i] = num;
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("Ahora se imprime la posición del array por pantalla.");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt.length + ", ");
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

    public static void main(String[] args) {
        Menu fc = new Menu();
        fc.menu();
    }
}