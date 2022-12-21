import java.util.Scanner;

public class BoletinStrings2 {

    Scanner sc = new Scanner(System.in);

    public void menuEjercicio2() {
        String opc = " ";

        do {
            System.out.println();
            System.out.print("----- Menú Principal -----"
                    + "\nA. Ejercicio 1"
                    + "\nB. Ejercicio 2"
                    + "\nC. Ejercicio 3"
                    + "\nD. Ejercicio 4"
                    + "\nE. Ejercicio 5"
                    + "\nF. Ejercicio 6"
                    + "\nG. Ejercicio 7"
                    + "\nH. Ejercicio 8"
                    + "\nI. Ejercicio 9"
                    + "\nJ. Ejercicio 10"
                    + "\nK. Ejercicio 11"
                    + "\nL. Ejercicio 12"
                    + "\nM. Ejercicio 13"
                    + "\nN. Ejercicio 14"
                    + "\nO. Ejercicio 15"
                    + "\nP. Ejercicio 16"
                    + "\nQ. Ejercicio 17"
                    + "\nR. Ejercicio 18"
                    + "\nS. Ejercicio 19"
                    + "\nZ. Salir"
                    + "\nIngrese una opción: ");
            opc = sc.nextLine();

            switch (opc) {
                case "A":
                    ejercicio1();
                    break;
                case "B":
                    ejercicio2();
                    break;
                case "C":
                    ejercicio3();
                    break;
                case "D":
                    ejercicio4();
                    break;
                case "E":
                    ejercicio5();
                    break;
                case "F":
                    ejercicio6();
                    break;
                case "G":
                    ejercicio7();
                    break;
                case "H":
                    ejercicio8();
                    break;
                case "I":
                    ejercicio9();
                    break;
                case "J":
                    ejercicio10();
                    break;
                case "K":
                    ejercicio11();
                    break;
                case "L":
                    ejercicio12();
                    break;
                case "M":
                    ejercicio13();
                    break;
                case "N":
                    ejercicio14();
                    break;
                case "O":
                    ejercicio15();
                    break;
                case "P":
                    ejercicio16();
                    break;
                case "Q":
                    ejercicio17();
                    break;
                case "R":
                    ejercicio18();
                    break;
                case "S":
                    ejercicio19();
                    break;
                case "Z":
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Gracias por usar la aplicación. Vuelva Pronto");
                    break;
            }

        } while (!opc.equalsIgnoreCase("Z"));
    }



    public void ejercicio1() {
        System.out.println("Lee por pantalla una cadena de caracteres e imprime su longitud.");
        String cadena = sc.nextLine();
        System.out.println("La longitud de la cadena es: " +cadena.length());
    }

    public void ejercicio2() {
        System.out.print("Lee por pantalla una cadena de caracteres e imprime su primera letra.");
        String cadena = sc.nextLine();
        System.out.println("La primera letra es: " +cadena.charAt(0)); // Devuelve un carácter
    }

    public void ejercicio3() {
        System.out.println("Lee por pantalla una cadena de caracteres e imprime su última letra." +
                "Ten en cuenta que la cadena introducida puede cambiar en cada ejecución.");
        String cadena = sc.nextLine();
        System.out.println("El último carácter de la cadena es: " +cadena.charAt(cadena.length()-1));
    }

    public void ejercicio4() {
        System.out.println("Lee por pantalla una cadena de caracteres e imprime la letra central o su aproximada.");
        String cadena = sc.nextLine();
        System.out.println("La letra 'central' es: "+cadena.charAt((cadena.length()-1)/2));
        System.out.println("La letra 'central' es: "+cadena.charAt((cadena.length())/2));
    }

    public void ejercicio5() {
        System.out.println("Repite los tres ejercicios anteriores imprimiendo junto a la letra su código UNICODE," +
                "separados por un espacio.");
        String cadena = sc.nextLine();
    }

    public void ejercicio6() {
        System.out.println("Lee por pantalla una cadena de caracteres, y vuelve a imprimirla en mayúsculas.");
        System.out.print("Introduce una nueva cadena: ");
        String cadena = sc.nextLine();
        System.out.println("La cadena en mayúscula es " +sc.nextLine().toUpperCase());
        // Es posible hacer este tipo de construcción dentro del print pero hay que tener en cuenta que de esta forma
        // no se almacena la variable o el String en caso de tener que usarla más tarde. Mejor declararla previamente.
    }

    public void ejercicio7() {
        System.out.println("Lee por pantalla una cadena de caracteres, e imprímela en minúsculas.");
        String cadena = sc.nextLine();

    }

    public void ejercicio8() {
        System.out.println("Lee por pantalla una cadena de caracteres y reemplaza" +
                "todas las aes por espacios en blanco.");
        String cadena = sc.nextLine();
        // Método convirtiendo el ASCII del espacio en blanco como carácter. Método poco eficiente.
        char a = 'a';
        int blanco = 32;
        char caracter = (char) blanco;
        System.out.println(cadena.replace('a',caracter));
        // Método con carácter
        System.out.println(cadena.replace('a',' '));
        // Método con string
        System.out.println(cadena.replaceAll("a"," "));
    }

