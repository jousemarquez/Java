import java.util.Scanner;

public class BoletinStrings1 {

    Scanner sc = new Scanner(System.in);

    public void menuEjercicio() {
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
                case "Z":
                    break;
                default:
                System.out.println("Gracias por usar la aplicación. Vuelva Pronto");
                break;
            }

        } while (!opc.equalsIgnoreCase("Z"));
    }

    public void ejercicio1() {
        System.out.println("Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida" +
                "por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.\n");
        String nombre = new String("José Antonio");
        System.out.println("Bienvenido "+nombre);
    }

    public void ejercicio2() {
        System.out.println("Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir.");
        String nombreSolicitado = sc.nextLine();
        System.out.println("Bienvenido "+nombreSolicitado);
        System.out.println();
    }

    public void ejercicio3() {
        System.out.println("Escribe una aplicación con un String que contenga una contraseña cualquiera." +
                "Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no" +
                "pedirá más la contraseña y mostrará un mensaje diciendo “Enhorabuena”. Piensa bien en la" +
                "condición de salida (3 intentos y si acierta sale, aunque le queden intentos).\n");
        int intentos = 3;
        String checkerContraseña = new String("Mordekaiser");
        boolean checker;
        do {
            System.out.println("Introducir la contraseña: ");
            String contraseña = sc.nextLine();
            checker = checkerContraseña.equals(contraseña);
            if (checker == true) {
                System.out.println("La contraseña es correcta");
            } else {
                intentos--;
                System.out.println("La contraseña es incorrecta. Tienes " + intentos + " intentos.");
            }
        } while (!checker);
        if (intentos == 0) {
            System.out.println("Has superado los intentos para introducir la contraseña. Los GEO van en camino.");
        } else {
            System.out.println("Accediendo el programa...");
        }
    }

    public void ejercicio4() {
        System.out.println("Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuántas" +
                "vocales hay en total (recorre el String con un bucle y charAt).");
        String dicho = new String("La lluvia en Sevilla es una maravilla");

    }

    public void ejercicio5() {
        System.out.println("Reemplaza todas las a del String anterior por una e.");
        String dicho = new String("La lluvia en Sevilla es una maravilla");
        System.out.println(dicho.replace('a','e'));
    }

    public void ejercicio6() {
        System.out.println("Dada una cadena mostrar por pantalla la cantidad de vocales que tiene." +
                "Ejemplo:\n" +
                "Entrada: cad = \"Hola tu\"\n" +
                "Salida: La cantidad de vocales es 3");
    }

    public void ejercicio7() {
        System.out.println("Dada una cadena invertir la misma y mostrar por pantalla." +
                "Ejemplo:\n" +
                "Entrada: \"casa blanca\"\n" +
                "Salida: \"acnalb asac\"");
    }

    public void ejercicio8() {
        System.out.println("Dada una cadena cad, y un carácter car, verificar cuántas veces se repite" +
                "el carácter car en la cadena cad." +
                "Ejemplo:\n" +
                "Entrada: cad = \"casa blanca\", car = 'a'\n" +
                "Salida: El carácter 'a' se repite 4 veces");
    }

    public void ejercicio9() {
        System.out.println("Lee un número por teclado y muestra por consola, el carácter al que pertenece" +
                "en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.");
    }

    public void ejercicio10() {
        System.out.println("Modifica el ejercicio anterior para que, en lugar de pedir un número," +
                "pida un carácter y muestre su código en la tabla ASCII.");
    }

    public void ejercicio11() {
        System.out.println("Recorre el String del ejercicio anterior y transforma cada carácter a su código ASCII." +
                "Muéstralos en línea recta, separados por un espacio entre cada carácter.");
    }

    public void ejercicio12() {
        System.out.println("Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos" +
                "(int, pero se leerán como String y luego se convertirán) y un signo aritmético (String)," +
                "según este último se realizará la operación correspondiente." +
                "" +
                "Al final mostrará el resultado en consola. Los signos aritméticos disponibles son:\n" +
                "+: suma los dos operandos.\n" +
                "-: resta los operandos.\n" +
                "*: multiplica los operandos.\n" +
                "/: divide los operandos, este debe dar un resultado con decimales (double)\n" +
                "^:  1º operando como base y 2º como exponente.\n" +
                "%:  módulo, resto de la división entre operando1 y operando2.");
    }

    public static void main(String[] args) {
        BoletinStrings1 fc = new BoletinStrings1();
        fc.menuEjercicio();
    }
}