    public void ejercicio9() {
        System.out.println("Lee por pantalla una cadena de caracteres y elimina todas las aes.");
        String cadena = sc.nextLine();
        System.out.println(cadena.replace('a',' ')); //
    }

    public void ejercicio10() {
        System.out.println("Lee por pantalla una cadena de caracteres y reemplaza las vocales por espacios en blanco.");
    }

    public void ejercicio11() {
        System.out.println("Lee por pantalla una cadena de caracteres y elimina todas las vocales.");
    }

    public void ejercicio12() {
        System.out.println("Lee por pantalla la cadena “Supermercado” y comprueba si tiene la letra m." +
                "Repite introduciendo la misma cadena y comprueba si tiene la letra M.");
        String cadena = new String("Supermercado");
        System.out.println("¿Contiene la \"m\"?: " +cadena.contains("m"));
        System.out.println("¿Contiene la \"M\"?: " +cadena.contains("M"));
    }

    public void ejercicio13() {
        System.out.println("Lee por pantalla dos cadenas y compáralas." +
                "Debes imprimir ‘La primera va antes’,‘La segunda va antes’ o ‘Son iguales’," +
                "dependiendo del resultado de la comparación.");
        System.out.println("Lee por pantalla dos cadenas y compáralas.\n" +
                "Debes imprimir ‘La primera va antes’,‘La segunda va antes’ o ‘Son iguales’,\n" +
                "dependiendo del resultado de la comparación.\n");
        System.out.print("Introduce cadena 1: ");
        String cadena1 = sc.nextLine();
        System.out.print("Introduce cadena 2: ");
        String cadena2 = sc.nextLine();
        int comparacion = cadena1.compareTo(cadena2);
        /* Es más eficiente declarar un entero en vez de declararlo en los argumentos del if, ya que solo se comprobaría
        una única vez.
        */
        if (comparacion < 0){
            System.out.println("La primera va antes.");
        } else if (comparacion > 0) {
            System.out.println("La segunda va antes.");
        } else {
            System.out.println("Son iguales.");
        }
    }

    public void ejercicio14() {
        System.out.println("Repite el ejercicio 13 pero ignorando mayúsculas.");
    }

    public void ejercicio15() {
        System.out.println("Lee por pantalla dos cadenas y comprueba si son iguales.");
    }

    public void ejercicio16() {
        System.out.println("Repite el ejercicio 15 pero ignorando mayúsculas.");
    }

    public void ejercicio17() {
        System.out.println("Lee un carácter por teclado y muestra por consola el código ASCII al que pertenece." +
                "Por ejemplo: si introduzco una a, debe mostrar 97.");
    }

    public void ejercicio18() {
        System.out.println("Lee una cadena de caracteres por teclado que represente un número de dos cifras,\n" +
                "e imprime por pantalla el carácter que representa.\n");
        String numStr = "";
        do {
            System.out.print("Introduce un número de dos dígitos: ");
            numStr = sc.nextLine();

        } while(numStr.length()!=2 || !Character.isDigit(numStr.charAt(0)) || !Character.isDigit(numStr.charAt(1)));
        /*La validación del while comprueba si la cadena tiene una longitud de 2 OR que el primer carácter es un número
        * OR el segundo carácter es un número. Si se cumple, finaliza el programa.*/

        int num = Integer.parseInt(numStr); // Hay que convertir este String en Int.
        System.out.println((char) num); // Desde este Int se hace un casting a Char.

        System.out.println("Fin");
    }

    public void ejercicio19() {
        System.out.println("Escribe una aplicación con un String que contenga una contraseña inventada." +
                "Después se pedirá que introduzcas la contraseña, con 3 intentos." +
                "Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo “Logged in”." +
                "Cuando falle, debe imprimir ‘Prueba otra vez…’ y volver a leer por teclado." +
                "En el tercer fallo, debe imprimir Error’ y el programa termina. 22." +
                "Se pretende leer por pantalla una contraseña e indicarle al usuario si su seguridad es fuerte," +
                "media o débil. Cree un algoritmo que lea una cadena e imprima por pantalla su nivel de seguridad" +
                "en base a los siguientes criterios:\n" +
                " - Si la longitud de la cadena es inferior a cinco, siempre es débil. Ejemplo: \"hola\" es debil.\n" +
                " - Si la longitud es superior o igual a cinco y solo tiene letras o solo tiene números, es media." +
                "Ejemplo: \"holaholita\" o \"57213\".\n" +
                " - Si la longitud es superior o igual a cinco y tiene tanto letras como números, es alta." +
                "Ejemplo: “adios365”\n" +
                "Nota: puede usar todo lo aprendido sobre Java. Suponga que la cadena solo tiene letras y números," +
                "nunca caracteres especiales.");
    }
    public static void main(String[] args) {
        BoletinStrings2 fc = new BoletinStrings2();
        fc.menuEjercicio2();
    }
}


